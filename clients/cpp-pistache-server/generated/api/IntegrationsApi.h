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
 * IntegrationsApi.h
 *
 * 
 */

#ifndef IntegrationsApi_H_
#define IntegrationsApi_H_


#include "ApiBase.h"

#include <pistache/http.h>
#include <pistache/router.h>
#include <pistache/http_headers.h>

#include <optional>
#include <utility>

#include "DetailedError.h"
#include "Error.h"
#include "IntegrationLogsRequest.h"
#include "IntegrationLogsSuccessResponse.h"
#include "IntegrationMetadata.h"
#include "IntegrationRecord.h"
#include "IntegrationRequest.h"
#include "IntegrationRequestPatch.h"
#include "Integrations_get_list_200_response.h"
#include <string>

namespace org::openapitools::server::api
{

class  IntegrationsApi : public ApiBase {
public:
    explicit IntegrationsApi(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~IntegrationsApi() override = default;
    void init() override;

    static const std::string base;

private:
    void setupRoutes();

    void integrations_commerce_del_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void integrations_commerce_get_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void integrations_commerce_patch_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void integrations_commerce_post_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void integrations_logs_post_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void integrations_get_by_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void integrations_get_list_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void integrations_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);

    /// <summary>
    /// Helper function to handle unexpected Exceptions during Parameter parsing and validation.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual void handleParsingException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during Parameter parsing and validation.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleParsingException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during processing of the request in handler functions.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual void handleOperationException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during processing of the request in handler functions.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleOperationException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Delete commerce integration
    /// </summary>
    /// <remarks>
    /// Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    /// </remarks>
    /// <param name="externalBusinessId">External business ID for the integration.</param>
    virtual void integrations_commerce_del(const std::string &externalBusinessId, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Get commerce integration
    /// </summary>
    /// <remarks>
    /// Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    /// </remarks>
    /// <param name="externalBusinessId">External business ID for the integration.</param>
    virtual void integrations_commerce_get(const std::string &externalBusinessId, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Update commerce integration
    /// </summary>
    /// <remarks>
    /// Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    /// </remarks>
    /// <param name="externalBusinessId">External business ID for the integration.</param>
    /// <param name="integrationRequestPatch">Parameters to get create/update the Integration Metadata (optional)</param>
    virtual void integrations_commerce_patch(const std::string &externalBusinessId, const org::openapitools::server::model::IntegrationRequestPatch &integrationRequestPatch, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Create commerce integration
    /// </summary>
    /// <remarks>
    /// Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    /// </remarks>
    /// <param name="integrationRequest">Parameters to get create/update the Integration Metadata (optional)</param>
    virtual void integrations_commerce_post(const org::openapitools::server::model::IntegrationRequest &integrationRequest, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Receives batched logs from integration applications.
    /// </summary>
    /// <remarks>
    /// This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    /// </remarks>
    /// <param name="integrationLogsRequest">Ingest log information from external integration application.</param>
    virtual void integrations_logs_post(const org::openapitools::server::model::IntegrationLogsRequest &integrationLogsRequest, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Get integration metadata
    /// </summary>
    /// <remarks>
    /// Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    /// </remarks>
    /// <param name="id">Integration ID.</param>
    virtual void integrations_get_by_id(const std::string &id, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Get integration metadata list
    /// </summary>
    /// <remarks>
    /// Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    /// </remarks>
    /// <param name="bookmark">Cursor used to fetch the next page of items (optional, default to &quot;&quot;)</param>
    /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)</param>
    virtual void integrations_get_list(const std::optional<std::string> &bookmark, const std::optional<int32_t> &pageSize, Pistache::Http::ResponseWriter &response) = 0;

};

} // namespace org::openapitools::server::api

#endif /* IntegrationsApi_H_ */

