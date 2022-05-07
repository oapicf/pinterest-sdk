package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AnalyticsMetricsResponse;
import org.openapitools.server.api.model.Error;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Pin;

public final class PinsApiException extends MainApiException {
    public PinsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final PinsApiException Pins_pinsAnalytics_200_Exception = new PinsApiException(200, "response");
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
    

}