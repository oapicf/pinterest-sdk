#ifndef TINY_CPP_CLIENT_UserAccountApi_H_
#define TINY_CPP_CLIENT_UserAccountApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Account.h"
#include "AnalyticsMetricsResponse.h"
#include "Boards_user_follows_list_200_response.h"
#include "Date.h"
#include "Error.h"
#include "FollowUserRequest.h"
#include "Followers_list_200_response.h"
#include "LinkedBusiness.h"
#include <map>
#include "TopPinsAnalyticsResponse.h"
#include "TopVideoPinsAnalyticsResponse.h"
#include "UserFollowingFeedType.h"
#include "UserSummary.h"
#include "UserWebsiteSummary.h"
#include "UserWebsiteVerificationCode.h"
#include "UserWebsiteVerifyRequest.h"
#include "User_account_followed_interests_200_response.h"
#include "User_following_get_200_response.h"
#include "User_websites_get_200_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class UserAccountApi : public Service {
public:
    UserAccountApi() = default;

    virtual ~UserAccountApi() = default;

    /**
    * List following boards.
    *
    * Get a list of the boards a user follows. The request returns a board summary object array.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                Boards_user_follows_list_200_response
        >
    boardsUserFollows_list(
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            bool explicitFollowing
            , 
            
            std::string adAccountId
            
    );
    /**
    * Follow user.
    *
    * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.
    * \param username A valid username *Required*
    * \param followUserRequest Follow a user. *Required*
    */
    Response<
                UserSummary
        >
    followUser_update(
            
            std::string username
            , 
            
            FollowUserRequest followUserRequest
            
    );
    /**
    * List followers.
    *
    * Get a list of your followers.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    */
    Response<
                Followers_list_200_response
        >
    followers_list(
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * List linked businesses.
    *
    * Get a list of your linked business accounts.
    */
    Response<
                    std::list<LinkedBusiness>
        >
    linkedBusinessAccounts_get(
    );
    /**
    * Unverify website.
    *
    * Unverifu a website verified by the signed-in user.
    * \param website Website with path or domain only *Required*
    */
    Response<
            String
        >
    unverifyWebsite_delete(
            
            std::string website
            
    );
    /**
    * Get user account analytics.
    *
    * Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
    * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
    * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
    * \param fromClaimedContent Filter on Pins that match your claimed domain.
    * \param pinFormat Pin formats to get data for, default is all.
    * \param appTypes Apps or devices to get data for, default is all.
    * \param contentType Filter to paid or organic data. Default is all.
    * \param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
    * \param metricTypes Metric types to get data for, default is all. 
    * \param splitField How to split the data into groups. Not including this param means data won't be split.
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                String
        >
    userAccount_analytics(
            
            Date startDate
            , 
            
            Date endDate
            , 
            
            std::string fromClaimedContent
            , 
            
            std::string pinFormat
            , 
            
            std::string appTypes
            , 
            
            std::string contentType
            , 
            
            std::string source
            , 
            std::list<std::string> metricTypes
            
            , 
            
            std::string splitField
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get user account top pins analytics.
    *
    * Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
    * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
    * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
    * \param sortBy Specify sorting order for metrics *Required*
    * \param fromClaimedContent Filter on Pins that match your claimed domain.
    * \param pinFormat Pin formats to get data for, default is all.
    * \param appTypes Apps or devices to get data for, default is all.
    * \param contentType Filter to paid or organic data. Default is all.
    * \param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
    * \param metricTypes Metric types to get data for, default is all. 
    * \param numOfPins Number of pins to include, default is 10. Max is 50.
    * \param createdInLastNDays Get metrics for pins created in the last \"n\" days.
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                TopPinsAnalyticsResponse
        >
    userAccount_analytics_topPins(
            
            Date startDate
            , 
            
            Date endDate
            , 
            
            std::string sortBy
            , 
            
            std::string fromClaimedContent
            , 
            
            std::string pinFormat
            , 
            
            std::string appTypes
            , 
            
            std::string contentType
            , 
            
            std::string source
            , 
            std::list<std::string> metricTypes
            
            , 
            
            int numOfPins
            , 
            
            int createdInLastNDays
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get user account top video pins analytics.
    *
    * Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
    * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
    * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
    * \param sortBy Specify sorting order for video metrics *Required*
    * \param fromClaimedContent Filter on Pins that match your claimed domain.
    * \param pinFormat Pin formats to get data for, default is all.
    * \param appTypes Apps or devices to get data for, default is all.
    * \param contentType Filter to paid or organic data. Default is all.
    * \param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
    * \param metricTypes Metric types to get video data for, default is all. 
    * \param numOfPins Number of pins to include, default is 10. Max is 50.
    * \param createdInLastNDays Get metrics for pins created in the last \"n\" days.
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                TopVideoPinsAnalyticsResponse
        >
    userAccount_analytics_topVideoPins(
            
            Date startDate
            , 
            
            Date endDate
            , 
            
            std::string sortBy
            , 
            
            std::string fromClaimedContent
            , 
            
            std::string pinFormat
            , 
            
            std::string appTypes
            , 
            
            std::string contentType
            , 
            
            std::string source
            , 
            std::list<std::string> metricTypes
            
            , 
            
            int numOfPins
            , 
            
            int createdInLastNDays
            , 
            
            std::string adAccountId
            
    );
    /**
    * List following interests.
    *
    * Get a list of a user's following interests in one place.
    * \param username A valid username *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    */
    Response<
                User_account_followed_interests_200_response
        >
    userAccount_followedInterests(
            
            std::string username
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Get user account.
    *
    * Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                Account
        >
    userAccount_get(
            
            std::string adAccountId
            
    );
    /**
    * List following.
    *
    * Get a list of who a certain user follows.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param feedType Thrift param specifying what type of followees will be kept. Default to include all followees.
    * \param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                User_following_get_200_response
        >
    userFollowing_get(
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            UserFollowingFeedType feedType
            , 
            
            bool explicitFollowing
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get user websites.
    *
    * Get user websites, claimed or not
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    */
    Response<
                User_websites_get_200_response
        >
    userWebsites_get(
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Verify website.
    *
    * Verify a website as a signed-in user.
    * \param userWebsiteVerifyRequest Verify a website. *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                UserWebsiteSummary
        >
    verifyWebsite_update(
            
            UserWebsiteVerifyRequest userWebsiteVerifyRequest
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get user verification code for website claiming.
    *
    * Get verification code for user to install on the website to claim it.
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                UserWebsiteVerificationCode
        >
    websiteVerification_get(
            
            std::string adAccountId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_UserAccountApi_H_ */