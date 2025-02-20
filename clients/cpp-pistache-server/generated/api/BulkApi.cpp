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

#include "BulkApi.h"
#include "Helpers.h"

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::helpers;
using namespace org::openapitools::server::model;

const std::string BulkApi::base = "/v5";

BulkApi::BulkApi(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : ApiBase(rtr)
{
}

void BulkApi::init() {
    setupRoutes();
}

void BulkApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Post(*router, base + "/ad_accounts/:ad_account_id/bulk/download", Routes::bind(&BulkApi::bulk_download_create_handler, this));
    Routes::Get(*router, base + "/ad_accounts/:ad_account_id/bulk/:bulk_request_id", Routes::bind(&BulkApi::bulk_request_get_handler, this));
    Routes::Post(*router, base + "/ad_accounts/:ad_account_id/bulk/upsert", Routes::bind(&BulkApi::bulk_upsert_create_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&BulkApi::bulk_api_default_handler, this));
}

void BulkApi::handleParsingException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept
{
    std::pair<Pistache::Http::Code, std::string> codeAndError = handleParsingException(ex);
    response.send(codeAndError.first, codeAndError.second);
}

std::pair<Pistache::Http::Code, std::string> BulkApi::handleParsingException(const std::exception& ex) const noexcept
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

void BulkApi::handleOperationException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept
{
    std::pair<Pistache::Http::Code, std::string> codeAndError = handleOperationException(ex);
    response.send(codeAndError.first, codeAndError.second);
}

std::pair<Pistache::Http::Code, std::string> BulkApi::handleOperationException(const std::exception& ex) const noexcept
{
    return std::make_pair(Pistache::Http::Code::Internal_Server_Error, ex.what());
}

void BulkApi::bulk_download_create_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto adAccountId = request.param(":adAccountId").as<std::string>();
    
    // Getting the body param
    
    BulkDownloadRequest bulkDownloadRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(bulkDownloadRequest);
        bulkDownloadRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->bulk_download_create(adAccountId, bulkDownloadRequest, response);
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
void BulkApi::bulk_request_get_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto adAccountId = request.param(":adAccountId").as<std::string>();
    auto bulkRequestId = request.param(":bulkRequestId").as<std::string>();
    
    // Getting the query params
    auto includeDetailsQuery = request.query().get("include_details");
    std::optional<bool> includeDetails;
    if(includeDetailsQuery.has_value()){
        bool valueQuery_instance;
        if(fromStringValue(includeDetailsQuery.value(), valueQuery_instance)){
            includeDetails = valueQuery_instance;
        }
    }
    
    try {
        this->bulk_request_get(adAccountId, bulkRequestId, includeDetails, response);
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
void BulkApi::bulk_upsert_create_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto adAccountId = request.param(":adAccountId").as<std::string>();
    
    // Getting the body param
    
    BulkUpsertRequest bulkUpsertRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(bulkUpsertRequest);
        bulkUpsertRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->bulk_upsert_create(adAccountId, bulkUpsertRequest, response);
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

void BulkApi::bulk_api_default_handler(const Pistache::Rest::Request &, Pistache::Http::ResponseWriter response) {
    response.send(Pistache::Http::Code::Not_Found, "The requested method does not exist");
}

} // namespace org::openapitools::server::api

