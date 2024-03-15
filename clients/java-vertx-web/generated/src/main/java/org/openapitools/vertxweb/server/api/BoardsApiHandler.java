package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Board;
import org.openapitools.vertxweb.server.model.BoardSection;
import org.openapitools.vertxweb.server.model.BoardSectionsList200Response;
import org.openapitools.vertxweb.server.model.BoardUpdate;
import org.openapitools.vertxweb.server.model.BoardsList200Response;
import org.openapitools.vertxweb.server.model.BoardsListPins200Response;
import org.openapitools.vertxweb.server.model.Error;

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
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter boardSection is {}", boardSection);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.boardSectionsCreate(boardId, boardSection, adAccountId)
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
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter sectionId is {}", sectionId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.boardSectionsDelete(boardId, sectionId, adAccountId)
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
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.boardSectionsList(boardId, adAccountId, bookmark, pageSize)
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
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter sectionId is {}", sectionId);
        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.boardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize)
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
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter sectionId is {}", sectionId);
        logger.debug("Parameter boardSection is {}", boardSection);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.boardSectionsUpdate(boardId, sectionId, boardSection, adAccountId)
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
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter board is {}", board);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.boardsCreate(board, adAccountId)
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
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.boardsDelete(boardId, adAccountId)
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
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.boardsGet(boardId, adAccountId)
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

        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        String privacy = requestParameters.queryParameter("privacy") != null ? requestParameters.queryParameter("privacy").getString() : null;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter privacy is {}", privacy);

        api.boardsList(adAccountId, bookmark, pageSize, privacy)
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
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;
        List<String> creativeTypes = requestParameters.queryParameter("creative_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("creative_types").get(), new TypeReference<List<String>>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;
        Boolean pinMetrics = requestParameters.queryParameter("pin_metrics") != null ? requestParameters.queryParameter("pin_metrics").getBoolean() : false;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter creativeTypes is {}", creativeTypes);
        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter pinMetrics is {}", pinMetrics);

        api.boardsListPins(boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics)
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
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter boardUpdate is {}", boardUpdate);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.boardsUpdate(boardId, boardUpdate, adAccountId)
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
