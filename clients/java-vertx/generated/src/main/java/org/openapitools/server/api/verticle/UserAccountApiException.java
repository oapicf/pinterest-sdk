package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Account;
import org.openapitools.server.api.model.AnalyticsMetricsResponse;
import org.openapitools.server.api.model.BoardsUserFollowsList200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.FollowUserRequest;
import org.openapitools.server.api.model.FollowersList200Response;
import org.openapitools.server.api.model.LinkedBusiness;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.TopPinsAnalyticsResponse;
import org.openapitools.server.api.model.TopVideoPinsAnalyticsResponse;
import org.openapitools.server.api.model.UserAccountFollowedInterests200Response;
import org.openapitools.server.api.model.UserFollowingFeedType;
import org.openapitools.server.api.model.UserFollowingGet200Response;
import org.openapitools.server.api.model.UserSummary;
import org.openapitools.server.api.model.UserWebsiteSummary;
import org.openapitools.server.api.model.UserWebsiteVerificationCode;
import org.openapitools.server.api.model.UserWebsiteVerifyRequest;
import org.openapitools.server.api.model.UserWebsitesGet200Response;

public final class UserAccountApiException extends MainApiException {
    public UserAccountApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final UserAccountApiException UserAccount_boardsUserFollowsList_200_Exception = new UserAccountApiException(200, "Success");
    public static final UserAccountApiException UserAccount_boardsUserFollowsList_400_Exception = new UserAccountApiException(400, "Invalid user id");
    public static final UserAccountApiException UserAccount_followUserUpdate_200_Exception = new UserAccountApiException(200, "Success");
    public static final UserAccountApiException UserAccount_followUserUpdate_404_Exception = new UserAccountApiException(404, "User not found");
    public static final UserAccountApiException UserAccount_followersList_200_Exception = new UserAccountApiException(200, "Success");
    public static final UserAccountApiException UserAccount_followersList_400_Exception = new UserAccountApiException(400, "Invalid user id");
    public static final UserAccountApiException UserAccount_linkedBusinessAccountsGet_200_Exception = new UserAccountApiException(200, "Success");
    public static final UserAccountApiException UserAccount_unverifyWebsiteDelete_204_Exception = new UserAccountApiException(204, "Successfully unverified website");
    public static final UserAccountApiException UserAccount_unverifyWebsiteDelete_404_Exception = new UserAccountApiException(404, "Website not in user list.");
    public static final UserAccountApiException UserAccount_userAccountAnalytics_200_Exception = new UserAccountApiException(200, "Success");
    public static final UserAccountApiException UserAccount_userAccountAnalytics_400_Exception = new UserAccountApiException(400, "Invalid user accounts analytics parameters.");
    public static final UserAccountApiException UserAccount_userAccountAnalytics_403_Exception = new UserAccountApiException(403, "Not authorized to access the user account analytics.");
    public static final UserAccountApiException UserAccount_userAccountAnalyticsTopPins_200_Exception = new UserAccountApiException(200, "Success");
    public static final UserAccountApiException UserAccount_userAccountAnalyticsTopPins_403_Exception = new UserAccountApiException(403, "Not authorized to access the user account analytics.");
    public static final UserAccountApiException UserAccount_userAccountAnalyticsTopVideoPins_200_Exception = new UserAccountApiException(200, "Success");
    public static final UserAccountApiException UserAccount_userAccountAnalyticsTopVideoPins_403_Exception = new UserAccountApiException(403, "Not authorized to access the user account analytics.");
    public static final UserAccountApiException UserAccount_userAccountFollowedInterests_200_Exception = new UserAccountApiException(200, "Success");
    public static final UserAccountApiException UserAccount_userAccountFollowedInterests_400_Exception = new UserAccountApiException(400, "Invalid parameters");
    public static final UserAccountApiException UserAccount_userAccountFollowedInterests_401_Exception = new UserAccountApiException(401, "Authorization failed");
    public static final UserAccountApiException UserAccount_userAccountFollowedInterests_404_Exception = new UserAccountApiException(404, "User not found");
    public static final UserAccountApiException UserAccount_userAccountGet_200_Exception = new UserAccountApiException(200, "response");
    public static final UserAccountApiException UserAccount_userAccountGet_403_Exception = new UserAccountApiException(403, "Not authorized to access the user account.");
    public static final UserAccountApiException UserAccount_userFollowingGet_200_Exception = new UserAccountApiException(200, "response");
    public static final UserAccountApiException UserAccount_userWebsitesGet_200_Exception = new UserAccountApiException(200, "Success");
    public static final UserAccountApiException UserAccount_userWebsitesGet_403_Exception = new UserAccountApiException(403, "Not authorized to access the user website list.");
    public static final UserAccountApiException UserAccount_verifyWebsiteUpdate_200_Exception = new UserAccountApiException(200, "Success");
    public static final UserAccountApiException UserAccount_websiteVerificationGet_200_Exception = new UserAccountApiException(200, "Success");
    public static final UserAccountApiException UserAccount_websiteVerificationGet_403_Exception = new UserAccountApiException(403, "Not authorized to access the user verification code for website claiming.");
    

}