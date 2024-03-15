package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Board;
import org.openapitools.server.api.model.BoardSection;
import org.openapitools.server.api.model.BoardSectionsList200Response;
import org.openapitools.server.api.model.BoardUpdate;
import org.openapitools.server.api.model.BoardsList200Response;
import org.openapitools.server.api.model.BoardsListPins200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface BoardsApi  {
    //board_sections/create
    void boardSectionsCreate(String boardId, BoardSection boardSection, String adAccountId, Handler<AsyncResult<BoardSection>> handler);

    //board_sections/delete
    void boardSectionsDelete(String boardId, String sectionId, String adAccountId, Handler<AsyncResult<Void>> handler);

    //board_sections/list
    void boardSectionsList(String boardId, String adAccountId, String bookmark, Integer pageSize, Handler<AsyncResult<BoardSectionsList200Response>> handler);

    //board_sections/list_pins
    void boardSectionsListPins(String boardId, String sectionId, String adAccountId, String bookmark, Integer pageSize, Handler<AsyncResult<BoardsListPins200Response>> handler);

    //board_sections/update
    void boardSectionsUpdate(String boardId, String sectionId, BoardSection boardSection, String adAccountId, Handler<AsyncResult<BoardSection>> handler);

    //boards/create
    void boardsCreate(Board board, String adAccountId, Handler<AsyncResult<Board>> handler);

    //boards/delete
    void boardsDelete(String boardId, String adAccountId, Handler<AsyncResult<Void>> handler);

    //boards/get
    void boardsGet(String boardId, String adAccountId, Handler<AsyncResult<Board>> handler);

    //boards/list
    void boardsList(String adAccountId, String bookmark, Integer pageSize, String privacy, Handler<AsyncResult<BoardsList200Response>> handler);

    //boards/list_pins
    void boardsListPins(String boardId, String bookmark, Integer pageSize, List<String> creativeTypes, String adAccountId, Boolean pinMetrics, Handler<AsyncResult<BoardsListPins200Response>> handler);

    //boards/update
    void boardsUpdate(String boardId, BoardUpdate boardUpdate, String adAccountId, Handler<AsyncResult<Board>> handler);

}
