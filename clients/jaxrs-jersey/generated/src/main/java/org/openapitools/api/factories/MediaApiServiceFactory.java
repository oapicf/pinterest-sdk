package org.openapitools.api.factories;

import org.openapitools.api.MediaApiService;
import org.openapitools.api.impl.MediaApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-07T02:51:20.133823354Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MediaApiServiceFactory {
    private static final MediaApiService service = new MediaApiServiceImpl();

    public static MediaApiService getMediaApi() {
        return service;
    }
}
