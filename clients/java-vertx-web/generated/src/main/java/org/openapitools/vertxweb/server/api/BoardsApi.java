package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Board;
import org.openapitools.vertxweb.server.model.BoardSection;
import org.openapitools.vertxweb.server.model.BoardUpdate;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.Paginated;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface BoardsApi  {
    Future<ApiResponse<BoardSection>> boardSectionsCreate(String boardId, BoardSection boardSection);
    Future<ApiResponse<Void>> boardSectionsDelete(String boardId, String sectionId);
    Future<ApiResponse<Paginated>> boardSectionsList(String boardId, String bookmark, Integer pageSize);
    Future<ApiResponse<Paginated>> boardSectionsListPins(String boardId, String sectionId, String bookmark, Integer pageSize);
    Future<ApiResponse<BoardSection>> boardSectionsUpdate(String boardId, String sectionId, BoardSection boardSection);
    Future<ApiResponse<Board>> boardsCreate(Board board);
    Future<ApiResponse<Void>> boardsDelete(String boardId);
    Future<ApiResponse<Board>> boardsGet(String boardId);
    Future<ApiResponse<Paginated>> boardsList(String bookmark, Integer pageSize, String privacy);
    Future<ApiResponse<Paginated>> boardsListPins(String boardId, String bookmark, Integer pageSize);
    Future<ApiResponse<Board>> boardsUpdate(String boardId, BoardUpdate boardUpdate);
}
