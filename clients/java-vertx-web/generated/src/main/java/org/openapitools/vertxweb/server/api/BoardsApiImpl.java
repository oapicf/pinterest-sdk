package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Board;
import org.openapitools.vertxweb.server.model.BoardCreate;
import org.openapitools.vertxweb.server.model.BoardPrivacyFilter;
import org.openapitools.vertxweb.server.model.BoardSection;
import org.openapitools.vertxweb.server.model.BoardSectionCreate;
import org.openapitools.vertxweb.server.model.BoardSectionUpdateWithRequiredBody;
import org.openapitools.vertxweb.server.model.BoardSectionsList200Response;
import org.openapitools.vertxweb.server.model.BoardWithUpdatePrivacy;
import org.openapitools.vertxweb.server.model.BoardWithUpdatePrivacyUpdate;
import org.openapitools.vertxweb.server.model.BoardsList200Response;
import org.openapitools.vertxweb.server.model.BoardsListPins200Response;
import org.openapitools.vertxweb.server.model.CreativeType;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class BoardsApiImpl implements BoardsApi {
    public Future<ApiResponse<BoardSection>> boardSectionsCreate(String boardId, BoardSectionCreate boardSectionCreate, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BoardSection>> boardSectionsDelete(String boardId, String sectionId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BoardSectionsList200Response>> boardSectionsList(String boardId, String adAccountId, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BoardsListPins200Response>> boardSectionsListPins(String boardId, String sectionId, String adAccountId, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BoardSection>> boardSectionsUpdate(String boardId, String sectionId, BoardSectionUpdateWithRequiredBody boardSectionUpdateWithRequiredBody, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Board>> boardsCreate(BoardCreate boardCreate, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Board>> boardsDelete(String boardId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Board>> boardsGet(String boardId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BoardsList200Response>> boardsList(String adAccountId, BoardPrivacyFilter privacy, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BoardsListPins200Response>> boardsListPins(String boardId, List<CreativeType> creativeTypes, String adAccountId, Boolean pinMetrics, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BoardWithUpdatePrivacy>> boardsUpdate(String boardId, BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

}
