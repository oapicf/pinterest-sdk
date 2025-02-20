/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * LeadsExportApi.h
 *
 * 
 */

#ifndef LeadsExportApi_H_
#define LeadsExportApi_H_


#include <memory>
#include <utility>
#include <exception>
#include <functional>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "Error.h"
#include "LeadsExportCreateRequest.h"
#include "LeadsExportCreateResponse.h"
#include "LeadsExportResponseData.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  LeadsExportApiException: public std::exception
{
public:
    LeadsExportApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace LeadsExportApiResources {
/// <summary>
/// Create a request to export leads collected from a lead ad
/// </summary>
/// <remarks>
/// &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
/// </remarks>
class  Ad_accountsAd_account_idLeads_exportResource: public restbed::Resource
{
public:
    Ad_accountsAd_account_idLeads_exportResource(const std::string& context = "/v5");
    virtual ~Ad_accountsAd_account_idLeads_exportResource() = default;

    Ad_accountsAd_account_idLeads_exportResource(
        const Ad_accountsAd_account_idLeads_exportResource& other) = default; // copy constructor
    Ad_accountsAd_account_idLeads_exportResource(Ad_accountsAd_account_idLeads_exportResource&& other) noexcept = default; // move constructor

    Ad_accountsAd_account_idLeads_exportResource& operator=(const Ad_accountsAd_account_idLeads_exportResource& other) = default; // copy assignment
    Ad_accountsAd_account_idLeads_exportResource& operator=(Ad_accountsAd_account_idLeads_exportResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, LeadsExportCreateResponse>(
        std::string & adAccountId, LeadsExportCreateRequest & leadsExportCreateRequest)> handler_POST_func =
            [](std::string &, LeadsExportCreateRequest &) -> std::pair<int, LeadsExportCreateResponse>
                { throw LeadsExportApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, LeadsExportCreateResponse> handler_POST(
        std::string & adAccountId, LeadsExportCreateRequest & leadsExportCreateRequest);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleLeadsExportApiException(const LeadsExportApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_POST_internal(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Get the lead export from the lead export create call
/// </summary>
/// <remarks>
/// &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
/// </remarks>
class  Ad_accountsAd_account_idLeads_exportLeads_export_idResource: public restbed::Resource
{
public:
    Ad_accountsAd_account_idLeads_exportLeads_export_idResource(const std::string& context = "/v5");
    virtual ~Ad_accountsAd_account_idLeads_exportLeads_export_idResource() = default;

    Ad_accountsAd_account_idLeads_exportLeads_export_idResource(
        const Ad_accountsAd_account_idLeads_exportLeads_export_idResource& other) = default; // copy constructor
    Ad_accountsAd_account_idLeads_exportLeads_export_idResource(Ad_accountsAd_account_idLeads_exportLeads_export_idResource&& other) noexcept = default; // move constructor

    Ad_accountsAd_account_idLeads_exportLeads_export_idResource& operator=(const Ad_accountsAd_account_idLeads_exportLeads_export_idResource& other) = default; // copy assignment
    Ad_accountsAd_account_idLeads_exportLeads_export_idResource& operator=(Ad_accountsAd_account_idLeads_exportLeads_export_idResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, LeadsExportResponseData>(
        std::string & adAccountId, std::string & leadsExportId)> handler_GET_func =
            [](std::string &, std::string &) -> std::pair<int, LeadsExportResponseData>
                { throw LeadsExportApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, LeadsExportResponseData> handler_GET(
        std::string & adAccountId, std::string & leadsExportId);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleLeadsExportApiException(const LeadsExportApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};

} /* namespace LeadsExportApiResources */

using LeadsExportApiAd_accountsAd_account_idLeads_exportResource [[deprecated]] = LeadsExportApiResources::Ad_accountsAd_account_idLeads_exportResource;
using LeadsExportApiAd_accountsAd_account_idLeads_exportLeads_export_idResource [[deprecated]] = LeadsExportApiResources::Ad_accountsAd_account_idLeads_exportLeads_export_idResource;

//
// The restbed service to actually implement the REST server
//
class  LeadsExportApi
{
public:
    explicit LeadsExportApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~LeadsExportApi();

    std::shared_ptr<LeadsExportApiResources::Ad_accountsAd_account_idLeads_exportResource> getAd_accountsAd_account_idLeads_exportResource();
    std::shared_ptr<LeadsExportApiResources::Ad_accountsAd_account_idLeads_exportLeads_export_idResource> getAd_accountsAd_account_idLeads_exportLeads_export_idResource();

    void setResource(std::shared_ptr<LeadsExportApiResources::Ad_accountsAd_account_idLeads_exportResource> resource);
    void setResource(std::shared_ptr<LeadsExportApiResources::Ad_accountsAd_account_idLeads_exportLeads_export_idResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setLeadsExportApiAd_accountsAd_account_idLeads_exportResource(std::shared_ptr<LeadsExportApiResources::Ad_accountsAd_account_idLeads_exportResource> spLeadsExportApiAd_accountsAd_account_idLeads_exportResource);
    [[deprecated("use setResource()")]]
    virtual void setLeadsExportApiAd_accountsAd_account_idLeads_exportLeads_export_idResource(std::shared_ptr<LeadsExportApiResources::Ad_accountsAd_account_idLeads_exportLeads_export_idResource> spLeadsExportApiAd_accountsAd_account_idLeads_exportLeads_export_idResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<LeadsExportApiResources::Ad_accountsAd_account_idLeads_exportResource> m_spAd_accountsAd_account_idLeads_exportResource;
    std::shared_ptr<LeadsExportApiResources::Ad_accountsAd_account_idLeads_exportLeads_export_idResource> m_spAd_accountsAd_account_idLeads_exportLeads_export_idResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* LeadsExportApi_H_ */

