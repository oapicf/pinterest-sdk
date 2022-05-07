package org.openapitools.api.factories;

import org.openapitools.api.BoardsApiService;
import org.openapitools.api.impl.BoardsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-05-07T06:42:01.683468Z[Etc/UTC]")
public class BoardsApiServiceFactory {
    private static final BoardsApiService service = new BoardsApiServiceImpl();

    public static BoardsApiService getBoardsApi() {
        return service;
    }
}
