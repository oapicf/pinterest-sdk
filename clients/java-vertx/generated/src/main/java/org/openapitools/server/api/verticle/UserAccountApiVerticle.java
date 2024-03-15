package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.Account;
import org.openapitools.server.api.model.AnalyticsMetricsResponse;
import org.openapitools.server.api.model.BoardsUserFollowsList200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.FollowUserRequest;
import org.openapitools.server.api.model.FollowersList200Response;
import org.openapitools.server.api.model.LinkedBusiness;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.TopPinsAnalyticsResponse;
import org.openapitools.server.api.model.TopVideoPinsAnalyticsResponse;
import org.openapitools.server.api.model.UserAccountFollowedInterests200Response;
import org.openapitools.server.api.model.UserFollowingFeedType;
import org.openapitools.server.api.model.UserFollowingGet200Response;
import org.openapitools.server.api.model.UserSummary;
import org.openapitools.server.api.model.UserWebsiteSummary;
import org.openapitools.server.api.model.UserWebsiteVerificationCode;
import org.openapitools.server.api.model.UserWebsiteVerifyRequest;
import org.openapitools.server.api.model.UserWebsitesGet200Response;

import java.util.List;
import java.util.Map;

public class UserAccountApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(UserAccountApiVerticle.class);

    static final String BOARDS_USER_FOLLOWS/LIST_SERVICE_ID = "boards_user_follows/list";
    static final String FOLLOW_USER/UPDATE_SERVICE_ID = "follow_user/update";
    static final String FOLLOWERS/LIST_SERVICE_ID = "followers/list";
    static final String LINKED_BUSINESS_ACCOUNTS/GET_SERVICE_ID = "linked_business_accounts/get";
    static final String UNVERIFY_WEBSITE/DELETE_SERVICE_ID = "unverify_website/delete";
    static final String USER_ACCOUNT/ANALYTICS_SERVICE_ID = "user_account/analytics";
    static final String USER_ACCOUNT/ANALYTICS/TOP_PINS_SERVICE_ID = "user_account/analytics/top_pins";
    static final String USER_ACCOUNT/ANALYTICS/TOP_VIDEO_PINS_SERVICE_ID = "user_account/analytics/top_video_pins";
    static final String USER_ACCOUNT/FOLLOWED_INTERESTS_SERVICE_ID = "user_account/followed_interests";
    static final String USER_ACCOUNT/GET_SERVICE_ID = "user_account/get";
    static final String USER_FOLLOWING/GET_SERVICE_ID = "user_following/get";
    static final String USER_WEBSITES/GET_SERVICE_ID = "user_websites/get";
    static final String VERIFY_WEBSITE/UPDATE_SERVICE_ID = "verify_website/update";
    static final String WEBSITE_VERIFICATION/GET_SERVICE_ID = "website_verification/get";
    
    final UserAccountApi service;

    public UserAccountApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.UserAccountApiImpl");
            service = (UserAccountApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("UserAccountApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for boards_user_follows/list
        vertx.eventBus().<JsonObject> consumer(BOARDS_USER_FOLLOWS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "boards_user_follows/list";
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String explicitFollowingParam = message.body().getString("explicit_following");
                Boolean explicitFollowing = (explicitFollowingParam == null) ? false : Json.mapper.readValue(explicitFollowingParam, Boolean.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.boardsUserFollowsList(bookmark, pageSize, explicitFollowing, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "boards_user_follows/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("boards_user_follows/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for follow_user/update
        vertx.eventBus().<JsonObject> consumer(FOLLOW_USER/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "follow_user/update";
                String usernameParam = message.body().getString("username");
                if(usernameParam == null) {
                    manageError(message, new MainApiException(400, "username is required"), serviceId);
                    return;
                }
                String username = usernameParam;
                JsonObject followUserRequestParam = message.body().getJsonObject("FollowUserRequest");
                if (followUserRequestParam == null) {
                    manageError(message, new MainApiException(400, "FollowUserRequest is required"), serviceId);
                    return;
                }
                FollowUserRequest followUserRequest = Json.mapper.readValue(followUserRequestParam.encode(), FollowUserRequest.class);
                service.followUserUpdate(username, followUserRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "follow_user/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("follow_user/update", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for followers/list
        vertx.eventBus().<JsonObject> consumer(FOLLOWERS/LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "followers/list";
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.followersList(bookmark, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "followers/list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("followers/list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for linked_business_accounts/get
        vertx.eventBus().<JsonObject> consumer(LINKED_BUSINESS_ACCOUNTS/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "linked_business_accounts/get";
                service.linkedBusinessAccountsGet(result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "linked_business_accounts/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("linked_business_accounts/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for unverify_website/delete
        vertx.eventBus().<JsonObject> consumer(UNVERIFY_WEBSITE/DELETE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "unverify_website/delete";
                String websiteParam = message.body().getString("website");
                if(websiteParam == null) {
                    manageError(message, new MainApiException(400, "website is required"), serviceId);
                    return;
                }
                String website = websiteParam;
                service.unverifyWebsiteDelete(website, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "unverify_website/delete");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("unverify_website/delete", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for user_account/analytics
        vertx.eventBus().<JsonObject> consumer(USER_ACCOUNT/ANALYTICS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "user_account/analytics";
                String startDateParam = message.body().getString("start_date");
                if(startDateParam == null) {
                    manageError(message, new MainApiException(400, "start_date is required"), serviceId);
                    return;
                }
                LocalDate startDate = Json.mapper.readValue(startDateParam, LocalDate.class);
                String endDateParam = message.body().getString("end_date");
                if(endDateParam == null) {
                    manageError(message, new MainApiException(400, "end_date is required"), serviceId);
                    return;
                }
                LocalDate endDate = Json.mapper.readValue(endDateParam, LocalDate.class);
                String fromClaimedContentParam = message.body().getString("from_claimed_content");
                String fromClaimedContent = (fromClaimedContentParam == null) ? "BOTH" : fromClaimedContentParam;
                String pinFormatParam = message.body().getString("pin_format");
                String pinFormat = (pinFormatParam == null) ? "ALL" : pinFormatParam;
                String appTypesParam = message.body().getString("app_types");
                String appTypes = (appTypesParam == null) ? "ALL" : appTypesParam;
                String contentTypeParam = message.body().getString("content_type");
                String contentType = (contentTypeParam == null) ? "ALL" : contentTypeParam;
                String sourceParam = message.body().getString("source");
                String source = (sourceParam == null) ? "ALL" : sourceParam;
                JsonArray metricTypesParam = message.body().getJsonArray("metric_types");
                List<String> metricTypes = (metricTypesParam == null) ? null : Json.mapper.readValue(metricTypesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String splitFieldParam = message.body().getString("split_field");
                String splitField = (splitFieldParam == null) ? "NO_SPLIT" : splitFieldParam;
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "user_account/analytics");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("user_account/analytics", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for user_account/analytics/top_pins
        vertx.eventBus().<JsonObject> consumer(USER_ACCOUNT/ANALYTICS/TOP_PINS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "user_account/analytics/top_pins";
                String startDateParam = message.body().getString("start_date");
                if(startDateParam == null) {
                    manageError(message, new MainApiException(400, "start_date is required"), serviceId);
                    return;
                }
                LocalDate startDate = Json.mapper.readValue(startDateParam, LocalDate.class);
                String endDateParam = message.body().getString("end_date");
                if(endDateParam == null) {
                    manageError(message, new MainApiException(400, "end_date is required"), serviceId);
                    return;
                }
                LocalDate endDate = Json.mapper.readValue(endDateParam, LocalDate.class);
                String sortByParam = message.body().getString("sort_by");
                if(sortByParam == null) {
                    manageError(message, new MainApiException(400, "sort_by is required"), serviceId);
                    return;
                }
                String sortBy = sortByParam;
                String fromClaimedContentParam = message.body().getString("from_claimed_content");
                String fromClaimedContent = (fromClaimedContentParam == null) ? "BOTH" : fromClaimedContentParam;
                String pinFormatParam = message.body().getString("pin_format");
                String pinFormat = (pinFormatParam == null) ? "ALL" : pinFormatParam;
                String appTypesParam = message.body().getString("app_types");
                String appTypes = (appTypesParam == null) ? "ALL" : appTypesParam;
                String contentTypeParam = message.body().getString("content_type");
                String contentType = (contentTypeParam == null) ? "ALL" : contentTypeParam;
                String sourceParam = message.body().getString("source");
                String source = (sourceParam == null) ? "ALL" : sourceParam;
                JsonArray metricTypesParam = message.body().getJsonArray("metric_types");
                List<String> metricTypes = (metricTypesParam == null) ? null : Json.mapper.readValue(metricTypesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String numOfPinsParam = message.body().getString("num_of_pins");
                Integer numOfPins = (numOfPinsParam == null) ? 10 : Json.mapper.readValue(numOfPinsParam, Integer.class);
                String createdInLastNDaysParam = message.body().getString("created_in_last_n_days");
                Integer createdInLastNDays = (createdInLastNDaysParam == null) ? null : Json.mapper.readValue(createdInLastNDaysParam, Integer.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.userAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "user_account/analytics/top_pins");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("user_account/analytics/top_pins", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for user_account/analytics/top_video_pins
        vertx.eventBus().<JsonObject> consumer(USER_ACCOUNT/ANALYTICS/TOP_VIDEO_PINS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "user_account/analytics/top_video_pins";
                String startDateParam = message.body().getString("start_date");
                if(startDateParam == null) {
                    manageError(message, new MainApiException(400, "start_date is required"), serviceId);
                    return;
                }
                LocalDate startDate = Json.mapper.readValue(startDateParam, LocalDate.class);
                String endDateParam = message.body().getString("end_date");
                if(endDateParam == null) {
                    manageError(message, new MainApiException(400, "end_date is required"), serviceId);
                    return;
                }
                LocalDate endDate = Json.mapper.readValue(endDateParam, LocalDate.class);
                String sortByParam = message.body().getString("sort_by");
                if(sortByParam == null) {
                    manageError(message, new MainApiException(400, "sort_by is required"), serviceId);
                    return;
                }
                String sortBy = sortByParam;
                String fromClaimedContentParam = message.body().getString("from_claimed_content");
                String fromClaimedContent = (fromClaimedContentParam == null) ? "BOTH" : fromClaimedContentParam;
                String pinFormatParam = message.body().getString("pin_format");
                String pinFormat = (pinFormatParam == null) ? "ALL" : pinFormatParam;
                String appTypesParam = message.body().getString("app_types");
                String appTypes = (appTypesParam == null) ? "ALL" : appTypesParam;
                String contentTypeParam = message.body().getString("content_type");
                String contentType = (contentTypeParam == null) ? "ALL" : contentTypeParam;
                String sourceParam = message.body().getString("source");
                String source = (sourceParam == null) ? "ALL" : sourceParam;
                JsonArray metricTypesParam = message.body().getJsonArray("metric_types");
                List<String> metricTypes = (metricTypesParam == null) ? null : Json.mapper.readValue(metricTypesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String numOfPinsParam = message.body().getString("num_of_pins");
                Integer numOfPins = (numOfPinsParam == null) ? 10 : Json.mapper.readValue(numOfPinsParam, Integer.class);
                String createdInLastNDaysParam = message.body().getString("created_in_last_n_days");
                Integer createdInLastNDays = (createdInLastNDaysParam == null) ? null : Json.mapper.readValue(createdInLastNDaysParam, Integer.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.userAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "user_account/analytics/top_video_pins");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("user_account/analytics/top_video_pins", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for user_account/followed_interests
        vertx.eventBus().<JsonObject> consumer(USER_ACCOUNT/FOLLOWED_INTERESTS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "user_account/followed_interests";
                String usernameParam = message.body().getString("username");
                if(usernameParam == null) {
                    manageError(message, new MainApiException(400, "username is required"), serviceId);
                    return;
                }
                String username = usernameParam;
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.userAccountFollowedInterests(username, bookmark, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "user_account/followed_interests");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("user_account/followed_interests", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for user_account/get
        vertx.eventBus().<JsonObject> consumer(USER_ACCOUNT/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "user_account/get";
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.userAccountGet(adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "user_account/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("user_account/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for user_following/get
        vertx.eventBus().<JsonObject> consumer(USER_FOLLOWING/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "user_following/get";
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                String feedTypeParam = message.body().getString("feed_type");
                UserFollowingFeedType feedType = (feedTypeParam == null) ? ALL : feedTypeParam;
                String explicitFollowingParam = message.body().getString("explicit_following");
                Boolean explicitFollowing = (explicitFollowingParam == null) ? false : Json.mapper.readValue(explicitFollowingParam, Boolean.class);
                String adAccountIdParam = message.body().getString("ad_account_id");
                String adAccountId = (adAccountIdParam == null) ? null : adAccountIdParam;
                service.userFollowingGet(bookmark, pageSize, feedType, explicitFollowing, adAccountId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "user_following/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("user_following/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for user_websites/get
        vertx.eventBus().<JsonObject> consumer(USER_WEBSITES/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "user_websites/get";
                String bookmarkParam = message.body().getString("bookmark");
                String bookmark = (bookmarkParam == null) ? null : bookmarkParam;
                String pageSizeParam = message.body().getString("page_size");
                Integer pageSize = (pageSizeParam == null) ? 25 : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.userWebsitesGet(bookmark, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "user_websites/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("user_websites/get", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for verify_website/update
        vertx.eventBus().<JsonObject> consumer(VERIFY_WEBSITE/UPDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "verify_website/update";
                JsonObject userWebsiteVerifyRequestParam = message.body().getJsonObject("UserWebsiteVerifyRequest");
                if (userWebsiteVerifyRequestParam == null) {
                    manageError(message, new MainApiException(400, "UserWebsiteVerifyRequest is required"), serviceId);
                    return;
                }
                UserWebsiteVerifyRequest userWebsiteVerifyRequest = Json.mapper.readValue(userWebsiteVerifyRequestParam.encode(), UserWebsiteVerifyRequest.class);
                service.verifyWebsiteUpdate(userWebsiteVerifyRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "verify_website/update");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("verify_website/update", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for website_verification/get
        vertx.eventBus().<JsonObject> consumer(WEBSITE_VERIFICATION/GET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "website_verification/get";
                service.websiteVerificationGet(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "website_verification/get");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("website_verification/get", e);
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
