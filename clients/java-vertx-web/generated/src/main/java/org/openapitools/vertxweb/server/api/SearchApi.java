package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.PinsList200Response;
import org.openapitools.vertxweb.server.model.SearchPartnerPins200Response;
import org.openapitools.vertxweb.server.model.SearchUserBoardsGet200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface SearchApi  {
    Future<ApiResponse<SearchPartnerPins200Response>> searchPartnerPins(String term, String countryCode, String bookmark, String locale, Integer limit);
    Future<ApiResponse<SearchUserBoardsGet200Response>> searchUserBoardsGet(String adAccountId, String bookmark, Integer pageSize, String query);
    Future<ApiResponse<PinsList200Response>> searchUserPinsList(String query, String adAccountId, String bookmark);
}
