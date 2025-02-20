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

#include "ProductGroupPromotionsApi.h"
#include "Helpers.h"

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::helpers;
using namespace org::openapitools::server::model;

const std::string ProductGroupPromotionsApi::base = "/v5";

ProductGroupPromotionsApi::ProductGroupPromotionsApi(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : ApiBase(rtr)
{
}

void ProductGroupPromotionsApi::init() {
    setupRoutes();
}

void ProductGroupPromotionsApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Post(*router, base + "/ad_accounts/:ad_account_id/product_group_promotions", Routes::bind(&ProductGroupPromotionsApi::product_group_promotions_create_handler, this));
    Routes::Get(*router, base + "/ad_accounts/:ad_account_id/product_group_promotions/:product_group_promotion_id", Routes::bind(&ProductGroupPromotionsApi::product_group_promotions_get_handler, this));
    Routes::Get(*router, base + "/ad_accounts/:ad_account_id/product_group_promotions", Routes::bind(&ProductGroupPromotionsApi::product_group_promotions_list_handler, this));
    Routes::Patch(*router, base + "/ad_accounts/:ad_account_id/product_group_promotions", Routes::bind(&ProductGroupPromotionsApi::product_group_promotions_update_handler, this));
    Routes::Get(*router, base + "/ad_accounts/:ad_account_id/product_groups/analytics", Routes::bind(&ProductGroupPromotionsApi::product_groups_analytics_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&ProductGroupPromotionsApi::product_group_promotions_api_default_handler, this));
}

void ProductGroupPromotionsApi::handleParsingException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept
{
    std::pair<Pistache::Http::Code, std::string> codeAndError = handleParsingException(ex);
    response.send(codeAndError.first, codeAndError.second);
}

std::pair<Pistache::Http::Code, std::string> ProductGroupPromotionsApi::handleParsingException(const std::exception& ex) const noexcept
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

void ProductGroupPromotionsApi::handleOperationException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept
{
    std::pair<Pistache::Http::Code, std::string> codeAndError = handleOperationException(ex);
    response.send(codeAndError.first, codeAndError.second);
}

std::pair<Pistache::Http::Code, std::string> ProductGroupPromotionsApi::handleOperationException(const std::exception& ex) const noexcept
{
    return std::make_pair(Pistache::Http::Code::Internal_Server_Error, ex.what());
}

void ProductGroupPromotionsApi::product_group_promotions_create_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto adAccountId = request.param(":adAccountId").as<std::string>();
    
    // Getting the body param
    
    ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(productGroupPromotionCreateRequest);
        productGroupPromotionCreateRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->product_group_promotions_create(adAccountId, productGroupPromotionCreateRequest, response);
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
void ProductGroupPromotionsApi::product_group_promotions_get_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto adAccountId = request.param(":adAccountId").as<std::string>();
    auto productGroupPromotionId = request.param(":productGroupPromotionId").as<std::string>();
    
    try {
        this->product_group_promotions_get(adAccountId, productGroupPromotionId, response);
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
void ProductGroupPromotionsApi::product_group_promotions_list_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto adAccountId = request.param(":adAccountId").as<std::string>();
    
    // Getting the query params
    auto productGroupPromotionIdsQuery = request.query().get("product_group_promotion_ids");
    std::optional<std::vector<std::string>> productGroupPromotionIds;
    if(productGroupPromotionIdsQuery.has_value()){
        std::vector<std::string> valueQuery_instance;
        if(fromStringValue(productGroupPromotionIdsQuery.value(), valueQuery_instance)){
            productGroupPromotionIds = valueQuery_instance;
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
    auto adGroupIdQuery = request.query().get("ad_group_id");
    std::optional<std::string> adGroupId;
    if(adGroupIdQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(adGroupIdQuery.value(), valueQuery_instance)){
            adGroupId = valueQuery_instance;
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
        this->product_group_promotions_list(adAccountId, productGroupPromotionIds, entityStatuses, adGroupId, pageSize, order, bookmark, response);
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
void ProductGroupPromotionsApi::product_group_promotions_update_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto adAccountId = request.param(":adAccountId").as<std::string>();
    
    // Getting the body param
    
    ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(productGroupPromotionUpdateRequest);
        productGroupPromotionUpdateRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->product_group_promotions_update(adAccountId, productGroupPromotionUpdateRequest, response);
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
void ProductGroupPromotionsApi::product_groups_analytics_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
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
    auto productGroupIdsQuery = request.query().get("product_group_ids");
    std::optional<std::vector<std::string>> productGroupIds;
    if(productGroupIdsQuery.has_value()){
        std::vector<std::string> valueQuery_instance;
        if(fromStringValue(productGroupIdsQuery.value(), valueQuery_instance)){
            productGroupIds = valueQuery_instance;
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
    
    try {
        this->product_groups_analytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, response);
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

void ProductGroupPromotionsApi::product_group_promotions_api_default_handler(const Pistache::Rest::Request &, Pistache::Http::ResponseWriter response) {
    response.send(Pistache::Http::Code::Not_Found, "The requested method does not exist");
}

} // namespace org::openapitools::server::api

