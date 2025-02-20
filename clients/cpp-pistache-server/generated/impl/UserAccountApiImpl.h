/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

/*
* UserAccountApiImpl.h
*
* 
*/

#ifndef USER_ACCOUNT_API_IMPL_H_
#define USER_ACCOUNT_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <UserAccountApi.h>


#include "Account.h"
#include "AnalyticsMetricsResponse.h"
#include "Boards_user_follows_list_200_response.h"
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
#include <map>
#include <string>
#include <vector>

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class  UserAccountApiImpl : public org::openapitools::server::api::UserAccountApi {
public:
    explicit UserAccountApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~UserAccountApiImpl() override = default;

    void boards_user_follows_list(const std::optional<std::string> &bookmark, const std::optional<int32_t> &pageSize, const std::optional<bool> &explicitFollowing, const std::optional<std::string> &adAccountId, Pistache::Http::ResponseWriter &response);
    void follow_user_update(const std::string &username, const FollowUserRequest &followUserRequest, Pistache::Http::ResponseWriter &response);
    void followers_list(const std::optional<std::string> &bookmark, const std::optional<int32_t> &pageSize, Pistache::Http::ResponseWriter &response);
    void linked_business_accounts_get(Pistache::Http::ResponseWriter &response);
    void unverify_website_delete(const std::optional<std::string> &website, Pistache::Http::ResponseWriter &response);
    void user_account_analytics(const std::optional<std::string> &startDate, const std::optional<std::string> &endDate, const std::optional<std::string> &fromClaimedContent, const std::optional<std::string> &pinFormat, const std::optional<std::string> &appTypes, const std::optional<std::string> &contentType, const std::optional<std::string> &source, const std::optional<std::vector<std::string>> &metricTypes, const std::optional<std::string> &splitField, const std::optional<std::string> &adAccountId, Pistache::Http::ResponseWriter &response);
    void user_account_analytics_top_pins(const std::optional<std::string> &startDate, const std::optional<std::string> &endDate, const std::optional<std::string> &sortBy, const std::optional<std::string> &fromClaimedContent, const std::optional<std::string> &pinFormat, const std::optional<std::string> &appTypes, const std::optional<std::string> &contentType, const std::optional<std::string> &source, const std::optional<std::vector<std::string>> &metricTypes, const std::optional<int32_t> &numOfPins, const std::optional<int32_t> &createdInLastNDays, const std::optional<std::string> &adAccountId, Pistache::Http::ResponseWriter &response);
    void user_account_analytics_top_video_pins(const std::optional<std::string> &startDate, const std::optional<std::string> &endDate, const std::optional<std::string> &sortBy, const std::optional<std::string> &fromClaimedContent, const std::optional<std::string> &pinFormat, const std::optional<std::string> &appTypes, const std::optional<std::string> &contentType, const std::optional<std::string> &source, const std::optional<std::vector<std::string>> &metricTypes, const std::optional<int32_t> &numOfPins, const std::optional<int32_t> &createdInLastNDays, const std::optional<std::string> &adAccountId, Pistache::Http::ResponseWriter &response);
    void user_account_followed_interests(const std::string &username, const std::optional<std::string> &bookmark, const std::optional<int32_t> &pageSize, Pistache::Http::ResponseWriter &response);
    void user_account_get(const std::optional<std::string> &adAccountId, Pistache::Http::ResponseWriter &response);
    void user_following_get(const std::optional<std::string> &bookmark, const std::optional<int32_t> &pageSize, const std::optional<UserFollowingFeedType> &feedType, const std::optional<bool> &explicitFollowing, const std::optional<std::string> &adAccountId, Pistache::Http::ResponseWriter &response);
    void user_websites_get(const std::optional<std::string> &bookmark, const std::optional<int32_t> &pageSize, Pistache::Http::ResponseWriter &response);
    void verify_website_update(const UserWebsiteVerifyRequest &userWebsiteVerifyRequest, const std::optional<std::string> &adAccountId, Pistache::Http::ResponseWriter &response);
    void website_verification_get(const std::optional<std::string> &adAccountId, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
