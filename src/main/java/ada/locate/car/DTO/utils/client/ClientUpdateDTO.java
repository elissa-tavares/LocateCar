package ada.locate.car.DTO.utils.client;

import ada.locate.car.DTO.ClientDTO;
import ada.locate.car.config.record.client.ProviderClientConfig;

public class ClientUpdateDTO {
    private final ProviderClientConfig provider;

    public ClientUpdateDTO(ProviderClientConfig provider) {
        this.provider = provider;
    }

    public ClientDTO buildClientDTO(String document, String edit){
        return switch (edit.toLowerCase()) {
            case "name" -> new ClientDTO.Builder()
                    .name(provider.update().nameUpdate())
                    .document(document)
                    .description(edit)
                    .build();
            case "address" -> new ClientDTO.Builder()
                    .address(provider.update().addressUpdate())
                    .description(edit)
                    .document(document)
                    .build();
            case "phone number" -> new ClientDTO.Builder()
                    .phoneNumber(provider.update().phoneNumberUpdate())
                    .document(document)
                    .description(edit)
                    .build();
            case "email" -> new ClientDTO.Builder()
                    .email(provider.update().emailUpdate())
                    .document(document)
                    .description(edit)
                    .build();
            default -> null;
        };
    }
}
