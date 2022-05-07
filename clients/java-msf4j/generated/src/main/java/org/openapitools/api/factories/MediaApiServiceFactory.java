package org.openapitools.api.factories;

import org.openapitools.api.MediaApiService;
import org.openapitools.api.impl.MediaApiServiceImpl;

public class MediaApiServiceFactory {
    private static final MediaApiService service = new MediaApiServiceImpl();

    public static MediaApiService getMediaApi() {
        return service;
    }
}
