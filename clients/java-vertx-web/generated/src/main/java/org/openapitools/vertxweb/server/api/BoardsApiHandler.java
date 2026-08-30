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
        BoardSectionCreate boardSectionCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<BoardSectionCreate>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter boardSectionCreate is {}", boardSectionCreate);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.boardSectionsCreate(boardId, boardSectionCreate, adAccountId)
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
        BoardSectionUpdateWithRequiredBody boardSectionUpdateWithRequiredBody = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<BoardSectionUpdateWithRequiredBody>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter sectionId is {}", sectionId);
        logger.debug("Parameter boardSectionUpdateWithRequiredBody is {}", boardSectionUpdateWithRequiredBody);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.boardSectionsUpdate(boardId, sectionId, boardSectionUpdateWithRequiredBody, adAccountId)
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
        BoardCreate boardCreate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<BoardCreate>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter boardCreate is {}", boardCreate);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.boardsCreate(boardCreate, adAccountId)
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
        BoardPrivacyFilter privacy = requestParameters.queryParameter("privacy") != null ? requestParameters.queryParameter("privacy").getBoardPrivacyFilter() : null;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter privacy is {}", privacy);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.boardsList(adAccountId, privacy, bookmark, pageSize)
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
        List<CreativeType> creativeTypes = requestParameters.queryParameter("creative_types") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("creative_types").get(), new TypeReference<List<CreativeType>>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;
        Boolean pinMetrics = requestParameters.queryParameter("pin_metrics") != null ? requestParameters.queryParameter("pin_metrics").getBoolean() : false;
        String bookmark = requestParameters.queryParameter("bookmark") != null ? requestParameters.queryParameter("bookmark").getString() : null;
        Integer pageSize = requestParameters.queryParameter("page_size") != null ? requestParameters.queryParameter("page_size").getInteger() : 25;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter creativeTypes is {}", creativeTypes);
        logger.debug("Parameter adAccountId is {}", adAccountId);
        logger.debug("Parameter pinMetrics is {}", pinMetrics);
        logger.debug("Parameter bookmark is {}", bookmark);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.boardsListPins(boardId, creativeTypes, adAccountId, pinMetrics, bookmark, pageSize)
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
        BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<BoardWithUpdatePrivacyUpdate>(){}) : null;
        String adAccountId = requestParameters.queryParameter("ad_account_id") != null ? requestParameters.queryParameter("ad_account_id").getString() : null;

        logger.debug("Parameter boardId is {}", boardId);
        logger.debug("Parameter boardWithUpdatePrivacyUpdate is {}", boardWithUpdatePrivacyUpdate);
        logger.debug("Parameter adAccountId is {}", adAccountId);

        api.boardsUpdate(boardId, boardWithUpdatePrivacyUpdate, adAccountId)
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
