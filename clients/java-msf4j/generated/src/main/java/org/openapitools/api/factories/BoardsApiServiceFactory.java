package org.openapitools.api.factories;

import org.openapitools.api.BoardsApiService;
import org.openapitools.api.impl.BoardsApiServiceImpl;

public class BoardsApiServiceFactory {
    private static final BoardsApiService service = new BoardsApiServiceImpl();

    public static BoardsApiService getBoardsApi() {
        return service;
    }
}
