package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ConversionEventResponse;
import org.openapitools.server.api.model.ConversionTagCreate;
import org.openapitools.server.api.model.ConversionTagListResponse;
import org.openapitools.server.api.model.ConversionTagResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PageVisitConversionTagsGet200Response;

public final class ConversionTagsApiException extends MainApiException {
    public ConversionTagsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final ConversionTagsApiException ConversionTags_conversionTagsCreate_200_Exception = new ConversionTagsApiException(200, "Success");
    public static final ConversionTagsApiException ConversionTags_conversionTagsGet_200_Exception = new ConversionTagsApiException(200, "Success");
    public static final ConversionTagsApiException ConversionTags_conversionTagsList_200_Exception = new ConversionTagsApiException(200, "Success");
    public static final ConversionTagsApiException ConversionTags_ocpmEligibleConversionTagsGet_200_Exception = new ConversionTagsApiException(200, "Success");
    public static final ConversionTagsApiException ConversionTags_pageVisitConversionTagsGet_200_Exception = new ConversionTagsApiException(200, "Success");
    

}