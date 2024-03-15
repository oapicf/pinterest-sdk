package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.BoardsUserFollowsList200Response;
import java.util.Date;
import org.openapitools.model.Error;
import org.openapitools.model.FollowUserRequest;
import org.openapitools.model.FollowersList200Response;
import org.openapitools.model.LinkedBusiness;
import java.util.List;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public abstract class UserAccountApiService {
    public abstract Response boardsUserFollowsList(String bookmark
 ,Integer pageSize
 ,Boolean explicitFollowing
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response followUserUpdate(String username
 ,FollowUserRequest followUserRequest
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
 ,List<String> metricTypes
 ,String splitField
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response userAccountAnalyticsTopPins(Date startDate
 ,Date endDate
 ,String sortBy
 ,String fromClaimedContent
 ,String pinFormat
 ,String appTypes
 ,String contentType
 ,String source
 ,List<String> metricTypes
 ,Integer numOfPins
 ,Integer createdInLastNDays
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response userAccountAnalyticsTopVideoPins(Date startDate
 ,Date endDate
 ,String sortBy
 ,String fromClaimedContent
 ,String pinFormat
 ,String appTypes
 ,String contentType
 ,String source
 ,List<String> metricTypes
 ,Integer numOfPins
 ,Integer createdInLastNDays
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response userAccountGet(String adAccountId
 ) throws NotFoundException;
    public abstract Response userFollowingGet(String bookmark
 ,Integer pageSize
 ,UserFollowingFeedType feedType
 ,Boolean explicitFollowing
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response userWebsitesGet(String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response verifyWebsiteUpdate(UserWebsiteVerifyRequest userWebsiteVerifyRequest
 ) throws NotFoundException;
    public abstract Response websiteVerificationGet() throws NotFoundException;
}
