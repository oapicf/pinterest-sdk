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

#include "AdsApi.h"
#include "Helpers.h"

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::helpers;
using namespace org::openapitools::server::model;

const std::string AdsApi::base = "/v5";

AdsApi::AdsApi(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : ApiBase(rtr)
{
}

void AdsApi::init() {
    setupRoutes();
}

void AdsApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Post(*router, base + "/ad_accounts/:ad_account_id/ad_previews", Routes::bind(&AdsApi::ad_previews_create_handler, this));
    Routes::Get(*router, base + "/ad_accounts/:ad_account_id/ads/targeting_analytics", Routes::bind(&AdsApi::ad_targeting_analytics_get_handler, this));
    Routes::Get(*router, base + "/ad_accounts/:ad_account_id/ads/analytics", Routes::bind(&AdsApi::ads_analytics_handler, this));
    Routes::Post(*router, base + "/ad_accounts/:ad_account_id/ads", Routes::bind(&AdsApi::ads_create_handler, this));
    Routes::Get(*router, base + "/ad_accounts/:ad_account_id/ads/:ad_id", Routes::bind(&AdsApi::ads_get_handler, this));
    Routes::Get(*router, base + "/ad_accounts/:ad_account_id/ads", Routes::bind(&AdsApi::ads_list_handler, this));
    Routes::Patch(*router, base + "/ad_accounts/:ad_account_id/ads", Routes::bind(&AdsApi::ads_update_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&AdsApi::ads_api_default_handler, this));
}

void AdsApi::handleParsingException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept
{
    std::pair<Pistache::Http::Code, std::string> codeAndError = handleParsingException(ex);
    response.send(codeAndError.first, codeAndError.second);
}

std::pair<Pistache::Http::Code, std::string> AdsApi::handleParsingException(const std::exception& ex) const noexcept
{
    try {
        throw;
    } catch (nlohmann::detail::exception &e) {
        return std::make_pair(Pistache::Http::Code::Bad_Request, e.what());
    } catch (org::openapitools::server::helpers::ValidationException &e) {
        return std::make_pair(Pistache::Http::Code::Bad_Request, e.what());
    } catch (std::exception &e) {
        return std::make_pair(Pistache::Http::Code::Internal_Server_Error, e.what());
    }
}

void AdsApi::handleOperationException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept
{
    std::pair<Pistache::Http::Code, std::string> codeAndError = handleOperationException(ex);
    response.send(codeAndError.first, codeAndError.second);
}

std::pair<Pistache::Http::Code, std::string> AdsApi::handleOperationException(const std::exception& ex) const noexcept
{
    return std::make_pair(Pistache::Http::Code::Internal_Server_Error, ex.what());
}

void AdsApi::ad_previews_create_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto adAccountId = request.param(":adAccountId").as<std::string>();
    
    // Getting the body param
    
    AdPreviewRequest adPreviewRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(adPreviewRequest);
        adPreviewRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->ad_previews_create(adAccountId, adPreviewRequest, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AdsApi::ad_targeting_analytics_get_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto adAccountId = request.param(":adAccountId").as<std::string>();
    
    // Getting the query params
    auto adIdsQuery = request.query().get("ad_ids");
    std::optional<std::vector<std::string>> adIds;
    if(adIdsQuery.has_value()){
        std::vector<std::string> valueQuery_instance;
        if(fromStringValue(adIdsQuery.value(), valueQuery_instance)){
            adIds = valueQuery_instance;
        }
    }
    auto startDateQuery = request.query().get("start_date");
    std::optional<std::string> startDate;
    if(startDateQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(startDateQuery.value(), valueQuery_instance)){
            startDate = valueQuery_instance;
        }
    }
    auto endDateQuery = request.query().get("end_date");
    std::optional<std::string> endDate;
    if(endDateQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(endDateQuery.value(), valueQuery_instance)){
            endDate = valueQuery_instance;
        }
    }
    auto targetingTypesQuery = request.query().get("targeting_types");
    std::optional<std::vector<AdsAnalyticsAdTargetingType>> targetingTypes;
    if(targetingTypesQuery.has_value()){
        std::vector<AdsAnalyticsAdTargetingType> valueQuery_instance;
        if(fromStringValue(targetingTypesQuery.value(), valueQuery_instance)){
            targetingTypes = valueQuery_instance;
        }
    }
    auto columnsQuery = request.query().get("columns");
    std::optional<std::vector<std::string>> columns;
    if(columnsQuery.has_value()){
        std::vector<std::string> valueQuery_instance;
        if(fromStringValue(columnsQuery.value(), valueQuery_instance)){
            columns = valueQuery_instance;
        }
    }
    auto granularityQuery = request.query().get("granularity");
    std::optional<Granularity> granularity;
    if(granularityQuery.has_value()){
        Granularity valueQuery_instance;
        if(fromStringValue(granularityQuery.value(), valueQuery_instance)){
            granularity = valueQuery_instance;
        }
    }
    auto clickWindowDaysQuery = request.query().get("click_window_days");
    std::optional<int32_t> clickWindowDays;
    if(clickWindowDaysQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(clickWindowDaysQuery.value(), valueQuery_instance)){
            clickWindowDays = valueQuery_instance;
        }
    }
    auto engagementWindowDaysQuery = request.query().get("engagement_window_days");
    std::optional<int32_t> engagementWindowDays;
    if(engagementWindowDaysQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(engagementWindowDaysQuery.value(), valueQuery_instance)){
            engagementWindowDays = valueQuery_instance;
        }
    }
    auto viewWindowDaysQuery = request.query().get("view_window_days");
    std::optional<int32_t> viewWindowDays;
    if(viewWindowDaysQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(viewWindowDaysQuery.value(), valueQuery_instance)){
            viewWindowDays = valueQuery_instance;
        }
    }
    auto conversionReportTimeQuery = request.query().get("conversion_report_time");
    std::optional<std::string> conversionReportTime;
    if(conversionReportTimeQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(conversionReportTimeQuery.value(), valueQuery_instance)){
            conversionReportTime = valueQuery_instance;
        }
    }
    auto attributionTypesQuery = request.query().get("attribution_types");
    std::optional<ConversionReportAttributionType> attributionTypes;
    if(attributionTypesQuery.has_value()){
        ConversionReportAttributionType valueQuery_instance;
        if(fromStringValue(attributionTypesQuery.value(), valueQuery_instance)){
            attributionTypes = valueQuery_instance;
        }
    }
    
    try {
        this->ad_targeting_analytics_get(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AdsApi::ads_analytics_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto adAccountId = request.param(":adAccountId").as<std::string>();
    
    // Getting the query params
    auto startDateQuery = request.query().get("start_date");
    std::optional<std::string> startDate;
    if(startDateQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(startDateQuery.value(), valueQuery_instance)){
            startDate = valueQuery_instance;
        }
    }
    auto endDateQuery = request.query().get("end_date");
    std::optional<std::string> endDate;
    if(endDateQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(endDateQuery.value(), valueQuery_instance)){
            endDate = valueQuery_instance;
        }
    }
    auto adIdsQuery = request.query().get("ad_ids");
    std::optional<std::vector<std::string>> adIds;
    if(adIdsQuery.has_value()){
        std::vector<std::string> valueQuery_instance;
        if(fromStringValue(adIdsQuery.value(), valueQuery_instance)){
            adIds = valueQuery_instance;
        }
    }
    auto columnsQuery = request.query().get("columns");
    std::optional<std::vector<std::string>> columns;
    if(columnsQuery.has_value()){
        std::vector<std::string> valueQuery_instance;
        if(fromStringValue(columnsQuery.value(), valueQuery_instance)){
            columns = valueQuery_instance;
        }
    }
    auto granularityQuery = request.query().get("granularity");
    std::optional<Granularity> granularity;
    if(granularityQuery.has_value()){
        Granularity valueQuery_instance;
        if(fromStringValue(granularityQuery.value(), valueQuery_instance)){
            granularity = valueQuery_instance;
        }
    }
    auto clickWindowDaysQuery = request.query().get("click_window_days");
    std::optional<int32_t> clickWindowDays;
    if(clickWindowDaysQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(clickWindowDaysQuery.value(), valueQuery_instance)){
            clickWindowDays = valueQuery_instance;
        }
    }
    auto engagementWindowDaysQuery = request.query().get("engagement_window_days");
    std::optional<int32_t> engagementWindowDays;
    if(engagementWindowDaysQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(engagementWindowDaysQuery.value(), valueQuery_instance)){
            engagementWindowDays = valueQuery_instance;
        }
    }
    auto viewWindowDaysQuery = request.query().get("view_window_days");
    std::optional<int32_t> viewWindowDays;
    if(viewWindowDaysQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(viewWindowDaysQuery.value(), valueQuery_instance)){
            viewWindowDays = valueQuery_instance;
        }
    }
    auto conversionReportTimeQuery = request.query().get("conversion_report_time");
    std::optional<std::string> conversionReportTime;
    if(conversionReportTimeQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(conversionReportTimeQuery.value(), valueQuery_instance)){
            conversionReportTime = valueQuery_instance;
        }
    }
    auto pinIdsQuery = request.query().get("pin_ids");
    std::optional<std::vector<std::string>> pinIds;
    if(pinIdsQuery.has_value()){
        std::vector<std::string> valueQuery_instance;
        if(fromStringValue(pinIdsQuery.value(), valueQuery_instance)){
            pinIds = valueQuery_instance;
        }
    }
    auto campaignIdsQuery = request.query().get("campaign_ids");
    std::optional<std::vector<std::string>> campaignIds;
    if(campaignIdsQuery.has_value()){
        std::vector<std::string> valueQuery_instance;
        if(fromStringValue(campaignIdsQuery.value(), valueQuery_instance)){
            campaignIds = valueQuery_instance;
        }
    }
    
    try {
        this->ads_analytics(adAccountId, startDate, endDate, columns, granularity, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, pinIds, campaignIds, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AdsApi::ads_create_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto adAccountId = request.param(":adAccountId").as<std::string>();
    
    // Getting the body param
    std::vector<AdCreateRequest> adCreateRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(adCreateRequest);
        for (const auto& validationParam : adCreateRequest)
             validationParam.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->ads_create(adAccountId, adCreateRequest, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AdsApi::ads_get_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto adAccountId = request.param(":adAccountId").as<std::string>();
    auto adId = request.param(":adId").as<std::string>();
    
    try {
        this->ads_get(adAccountId, adId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AdsApi::ads_list_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto adAccountId = request.param(":adAccountId").as<std::string>();
    
    // Getting the query params
    auto campaignIdsQuery = request.query().get("campaign_ids");
    std::optional<std::vector<std::string>> campaignIds;
    if(campaignIdsQuery.has_value()){
        std::vector<std::string> valueQuery_instance;
        if(fromStringValue(campaignIdsQuery.value(), valueQuery_instance)){
            campaignIds = valueQuery_instance;
        }
    }
    auto adGroupIdsQuery = request.query().get("ad_group_ids");
    std::optional<std::vector<std::string>> adGroupIds;
    if(adGroupIdsQuery.has_value()){
        std::vector<std::string> valueQuery_instance;
        if(fromStringValue(adGroupIdsQuery.value(), valueQuery_instance)){
            adGroupIds = valueQuery_instance;
        }
    }
    auto adIdsQuery = request.query().get("ad_ids");
    std::optional<std::vector<std::string>> adIds;
    if(adIdsQuery.has_value()){
        std::vector<std::string> valueQuery_instance;
        if(fromStringValue(adIdsQuery.value(), valueQuery_instance)){
            adIds = valueQuery_instance;
        }
    }
    auto entityStatusesQuery = request.query().get("entity_statuses");
    std::optional<std::vector<std::string>> entityStatuses;
    if(entityStatusesQuery.has_value()){
        std::vector<std::string> valueQuery_instance;
        if(fromStringValue(entityStatusesQuery.value(), valueQuery_instance)){
            entityStatuses = valueQuery_instance;
        }
    }
    auto pageSizeQuery = request.query().get("page_size");
    std::optional<int32_t> pageSize;
    if(pageSizeQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(pageSizeQuery.value(), valueQuery_instance)){
            pageSize = valueQuery_instance;
        }
    }
    auto orderQuery = request.query().get("order");
    std::optional<std::string> order;
    if(orderQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(orderQuery.value(), valueQuery_instance)){
            order = valueQuery_instance;
        }
    }
    auto bookmarkQuery = request.query().get("bookmark");
    std::optional<std::string> bookmark;
    if(bookmarkQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(bookmarkQuery.value(), valueQuery_instance)){
            bookmark = valueQuery_instance;
        }
    }
    
    try {
        this->ads_list(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void AdsApi::ads_update_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto adAccountId = request.param(":adAccountId").as<std::string>();
    
    // Getting the body param
    std::vector<AdUpdateRequest> adUpdateRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(adUpdateRequest);
        for (const auto& validationParam : adUpdateRequest)
             validationParam.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->ads_update(adAccountId, adUpdateRequest, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}

void AdsApi::ads_api_default_handler(const Pistache::Rest::Request &, Pistache::Http::ResponseWriter response) {
    response.send(Pistache::Http::Code::Not_Found, "The requested method does not exist");
}

} // namespace org::openapitools::server::api

