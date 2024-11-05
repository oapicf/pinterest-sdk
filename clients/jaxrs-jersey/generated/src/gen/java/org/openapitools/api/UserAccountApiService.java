package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.BoardsUserFollowsList200Response;
import java.util.Date;
import org.openapitools.model.Error;
import org.openapitools.model.FollowUserRequest;
import org.openapitools.model.FollowersList200Response;
import org.openapitools.model.LinkedBusiness;
import java.util.Map;
import org.openapitools.model.TopPinsAnalyticsResponse;
import org.openapitools.model.TopVideoPinsAnalyticsResponse;
import org.openapitools.model.UserFollowingFeedType;
import org.openapitools.model.UserFollowingGet200Response;
import org.openapitools.model.UserSummary;
import org.openapitools.model.UserWebsiteSummary;
import org.openapitools.model.UserWebsiteVerificationCode;
import org.openapitools.model.UserWebsiteVerifyRequest;
import org.openapitools.model.UserWebsitesGet200Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public abstract class UserAccountApiService {
    public abstract Response boardsUserFollowsList(String bookmark, @Min(1) @Max(250)Integer pageSize,Boolean explicitFollowing, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response followUserUpdate( @Pattern(regexp="(?!^\\d+$)^.+$")String username,FollowUserRequest followUserRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response followersList(String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response linkedBusinessAccountsGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response unverifyWebsiteDelete( @NotNull String website,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userAccountAnalytics( @NotNull Date startDate, @NotNull Date endDate,String fromClaimedContent,String pinFormat,String appTypes,String contentType,String source,List<String> metricTypes,String splitField, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userAccountAnalyticsTopPins( @NotNull Date startDate, @NotNull Date endDate, @NotNull String sortBy,String fromClaimedContent,String pinFormat,String appTypes,String contentType,String source,List<String> metricTypes, @Min(1) @Max(50)Integer numOfPins,Integer createdInLastNDays, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userAccountAnalyticsTopVideoPins( @NotNull Date startDate, @NotNull Date endDate, @NotNull String sortBy,String fromClaimedContent,String pinFormat,String appTypes,String contentType,String source,List<String> metricTypes, @Min(1) @Max(50)Integer numOfPins,Integer createdInLastNDays, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userAccountGet( @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userFollowingGet(String bookmark, @Min(1) @Max(250)Integer pageSize,UserFollowingFeedType feedType,Boolean explicitFollowing, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userWebsitesGet(String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response verifyWebsiteUpdate(UserWebsiteVerifyRequest userWebsiteVerifyRequest, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response websiteVerificationGet( @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
}
