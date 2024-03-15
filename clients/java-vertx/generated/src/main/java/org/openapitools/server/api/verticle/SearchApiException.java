package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PinsList200Response;
import org.openapitools.server.api.model.SearchPartnerPins200Response;
import org.openapitools.server.api.model.SearchUserBoardsGet200Response;

public final class SearchApiException extends MainApiException {
    public SearchApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final SearchApiException Search_searchPartnerPins_200_Exception = new SearchApiException(200, "Success");
    public static final SearchApiException Search_searchPartnerPins_400_Exception = new SearchApiException(400, "Invalid pins");
    public static final SearchApiException Search_searchUserBoardsGet_200_Exception = new SearchApiException(200, "response");
    public static final SearchApiException Search_searchUserPinsList_200_Exception = new SearchApiException(200, "Success");
    public static final SearchApiException Search_searchUserPinsList_404_Exception = new SearchApiException(404, "User not found");
    

}