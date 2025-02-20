/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;
import org.openapitools.model.*;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.LoggingLevel;

@Component
public class UserAccountApi extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        

        /**
        GET /user_account/following/boards : List following boards
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("user_accounts:read","See your user accounts and followers")
                .end()
                .oauth2("client_credentials")
                    .flow("application")
                    .tokenUrl("https://api.pinterest.com/v3/oauth/access_token/")
                        .withScope("user_accounts:read","See your user accounts and followers")
                
            .endSecurityDefinition()
            .get("/user_account/following/boards")
                .description("List following boards")
                .id("boardsUserFollowsListApi")
                .produces("application/json")
                .outType(BoardsUserFollowsList200Response.class)
                .param()
                    .name("bookmark")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Cursor used to fetch the next page of items")
                .endParam()
                .param()
                    .name("pageSize")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")
                .endParam()
                .param()
                    .name("explicitFollowing")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.")
                .endParam()
                .param()
                    .name("adAccountId")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .to("direct:boardsUserFollowsList");
        

        /**
        POST /user_account/following/{username} : Follow user
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("user_accounts:write","Update your user accounts and followers")
                
            .endSecurityDefinition()
            .post("/user_account/following/{username}")
                .description("Follow user")
                .id("followUserUpdateApi")
                .produces("application/json")
                .outType(UserSummary.class)
                .consumes("application/json")
                .type(FollowUserRequest.class)
                
                .param()
                    .name("username")
                    .type(RestParamType.path)
                    .required(true)
                    .description("A valid username")
                .endParam()
                .param()
                    .name("followUserRequest")
                    .type(RestParamType.body)
                    .required(true)
                    .description("Follow a user.")
                .endParam()
                .to("direct:followUserUpdate");
        

        /**
        GET /user_account/followers : List followers
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("user_accounts:read","See your user accounts and followers")
                .end()
                .oauth2("client_credentials")
                    .flow("application")
                    .tokenUrl("https://api.pinterest.com/v3/oauth/access_token/")
                        .withScope("user_accounts:read","See your user accounts and followers")
                
            .endSecurityDefinition()
            .get("/user_account/followers")
                .description("List followers")
                .id("followersListApi")
                .produces("application/json")
                .outType(FollowersList200Response.class)
                .param()
                    .name("bookmark")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Cursor used to fetch the next page of items")
                .endParam()
                .param()
                    .name("pageSize")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")
                .endParam()
                .to("direct:followersList");
        

        /**
        GET /user_account/businesses : List linked businesses
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("user_accounts:read","See your user accounts and followers")
                .end()
                .oauth2("client_credentials")
                    .flow("application")
                    .tokenUrl("https://api.pinterest.com/v3/oauth/access_token/")
                        .withScope("user_accounts:read","See your user accounts and followers")
                
            .endSecurityDefinition()
            .get("/user_account/businesses")
                .description("List linked businesses")
                .id("linkedBusinessAccountsGetApi")
                .produces("application/json")
                .outType(LinkedBusiness[].class)
                .to("direct:linkedBusinessAccountsGet");
        

        /**
        DELETE /user_account/websites : Unverify website
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("user_accounts:write","Update your user accounts and followers")
                
            .endSecurityDefinition()
            .delete("/user_account/websites")
                .description("Unverify website")
                .id("unverifyWebsiteDeleteApi")
                .produces("application/json")
                .outType(Void.class)
                .param()
                    .name("website")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Website with path or domain only")
                .endParam()
                .to("direct:unverifyWebsiteDelete");
        

        /**
        GET /user_account/analytics : Get user account analytics
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("user_accounts:read","See your user accounts and followers")
                
            .endSecurityDefinition()
            .get("/user_account/analytics")
                .description("Get user account analytics")
                .id("userAccountAnalyticsApi")
                .produces("application/json")
                .param()
                    .name("startDate")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")
                .endParam()
                .param()
                    .name("endDate")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")
                .endParam()
                .param()
                    .name("fromClaimedContent")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Filter on Pins that match your claimed domain.")
                .endParam()
                .param()
                    .name("pinFormat")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Pin formats to get data for, default is all.")
                .endParam()
                .param()
                    .name("appTypes")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Apps or devices to get data for, default is all.")
                .endParam()
                .param()
                    .name("contentType")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Filter to paid or organic data. Default is all.")
                .endParam()
                .param()
                    .name("source")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts")
                .endParam()
                .param()
                    .name("metricTypes")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Metric types to get data for, default is all. ")
                .endParam()
                .param()
                    .name("splitField")
                    .type(RestParamType.query)
                    .required(false)
                    .description("How to split the data into groups. Not including this param means data won't be split.")
                .endParam()
                .param()
                    .name("adAccountId")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .to("direct:userAccountAnalytics");
        

        /**
        GET /user_account/analytics/top_pins : Get user account top pins analytics
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("pins:read","See your public Pins")
                        .withScope("user_accounts:read","See your user accounts and followers")
                .end()
                .oauth2("client_credentials")
                    .flow("application")
                    .tokenUrl("https://api.pinterest.com/v3/oauth/access_token/")
                        .withScope("pins:read","See your public Pins")
                        .withScope("user_accounts:read","See your user accounts and followers")
                
            .endSecurityDefinition()
            .get("/user_account/analytics/top_pins")
                .description("Get user account top pins analytics")
                .id("userAccountAnalyticsTopPinsApi")
                .produces("application/json")
                .outType(TopPinsAnalyticsResponse.class)
                .param()
                    .name("startDate")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")
                .endParam()
                .param()
                    .name("endDate")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")
                .endParam()
                .param()
                    .name("sortBy")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Specify sorting order for metrics")
                .endParam()
                .param()
                    .name("fromClaimedContent")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Filter on Pins that match your claimed domain.")
                .endParam()
                .param()
                    .name("pinFormat")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Pin formats to get data for, default is all.")
                .endParam()
                .param()
                    .name("appTypes")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Apps or devices to get data for, default is all.")
                .endParam()
                .param()
                    .name("contentType")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Filter to paid or organic data. Default is all.")
                .endParam()
                .param()
                    .name("source")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts")
                .endParam()
                .param()
                    .name("metricTypes")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Metric types to get data for, default is all. ")
                .endParam()
                .param()
                    .name("numOfPins")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of pins to include, default is 10. Max is 50.")
                .endParam()
                .param()
                    .name("createdInLastNDays")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Get metrics for pins created in the last \"n\" days.")
                .endParam()
                .param()
                    .name("adAccountId")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .to("direct:userAccountAnalyticsTopPins");
        

        /**
        GET /user_account/analytics/top_video_pins : Get user account top video pins analytics
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("pins:read","See your public Pins")
                        .withScope("user_accounts:read","See your user accounts and followers")
                .end()
                .oauth2("client_credentials")
                    .flow("application")
                    .tokenUrl("https://api.pinterest.com/v3/oauth/access_token/")
                        .withScope("pins:read","See your public Pins")
                        .withScope("user_accounts:read","See your user accounts and followers")
                
            .endSecurityDefinition()
            .get("/user_account/analytics/top_video_pins")
                .description("Get user account top video pins analytics")
                .id("userAccountAnalyticsTopVideoPinsApi")
                .produces("application/json")
                .outType(TopVideoPinsAnalyticsResponse.class)
                .param()
                    .name("startDate")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")
                .endParam()
                .param()
                    .name("endDate")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")
                .endParam()
                .param()
                    .name("sortBy")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Specify sorting order for video metrics")
                .endParam()
                .param()
                    .name("fromClaimedContent")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Filter on Pins that match your claimed domain.")
                .endParam()
                .param()
                    .name("pinFormat")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Pin formats to get data for, default is all.")
                .endParam()
                .param()
                    .name("appTypes")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Apps or devices to get data for, default is all.")
                .endParam()
                .param()
                    .name("contentType")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Filter to paid or organic data. Default is all.")
                .endParam()
                .param()
                    .name("source")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts")
                .endParam()
                .param()
                    .name("metricTypes")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Metric types to get video data for, default is all. ")
                .endParam()
                .param()
                    .name("numOfPins")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of pins to include, default is 10. Max is 50.")
                .endParam()
                .param()
                    .name("createdInLastNDays")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Get metrics for pins created in the last \"n\" days.")
                .endParam()
                .param()
                    .name("adAccountId")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .to("direct:userAccountAnalyticsTopVideoPins");
        

        /**
        GET /users/{username}/interests/follow : List following interests
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("user_accounts:read","See your user accounts and followers")
                .end()
                .oauth2("client_credentials")
                    .flow("application")
                    .tokenUrl("https://api.pinterest.com/v3/oauth/access_token/")
                        .withScope("user_accounts:read","See your user accounts and followers")
                
            .endSecurityDefinition()
            .get("/users/{username}/interests/follow")
                .description("List following interests")
                .id("userAccountFollowedInterestsApi")
                .produces("application/json")
                .outType(UserAccountFollowedInterests200Response.class)
                .param()
                    .name("username")
                    .type(RestParamType.path)
                    .required(true)
                    .description("A valid username")
                .endParam()
                .param()
                    .name("bookmark")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Cursor used to fetch the next page of items")
                .endParam()
                .param()
                    .name("pageSize")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")
                .endParam()
                .to("direct:userAccountFollowedInterests");
        

        /**
        GET /user_account : Get user account
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("user_accounts:read","See your user accounts and followers")
                .end()
                .oauth2("client_credentials")
                    .flow("application")
                    .tokenUrl("https://api.pinterest.com/v3/oauth/access_token/")
                        .withScope("user_accounts:read","See your user accounts and followers")
                
            .endSecurityDefinition()
            .get("/user_account")
                .description("Get user account")
                .id("userAccountGetApi")
                .produces("application/json")
                .outType(Account.class)
                .param()
                    .name("adAccountId")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .to("direct:userAccountGet");
        

        /**
        GET /user_account/following : List following
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("user_accounts:read","See your user accounts and followers")
                .end()
                .oauth2("client_credentials")
                    .flow("application")
                    .tokenUrl("https://api.pinterest.com/v3/oauth/access_token/")
                        .withScope("user_accounts:read","See your user accounts and followers")
                
            .endSecurityDefinition()
            .get("/user_account/following")
                .description("List following")
                .id("userFollowingGetApi")
                .produces("application/json")
                .outType(UserFollowingGet200Response.class)
                .param()
                    .name("bookmark")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Cursor used to fetch the next page of items")
                .endParam()
                .param()
                    .name("pageSize")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")
                .endParam()
                .param()
                    .name("feedType")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Thrift param specifying what type of followees will be kept. Default to include all followees.")
                .endParam()
                .param()
                    .name("explicitFollowing")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.")
                .endParam()
                .param()
                    .name("adAccountId")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .to("direct:userFollowingGet");
        

        /**
        GET /user_account/websites : Get user websites
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("user_accounts:read","See your user accounts and followers")
                
            .endSecurityDefinition()
            .get("/user_account/websites")
                .description("Get user websites")
                .id("userWebsitesGetApi")
                .produces("application/json")
                .outType(UserWebsitesGet200Response.class)
                .param()
                    .name("bookmark")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Cursor used to fetch the next page of items")
                .endParam()
                .param()
                    .name("pageSize")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")
                .endParam()
                .to("direct:userWebsitesGet");
        

        /**
        POST /user_account/websites : Verify website
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("user_accounts:write","Update your user accounts and followers")
                
            .endSecurityDefinition()
            .post("/user_account/websites")
                .description("Verify website")
                .id("verifyWebsiteUpdateApi")
                .produces("application/json")
                .outType(UserWebsiteSummary.class)
                .consumes("application/json")
                .type(UserWebsiteVerifyRequest.class)
                
                .param()
                    .name("adAccountId")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .param()
                    .name("userWebsiteVerifyRequest")
                    .type(RestParamType.body)
                    .required(true)
                    .description("Verify a website.")
                .endParam()
                .to("direct:verifyWebsiteUpdate");
        

        /**
        GET /user_account/websites/verification : Get user verification code for website claiming
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("user_accounts:read","See your user accounts and followers")
                .end()
                .oauth2("client_credentials")
                    .flow("application")
                    .tokenUrl("https://api.pinterest.com/v3/oauth/access_token/")
                        .withScope("user_accounts:read","See your user accounts and followers")
                
            .endSecurityDefinition()
            .get("/user_account/websites/verification")
                .description("Get user verification code for website claiming")
                .id("websiteVerificationGetApi")
                .produces("application/json")
                .outType(UserWebsiteVerificationCode.class)
                .param()
                    .name("adAccountId")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .to("direct:websiteVerificationGet");
        
    }
}
