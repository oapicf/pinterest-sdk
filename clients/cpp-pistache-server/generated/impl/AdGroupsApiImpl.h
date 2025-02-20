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
* AdGroupsApiImpl.h
*
* 
*/

#ifndef AD_GROUPS_API_IMPL_H_
#define AD_GROUPS_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <AdGroupsApi.h>


#include "AdGroupArrayResponse.h"
#include "AdGroupAudienceSizingRequest.h"
#include "AdGroupAudienceSizingResponse.h"
#include "AdGroupCreateRequest.h"
#include "AdGroupResponse.h"
#include "AdGroupUpdateRequest.h"
#include "AdGroupsAnalyticsResponse_inner.h"
#include "Ad_groups_list_200_response.h"
#include "AdsAnalyticsTargetingType.h"
#include "BidFloor.h"
#include "BidFloorRequest.h"
#include "ConversionReportAttributionType.h"
#include "Error.h"
#include "Granularity.h"
#include "MetricsResponse.h"
#include <string>
#include <vector>

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class  AdGroupsApiImpl : public org::openapitools::server::api::AdGroupsApi {
public:
    explicit AdGroupsApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~AdGroupsApiImpl() override = default;

    void ad_groups_bid_floor_get(const std::string &adAccountId, const BidFloorRequest &bidFloorRequest, Pistache::Http::ResponseWriter &response);
    void ad_groups_targeting_analytics_get(const std::string &adAccountId, const std::optional<std::vector<std::string>> &adGroupIds, const std::optional<std::string> &startDate, const std::optional<std::string> &endDate, const std::optional<std::vector<org::openapitools::server::model::AdsAnalyticsTargetingType>> &targetingTypes, const std::optional<std::vector<std::string>> &columns, const std::optional<org::openapitools::server::model::Granularity> &granularity, const std::optional<int32_t> &clickWindowDays, const std::optional<int32_t> &engagementWindowDays, const std::optional<int32_t> &viewWindowDays, const std::optional<std::string> &conversionReportTime, const std::optional<org::openapitools::server::model::ConversionReportAttributionType> &attributionTypes, Pistache::Http::ResponseWriter &response);
    void ad_groups_analytics(const std::string &adAccountId, const std::optional<std::string> &startDate, const std::optional<std::string> &endDate, const std::optional<std::vector<std::string>> &adGroupIds, const std::optional<std::vector<std::string>> &columns, const std::optional<org::openapitools::server::model::Granularity> &granularity, const std::optional<int32_t> &clickWindowDays, const std::optional<int32_t> &engagementWindowDays, const std::optional<int32_t> &viewWindowDays, const std::optional<std::string> &conversionReportTime, Pistache::Http::ResponseWriter &response);
    void ad_groups_audience_sizing(const std::string &adAccountId, const AdGroupAudienceSizingRequest &adGroupAudienceSizingRequest, Pistache::Http::ResponseWriter &response);
    void ad_groups_create(const std::string &adAccountId, const std::vector<org::openapitools::server::model::AdGroupCreateRequest> &adGroupCreateRequest, Pistache::Http::ResponseWriter &response);
    void ad_groups_get(const std::string &adAccountId, const std::string &adGroupId, Pistache::Http::ResponseWriter &response);
    void ad_groups_list(const std::string &adAccountId, const std::optional<std::vector<std::string>> &campaignIds, const std::optional<std::vector<std::string>> &adGroupIds, const std::optional<std::vector<std::string>> &entityStatuses, const std::optional<int32_t> &pageSize, const std::optional<std::string> &order, const std::optional<std::string> &bookmark, const std::optional<bool> &translateInterestsToNames, Pistache::Http::ResponseWriter &response);
    void ad_groups_update(const std::string &adAccountId, const std::vector<org::openapitools::server::model::AdGroupUpdateRequest> &adGroupUpdateRequest, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
