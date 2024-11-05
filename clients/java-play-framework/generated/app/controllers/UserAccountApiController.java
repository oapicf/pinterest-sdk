package controllers;

import apimodels.Account;
import apimodels.AnalyticsMetricsResponse;
import apimodels.BoardsUserFollowsList200Response;
import apimodels.Error;
import apimodels.FollowUserRequest;
import apimodels.FollowersList200Response;
import apimodels.LinkedBusiness;
import java.time.LocalDate;
import java.util.Map;
import apimodels.TopPinsAnalyticsResponse;
import apimodels.TopVideoPinsAnalyticsResponse;
import apimodels.UserAccountFollowedInterests200Response;
import apimodels.UserFollowingFeedType;
import apimodels.UserFollowingGet200Response;
import apimodels.UserSummary;
import apimodels.UserWebsiteSummary;
import apimodels.UserWebsiteVerificationCode;
import apimodels.UserWebsiteVerifyRequest;
import apimodels.UserWebsitesGet200Response;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UserAccountApiController extends Controller {
    private final UserAccountApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private UserAccountApiController(Config configuration, UserAccountApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result boardsUserFollowsList(Http.Request request) throws Exception {
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        String valueexplicitFollowing = request.getQueryString("explicit_following");
        Boolean explicitFollowing;
        if (valueexplicitFollowing != null) {
            explicitFollowing = Boolean.valueOf(valueexplicitFollowing);
        } else {
            explicitFollowing = false;
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.boardsUserFollowsListHttp(request, bookmark, pageSize, explicitFollowing, adAccountId);
    }

    @ApiAction
    public Result followUserUpdate(Http.Request request,  @Pattern(regexp="(?!^\\d+$)^.+$")String username) throws Exception {
        JsonNode nodefollowUserRequest = request.body().asJson();
        FollowUserRequest followUserRequest;
        if (nodefollowUserRequest != null) {
            followUserRequest = mapper.readValue(nodefollowUserRequest.toString(), FollowUserRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(followUserRequest);
            }
        } else {
            throw new IllegalArgumentException("'FollowUserRequest' parameter is required");
        }
        return imp.followUserUpdateHttp(request, username, followUserRequest);
    }

    @ApiAction
    public Result followersList(Http.Request request) throws Exception {
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.followersListHttp(request, bookmark, pageSize);
    }

    @ApiAction
    public Result linkedBusinessAccountsGet(Http.Request request) throws Exception {
        return imp.linkedBusinessAccountsGetHttp(request);
    }

    @ApiAction
    public Result unverifyWebsiteDelete(Http.Request request) throws Exception {
        String valuewebsite = request.getQueryString("website");
        String website;
        if (valuewebsite != null) {
            website = valuewebsite;
        } else {
            throw new IllegalArgumentException("'website' parameter is required");
        }
        return imp.unverifyWebsiteDeleteHttp(request, website);
    }

    @ApiAction
    public Result userAccountAnalytics(Http.Request request) throws Exception {
        String valuestartDate = request.getQueryString("start_date");
        LocalDate startDate;
        if (valuestartDate != null) {
            startDate = LocalDate.parse(valuestartDate);
        } else {
            throw new IllegalArgumentException("'start_date' parameter is required");
        }
        String valueendDate = request.getQueryString("end_date");
        LocalDate endDate;
        if (valueendDate != null) {
            endDate = LocalDate.parse(valueendDate);
        } else {
            throw new IllegalArgumentException("'end_date' parameter is required");
        }
        String valuefromClaimedContent = request.getQueryString("from_claimed_content");
        String fromClaimedContent;
        if (valuefromClaimedContent != null) {
            fromClaimedContent = valuefromClaimedContent;
        } else {
            fromClaimedContent = "BOTH";
        }
        String valuepinFormat = request.getQueryString("pin_format");
        String pinFormat;
        if (valuepinFormat != null) {
            pinFormat = valuepinFormat;
        } else {
            pinFormat = "ALL";
        }
        String valueappTypes = request.getQueryString("app_types");
        String appTypes;
        if (valueappTypes != null) {
            appTypes = valueappTypes;
        } else {
            appTypes = "ALL";
        }
        String valuecontentType = request.getQueryString("content_type");
        String contentType;
        if (valuecontentType != null) {
            contentType = valuecontentType;
        } else {
            contentType = "ALL";
        }
        String valuesource = request.getQueryString("source");
        String source;
        if (valuesource != null) {
            source = valuesource;
        } else {
            source = "ALL";
        }
        String[] metricTypesArray = request.queryString().get("metric_types");
        List<String> metricTypesList = OpenAPIUtils.parametersToList("csv", metricTypesArray);
        List<String> metricTypes = new ArrayList<>();
        for (String curParam : metricTypesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                metricTypes.add(curParam);
            }
        }
        String valuesplitField = request.getQueryString("split_field");
        String splitField;
        if (valuesplitField != null) {
            splitField = valuesplitField;
        } else {
            splitField = "NO_SPLIT";
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.userAccountAnalyticsHttp(request, startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId);
    }

    @ApiAction
    public Result userAccountAnalyticsTopPins(Http.Request request) throws Exception {
        String valuestartDate = request.getQueryString("start_date");
        LocalDate startDate;
        if (valuestartDate != null) {
            startDate = LocalDate.parse(valuestartDate);
        } else {
            throw new IllegalArgumentException("'start_date' parameter is required");
        }
        String valueendDate = request.getQueryString("end_date");
        LocalDate endDate;
        if (valueendDate != null) {
            endDate = LocalDate.parse(valueendDate);
        } else {
            throw new IllegalArgumentException("'end_date' parameter is required");
        }
        String valuesortBy = request.getQueryString("sort_by");
        String sortBy;
        if (valuesortBy != null) {
            sortBy = valuesortBy;
        } else {
            throw new IllegalArgumentException("'sort_by' parameter is required");
        }
        String valuefromClaimedContent = request.getQueryString("from_claimed_content");
        String fromClaimedContent;
        if (valuefromClaimedContent != null) {
            fromClaimedContent = valuefromClaimedContent;
        } else {
            fromClaimedContent = "BOTH";
        }
        String valuepinFormat = request.getQueryString("pin_format");
        String pinFormat;
        if (valuepinFormat != null) {
            pinFormat = valuepinFormat;
        } else {
            pinFormat = "ALL";
        }
        String valueappTypes = request.getQueryString("app_types");
        String appTypes;
        if (valueappTypes != null) {
            appTypes = valueappTypes;
        } else {
            appTypes = "ALL";
        }
        String valuecontentType = request.getQueryString("content_type");
        String contentType;
        if (valuecontentType != null) {
            contentType = valuecontentType;
        } else {
            contentType = "ALL";
        }
        String valuesource = request.getQueryString("source");
        String source;
        if (valuesource != null) {
            source = valuesource;
        } else {
            source = "ALL";
        }
        String[] metricTypesArray = request.queryString().get("metric_types");
        List<String> metricTypesList = OpenAPIUtils.parametersToList("csv", metricTypesArray);
        List<String> metricTypes = new ArrayList<>();
        for (String curParam : metricTypesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                metricTypes.add(curParam);
            }
        }
        String valuenumOfPins = request.getQueryString("num_of_pins");
        Integer numOfPins;
        if (valuenumOfPins != null) {
            numOfPins = Integer.parseInt(valuenumOfPins);
        } else {
            numOfPins = 10;
        }
        String valuecreatedInLastNDays = request.getQueryString("created_in_last_n_days");
        Integer createdInLastNDays;
        if (valuecreatedInLastNDays != null) {
            createdInLastNDays = Integer.parseInt(valuecreatedInLastNDays);
        } else {
            createdInLastNDays = null;
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.userAccountAnalyticsTopPinsHttp(request, startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId);
    }

    @ApiAction
    public Result userAccountAnalyticsTopVideoPins(Http.Request request) throws Exception {
        String valuestartDate = request.getQueryString("start_date");
        LocalDate startDate;
        if (valuestartDate != null) {
            startDate = LocalDate.parse(valuestartDate);
        } else {
            throw new IllegalArgumentException("'start_date' parameter is required");
        }
        String valueendDate = request.getQueryString("end_date");
        LocalDate endDate;
        if (valueendDate != null) {
            endDate = LocalDate.parse(valueendDate);
        } else {
            throw new IllegalArgumentException("'end_date' parameter is required");
        }
        String valuesortBy = request.getQueryString("sort_by");
        String sortBy;
        if (valuesortBy != null) {
            sortBy = valuesortBy;
        } else {
            throw new IllegalArgumentException("'sort_by' parameter is required");
        }
        String valuefromClaimedContent = request.getQueryString("from_claimed_content");
        String fromClaimedContent;
        if (valuefromClaimedContent != null) {
            fromClaimedContent = valuefromClaimedContent;
        } else {
            fromClaimedContent = "BOTH";
        }
        String valuepinFormat = request.getQueryString("pin_format");
        String pinFormat;
        if (valuepinFormat != null) {
            pinFormat = valuepinFormat;
        } else {
            pinFormat = "ALL";
        }
        String valueappTypes = request.getQueryString("app_types");
        String appTypes;
        if (valueappTypes != null) {
            appTypes = valueappTypes;
        } else {
            appTypes = "ALL";
        }
        String valuecontentType = request.getQueryString("content_type");
        String contentType;
        if (valuecontentType != null) {
            contentType = valuecontentType;
        } else {
            contentType = "ALL";
        }
        String valuesource = request.getQueryString("source");
        String source;
        if (valuesource != null) {
            source = valuesource;
        } else {
            source = "ALL";
        }
        String[] metricTypesArray = request.queryString().get("metric_types");
        List<String> metricTypesList = OpenAPIUtils.parametersToList("csv", metricTypesArray);
        List<String> metricTypes = new ArrayList<>();
        for (String curParam : metricTypesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                metricTypes.add(curParam);
            }
        }
        String valuenumOfPins = request.getQueryString("num_of_pins");
        Integer numOfPins;
        if (valuenumOfPins != null) {
            numOfPins = Integer.parseInt(valuenumOfPins);
        } else {
            numOfPins = 10;
        }
        String valuecreatedInLastNDays = request.getQueryString("created_in_last_n_days");
        Integer createdInLastNDays;
        if (valuecreatedInLastNDays != null) {
            createdInLastNDays = Integer.parseInt(valuecreatedInLastNDays);
        } else {
            createdInLastNDays = null;
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.userAccountAnalyticsTopVideoPinsHttp(request, startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId);
    }

    @ApiAction
    public Result userAccountFollowedInterests(Http.Request request,  @Pattern(regexp="(?!^\\d+$)^.+$")String username) throws Exception {
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.userAccountFollowedInterestsHttp(request, username, bookmark, pageSize);
    }

    @ApiAction
    public Result userAccountGet(Http.Request request) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.userAccountGetHttp(request, adAccountId);
    }

    @ApiAction
    public Result userFollowingGet(Http.Request request) throws Exception {
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        String valuefeedType = request.getQueryString("feed_type");
        UserFollowingFeedType feedType;
        if (valuefeedType != null) {
            feedType = valuefeedType;
        } else {
            feedType = "ALL";
        }
        String valueexplicitFollowing = request.getQueryString("explicit_following");
        Boolean explicitFollowing;
        if (valueexplicitFollowing != null) {
            explicitFollowing = Boolean.valueOf(valueexplicitFollowing);
        } else {
            explicitFollowing = false;
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.userFollowingGetHttp(request, bookmark, pageSize, feedType, explicitFollowing, adAccountId);
    }

    @ApiAction
    public Result userWebsitesGet(Http.Request request) throws Exception {
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.userWebsitesGetHttp(request, bookmark, pageSize);
    }

    @ApiAction
    public Result verifyWebsiteUpdate(Http.Request request) throws Exception {
        JsonNode nodeuserWebsiteVerifyRequest = request.body().asJson();
        UserWebsiteVerifyRequest userWebsiteVerifyRequest;
        if (nodeuserWebsiteVerifyRequest != null) {
            userWebsiteVerifyRequest = mapper.readValue(nodeuserWebsiteVerifyRequest.toString(), UserWebsiteVerifyRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(userWebsiteVerifyRequest);
            }
        } else {
            throw new IllegalArgumentException("'UserWebsiteVerifyRequest' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.verifyWebsiteUpdateHttp(request, userWebsiteVerifyRequest, adAccountId);
    }

    @ApiAction
    public Result websiteVerificationGet(Http.Request request) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.websiteVerificationGetHttp(request, adAccountId);
    }

}
