package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Pin;
import org.openapitools.server.api.model.PinAnalyticsMetricsResponse;
import org.openapitools.server.api.model.PinCreate;
import org.openapitools.server.api.model.PinUpdate;
import org.openapitools.server.api.model.PinsAnalyticsMetricTypesParameterInner;
import org.openapitools.server.api.model.PinsList200Response;
import org.openapitools.server.api.model.PinsSaveRequest;

public final class PinsApiException extends MainApiException {
    public PinsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final PinsApiException Pins_multiPinsAnalytics_200_Exception = new PinsApiException(200, "response");
    public static final PinsApiException Pins_multiPinsAnalytics_400_Exception = new PinsApiException(400, "Invalid pins analytics parameters.");
    public static final PinsApiException Pins_multiPinsAnalytics_401_Exception = new PinsApiException(401, "Not authorized to access board or Pin.");
    public static final PinsApiException Pins_multiPinsAnalytics_404_Exception = new PinsApiException(404, "Pin not found.");
    public static final PinsApiException Pins_multiPinsAnalytics_429_Exception = new PinsApiException(429, "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.");
    public static final PinsApiException Pins_pinsAnalytics_200_Exception = new PinsApiException(200, "response");
    public static final PinsApiException Pins_pinsAnalytics_400_Exception = new PinsApiException(400, "Invalid pins analytics parameters.");
    public static final PinsApiException Pins_pinsAnalytics_403_Exception = new PinsApiException(403, "Not authorized to access board or Pin.");
    public static final PinsApiException Pins_pinsAnalytics_404_Exception = new PinsApiException(404, "Pin not found.");
    public static final PinsApiException Pins_pinsCreate_201_Exception = new PinsApiException(201, "Successful pin creation.");
    public static final PinsApiException Pins_pinsCreate_400_Exception = new PinsApiException(400, "Invalid Pin parameters response");
    public static final PinsApiException Pins_pinsCreate_403_Exception = new PinsApiException(403, "The Pin's image is too small, too large or is broken");
    public static final PinsApiException Pins_pinsCreate_404_Exception = new PinsApiException(404, "Board or section not found");
    public static final PinsApiException Pins_pinsCreate_429_Exception = new PinsApiException(429, "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.");
    public static final PinsApiException Pins_pinsDelete_204_Exception = new PinsApiException(204, "Successfully deleted Pin");
    public static final PinsApiException Pins_pinsDelete_403_Exception = new PinsApiException(403, "Not authorized to access board or Pin.");
    public static final PinsApiException Pins_pinsDelete_404_Exception = new PinsApiException(404, "Pin not found.");
    public static final PinsApiException Pins_pinsGet_200_Exception = new PinsApiException(200, "response");
    public static final PinsApiException Pins_pinsGet_403_Exception = new PinsApiException(403, "Not authorized to access board or Pin.");
    public static final PinsApiException Pins_pinsGet_404_Exception = new PinsApiException(404, "Pin not found.");
    public static final PinsApiException Pins_pinsList_200_Exception = new PinsApiException(200, "Success");
    public static final PinsApiException Pins_pinsList_400_Exception = new PinsApiException(400, "Invalid pin filter value");
    public static final PinsApiException Pins_pinsSave_201_Exception = new PinsApiException(201, "Successfully saved pin.");
    public static final PinsApiException Pins_pinsSave_403_Exception = new PinsApiException(403, "Not authorized to access Board or Pin.");
    public static final PinsApiException Pins_pinsSave_404_Exception = new PinsApiException(404, "Board or Pin not found.");
    public static final PinsApiException Pins_pinsUpdate_200_Exception = new PinsApiException(200, "response");
    public static final PinsApiException Pins_pinsUpdate_403_Exception = new PinsApiException(403, "Not authorized to update Pin.");
    public static final PinsApiException Pins_pinsUpdate_404_Exception = new PinsApiException(404, "Pin not found.");
    public static final PinsApiException Pins_pinsUpdate_429_Exception = new PinsApiException(429, "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.");
    

}