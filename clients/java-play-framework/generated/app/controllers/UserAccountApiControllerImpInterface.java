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

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class UserAccountApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result boardsUserFollowsListHttp(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize, Boolean explicitFollowing,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BoardsUserFollowsList200Response obj = boardsUserFollowsList(request, bookmark, pageSize, explicitFollowing, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BoardsUserFollowsList200Response boardsUserFollowsList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize, Boolean explicitFollowing,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result followUserUpdateHttp(Http.Request request,  @Pattern(regexp="(?!^\\d+$)^.+$")String username, FollowUserRequest followUserRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        UserSummary obj = followUserUpdate(request, username, followUserRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UserSummary followUserUpdate(Http.Request request,  @Pattern(regexp="(?!^\\d+$)^.+$")String username, FollowUserRequest followUserRequest) throws Exception;

    public Result followersListHttp(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        FollowersList200Response obj = followersList(request, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract FollowersList200Response followersList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result linkedBusinessAccountsGetHttp(Http.Request request) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        List<LinkedBusiness> obj = linkedBusinessAccountsGet(request);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (LinkedBusiness curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<LinkedBusiness> linkedBusinessAccountsGet(Http.Request request) throws Exception;

    public Result unverifyWebsiteDeleteHttp(Http.Request request, @NotNull String website) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        unverifyWebsiteDelete(request, website);
        return ok();

    }

    public abstract void unverifyWebsiteDelete(Http.Request request, @NotNull String website) throws Exception;

    public Result userAccountAnalyticsHttp(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, String splitField,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Map<String, AnalyticsMetricsResponse> obj = userAccountAnalytics(request, startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Map.Entry<String, AnalyticsMetricsResponse> entry : obj.entrySet()) {
                OpenAPIUtils.validate(entry.getValue());
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Map<String, AnalyticsMetricsResponse> userAccountAnalytics(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, String splitField,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result userAccountAnalyticsTopPinsHttp(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes,  @Min(1) @Max(50)Integer numOfPins, Integer createdInLastNDays,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        TopPinsAnalyticsResponse obj = userAccountAnalyticsTopPins(request, startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TopPinsAnalyticsResponse userAccountAnalyticsTopPins(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes,  @Min(1) @Max(50)Integer numOfPins, Integer createdInLastNDays,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result userAccountAnalyticsTopVideoPinsHttp(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes,  @Min(1) @Max(50)Integer numOfPins, Integer createdInLastNDays,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        TopVideoPinsAnalyticsResponse obj = userAccountAnalyticsTopVideoPins(request, startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TopVideoPinsAnalyticsResponse userAccountAnalyticsTopVideoPins(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes,  @Min(1) @Max(50)Integer numOfPins, Integer createdInLastNDays,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result userAccountFollowedInterestsHttp(Http.Request request,  @Pattern(regexp="(?!^\\d+$)^.+$")String username, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        UserAccountFollowedInterests200Response obj = userAccountFollowedInterests(request, username, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UserAccountFollowedInterests200Response userAccountFollowedInterests(Http.Request request,  @Pattern(regexp="(?!^\\d+$)^.+$")String username, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result userAccountGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Account obj = userAccountGet(request, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Account userAccountGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result userFollowingGetHttp(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize, UserFollowingFeedType feedType, Boolean explicitFollowing,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        UserFollowingGet200Response obj = userFollowingGet(request, bookmark, pageSize, feedType, explicitFollowing, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UserFollowingGet200Response userFollowingGet(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize, UserFollowingFeedType feedType, Boolean explicitFollowing,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result userWebsitesGetHttp(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        UserWebsitesGet200Response obj = userWebsitesGet(request, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UserWebsitesGet200Response userWebsitesGet(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result verifyWebsiteUpdateHttp(Http.Request request, UserWebsiteVerifyRequest userWebsiteVerifyRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        UserWebsiteSummary obj = verifyWebsiteUpdate(request, userWebsiteVerifyRequest, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UserWebsiteSummary verifyWebsiteUpdate(Http.Request request, UserWebsiteVerifyRequest userWebsiteVerifyRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result websiteVerificationGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        UserWebsiteVerificationCode obj = websiteVerificationGet(request, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UserWebsiteVerificationCode websiteVerificationGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

}
