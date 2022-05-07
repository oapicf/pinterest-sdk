package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Account;
import org.openapitools.server.api.model.AnalyticsMetricsResponse;
import org.openapitools.server.api.model.Error;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;

public final class UserAccountApiException extends MainApiException {
    public UserAccountApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final UserAccountApiException UserAccount_userAccountAnalytics_200_Exception = new UserAccountApiException(200, "Success");
    public static final UserAccountApiException UserAccount_userAccountAnalytics_403_Exception = new UserAccountApiException(403, "Not authorized to access the user account analytics.");
    public static final UserAccountApiException UserAccount_userAccountGet_200_Exception = new UserAccountApiException(200, "response");
    public static final UserAccountApiException UserAccount_userAccountGet_403_Exception = new UserAccountApiException(403, "Not authorized to access the user account.");
    

}