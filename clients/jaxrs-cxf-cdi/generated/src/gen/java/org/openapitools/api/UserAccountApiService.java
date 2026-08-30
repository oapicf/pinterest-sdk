package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import java.math.BigDecimal;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.FollowUser;
import org.openapitools.model.FollowUserCreate;
import org.openapitools.model.FollowersList200Response;
import org.openapitools.model.LinkedBusiness;
import org.joda.time.LocalDate;
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

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-08-30T09:54:04.171825690Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface UserAccountApiService {
      public Response boardsUserFollowsList(String adAccountId, Boolean explicitFollowing, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response followUserUpdate(String username, FollowUserCreate followUserCreate, SecurityContext securityContext);
      public Response followersList(String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response linkedBusinessAccountsGet(SecurityContext securityContext);
      public Response unverifyWebsiteDelete(String website, SecurityContext securityContext);
      public Response userAccountAnalytics(LocalDate startDate, LocalDate endDate, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<QuerymetrictypesItems> metricTypes, String splitField, String adAccountId, SecurityContext securityContext);
      public Response userAccountAnalyticsTopPins(LocalDate startDate, LocalDate endDate, TopPinsSortBy sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<QuerymetrictypesItems> metricTypes, Integer numOfPins, BigDecimal createdInLastNDays, String adAccountId, SecurityContext securityContext);
      public Response userAccountAnalyticsTopVideoPins(LocalDate startDate, LocalDate endDate, TopVideoPinsSortBy sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<QueryvideopinmetrictypesItems> metricTypes, Integer numOfPins, BigDecimal createdInLastNDays, String adAccountId, SecurityContext securityContext);
      public Response userAccountGet(String adAccountId, SecurityContext securityContext);
      public Response userFollowingGet(String adAccountId, Boolean explicitFollowing, UserFollowingFeedType feedType, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response userWebsitesGet(String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response verifyWebsiteUpdate(UserWebsiteCreate userWebsiteCreate, String adAccountId, SecurityContext securityContext);
      public Response websiteVerificationGet(String adAccountId, SecurityContext securityContext);
}
