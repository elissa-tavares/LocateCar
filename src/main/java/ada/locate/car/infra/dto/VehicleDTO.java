package ada.locate.car.infra.dto;

import java.time.LocalDate;

public record VehicleDTO(String brand, LocalDate yearManufacture,
                         String color, String plateNumber,
                         String model, String description, String oldPlateNumber) {

    @Override
    public String toString() {
        return "VehicleDTO{" +
                "brand='" + brand + '\'' +
                ", yearManufacture=" + yearManufacture +
                ", color='" + color + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public static class Builder {
        private String brand;
        private LocalDate yearManufacture;
        private String color;
        private String plateNumber;
        private String model;
        private String description;
        private String oldPlateNumber;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder yearManufacture(LocalDate yearManufacture) {
            this.yearManufacture = yearManufacture;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder plateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }
        public Builder description(String description) {
            this.description = description;
            return this;
        }
        public Builder oldPlateNumber(String oldPlateNumber) {
            this.oldPlateNumber = oldPlateNumber;
            return this;
        }

        public VehicleDTO build() {
            return new VehicleDTO(brand, yearManufacture, color, plateNumber, model, description, oldPlateNumber);
        }
    }


}
