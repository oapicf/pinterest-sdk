package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.BoardsUserFollowsList200Response;
import org.openapitools.model.Error;
import org.openapitools.model.FollowUserRequest;
import org.openapitools.model.FollowersList200Response;
import org.openapitools.model.LinkedBusiness;
import org.joda.time.LocalDate;
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

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-14T23:04:18.835425768Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface UserAccountApiService {
      public Response boardsUserFollowsList(String bookmark, Integer pageSize, Boolean explicitFollowing, String adAccountId, SecurityContext securityContext);
      public Response followUserUpdate(String username, FollowUserRequest followUserRequest, SecurityContext securityContext);
      public Response followersList(String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response linkedBusinessAccountsGet(SecurityContext securityContext);
      public Response unverifyWebsiteDelete(String website, SecurityContext securityContext);
      public Response userAccountAnalytics(LocalDate startDate, LocalDate endDate, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, String splitField, String adAccountId, SecurityContext securityContext);
      public Response userAccountAnalyticsTopPins(LocalDate startDate, LocalDate endDate, String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, Integer numOfPins, Integer createdInLastNDays, String adAccountId, SecurityContext securityContext);
      public Response userAccountAnalyticsTopVideoPins(LocalDate startDate, LocalDate endDate, String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, Integer numOfPins, Integer createdInLastNDays, String adAccountId, SecurityContext securityContext);
      public Response userAccountGet(String adAccountId, SecurityContext securityContext);
      public Response userFollowingGet(String bookmark, Integer pageSize, UserFollowingFeedType feedType, Boolean explicitFollowing, String adAccountId, SecurityContext securityContext);
      public Response userWebsitesGet(String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response verifyWebsiteUpdate(UserWebsiteVerifyRequest userWebsiteVerifyRequest, SecurityContext securityContext);
      public Response websiteVerificationGet(SecurityContext securityContext);
}
