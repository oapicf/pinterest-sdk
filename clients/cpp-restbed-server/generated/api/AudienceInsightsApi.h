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
 * AudienceInsightsApi.h
 *
 * 
 */

#ifndef AudienceInsightsApi_H_
#define AudienceInsightsApi_H_


#include <memory>
#include <utility>
#include <exception>
#include <functional>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "AudienceDefinitionResponse.h"
#include "AudienceInsightType.h"
#include "AudienceInsightsResponse.h"
#include "Error.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  AudienceInsightsApiException: public std::exception
{
public:
    AudienceInsightsApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace AudienceInsightsApiResources {
/// <summary>
/// Get audience insights scope and type
/// </summary>
/// <remarks>
/// Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
/// </remarks>
class  Ad_accountsAd_account_idInsightsAudiencesResource: public restbed::Resource
{
public:
    Ad_accountsAd_account_idInsightsAudiencesResource(const std::string& context = "/v5");
    virtual ~Ad_accountsAd_account_idInsightsAudiencesResource() = default;

    Ad_accountsAd_account_idInsightsAudiencesResource(
        const Ad_accountsAd_account_idInsightsAudiencesResource& other) = default; // copy constructor
    Ad_accountsAd_account_idInsightsAudiencesResource(Ad_accountsAd_account_idInsightsAudiencesResource&& other) noexcept = default; // move constructor

    Ad_accountsAd_account_idInsightsAudiencesResource& operator=(const Ad_accountsAd_account_idInsightsAudiencesResource& other) = default; // copy assignment
    Ad_accountsAd_account_idInsightsAudiencesResource& operator=(Ad_accountsAd_account_idInsightsAudiencesResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, AudienceDefinitionResponse>(
        std::string & adAccountId)> handler_GET_func =
            [](std::string &) -> std::pair<int, AudienceDefinitionResponse>
                { throw AudienceInsightsApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, AudienceDefinitionResponse> handler_GET(
        std::string & adAccountId);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleAudienceInsightsApiException(const AudienceInsightsApiException& e);
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

/// <summary>
/// Get audience insights
/// </summary>
/// <remarks>
/// Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account&#39;s engaged audience on Pinterest, the ad account&#39;s total audience on Pinterest and Pinterest&#39;s total audience.&lt;p/&gt; &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-insights\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Learn more about Audience Insights&lt;/a&gt;.
/// </remarks>
class  Ad_accountsAd_account_idAudience_insightsResource: public restbed::Resource
{
public:
    Ad_accountsAd_account_idAudience_insightsResource(const std::string& context = "/v5");
    virtual ~Ad_accountsAd_account_idAudience_insightsResource() = default;

    Ad_accountsAd_account_idAudience_insightsResource(
        const Ad_accountsAd_account_idAudience_insightsResource& other) = default; // copy constructor
    Ad_accountsAd_account_idAudience_insightsResource(Ad_accountsAd_account_idAudience_insightsResource&& other) noexcept = default; // move constructor

    Ad_accountsAd_account_idAudience_insightsResource& operator=(const Ad_accountsAd_account_idAudience_insightsResource& other) = default; // copy assignment
    Ad_accountsAd_account_idAudience_insightsResource& operator=(Ad_accountsAd_account_idAudience_insightsResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, AudienceInsightsResponse>(
        std::string & adAccountId, AudienceInsightType & audienceInsightType)> handler_GET_func =
            [](std::string &, AudienceInsightType &) -> std::pair<int, AudienceInsightsResponse>
                { throw AudienceInsightsApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, AudienceInsightsResponse> handler_GET(
        std::string & adAccountId, AudienceInsightType & audienceInsightType);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleAudienceInsightsApiException(const AudienceInsightsApiException& e);
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

} /* namespace AudienceInsightsApiResources */

using AudienceInsightsApiAd_accountsAd_account_idInsightsAudiencesResource [[deprecated]] = AudienceInsightsApiResources::Ad_accountsAd_account_idInsightsAudiencesResource;
using AudienceInsightsApiAd_accountsAd_account_idAudience_insightsResource [[deprecated]] = AudienceInsightsApiResources::Ad_accountsAd_account_idAudience_insightsResource;

//
// The restbed service to actually implement the REST server
//
class  AudienceInsightsApi
{
public:
    explicit AudienceInsightsApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~AudienceInsightsApi();

    std::shared_ptr<AudienceInsightsApiResources::Ad_accountsAd_account_idInsightsAudiencesResource> getAd_accountsAd_account_idInsightsAudiencesResource();
    std::shared_ptr<AudienceInsightsApiResources::Ad_accountsAd_account_idAudience_insightsResource> getAd_accountsAd_account_idAudience_insightsResource();

    void setResource(std::shared_ptr<AudienceInsightsApiResources::Ad_accountsAd_account_idInsightsAudiencesResource> resource);
    void setResource(std::shared_ptr<AudienceInsightsApiResources::Ad_accountsAd_account_idAudience_insightsResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setAudienceInsightsApiAd_accountsAd_account_idInsightsAudiencesResource(std::shared_ptr<AudienceInsightsApiResources::Ad_accountsAd_account_idInsightsAudiencesResource> spAudienceInsightsApiAd_accountsAd_account_idInsightsAudiencesResource);
    [[deprecated("use setResource()")]]
    virtual void setAudienceInsightsApiAd_accountsAd_account_idAudience_insightsResource(std::shared_ptr<AudienceInsightsApiResources::Ad_accountsAd_account_idAudience_insightsResource> spAudienceInsightsApiAd_accountsAd_account_idAudience_insightsResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<AudienceInsightsApiResources::Ad_accountsAd_account_idInsightsAudiencesResource> m_spAd_accountsAd_account_idInsightsAudiencesResource;
    std::shared_ptr<AudienceInsightsApiResources::Ad_accountsAd_account_idAudience_insightsResource> m_spAd_accountsAd_account_idAudience_insightsResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* AudienceInsightsApi_H_ */

