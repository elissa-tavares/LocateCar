package ada.locate.car.app.messages;

import ada.locate.car.core.model.Client;

public enum MessagesClient {
    ALL_CLIENT_DATA("Name:\nAddress:\nPhoneNumber:\nEmail:"),
    ENTER_CPF("Enter CPF"),
    ENTER_CNPJ("Enter CNPJ"),
//    CPF_REGEX("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}"),
//    CNPJ_REGEX("\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}"),
    INSERT_CLIENT_DATA("Insert client data"),
    CLIENT_DETAILS("Client details"),
    CLIENT_MENU("Client Menu"),
    OPTION_CLIENT("Create\nRead\nUpdate\nDelete\nSearch\n"),

    ALL_TYPES(Client.getModels()),
    MENU_UPDATED_CLIENT("Client update menu"),
    UPDATED_CLIENT("Id\nNome\nEndereço\nTelefone\nEmail\n"),
    OPTION_UPDATE("Update with CPF\nUpdate with CNPJ"),
    UPDATE_MENU("Update Menu"),

    OPTION_CREATE("Create with CPF\nCreate with CNPJ"),
    TITLE_DELETE_CLIENT("Client delete"),
    DELETE_CLIENT("Enter the identification number of the client you want to delete"),
    ENTER_CLIENT_ID("Enter client id"),
    ENTER_UPDATED_FIELDS("Enter client data to update"),
    UPDATED_CLIENT_DATA("Name:\nAddress:\nPhoneNumber:\nEmail:");


    private final String message;

    MessagesClient(String message) {
        this.message = message;
    }

    public String get() {
        return message;
    }
}
