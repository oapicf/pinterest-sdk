package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.Board;
import org.openapitools.server.api.model.BoardSection;
import org.openapitools.server.api.model.BoardSectionsList200Response;
import org.openapitools.server.api.model.BoardUpdate;
import org.openapitools.server.api.model.BoardsList200Response;
import org.openapitools.server.api.model.BoardsListPins200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class BoardsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(BoardsApiVerticle.class);

    static final String BOARD_SECTIONS/CREATE_SERVICE_ID = "board_sections/create";
    static final String BOARD_SECTIONS/DELETE_SERVICE_ID = "board_sections/delete";
    static final String BOARD_SECTIONS/LIST_SERVICE_ID = "board_sections/list";
    static final String BOARD_SECTIONS/LIST_PINS_SERVICE_ID = "board_sections/list_pins";
    static final String BOARD_SECTIONS/UPDATE_SERVICE_ID = "board_sections/update";
    static final String BOARDS/CREATE_SERVICE_ID = "boards/create";
    static final String BOARDS/DELETE_SERVICE_ID = "boards/delete";
    static final String BOARDS/GET_SERVICE_ID = "boards/get";
    static final String BOARDS/LIST_SERVICE_ID = "boards/list";
    static final String BOARDS/LIST_PINS_SERVICE_ID = "boards/list_pins";
    static final String BOARDS/UPDATE_SERVICE_ID = "boards/update";
    
    final BoardsApi service;

    public BoardsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.BoardsApiImpl");
            service = (BoardsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("BoardsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for board_sections/create
        vertx.eventBus().<JsonObject> consumer(BOARD_SECTIONS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "board_sections/create";
                String boardIdParam = message.body().getString("board_id");
                if(boardIdParam == null) {
                    manageError(message, new MainApiException(400, "board_id is required"), serviceId);
                    return;
                }
                String boardId = boardIdParam;
                JsonObject boardSectionParam = message.body().getJsonObject("BoardSection");
                if (boardSectionParam == null) {
                    manageError(message, new MainApiException(400, "BoardSection is required"), serviceId);
                    return;
                }
                BoardSection boardSection = Json.mapper.readValue(boardSectionParam.encode(), BoardSection.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.boardSectionsCreate(boardId, boardSection, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "board_sections/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("board_sections/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for board_sections/delete
        vertx.eventBus().<JsonObject> consumer(BOARD_SECTIONS/DELETE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "board_sections/delete";
                String boardIdParam = message.body().getString("board_id");
                if(boardIdParam == null) {
                    manageError(message, new MainApiException(400, "board_id is required"), serviceId);
                    return;
                }
                String boardId = boardIdParam;
                String sectionIdParam = message.body().getString("section_id");
                if(sectionIdParam == null) {
                    manageError(message, new MainApiException(400, "section_id is required"), serviceId);
                    return;
                }
                String sectionId = sectionIdParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.boardSectionsDelete(boardId, sectionId, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "board_sections/delete");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("board_sections/delete", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for board_sections/list
        vertx.eventBus().<JsonObject> consumer(BOARD_SECTIONS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "board_sections/list";
                String boardIdParam = message.body().getString("board_id");
                if(boardIdParam == null) {
                    manageError(message, new MainApiException(400, "board_id is required"), serviceId);
                    return;
                }
                String boardId = boardIdParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.boardSectionsList(boardId, adAccountId, bookmark, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "board_sections/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("board_sections/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for board_sections/list_pins
        vertx.eventBus().<JsonObject> consumer(BOARD_SECTIONS/LIST_PINS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "board_sections/list_pins";
                String boardIdParam = message.body().getString("board_id");
                if(boardIdParam == null) {
                    manageError(message, new MainApiException(400, "board_id is required"), serviceId);
                    return;
                }
                String boardId = boardIdParam;
                String sectionIdParam = message.body().getString("section_id");
                if(sectionIdParam == null) {
                    manageError(message, new MainApiException(400, "section_id is required"), serviceId);
                    return;
                }
                String sectionId = sectionIdParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.boardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "board_sections/list_pins");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("board_sections/list_pins", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for board_sections/update
        vertx.eventBus().<JsonObject> consumer(BOARD_SECTIONS/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "board_sections/update";
                String boardIdParam = message.body().getString("board_id");
                if(boardIdParam == null) {
                    manageError(message, new MainApiException(400, "board_id is required"), serviceId);
                    return;
                }
                String boardId = boardIdParam;
                String sectionIdParam = message.body().getString("section_id");
                if(sectionIdParam == null) {
                    manageError(message, new MainApiException(400, "section_id is required"), serviceId);
                    return;
                }
                String sectionId = sectionIdParam;
                JsonObject boardSectionParam = message.body().getJsonObject("BoardSection");
                if (boardSectionParam == null) {
                    manageError(message, new MainApiException(400, "BoardSection is required"), serviceId);
                    return;
                }
                BoardSection boardSection = Json.mapper.readValue(boardSectionParam.encode(), BoardSection.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.boardSectionsUpdate(boardId, sectionId, boardSection, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "board_sections/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("board_sections/update", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for boards/create
        vertx.eventBus().<JsonObject> consumer(BOARDS/CREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "boards/create";
                JsonObject boardParam = message.body().getJsonObject("Board");
                if (boardParam == null) {
                    manageError(message, new MainApiException(400, "Board is required"), serviceId);
                    return;
                }
                Board board = Json.mapper.readValue(boardParam.encode(), Board.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.boardsCreate(board, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "boards/create");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("boards/create", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for boards/delete
        vertx.eventBus().<JsonObject> consumer(BOARDS/DELETE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "boards/delete";
                String boardIdParam = message.body().getString("board_id");
                if(boardIdParam == null) {
                    manageError(message, new MainApiException(400, "board_id is required"), serviceId);
                    return;
                }
                String boardId = boardIdParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.boardsDelete(boardId, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "boards/delete");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("boards/delete", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for boards/get
        vertx.eventBus().<JsonObject> consumer(BOARDS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "boards/get";
                String boardIdParam = message.body().getString("board_id");
                if(boardIdParam == null) {
                    manageError(message, new MainApiException(400, "board_id is required"), serviceId);
                    return;
                }
                String boardId = boardIdParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.boardsGet(boardId, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "boards/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("boards/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for boards/list
        vertx.eventBus().<JsonObject> consumer(BOARDS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "boards/list";
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String privacyParam = message.body().getString("privacy");
                String privacy = (privacyParam == null) ? null : privacyParam;
                service.boardsList(adAccountId, bookmark, pageSize, privacy, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "boards/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("boards/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for boards/list_pins
        vertx.eventBus().<JsonObject> consumer(BOARDS/LIST_PINS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "boards/list_pins";
                String boardIdParam = message.body().getString("board_id");
                if(boardIdParam == null) {
                    manageError(message, new MainApiException(400, "board_id is required"), serviceId);
                    return;
                }
                String boardId = boardIdParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                JsonArray creativeTypesParam = message.body().getJsonArray("creative_types");
                List<String> creativeTypes = (creativeTypesParam == null) ? null : Json.mapper.readValue(creativeTypesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                String pinMetricsParam = message.body().getString("pin_metrics");
                Boolean pinMetrics = (pinMetricsParam == null) ? false : Json.mapper.readValue(pinMetricsParam, Boolean.class);
                service.boardsListPins(boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "boards/list_pins");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("boards/list_pins", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for boards/update
        vertx.eventBus().<JsonObject> consumer(BOARDS/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "boards/update";
                String boardIdParam = message.body().getString("board_id");
                if(boardIdParam == null) {
                    manageError(message, new MainApiException(400, "board_id is required"), serviceId);
                    return;
                }
                String boardId = boardIdParam;
                JsonObject boardUpdateParam = message.body().getJsonObject("BoardUpdate");
                if (boardUpdateParam == null) {
                    manageError(message, new MainApiException(400, "BoardUpdate is required"), serviceId);
                    return;
                }
                BoardUpdate boardUpdate = Json.mapper.readValue(boardUpdateParam.encode(), BoardUpdate.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.boardsUpdate(boardId, boardUpdate, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "boards/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("boards/update", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }

    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause);
        }

        message.fail(code, statusMessage);
    }

    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
