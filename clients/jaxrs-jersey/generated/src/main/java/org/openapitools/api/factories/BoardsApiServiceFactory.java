package org.openapitools.api.factories;

import org.openapitools.api.BoardsApiService;
import org.openapitools.api.impl.BoardsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-07T04:06:30.634820227Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class BoardsApiServiceFactory {
    private static final BoardsApiService service = new BoardsApiServiceImpl();

    public static BoardsApiService getBoardsApi() {
        return service;
    }
}
