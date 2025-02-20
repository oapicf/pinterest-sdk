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
 * AudienceSharingApi.h
 *
 * 
 */

#ifndef AudienceSharingApi_H_
#define AudienceSharingApi_H_


#include <memory>
#include <utility>
#include <exception>
#include <functional>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "Ad_accounts_audiences_shared_accounts_list_200_response.h"
#include "AudienceAccountType.h"
#include "Audiences_list_200_response.h"
#include "BusinessSharedAudience.h"
#include "BusinessSharedAudienceResponse.h"
#include "Error.h"
#include "SharedAudience.h"
#include "SharedAudienceResponse.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  AudienceSharingApiException: public std::exception
{
public:
    AudienceSharingApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace AudienceSharingApiResources {
/// <summary>
/// List accounts with access to an audience owned by an ad account
/// </summary>
/// <remarks>
/// List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
/// </remarks>
class  Ad_accountsAd_account_idAudiencesSharedAccountsResource: public restbed::Resource
{
public:
    Ad_accountsAd_account_idAudiencesSharedAccountsResource(const std::string& context = "/v5");
    virtual ~Ad_accountsAd_account_idAudiencesSharedAccountsResource() = default;

    Ad_accountsAd_account_idAudiencesSharedAccountsResource(
        const Ad_accountsAd_account_idAudiencesSharedAccountsResource& other) = default; // copy constructor
    Ad_accountsAd_account_idAudiencesSharedAccountsResource(Ad_accountsAd_account_idAudiencesSharedAccountsResource&& other) noexcept = default; // move constructor

    Ad_accountsAd_account_idAudiencesSharedAccountsResource& operator=(const Ad_accountsAd_account_idAudiencesSharedAccountsResource& other) = default; // copy assignment
    Ad_accountsAd_account_idAudiencesSharedAccountsResource& operator=(Ad_accountsAd_account_idAudiencesSharedAccountsResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, Ad_accounts_audiences_shared_accounts_list_200_response>(
        std::string & adAccountId, std::string & audienceId, AudienceAccountType & accountType, int32_t & pageSize, std::string & bookmark)> handler_GET_func =
            [](std::string &, std::string &, AudienceAccountType &, int32_t &, std::string &) -> std::pair<int, Ad_accounts_audiences_shared_accounts_list_200_response>
                { throw AudienceSharingApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, Ad_accounts_audiences_shared_accounts_list_200_response> handler_GET(
        std::string & adAccountId, std::string & audienceId, AudienceAccountType & accountType, int32_t & pageSize, std::string & bookmark);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleAudienceSharingApiException(const AudienceSharingApiException& e);
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
/// List accounts with access to an audience owned by a business
/// </summary>
/// <remarks>
/// List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
/// </remarks>
class  BusinessesBusiness_idAudiencesSharedAccountsResource: public restbed::Resource
{
public:
    BusinessesBusiness_idAudiencesSharedAccountsResource(const std::string& context = "/v5");
    virtual ~BusinessesBusiness_idAudiencesSharedAccountsResource() = default;

    BusinessesBusiness_idAudiencesSharedAccountsResource(
        const BusinessesBusiness_idAudiencesSharedAccountsResource& other) = default; // copy constructor
    BusinessesBusiness_idAudiencesSharedAccountsResource(BusinessesBusiness_idAudiencesSharedAccountsResource&& other) noexcept = default; // move constructor

    BusinessesBusiness_idAudiencesSharedAccountsResource& operator=(const BusinessesBusiness_idAudiencesSharedAccountsResource& other) = default; // copy assignment
    BusinessesBusiness_idAudiencesSharedAccountsResource& operator=(BusinessesBusiness_idAudiencesSharedAccountsResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, Ad_accounts_audiences_shared_accounts_list_200_response>(
        std::string & businessId, std::string & audienceId, AudienceAccountType & accountType, int32_t & pageSize, std::string & bookmark)> handler_GET_func =
            [](std::string &, std::string &, AudienceAccountType &, int32_t &, std::string &) -> std::pair<int, Ad_accounts_audiences_shared_accounts_list_200_response>
                { throw AudienceSharingApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, Ad_accounts_audiences_shared_accounts_list_200_response> handler_GET(
        std::string & businessId, std::string & audienceId, AudienceAccountType & accountType, int32_t & pageSize, std::string & bookmark);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleAudienceSharingApiException(const AudienceSharingApiException& e);
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
/// List received audiences for a business
/// </summary>
/// <remarks>
/// Get a list of received audiences for the given business.
/// </remarks>
class  BusinessesBusiness_idAudiencesResource: public restbed::Resource
{
public:
    BusinessesBusiness_idAudiencesResource(const std::string& context = "/v5");
    virtual ~BusinessesBusiness_idAudiencesResource() = default;

    BusinessesBusiness_idAudiencesResource(
        const BusinessesBusiness_idAudiencesResource& other) = default; // copy constructor
    BusinessesBusiness_idAudiencesResource(BusinessesBusiness_idAudiencesResource&& other) noexcept = default; // move constructor

    BusinessesBusiness_idAudiencesResource& operator=(const BusinessesBusiness_idAudiencesResource& other) = default; // copy assignment
    BusinessesBusiness_idAudiencesResource& operator=(BusinessesBusiness_idAudiencesResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, Audiences_list_200_response>(
        std::string & businessId, std::string & bookmark, std::string & order, int32_t & pageSize)> handler_GET_func =
            [](std::string &, std::string &, std::string &, int32_t &) -> std::pair<int, Audiences_list_200_response>
                { throw AudienceSharingApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, Audiences_list_200_response> handler_GET(
        std::string & businessId, std::string & bookmark, std::string & order, int32_t & pageSize);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleAudienceSharingApiException(const AudienceSharingApiException& e);
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
/// Update audience sharing between ad accounts
/// </summary>
/// <remarks>
/// From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
/// </remarks>
class  Ad_accountsAd_account_idAudiencesAd_accountsSharedResource: public restbed::Resource
{
public:
    Ad_accountsAd_account_idAudiencesAd_accountsSharedResource(const std::string& context = "/v5");
    virtual ~Ad_accountsAd_account_idAudiencesAd_accountsSharedResource() = default;

    Ad_accountsAd_account_idAudiencesAd_accountsSharedResource(
        const Ad_accountsAd_account_idAudiencesAd_accountsSharedResource& other) = default; // copy constructor
    Ad_accountsAd_account_idAudiencesAd_accountsSharedResource(Ad_accountsAd_account_idAudiencesAd_accountsSharedResource&& other) noexcept = default; // move constructor

    Ad_accountsAd_account_idAudiencesAd_accountsSharedResource& operator=(const Ad_accountsAd_account_idAudiencesAd_accountsSharedResource& other) = default; // copy assignment
    Ad_accountsAd_account_idAudiencesAd_accountsSharedResource& operator=(Ad_accountsAd_account_idAudiencesAd_accountsSharedResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, SharedAudienceResponse>(
        std::string & adAccountId, SharedAudience & sharedAudience)> handler_PATCH_func =
            [](std::string &, SharedAudience &) -> std::pair<int, SharedAudienceResponse>
                { throw AudienceSharingApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, SharedAudienceResponse> handler_PATCH(
        std::string & adAccountId, SharedAudience & sharedAudience);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleAudienceSharingApiException(const AudienceSharingApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_PATCH_internal(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Update audience sharing from an ad account to businesses
/// </summary>
/// <remarks>
/// From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
/// </remarks>
class  Ad_accountsAd_account_idAudiencesBusinessesSharedResource: public restbed::Resource
{
public:
    Ad_accountsAd_account_idAudiencesBusinessesSharedResource(const std::string& context = "/v5");
    virtual ~Ad_accountsAd_account_idAudiencesBusinessesSharedResource() = default;

    Ad_accountsAd_account_idAudiencesBusinessesSharedResource(
        const Ad_accountsAd_account_idAudiencesBusinessesSharedResource& other) = default; // copy constructor
    Ad_accountsAd_account_idAudiencesBusinessesSharedResource(Ad_accountsAd_account_idAudiencesBusinessesSharedResource&& other) noexcept = default; // move constructor

    Ad_accountsAd_account_idAudiencesBusinessesSharedResource& operator=(const Ad_accountsAd_account_idAudiencesBusinessesSharedResource& other) = default; // copy assignment
    Ad_accountsAd_account_idAudiencesBusinessesSharedResource& operator=(Ad_accountsAd_account_idAudiencesBusinessesSharedResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, BusinessSharedAudienceResponse>(
        std::string & adAccountId, BusinessSharedAudience & businessSharedAudience)> handler_PATCH_func =
            [](std::string &, BusinessSharedAudience &) -> std::pair<int, BusinessSharedAudienceResponse>
                { throw AudienceSharingApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, BusinessSharedAudienceResponse> handler_PATCH(
        std::string & adAccountId, BusinessSharedAudience & businessSharedAudience);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleAudienceSharingApiException(const AudienceSharingApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_PATCH_internal(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Update audience sharing from a business to ad accounts
/// </summary>
/// <remarks>
/// From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
/// </remarks>
class  BusinessesBusiness_idAudiencesAd_accountsSharedResource: public restbed::Resource
{
public:
    BusinessesBusiness_idAudiencesAd_accountsSharedResource(const std::string& context = "/v5");
    virtual ~BusinessesBusiness_idAudiencesAd_accountsSharedResource() = default;

    BusinessesBusiness_idAudiencesAd_accountsSharedResource(
        const BusinessesBusiness_idAudiencesAd_accountsSharedResource& other) = default; // copy constructor
    BusinessesBusiness_idAudiencesAd_accountsSharedResource(BusinessesBusiness_idAudiencesAd_accountsSharedResource&& other) noexcept = default; // move constructor

    BusinessesBusiness_idAudiencesAd_accountsSharedResource& operator=(const BusinessesBusiness_idAudiencesAd_accountsSharedResource& other) = default; // copy assignment
    BusinessesBusiness_idAudiencesAd_accountsSharedResource& operator=(BusinessesBusiness_idAudiencesAd_accountsSharedResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, SharedAudienceResponse>(
        std::string & businessId, SharedAudience & sharedAudience)> handler_PATCH_func =
            [](std::string &, SharedAudience &) -> std::pair<int, SharedAudienceResponse>
                { throw AudienceSharingApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, SharedAudienceResponse> handler_PATCH(
        std::string & businessId, SharedAudience & sharedAudience);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleAudienceSharingApiException(const AudienceSharingApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_PATCH_internal(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Update audience sharing between businesses
/// </summary>
/// <remarks>
/// From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
/// </remarks>
class  BusinessesBusiness_idAudiencesBusinessesSharedResource: public restbed::Resource
{
public:
    BusinessesBusiness_idAudiencesBusinessesSharedResource(const std::string& context = "/v5");
    virtual ~BusinessesBusiness_idAudiencesBusinessesSharedResource() = default;

    BusinessesBusiness_idAudiencesBusinessesSharedResource(
        const BusinessesBusiness_idAudiencesBusinessesSharedResource& other) = default; // copy constructor
    BusinessesBusiness_idAudiencesBusinessesSharedResource(BusinessesBusiness_idAudiencesBusinessesSharedResource&& other) noexcept = default; // move constructor

    BusinessesBusiness_idAudiencesBusinessesSharedResource& operator=(const BusinessesBusiness_idAudiencesBusinessesSharedResource& other) = default; // copy assignment
    BusinessesBusiness_idAudiencesBusinessesSharedResource& operator=(BusinessesBusiness_idAudiencesBusinessesSharedResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, BusinessSharedAudienceResponse>(
        std::string & businessId, BusinessSharedAudience & businessSharedAudience)> handler_PATCH_func =
            [](std::string &, BusinessSharedAudience &) -> std::pair<int, BusinessSharedAudienceResponse>
                { throw AudienceSharingApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, BusinessSharedAudienceResponse> handler_PATCH(
        std::string & businessId, BusinessSharedAudience & businessSharedAudience);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleAudienceSharingApiException(const AudienceSharingApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_PATCH_internal(const std::shared_ptr<restbed::Session> session);
};

} /* namespace AudienceSharingApiResources */

using AudienceSharingApiAd_accountsAd_account_idAudiencesSharedAccountsResource [[deprecated]] = AudienceSharingApiResources::Ad_accountsAd_account_idAudiencesSharedAccountsResource;
using AudienceSharingApiBusinessesBusiness_idAudiencesSharedAccountsResource [[deprecated]] = AudienceSharingApiResources::BusinessesBusiness_idAudiencesSharedAccountsResource;
using AudienceSharingApiBusinessesBusiness_idAudiencesResource [[deprecated]] = AudienceSharingApiResources::BusinessesBusiness_idAudiencesResource;
using AudienceSharingApiAd_accountsAd_account_idAudiencesAd_accountsSharedResource [[deprecated]] = AudienceSharingApiResources::Ad_accountsAd_account_idAudiencesAd_accountsSharedResource;
using AudienceSharingApiAd_accountsAd_account_idAudiencesBusinessesSharedResource [[deprecated]] = AudienceSharingApiResources::Ad_accountsAd_account_idAudiencesBusinessesSharedResource;
using AudienceSharingApiBusinessesBusiness_idAudiencesAd_accountsSharedResource [[deprecated]] = AudienceSharingApiResources::BusinessesBusiness_idAudiencesAd_accountsSharedResource;
using AudienceSharingApiBusinessesBusiness_idAudiencesBusinessesSharedResource [[deprecated]] = AudienceSharingApiResources::BusinessesBusiness_idAudiencesBusinessesSharedResource;

//
// The restbed service to actually implement the REST server
//
class  AudienceSharingApi
{
public:
    explicit AudienceSharingApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~AudienceSharingApi();

    std::shared_ptr<AudienceSharingApiResources::Ad_accountsAd_account_idAudiencesSharedAccountsResource> getAd_accountsAd_account_idAudiencesSharedAccountsResource();
    std::shared_ptr<AudienceSharingApiResources::BusinessesBusiness_idAudiencesSharedAccountsResource> getBusinessesBusiness_idAudiencesSharedAccountsResource();
    std::shared_ptr<AudienceSharingApiResources::BusinessesBusiness_idAudiencesResource> getBusinessesBusiness_idAudiencesResource();
    std::shared_ptr<AudienceSharingApiResources::Ad_accountsAd_account_idAudiencesAd_accountsSharedResource> getAd_accountsAd_account_idAudiencesAd_accountsSharedResource();
    std::shared_ptr<AudienceSharingApiResources::Ad_accountsAd_account_idAudiencesBusinessesSharedResource> getAd_accountsAd_account_idAudiencesBusinessesSharedResource();
    std::shared_ptr<AudienceSharingApiResources::BusinessesBusiness_idAudiencesAd_accountsSharedResource> getBusinessesBusiness_idAudiencesAd_accountsSharedResource();
    std::shared_ptr<AudienceSharingApiResources::BusinessesBusiness_idAudiencesBusinessesSharedResource> getBusinessesBusiness_idAudiencesBusinessesSharedResource();

    void setResource(std::shared_ptr<AudienceSharingApiResources::Ad_accountsAd_account_idAudiencesSharedAccountsResource> resource);
    void setResource(std::shared_ptr<AudienceSharingApiResources::BusinessesBusiness_idAudiencesSharedAccountsResource> resource);
    void setResource(std::shared_ptr<AudienceSharingApiResources::BusinessesBusiness_idAudiencesResource> resource);
    void setResource(std::shared_ptr<AudienceSharingApiResources::Ad_accountsAd_account_idAudiencesAd_accountsSharedResource> resource);
    void setResource(std::shared_ptr<AudienceSharingApiResources::Ad_accountsAd_account_idAudiencesBusinessesSharedResource> resource);
    void setResource(std::shared_ptr<AudienceSharingApiResources::BusinessesBusiness_idAudiencesAd_accountsSharedResource> resource);
    void setResource(std::shared_ptr<AudienceSharingApiResources::BusinessesBusiness_idAudiencesBusinessesSharedResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setAudienceSharingApiAd_accountsAd_account_idAudiencesSharedAccountsResource(std::shared_ptr<AudienceSharingApiResources::Ad_accountsAd_account_idAudiencesSharedAccountsResource> spAudienceSharingApiAd_accountsAd_account_idAudiencesSharedAccountsResource);
    [[deprecated("use setResource()")]]
    virtual void setAudienceSharingApiBusinessesBusiness_idAudiencesSharedAccountsResource(std::shared_ptr<AudienceSharingApiResources::BusinessesBusiness_idAudiencesSharedAccountsResource> spAudienceSharingApiBusinessesBusiness_idAudiencesSharedAccountsResource);
    [[deprecated("use setResource()")]]
    virtual void setAudienceSharingApiBusinessesBusiness_idAudiencesResource(std::shared_ptr<AudienceSharingApiResources::BusinessesBusiness_idAudiencesResource> spAudienceSharingApiBusinessesBusiness_idAudiencesResource);
    [[deprecated("use setResource()")]]
    virtual void setAudienceSharingApiAd_accountsAd_account_idAudiencesAd_accountsSharedResource(std::shared_ptr<AudienceSharingApiResources::Ad_accountsAd_account_idAudiencesAd_accountsSharedResource> spAudienceSharingApiAd_accountsAd_account_idAudiencesAd_accountsSharedResource);
    [[deprecated("use setResource()")]]
    virtual void setAudienceSharingApiAd_accountsAd_account_idAudiencesBusinessesSharedResource(std::shared_ptr<AudienceSharingApiResources::Ad_accountsAd_account_idAudiencesBusinessesSharedResource> spAudienceSharingApiAd_accountsAd_account_idAudiencesBusinessesSharedResource);
    [[deprecated("use setResource()")]]
    virtual void setAudienceSharingApiBusinessesBusiness_idAudiencesAd_accountsSharedResource(std::shared_ptr<AudienceSharingApiResources::BusinessesBusiness_idAudiencesAd_accountsSharedResource> spAudienceSharingApiBusinessesBusiness_idAudiencesAd_accountsSharedResource);
    [[deprecated("use setResource()")]]
    virtual void setAudienceSharingApiBusinessesBusiness_idAudiencesBusinessesSharedResource(std::shared_ptr<AudienceSharingApiResources::BusinessesBusiness_idAudiencesBusinessesSharedResource> spAudienceSharingApiBusinessesBusiness_idAudiencesBusinessesSharedResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<AudienceSharingApiResources::Ad_accountsAd_account_idAudiencesSharedAccountsResource> m_spAd_accountsAd_account_idAudiencesSharedAccountsResource;
    std::shared_ptr<AudienceSharingApiResources::BusinessesBusiness_idAudiencesSharedAccountsResource> m_spBusinessesBusiness_idAudiencesSharedAccountsResource;
    std::shared_ptr<AudienceSharingApiResources::BusinessesBusiness_idAudiencesResource> m_spBusinessesBusiness_idAudiencesResource;
    std::shared_ptr<AudienceSharingApiResources::Ad_accountsAd_account_idAudiencesAd_accountsSharedResource> m_spAd_accountsAd_account_idAudiencesAd_accountsSharedResource;
    std::shared_ptr<AudienceSharingApiResources::Ad_accountsAd_account_idAudiencesBusinessesSharedResource> m_spAd_accountsAd_account_idAudiencesBusinessesSharedResource;
    std::shared_ptr<AudienceSharingApiResources::BusinessesBusiness_idAudiencesAd_accountsSharedResource> m_spBusinessesBusiness_idAudiencesAd_accountsSharedResource;
    std::shared_ptr<AudienceSharingApiResources::BusinessesBusiness_idAudiencesBusinessesSharedResource> m_spBusinessesBusiness_idAudiencesBusinessesSharedResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* AudienceSharingApi_H_ */

