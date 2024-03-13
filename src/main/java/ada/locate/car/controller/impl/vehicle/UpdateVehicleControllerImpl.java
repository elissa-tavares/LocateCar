package ada.locate.car.controller.impl.vehicle;

import ada.locate.car.app.messages.MessagesVehicle;
import ada.locate.car.controller.api.Controller;
import ada.locate.car.core.usecase.UpdateVehicle;
import ada.locate.car.dto.VehicleDTO;
import ada.locate.car.swing.api.Input;
import ada.locate.car.swing.api.Output;

import java.util.Arrays;

public class UpdateVehicleControllerImpl implements Controller {
    private final Input<String[]> inputMultipleFields;
    private final Output showInformation;
    private final UpdateVehicle<VehicleDTO> updateVehicleService;

    public UpdateVehicleControllerImpl(Input<String[]> inputMultipleFields, Output showInformation, UpdateVehicle<VehicleDTO> updateVehicleService) {
        this.inputMultipleFields = inputMultipleFields;
        this.showInformation = showInformation;
        this.updateVehicleService = updateVehicleService;
    }


    @Override
    public void execute() {
        String[] data = inputMultipleFields.execute(MessagesVehicle.MENU_UPDATE_VEHICLE.get(), MessagesVehicle.UPDATE_VEHICLE.get());
        showInformation.execute("atualizado", Arrays.toString(data));
        System.out.println(Arrays.toString(data));
    }
}
