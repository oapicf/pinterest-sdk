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

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UserAccountApiControllerImp extends UserAccountApiControllerImpInterface {
    @Override
    public BoardsUserFollowsList200Response boardsUserFollowsList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize, Boolean explicitFollowing,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new BoardsUserFollowsList200Response();
    }

    @Override
    public UserSummary followUserUpdate(Http.Request request,  @Pattern(regexp="(?!^\\d+$)^.+$")String username, FollowUserRequest followUserRequest) throws Exception {
        //Do your magic!!!
        return new UserSummary();
    }

    @Override
    public FollowersList200Response followersList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new FollowersList200Response();
    }

    @Override
    public List<LinkedBusiness> linkedBusinessAccountsGet(Http.Request request) throws Exception {
        //Do your magic!!!
        return new ArrayList<LinkedBusiness>();
    }

    @Override
    public void unverifyWebsiteDelete(Http.Request request, @NotNull String website) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Map<String, AnalyticsMetricsResponse> userAccountAnalytics(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, String splitField,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new HashMap<String, AnalyticsMetricsResponse>();
    }

    @Override
    public TopPinsAnalyticsResponse userAccountAnalyticsTopPins(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes,  @Min(1) @Max(50)Integer numOfPins, Integer createdInLastNDays,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new TopPinsAnalyticsResponse();
    }

    @Override
    public TopVideoPinsAnalyticsResponse userAccountAnalyticsTopVideoPins(Http.Request request, @NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes,  @Min(1) @Max(50)Integer numOfPins, Integer createdInLastNDays,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new TopVideoPinsAnalyticsResponse();
    }

    @Override
    public UserAccountFollowedInterests200Response userAccountFollowedInterests(Http.Request request,  @Pattern(regexp="(?!^\\d+$)^.+$")String username, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new UserAccountFollowedInterests200Response();
    }

    @Override
    public Account userAccountGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new Account();
    }

    @Override
    public UserFollowingGet200Response userFollowingGet(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize, UserFollowingFeedType feedType, Boolean explicitFollowing,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new UserFollowingGet200Response();
    }

    @Override
    public UserWebsitesGet200Response userWebsitesGet(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new UserWebsitesGet200Response();
    }

    @Override
    public UserWebsiteSummary verifyWebsiteUpdate(Http.Request request, UserWebsiteVerifyRequest userWebsiteVerifyRequest,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new UserWebsiteSummary();
    }

    @Override
    public UserWebsiteVerificationCode websiteVerificationGet(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new UserWebsiteVerificationCode();
    }

}
