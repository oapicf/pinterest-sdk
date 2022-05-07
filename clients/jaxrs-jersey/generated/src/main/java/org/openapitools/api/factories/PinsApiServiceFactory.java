package org.openapitools.api.factories;

import org.openapitools.api.PinsApiService;
import org.openapitools.api.impl.PinsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-05-07T06:42:01.683468Z[Etc/UTC]")
public class PinsApiServiceFactory {
    private static final PinsApiService service = new PinsApiServiceImpl();

    public static PinsApiService getPinsApi() {
        return service;
    }
}
