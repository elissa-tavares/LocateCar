package ada.locate.car.app.menu;

import ada.locate.car.app.messages.MessagesVehicle;
import ada.locate.car.app.config.vehicle.VehicleMenuConfig;

public class VehicleMenu implements Menu {
    private final VehicleMenuConfig config;

    public VehicleMenu(VehicleMenuConfig config) {
        this.config = config;
    }


    @Override
    public void run() {
        String option = config.front().inputOptionString().execute(MessagesVehicle.MENU_VEHICLE.get(), MessagesVehicle.OPTION_VEHICLE.get());

        if (option.isEmpty()) {
            return;
        }
        switch (option.toLowerCase().trim()) {
            case "create" -> config.controller().create().execute();
            case "read"   -> config.controller().read().execute();
            case "update" -> config.controller().update().execute();
            case "delete" -> config.controller().delete().execute();
        }
    }
}
