package ada.locate.car.config.record.client;

import ada.locate.car.controller.api.Controller;

public record ClientControllerConfig(Controller create,
                                     Controller read,
                                     Controller update,
                                     Controller delete) {
}
