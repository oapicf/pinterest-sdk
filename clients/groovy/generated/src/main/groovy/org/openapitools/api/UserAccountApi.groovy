package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Account
import org.openapitools.model.AnalyticsMetricsResponse
import org.openapitools.model.BoardsUserFollowsList200Response
import org.openapitools.model.Error
import org.openapitools.model.FollowUserRequest
import org.openapitools.model.FollowersList200Response
import org.openapitools.model.LinkedBusiness
import org.openapitools.model.TopPinsAnalyticsResponse
import org.openapitools.model.TopVideoPinsAnalyticsResponse
import org.openapitools.model.UserAccountFollowedInterests200Response
import org.openapitools.model.UserFollowingFeedType
import org.openapitools.model.UserFollowingGet200Response
import org.openapitools.model.UserSummary
import org.openapitools.model.UserWebsiteSummary
import org.openapitools.model.UserWebsiteVerificationCode
import org.openapitools.model.UserWebsiteVerifyRequest
import org.openapitools.model.UserWebsitesGet200Response

class UserAccountApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def boardsUserFollowsList ( String bookmark, Integer pageSize, Boolean explicitFollowing, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/following/boards"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (explicitFollowing != null) {
            queryParams.put("explicit_following", explicitFollowing)
        }
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    BoardsUserFollowsList200Response.class )

    }

    def followUserUpdate ( String username, FollowUserRequest followUserRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/following/${username}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (username == null) {
            throw new RuntimeException("missing required params username")
        }
        // verify required params are set
        if (followUserRequest == null) {
            throw new RuntimeException("missing required params followUserRequest")
        }



        contentType = 'application/json';
        bodyParams = followUserRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    UserSummary.class )

    }

    def followersList ( String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/followers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    FollowersList200Response.class )

    }

    def linkedBusinessAccountsGet ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/businesses"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    LinkedBusiness.class )

    }

    def unverifyWebsiteDelete ( String website, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/websites"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (website == null) {
            throw new RuntimeException("missing required params website")
        }

        if (website != null) {
            queryParams.put("website", website)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def userAccountAnalytics ( Date startDate, Date endDate, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, String splitField, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/analytics"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (startDate == null) {
            throw new RuntimeException("missing required params startDate")
        }
        // verify required params are set
        if (endDate == null) {
            throw new RuntimeException("missing required params endDate")
        }

        if (startDate != null) {
            queryParams.put("start_date", startDate)
        }
        if (endDate != null) {
            queryParams.put("end_date", endDate)
        }
        if (fromClaimedContent != null) {
            queryParams.put("from_claimed_content", fromClaimedContent)
        }
        if (pinFormat != null) {
            queryParams.put("pin_format", pinFormat)
        }
        if (appTypes != null) {
            queryParams.put("app_types", appTypes)
        }
        if (contentType != null) {
            queryParams.put("content_type", contentType)
        }
        if (source != null) {
            queryParams.put("source", source)
        }
        if (metricTypes != null) {
            queryParams.put("metric_types", metricTypes)
        }
        if (splitField != null) {
            queryParams.put("split_field", splitField)
        }
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "map",
                    AnalyticsMetricsResponse.class )

    }

    def userAccountAnalyticsTopPins ( Date startDate, Date endDate, String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, Integer numOfPins, Integer createdInLastNDays, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/analytics/top_pins"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (startDate == null) {
            throw new RuntimeException("missing required params startDate")
        }
        // verify required params are set
        if (endDate == null) {
            throw new RuntimeException("missing required params endDate")
        }
        // verify required params are set
        if (sortBy == null) {
            throw new RuntimeException("missing required params sortBy")
        }

        if (startDate != null) {
            queryParams.put("start_date", startDate)
        }
        if (endDate != null) {
            queryParams.put("end_date", endDate)
        }
        if (sortBy != null) {
            queryParams.put("sort_by", sortBy)
        }
        if (fromClaimedContent != null) {
            queryParams.put("from_claimed_content", fromClaimedContent)
        }
        if (pinFormat != null) {
            queryParams.put("pin_format", pinFormat)
        }
        if (appTypes != null) {
            queryParams.put("app_types", appTypes)
        }
        if (contentType != null) {
            queryParams.put("content_type", contentType)
        }
        if (source != null) {
            queryParams.put("source", source)
        }
        if (metricTypes != null) {
            queryParams.put("metric_types", metricTypes)
        }
        if (numOfPins != null) {
            queryParams.put("num_of_pins", numOfPins)
        }
        if (createdInLastNDays != null) {
            queryParams.put("created_in_last_n_days", createdInLastNDays)
        }
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    TopPinsAnalyticsResponse.class )

    }

    def userAccountAnalyticsTopVideoPins ( Date startDate, Date endDate, String sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<String> metricTypes, Integer numOfPins, Integer createdInLastNDays, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/analytics/top_video_pins"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (startDate == null) {
            throw new RuntimeException("missing required params startDate")
        }
        // verify required params are set
        if (endDate == null) {
            throw new RuntimeException("missing required params endDate")
        }
        // verify required params are set
        if (sortBy == null) {
            throw new RuntimeException("missing required params sortBy")
        }

        if (startDate != null) {
            queryParams.put("start_date", startDate)
        }
        if (endDate != null) {
            queryParams.put("end_date", endDate)
        }
        if (sortBy != null) {
            queryParams.put("sort_by", sortBy)
        }
        if (fromClaimedContent != null) {
            queryParams.put("from_claimed_content", fromClaimedContent)
        }
        if (pinFormat != null) {
            queryParams.put("pin_format", pinFormat)
        }
        if (appTypes != null) {
            queryParams.put("app_types", appTypes)
        }
        if (contentType != null) {
            queryParams.put("content_type", contentType)
        }
        if (source != null) {
            queryParams.put("source", source)
        }
        if (metricTypes != null) {
            queryParams.put("metric_types", metricTypes)
        }
        if (numOfPins != null) {
            queryParams.put("num_of_pins", numOfPins)
        }
        if (createdInLastNDays != null) {
            queryParams.put("created_in_last_n_days", createdInLastNDays)
        }
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    TopVideoPinsAnalyticsResponse.class )

    }

    def userAccountFollowedInterests ( String username, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/${username}/interests/follow"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (username == null) {
            throw new RuntimeException("missing required params username")
        }

        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    UserAccountFollowedInterests200Response.class )

    }

    def userAccountGet ( String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Account.class )

    }

    def userFollowingGet ( String bookmark, Integer pageSize, UserFollowingFeedType feedType, Boolean explicitFollowing, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/following"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (feedType != null) {
            queryParams.put("feed_type", feedType)
        }
        if (explicitFollowing != null) {
            queryParams.put("explicit_following", explicitFollowing)
        }
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    UserFollowingGet200Response.class )

    }

    def userWebsitesGet ( String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/websites"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    UserWebsitesGet200Response.class )

    }

    def verifyWebsiteUpdate ( UserWebsiteVerifyRequest userWebsiteVerifyRequest, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/websites"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userWebsiteVerifyRequest == null) {
            throw new RuntimeException("missing required params userWebsiteVerifyRequest")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = userWebsiteVerifyRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    UserWebsiteSummary.class )

    }

    def websiteVerificationGet ( String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/websites/verification"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    UserWebsiteVerificationCode.class )

    }

}
