package ada.locate.car.app;

import ada.locate.car.app.menu.Menu;
import ada.locate.car.app.messages.MessagesApp;
import ada.locate.car.app.menu.VehicleMenu;
import ada.locate.car.controller.api.Controller;
import ada.locate.car.controller.impl.vehicle.CreateVehicleControllerImpl;
import ada.locate.car.controller.impl.client.CreateClientCPFControllerImpl;
import ada.locate.car.infra.data.base.ClientCPFBase;
import ada.locate.car.infra.data.base.VehicleBase;
import ada.locate.car.infra.repository.ClientCPFRepository;
import ada.locate.car.infra.repository.VehicleRepository;
import ada.locate.car.infra.repository.api.Repository;
import ada.locate.car.model.ClientCPF;
import ada.locate.car.model.Vehicle;
import ada.locate.car.swing.api.Input;
import ada.locate.car.swing.api.Output;
import ada.locate.car.swing.impl.*;

import javax.swing.*;

public class LocateCar {
    public static void run() {

        Repository<ClientCPF> clientCPFRepository = new ClientCPFRepository(ClientCPFBase.getInstance());
        Repository<Vehicle> vehicleRepository = new VehicleRepository(VehicleBase.getInstance());

        Input<Integer> inputOptionInt = new ShowInputOptionsIntImpl();
        Input<String[]> inputMultipleFields = new ShowInputMultipleFieldsImpl();
        Input<String> inputOptionString = new ShowInputOptionsStringImpl();
        Input<String> inputCPF = new CPFInput();
        Output showInformation = new ShowInformationOutputImpl();

        Controller createVehicle = new CreateVehicleControllerImpl(inputOptionString, inputMultipleFields, showInformation);
        Controller createClientCPF = new CreateClientCPFControllerImpl(inputMultipleFields, showInformation, inputCPF);

        Menu vehicleMenu = new VehicleMenu(inputOptionInt, createVehicle);

        JFrame frame = CreateFrame.execute();
        frame.setVisible(true);

        Integer option;
        do {
            //main menu
            //recebe de quem se trata a edição
            option = inputOptionInt.execute(MessagesApp.MAIN_MENU.get(), MessagesApp.MAIN_OPTIONS_MENU.get());
            if(option != null){
                //direciona para o menu com as opções específicas de Client, Vehicle ou Alocation
                switch (option){
                    //Client
                    //case 1 -> Menu.;
                    //Vehicle
                    case 2 -> vehicleMenu.run();
                    //Alocation
                    // case 3 -> AlocationMenu.run();
                }
            }
        } while (option != null);

//        createVehicle.execute();
//        createClientCPF.execute();
        frame.dispose();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
