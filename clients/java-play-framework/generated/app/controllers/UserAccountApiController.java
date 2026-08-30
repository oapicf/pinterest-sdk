package controllers;

import apimodels.Account;
import apimodels.AnalyticsMetricsResponse;
import java.math.BigDecimal;
import apimodels.BoardsList200Response;
import apimodels.FollowUser;
import apimodels.FollowUserCreate;
import apimodels.FollowersList200Response;
import apimodels.LinkedBusiness;
import java.time.LocalDate;
import java.util.Map;
import apimodels.PinterestLibError;
import apimodels.QuerymetrictypesItems;
import apimodels.QueryvideopinmetrictypesItems;
import apimodels.TopPinsAnalyticsResponse;
import apimodels.TopPinsSortBy;
import apimodels.TopVideoPinsAnalyticsResponse;
import apimodels.TopVideoPinsSortBy;
import apimodels.UserAccountFollowedInterests200Response;
import apimodels.UserFollowingFeedType;
import apimodels.UserWebsite;
import apimodels.UserWebsiteCreate;
import apimodels.UserWebsiteVerification;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        String valueexplicitFollowing = request.getQueryString("explicit_following");
        Boolean explicitFollowing;
        if (valueexplicitFollowing != null) {
            explicitFollowing = Boolean.valueOf(valueexplicitFollowing);
        } else {
            explicitFollowing = false;
        }
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
        return imp.boardsUserFollowsListHttp(request, adAccountId, explicitFollowing, bookmark, pageSize);
    }

    @ApiAction
    public Result followUserUpdate(Http.Request request,  @Pattern(regexp="(?!^\\d+$)^.+$")String username) throws Exception {
        JsonNode nodefollowUserCreate = request.body().asJson();
        FollowUserCreate followUserCreate;
        if (nodefollowUserCreate != null) {
            followUserCreate = mapper.readValue(nodefollowUserCreate.toString(), FollowUserCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(followUserCreate);
            }
        } else {
            throw new IllegalArgumentException("'FollowUserCreate' parameter is required");
        }
        return imp.followUserUpdateHttp(request, username, followUserCreate);
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
        List<QuerymetrictypesItems> metricTypes = new ArrayList<>();
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
        TopPinsSortBy sortBy;
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
        List<QuerymetrictypesItems> metricTypes = new ArrayList<>();
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
        BigDecimal createdInLastNDays;
        if (valuecreatedInLastNDays != null) {
            createdInLastNDays = new BigDecimal(valuecreatedInLastNDays);
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
        TopVideoPinsSortBy sortBy;
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
        List<QueryvideopinmetrictypesItems> metricTypes = new ArrayList<>();
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
        BigDecimal createdInLastNDays;
        if (valuecreatedInLastNDays != null) {
            createdInLastNDays = new BigDecimal(valuecreatedInLastNDays);
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
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        String valueexplicitFollowing = request.getQueryString("explicit_following");
        Boolean explicitFollowing;
        if (valueexplicitFollowing != null) {
            explicitFollowing = Boolean.valueOf(valueexplicitFollowing);
        } else {
            explicitFollowing = false;
        }
        String valuefeedType = request.getQueryString("feed_type");
        UserFollowingFeedType feedType;
        if (valuefeedType != null) {
            feedType = valuefeedType;
        } else {
            feedType = ALL;
        }
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
        return imp.userFollowingGetHttp(request, adAccountId, explicitFollowing, feedType, bookmark, pageSize);
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
        JsonNode nodeuserWebsiteCreate = request.body().asJson();
        UserWebsiteCreate userWebsiteCreate;
        if (nodeuserWebsiteCreate != null) {
            userWebsiteCreate = mapper.readValue(nodeuserWebsiteCreate.toString(), UserWebsiteCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(userWebsiteCreate);
            }
        } else {
            throw new IllegalArgumentException("'UserWebsiteCreate' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.verifyWebsiteUpdateHttp(request, userWebsiteCreate, adAccountId);
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
