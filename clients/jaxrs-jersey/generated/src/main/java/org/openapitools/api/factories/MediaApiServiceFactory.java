package org.openapitools.api.factories;

import org.openapitools.api.MediaApiService;
import org.openapitools.api.impl.MediaApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-05-08T00:33:19.615491Z[Etc/UTC]")
public class MediaApiServiceFactory {
    private static final MediaApiService service = new MediaApiServiceImpl();

    public static MediaApiService getMediaApi() {
        return service;
    }
}
