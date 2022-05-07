package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Board;
import org.openapitools.server.api.model.BoardSection;
import org.openapitools.server.api.model.BoardUpdate;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Paginated;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface BoardsApi  {
    //board_sections/create
    void boardSectionsCreate(String boardId, BoardSection boardSection, Handler<AsyncResult<BoardSection>> handler);

    //board_sections/delete
    void boardSectionsDelete(String boardId, String sectionId, Handler<AsyncResult<Void>> handler);

    //board_sections/list
    void boardSectionsList(String boardId, String bookmark, Integer pageSize, Handler<AsyncResult<Paginated>> handler);

    //board_sections/list_pins
    void boardSectionsListPins(String boardId, String sectionId, String bookmark, Integer pageSize, Handler<AsyncResult<Paginated>> handler);

    //board_sections/update
    void boardSectionsUpdate(String boardId, String sectionId, BoardSection boardSection, Handler<AsyncResult<BoardSection>> handler);

    //boards/create
    void boardsCreate(Board board, Handler<AsyncResult<Board>> handler);

    //boards/delete
    void boardsDelete(String boardId, Handler<AsyncResult<Void>> handler);

    //boards/get
    void boardsGet(String boardId, Handler<AsyncResult<Board>> handler);

    //boards/list
    void boardsList(String bookmark, Integer pageSize, String privacy, Handler<AsyncResult<Paginated>> handler);

    //boards/list_pins
    void boardsListPins(String boardId, String bookmark, Integer pageSize, Handler<AsyncResult<Paginated>> handler);

    //boards/update
    void boardsUpdate(String boardId, BoardUpdate boardUpdate, Handler<AsyncResult<Board>> handler);

}
