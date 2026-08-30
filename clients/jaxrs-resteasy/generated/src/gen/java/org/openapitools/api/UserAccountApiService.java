package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



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

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface UserAccountApiService {
      Response boardsUserFollowsList(String adAccountId,Boolean explicitFollowing,String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response followUserUpdate(String username,FollowUserCreate followUserCreate,SecurityContext securityContext)
      throws NotFoundException;
      Response followersList(String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response linkedBusinessAccountsGet(SecurityContext securityContext)
      throws NotFoundException;
      Response unverifyWebsiteDelete(String website,SecurityContext securityContext)
      throws NotFoundException;
      Response userAccountAnalytics(Date startDate,Date endDate,String fromClaimedContent,String pinFormat,String appTypes,String contentType,String source,List<QuerymetrictypesItems> metricTypes,String splitField,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response userAccountAnalyticsTopPins(Date startDate,Date endDate,TopPinsSortBy sortBy,String fromClaimedContent,String pinFormat,String appTypes,String contentType,String source,List<QuerymetrictypesItems> metricTypes,Integer numOfPins,BigDecimal createdInLastNDays,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response userAccountAnalyticsTopVideoPins(Date startDate,Date endDate,TopVideoPinsSortBy sortBy,String fromClaimedContent,String pinFormat,String appTypes,String contentType,String source,List<QueryvideopinmetrictypesItems> metricTypes,Integer numOfPins,BigDecimal createdInLastNDays,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response userAccountGet(String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response userFollowingGet(String adAccountId,Boolean explicitFollowing,UserFollowingFeedType feedType,String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response userWebsitesGet(String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response verifyWebsiteUpdate(UserWebsiteCreate userWebsiteCreate,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response websiteVerificationGet(String adAccountId,SecurityContext securityContext)
      throws NotFoundException;


}
