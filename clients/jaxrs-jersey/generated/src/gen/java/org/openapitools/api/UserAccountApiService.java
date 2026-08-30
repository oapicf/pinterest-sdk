package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import java.math.BigDecimal;
import org.openapitools.model.BoardsList200Response;
import java.util.Date;
import org.openapitools.model.FollowUser;
import org.openapitools.model.FollowUserCreate;
import org.openapitools.model.FollowersList200Response;
import org.openapitools.model.LinkedBusiness;
import java.util.Map;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.QuerymetrictypesItems;
import org.openapitools.model.QueryvideopinmetrictypesItems;
import org.openapitools.model.TopPinsAnalyticsResponse;
import org.openapitools.model.TopPinsSortBy;
import org.openapitools.model.TopVideoPinsAnalyticsResponse;
import org.openapitools.model.TopVideoPinsSortBy;
import org.openapitools.model.UserFollowingFeedType;
import org.openapitools.model.UserWebsite;
import org.openapitools.model.UserWebsiteCreate;
import org.openapitools.model.UserWebsiteVerification;
import org.openapitools.model.UserWebsitesGet200Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-30T09:54:14.357431345Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public abstract class UserAccountApiService {
    public abstract Response boardsUserFollowsList( @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,Boolean explicitFollowing,String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response followUserUpdate( @Pattern(regexp="(?!^\\d+$)^.+$")String username,FollowUserCreate followUserCreate,SecurityContext securityContext) throws NotFoundException;
    public abstract Response followersList(String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response linkedBusinessAccountsGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response unverifyWebsiteDelete( @NotNull String website,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userAccountAnalytics( @NotNull Date startDate, @NotNull Date endDate,String fromClaimedContent,String pinFormat,String appTypes,String contentType,String source,List<QuerymetrictypesItems> metricTypes,String splitField, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userAccountAnalyticsTopPins( @NotNull Date startDate, @NotNull Date endDate, @NotNull TopPinsSortBy sortBy,String fromClaimedContent,String pinFormat,String appTypes,String contentType,String source,List<QuerymetrictypesItems> metricTypes, @Min(1) @Max(50)Integer numOfPins,BigDecimal createdInLastNDays, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userAccountAnalyticsTopVideoPins( @NotNull Date startDate, @NotNull Date endDate, @NotNull TopVideoPinsSortBy sortBy,String fromClaimedContent,String pinFormat,String appTypes,String contentType,String source,List<QueryvideopinmetrictypesItems> metricTypes, @Min(1) @Max(50)Integer numOfPins,BigDecimal createdInLastNDays, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userAccountGet( @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userFollowingGet( @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,Boolean explicitFollowing,UserFollowingFeedType feedType,String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userWebsitesGet(String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response verifyWebsiteUpdate(UserWebsiteCreate userWebsiteCreate, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response websiteVerificationGet( @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
}
