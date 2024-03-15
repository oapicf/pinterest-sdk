package org.openapitools.controllers;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import java.io.File;
import java.util.List;

import org.openapitools.model.*;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UserAccountController  {
  /**
   * Uncomment and implement as you see fit.  These operations will map
   * Directly to operation calls from the routing logic.  Because the inflector
   * Code allows you to implement logic incrementally, they are disabled.
   **/

  /*
    public ResponseContext boardsUserFollowsList(RequestContext request , String bookmark, Integer pageSize, Boolean explicitFollowing, String adAccountId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext followUserUpdate(RequestContext request , String username, FollowUserRequest followUserRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext followersList(RequestContext request , String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext linkedBusinessAccountsGet(RequestContext request ) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext unverifyWebsiteDelete(RequestContext request , String website) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext userAccountAnalytics(RequestContext request , Date startDate, Date endDate, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, String splitField, String adAccountId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext userAccountAnalyticsTopPins(RequestContext request , Date startDate, Date endDate, String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, Integer numOfPins, Integer createdInLastNDays, String adAccountId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext userAccountAnalyticsTopVideoPins(RequestContext request , Date startDate, Date endDate, String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, Integer numOfPins, Integer createdInLastNDays, String adAccountId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext userAccountGet(RequestContext request , String adAccountId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext userFollowingGet(RequestContext request , String bookmark, Integer pageSize, UserFollowingFeedType feedType, Boolean explicitFollowing, String adAccountId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext userWebsitesGet(RequestContext request , String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext verifyWebsiteUpdate(RequestContext request , UserWebsiteVerifyRequest userWebsiteVerifyRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext websiteVerificationGet(RequestContext request ) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

}
