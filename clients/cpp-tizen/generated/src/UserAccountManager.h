#ifndef _UserAccountManager_H_
#define _UserAccountManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Account.h"
#include "AnalyticsMetricsResponse.h"
#include "Boards_user_follows_list_200_response.h"
#include "Date.h"
#include "Error.h"
#include "FollowUserRequest.h"
#include "Followers_list_200_response.h"
#include "LinkedBusiness.h"
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
#include <list>
#include <map>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup UserAccount UserAccount
 * \ingroup Operations
 *  @{
 */
class UserAccountManager {
public:
	UserAccountManager();
	virtual ~UserAccountManager();

/*! \brief List following boards. *Synchronous*
 *
 * Get a list of the boards a user follows. The request returns a board summary object array.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardsUserFollowsListSync(char * accessToken,
	std::string bookmark, int pageSize, bool explicitFollowing, std::string adAccountId, 
	void(* handler)(Boards_user_follows_list_200_response, Error, void* )
	, void* userData);

/*! \brief List following boards. *Asynchronous*
 *
 * Get a list of the boards a user follows. The request returns a board summary object array.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardsUserFollowsListAsync(char * accessToken,
	std::string bookmark, int pageSize, bool explicitFollowing, std::string adAccountId, 
	void(* handler)(Boards_user_follows_list_200_response, Error, void* )
	, void* userData);


/*! \brief Follow user. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.
 * \param username A valid username *Required*
 * \param followUserRequest Follow a user. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool followUserUpdateSync(char * accessToken,
	std::string username, std::shared_ptr<FollowUserRequest> followUserRequest, 
	void(* handler)(UserSummary, Error, void* )
	, void* userData);

/*! \brief Follow user. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.
 * \param username A valid username *Required*
 * \param followUserRequest Follow a user. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool followUserUpdateAsync(char * accessToken,
	std::string username, std::shared_ptr<FollowUserRequest> followUserRequest, 
	void(* handler)(UserSummary, Error, void* )
	, void* userData);


/*! \brief List followers. *Synchronous*
 *
 * Get a list of your followers.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool followersListSync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Followers_list_200_response, Error, void* )
	, void* userData);

/*! \brief List followers. *Asynchronous*
 *
 * Get a list of your followers.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool followersListAsync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Followers_list_200_response, Error, void* )
	, void* userData);


/*! \brief List linked businesses. *Synchronous*
 *
 * Get a list of your linked business accounts.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool linkedBusinessAccountsGetSync(char * accessToken,
	
	void(* handler)(std::list<LinkedBusiness>, Error, void* )
	, void* userData);

/*! \brief List linked businesses. *Asynchronous*
 *
 * Get a list of your linked business accounts.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool linkedBusinessAccountsGetAsync(char * accessToken,
	
	void(* handler)(std::list<LinkedBusiness>, Error, void* )
	, void* userData);


/*! \brief Unverify website. *Synchronous*
 *
 * Unverifu a website verified by the signed-in user.
 * \param website Website with path or domain only *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool unverifyWebsiteDeleteSync(char * accessToken,
	std::string website, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Unverify website. *Asynchronous*
 *
 * Unverifu a website verified by the signed-in user.
 * \param website Website with path or domain only *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool unverifyWebsiteDeleteAsync(char * accessToken,
	std::string website, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get user account analytics. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountAnalyticsSync(char * accessToken,
	Date startDate, Date endDate, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::string contentType, std::string source, std::list<std::string> metricTypes, std::string splitField, std::string adAccountId, 
	void(* handler)(std::map<std::string,std::string>, Error, void* )
	, void* userData);

/*! \brief Get user account analytics. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountAnalyticsAsync(char * accessToken,
	Date startDate, Date endDate, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::string contentType, std::string source, std::list<std::string> metricTypes, std::string splitField, std::string adAccountId, 
	void(* handler)(std::map<std::string,std::string>, Error, void* )
	, void* userData);


/*! \brief Get user account top pins analytics. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountAnalyticsTopPinsSync(char * accessToken,
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::string contentType, std::string source, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopPinsAnalyticsResponse, Error, void* )
	, void* userData);

/*! \brief Get user account top pins analytics. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountAnalyticsTopPinsAsync(char * accessToken,
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::string contentType, std::string source, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopPinsAnalyticsResponse, Error, void* )
	, void* userData);


/*! \brief Get user account top video pins analytics. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountAnalyticsTopVideoPinsSync(char * accessToken,
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::string contentType, std::string source, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopVideoPinsAnalyticsResponse, Error, void* )
	, void* userData);

/*! \brief Get user account top video pins analytics. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountAnalyticsTopVideoPinsAsync(char * accessToken,
	Date startDate, Date endDate, std::string sortBy, std::string fromClaimedContent, std::string pinFormat, std::string appTypes, std::string contentType, std::string source, std::list<std::string> metricTypes, int numOfPins, int createdInLastNDays, std::string adAccountId, 
	void(* handler)(TopVideoPinsAnalyticsResponse, Error, void* )
	, void* userData);


/*! \brief List following interests. *Synchronous*
 *
 * Get a list of a user's following interests in one place.
 * \param username A valid username *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountFollowedInterestsSync(char * accessToken,
	std::string username, std::string bookmark, int pageSize, 
	void(* handler)(User_account_followed_interests_200_response, Error, void* )
	, void* userData);

/*! \brief List following interests. *Asynchronous*
 *
 * Get a list of a user's following interests in one place.
 * \param username A valid username *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountFollowedInterestsAsync(char * accessToken,
	std::string username, std::string bookmark, int pageSize, 
	void(* handler)(User_account_followed_interests_200_response, Error, void* )
	, void* userData);


/*! \brief Get user account. *Synchronous*
 *
 * Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountGetSync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(Account, Error, void* )
	, void* userData);

/*! \brief Get user account. *Asynchronous*
 *
 * Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userAccountGetAsync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(Account, Error, void* )
	, void* userData);


/*! \brief List following. *Synchronous*
 *
 * Get a list of who a certain user follows.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param feedType Thrift param specifying what type of followees will be kept. Default to include all followees.
 * \param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userFollowingGetSync(char * accessToken,
	std::string bookmark, int pageSize, UserFollowingFeedType feedType, bool explicitFollowing, std::string adAccountId, 
	void(* handler)(User_following_get_200_response, Error, void* )
	, void* userData);

/*! \brief List following. *Asynchronous*
 *
 * Get a list of who a certain user follows.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param feedType Thrift param specifying what type of followees will be kept. Default to include all followees.
 * \param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userFollowingGetAsync(char * accessToken,
	std::string bookmark, int pageSize, UserFollowingFeedType feedType, bool explicitFollowing, std::string adAccountId, 
	void(* handler)(User_following_get_200_response, Error, void* )
	, void* userData);


/*! \brief Get user websites. *Synchronous*
 *
 * Get user websites, claimed or not
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userWebsitesGetSync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(User_websites_get_200_response, Error, void* )
	, void* userData);

/*! \brief Get user websites. *Asynchronous*
 *
 * Get user websites, claimed or not
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool userWebsitesGetAsync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(User_websites_get_200_response, Error, void* )
	, void* userData);


/*! \brief Verify website. *Synchronous*
 *
 * Verify a website as a signed-in user.
 * \param userWebsiteVerifyRequest Verify a website. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool verifyWebsiteUpdateSync(char * accessToken,
	std::shared_ptr<UserWebsiteVerifyRequest> userWebsiteVerifyRequest, std::string adAccountId, 
	void(* handler)(UserWebsiteSummary, Error, void* )
	, void* userData);

/*! \brief Verify website. *Asynchronous*
 *
 * Verify a website as a signed-in user.
 * \param userWebsiteVerifyRequest Verify a website. *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool verifyWebsiteUpdateAsync(char * accessToken,
	std::shared_ptr<UserWebsiteVerifyRequest> userWebsiteVerifyRequest, std::string adAccountId, 
	void(* handler)(UserWebsiteSummary, Error, void* )
	, void* userData);


/*! \brief Get user verification code for website claiming. *Synchronous*
 *
 * Get verification code for user to install on the website to claim it.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool websiteVerificationGetSync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(UserWebsiteVerificationCode, Error, void* )
	, void* userData);

/*! \brief Get user verification code for website claiming. *Asynchronous*
 *
 * Get verification code for user to install on the website to claim it.
 * \param adAccountId Unique identifier of an ad account.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool websiteVerificationGetAsync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(UserWebsiteVerificationCode, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* UserAccountManager_H_ */
