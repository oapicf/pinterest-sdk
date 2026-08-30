package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Account
import org.openapitools.model.AnalyticsMetricsResponse
import java.math.BigDecimal
import org.openapitools.model.BoardsList200Response
import org.openapitools.model.FollowUser
import org.openapitools.model.FollowUserCreate
import org.openapitools.model.FollowersList200Response
import org.openapitools.model.LinkedBusiness
import org.openapitools.model.PinterestLibError
import org.openapitools.model.QuerymetrictypesItems
import org.openapitools.model.QueryvideopinmetrictypesItems
import org.openapitools.model.TopPinsAnalyticsResponse
import org.openapitools.model.TopPinsSortBy
import org.openapitools.model.TopVideoPinsAnalyticsResponse
import org.openapitools.model.TopVideoPinsSortBy
import org.openapitools.model.UserAccountFollowedInterests200Response
import org.openapitools.model.UserFollowingFeedType
import org.openapitools.model.UserWebsite
import org.openapitools.model.UserWebsiteCreate
import org.openapitools.model.UserWebsiteVerification
import org.openapitools.model.UserWebsitesGet200Response

class UserAccountApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def boardsUserFollowsList ( String adAccountId, Boolean explicitFollowing, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/following/boards"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }
        if (explicitFollowing != null) {
            queryParams.put("explicit_following", explicitFollowing)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    BoardsList200Response.class )

    }

    def followUserUpdate ( String username, FollowUserCreate followUserCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/following/${username}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (username == null) {
            throw new RuntimeException("missing required params username")
        }
        // verify required params are set
        if (followUserCreate == null) {
            throw new RuntimeException("missing required params followUserCreate")
        }



        contentType = 'application/json';
        bodyParams = followUserCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    FollowUser.class )

    }

    def followersList ( String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/followers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    FollowersList200Response.class )

    }

    def linkedBusinessAccountsGet ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/businesses"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    LinkedBusiness.class )

    }

    def unverifyWebsiteDelete ( String website, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/websites"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (website == null) {
            throw new RuntimeException("missing required params website")
        }

        if (website != null) {
            queryParams.put("website", website)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    UserWebsite.class )

    }

    def userAccountAnalytics ( Date startDate, Date endDate, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<QuerymetrictypesItems> metricTypes, String splitField, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/analytics"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
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




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "map",
                    AnalyticsMetricsResponse.class )

    }

    def userAccountAnalyticsTopPins ( Date startDate, Date endDate, TopPinsSortBy sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<QuerymetrictypesItems> metricTypes, Integer numOfPins, BigDecimal createdInLastNDays, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/analytics/top_pins"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
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




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    TopPinsAnalyticsResponse.class )

    }

    def userAccountAnalyticsTopVideoPins ( Date startDate, Date endDate, TopVideoPinsSortBy sortBy, String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source, List<QueryvideopinmetrictypesItems> metricTypes, Integer numOfPins, BigDecimal createdInLastNDays, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/analytics/top_video_pins"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
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




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    TopVideoPinsAnalyticsResponse.class )

    }

    def userAccountFollowedInterests ( String username, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/${username}/interests/follow"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
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




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    UserAccountFollowedInterests200Response.class )

    }

    def userAccountGet ( String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Account.class )

    }

    def userFollowingGet ( String adAccountId, Boolean explicitFollowing, UserFollowingFeedType feedType, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/following"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }
        if (explicitFollowing != null) {
            queryParams.put("explicit_following", explicitFollowing)
        }
        if (feedType != null) {
            queryParams.put("feed_type", feedType)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    FollowersList200Response.class )

    }

    def userWebsitesGet ( String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/websites"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    UserWebsitesGet200Response.class )

    }

    def verifyWebsiteUpdate ( UserWebsiteCreate userWebsiteCreate, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/websites"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (userWebsiteCreate == null) {
            throw new RuntimeException("missing required params userWebsiteCreate")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = userWebsiteCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    UserWebsite.class )

    }

    def websiteVerificationGet ( String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/websites/verification"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    UserWebsiteVerification.class )

    }

}
