package org.openapitools.api.factories;

import org.openapitools.api.PinsApiService;
import org.openapitools.api.impl.PinsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-03T06:15:21.978491780Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PinsApiServiceFactory {
    private static final PinsApiService service = new PinsApiServiceImpl();

    public static PinsApiService getPinsApi() {
        return service;
    }
}
