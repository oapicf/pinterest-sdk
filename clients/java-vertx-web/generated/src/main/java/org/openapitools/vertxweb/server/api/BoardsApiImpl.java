package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Board;
import org.openapitools.vertxweb.server.model.BoardSection;
import org.openapitools.vertxweb.server.model.BoardUpdate;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.Paginated;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.impl.HttpStatusException;

import java.util.List;
import java.util.Map;

// Implement this class

public class BoardsApiImpl implements BoardsApi {
    public Future<ApiResponse<BoardSection>> boardSectionsCreate(String boardId, BoardSection boardSection) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Void>> boardSectionsDelete(String boardId, String sectionId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Paginated>> boardSectionsList(String boardId, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Paginated>> boardSectionsListPins(String boardId, String sectionId, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<BoardSection>> boardSectionsUpdate(String boardId, String sectionId, BoardSection boardSection) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Board>> boardsCreate(Board board) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Void>> boardsDelete(String boardId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Board>> boardsGet(String boardId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Paginated>> boardsList(String bookmark, Integer pageSize, String privacy) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Paginated>> boardsListPins(String boardId, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Board>> boardsUpdate(String boardId, BoardUpdate boardUpdate) {
        return Future.failedFuture(new HttpStatusException(501));
    }

}
