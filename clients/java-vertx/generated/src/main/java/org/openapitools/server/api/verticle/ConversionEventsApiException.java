package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ConversionApiResponse;
import org.openapitools.server.api.model.ConversionEvents;
import org.openapitools.server.api.model.DetailedError;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

public final class ConversionEventsApiException extends MainApiException {
    public ConversionEventsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final ConversionEventsApiException ConversionEvents_eventsCreate_200_Exception = new ConversionEventsApiException(200, "Success");
    public static final ConversionEventsApiException ConversionEvents_eventsCreate_400_Exception = new ConversionEventsApiException(400, "The request was invalid.");
    public static final ConversionEventsApiException ConversionEvents_eventsCreate_401_Exception = new ConversionEventsApiException(401, "Not authorized to send conversion events");
    public static final ConversionEventsApiException ConversionEvents_eventsCreate_403_Exception = new ConversionEventsApiException(403, "Unauthorized access.");
    public static final ConversionEventsApiException ConversionEvents_eventsCreate_422_Exception = new ConversionEventsApiException(422, "Not all events were successfully processed.");
    public static final ConversionEventsApiException ConversionEvents_eventsCreate_429_Exception = new ConversionEventsApiException(429, "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window.");
    public static final ConversionEventsApiException ConversionEvents_eventsCreate_503_Exception = new ConversionEventsApiException(503, "The endpoint has been ramped down and is currently not accepting any traffic.");
    

}