package org.openapitools.api.factories;

import org.openapitools.api.PinsApiService;
import org.openapitools.api.impl.PinsApiServiceImpl;

public class PinsApiServiceFactory {
    private static final PinsApiService service = new PinsApiServiceImpl();

    public static PinsApiService getPinsApi() {
        return service;
    }
}
