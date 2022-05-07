package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Board;
import org.openapitools.vertxweb.server.model.BoardSection;
import org.openapitools.vertxweb.server.model.BoardUpdate;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.Paginated;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class BoardsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(BoardsApiHandler.class);

    private final BoardsApi api;

    public BoardsApiHandler(BoardsApi api) {
        this.api = api;
    }

    @Deprecated
    public BoardsApiHandler() {
        this(new BoardsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("boardSectionsCreate").handler(this::boardSectionsCreate);
        builder.operation("boardSectionsDelete").handler(this::boardSectionsDelete);
        builder.operation("boardSectionsList").handler(this::boardSectionsList);
        builder.operation("boardSectionsListPins").handler(this::boardSectionsListPins);
        builder.operation("boardSectionsUpdate").handler(this::boardSectionsUpdate);
        builder.operation("boardsCreate").handler(this::boardsCreate);
        builder.operation("boardsDelete").handler(this::boardsDelete);
        builder.operation("boardsGet").handler(this::boardsGet);
        builder.operation("boardsList").handler(this::boardsList);
        builder.operation("boardsListPins").handler(this::boardsListPins);
        builder.operation("boardsUpdate").handler(this::boardsUpdate);
    }

    private void boardSectionsCreate(RoutingContext routingContext) {
        logger.info("boardSectionsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String boardId = requestParameters.pathParameter("board_id") != null ? requestParameters.pathParameter("board_id").getString() : null;
        RequestParameter body = requestParameters.body();
        BoardSection boardSection = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<BoardSection>(){}) : null;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter boardSection is {}", boardSection);

        api.boardSectionsCreate(boardId, boardSection)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void boardSectionsDelete(RoutingContext routingContext) {
        logger.info("boardSectionsDelete()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String boardId = requestParameters.pathParameter("board_id") != null ? requestParameters.pathParameter("board_id").getString() : null;
        String sectionId = requestParameters.pathParameter("section_id") != null ? requestParameters.pathParameter("section_id").getString() : null;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter sectionId is {}", sectionId);

        api.boardSectionsDelete(boardId, sectionId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void boardSectionsList(RoutingContext routingContext) {
        logger.info("boardSectionsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String boardId = requestParameters.pathParameter("board_id") != null ? requestParameters.pathParameter("board_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : null;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.boardSectionsList(boardId, bookmark, pageSize)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void boardSectionsListPins(RoutingContext routingContext) {
        logger.info("boardSectionsListPins()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String boardId = requestParameters.pathParameter("board_id") != null ? requestParameters.pathParameter("board_id").getString() : null;
        String sectionId = requestParameters.pathParameter("section_id") != null ? requestParameters.pathParameter("section_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : null;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter sectionId is {}", sectionId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.boardSectionsListPins(boardId, sectionId, bookmark, pageSize)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void boardSectionsUpdate(RoutingContext routingContext) {
        logger.info("boardSectionsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String boardId = requestParameters.pathParameter("board_id") != null ? requestParameters.pathParameter("board_id").getString() : null;
        String sectionId = requestParameters.pathParameter("section_id") != null ? requestParameters.pathParameter("section_id").getString() : null;
        RequestParameter body = requestParameters.body();
        BoardSection boardSection = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<BoardSection>(){}) : null;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter sectionId is {}", sectionId);
        logger.debug("Parameter boardSection is {}", boardSection);

        api.boardSectionsUpdate(boardId, sectionId, boardSection)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void boardsCreate(RoutingContext routingContext) {
        logger.info("boardsCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        Board board = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<Board>(){}) : null;

        logger.debug("Parameter board is {}", board);

        api.boardsCreate(board)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void boardsDelete(RoutingContext routingContext) {
        logger.info("boardsDelete()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String boardId = requestParameters.pathParameter("board_id") != null ? requestParameters.pathParameter("board_id").getString() : null;

        logger.debug("Parameter boardId is {}", boardId);

        api.boardsDelete(boardId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void boardsGet(RoutingContext routingContext) {
        logger.info("boardsGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String boardId = requestParameters.pathParameter("board_id") != null ? requestParameters.pathParameter("board_id").getString() : null;

        logger.debug("Parameter boardId is {}", boardId);

        api.boardsGet(boardId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void boardsList(RoutingContext routingContext) {
        logger.info("boardsList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : null;
        String privacy = requestParameters.queryParameter("privacy") != null ? requestParameters.queryParameter("privacy").getString() : null;

        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter privacy is {}", privacy);

        api.boardsList(bookmark, pageSize, privacy)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void boardsListPins(RoutingContext routingContext) {
        logger.info("boardsListPins()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String boardId = requestParameters.pathParameter("board_id") != null ? requestParameters.pathParameter("board_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : null;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.boardsListPins(boardId, bookmark, pageSize)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void boardsUpdate(RoutingContext routingContext) {
        logger.info("boardsUpdate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String boardId = requestParameters.pathParameter("board_id") != null ? requestParameters.pathParameter("board_id").getString() : null;
        RequestParameter body = requestParameters.body();
        BoardUpdate boardUpdate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<BoardUpdate>(){}) : null;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter boardUpdate is {}", boardUpdate);

        api.boardsUpdate(boardId, boardUpdate)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
