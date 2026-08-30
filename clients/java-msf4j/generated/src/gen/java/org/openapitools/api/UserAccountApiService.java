package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import java.math.BigDecimal;
import org.openapitools.model.BoardsList200Response;
import java.util.Date;
import org.openapitools.model.FollowUser;
import org.openapitools.model.FollowUserCreate;
import org.openapitools.model.FollowersList200Response;
import org.openapitools.model.LinkedBusiness;
import java.util.List;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public abstract class UserAccountApiService {
    public abstract Response boardsUserFollowsList(String adAccountId
 ,Boolean explicitFollowing
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response followUserUpdate(String username
 ,FollowUserCreate followUserCreate
 ) throws NotFoundException;
    public abstract Response followersList(String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response linkedBusinessAccountsGet() throws NotFoundException;
    public abstract Response unverifyWebsiteDelete(String website
 ) throws NotFoundException;
    public abstract Response userAccountAnalytics(Date startDate
 ,Date endDate
 ,String fromClaimedContent
 ,String pinFormat
 ,String appTypes
 ,String contentType
 ,String source
 ,List<QuerymetrictypesItems> metricTypes
 ,String splitField
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response userAccountAnalyticsTopPins(Date startDate
 ,Date endDate
 ,TopPinsSortBy sortBy
 ,String fromClaimedContent
 ,String pinFormat
 ,String appTypes
 ,String contentType
 ,String source
 ,List<QuerymetrictypesItems> metricTypes
 ,Integer numOfPins
 ,BigDecimal createdInLastNDays
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response userAccountAnalyticsTopVideoPins(Date startDate
 ,Date endDate
 ,TopVideoPinsSortBy sortBy
 ,String fromClaimedContent
 ,String pinFormat
 ,String appTypes
 ,String contentType
 ,String source
 ,List<QueryvideopinmetrictypesItems> metricTypes
 ,Integer numOfPins
 ,BigDecimal createdInLastNDays
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response userAccountGet(String adAccountId
 ) throws NotFoundException;
    public abstract Response userFollowingGet(String adAccountId
 ,Boolean explicitFollowing
 ,UserFollowingFeedType feedType
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response userWebsitesGet(String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response verifyWebsiteUpdate(UserWebsiteCreate userWebsiteCreate
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response websiteVerificationGet(String adAccountId
 ) throws NotFoundException;
}
