package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PinsList200Response;
import org.openapitools.server.api.model.SearchPartnerPins200Response;
import org.openapitools.server.api.model.SearchUserBoardsGet200Response;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface SearchApi  {
    //search_partner_pins
    void searchPartnerPins(String term, String countryCode, String bookmark, String locale, Integer limit, Handler<AsyncResult<SearchPartnerPins200Response>> handler);

    //search_user_boards/get
    void searchUserBoardsGet(String adAccountId, String bookmark, Integer pageSize, String query, Handler<AsyncResult<SearchUserBoardsGet200Response>> handler);

    //search_user_pins/list
    void searchUserPinsList(String query, String adAccountId, String bookmark, Handler<AsyncResult<PinsList200Response>> handler);

}
