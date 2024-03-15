package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


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

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UserAccountApiServiceImpl implements UserAccountApiService {
      public Response boardsUserFollowsList(String bookmark,Integer pageSize,Boolean explicitFollowing,String adAccountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response followUserUpdate(String username,FollowUserRequest followUserRequest,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response followersList(String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response linkedBusinessAccountsGet(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response unverifyWebsiteDelete(String website,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response userAccountAnalytics(Date startDate,Date endDate,String fromClaimedContent,String pinFormat,String appTypes,String contentType,String source,List<String> metricTypes,String splitField,String adAccountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response userAccountAnalyticsTopPins(Date startDate,Date endDate,String sortBy,String fromClaimedContent,String pinFormat,String appTypes,String contentType,String source,List<String> metricTypes,Integer numOfPins,Integer createdInLastNDays,String adAccountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response userAccountAnalyticsTopVideoPins(Date startDate,Date endDate,String sortBy,String fromClaimedContent,String pinFormat,String appTypes,String contentType,String source,List<String> metricTypes,Integer numOfPins,Integer createdInLastNDays,String adAccountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response userAccountGet(String adAccountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response userFollowingGet(String bookmark,Integer pageSize,UserFollowingFeedType feedType,Boolean explicitFollowing,String adAccountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response userWebsitesGet(String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response verifyWebsiteUpdate(UserWebsiteVerifyRequest userWebsiteVerifyRequest,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response websiteVerificationGet(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
