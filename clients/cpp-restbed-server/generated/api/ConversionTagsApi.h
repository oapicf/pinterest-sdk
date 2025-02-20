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
 * ConversionTagsApi.h
 *
 * 
 */

#ifndef ConversionTagsApi_H_
#define ConversionTagsApi_H_


#include <memory>
#include <utility>
#include <exception>
#include <functional>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "ConversionEventResponse.h"
#include "ConversionTagCreate.h"
#include "ConversionTagListResponse.h"
#include "ConversionTagResponse.h"
#include "Error.h"
#include "Page_visit_conversion_tags_get_200_response.h"
#include <map>
#include <string>
#include <vector>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  ConversionTagsApiException: public std::exception
{
public:
    ConversionTagsApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace ConversionTagsApiResources {
/// <summary>
/// Create conversion tag
/// </summary>
/// <remarks>
/// Create a conversion tag, also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest tag&lt;/a&gt;, with the option to enable enhanced match.&lt;p/&gt; The Pinterest Tag tracks actions people take on the ad account’ s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.&lt;p/&gt; For more information, see:&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot;&gt;Set up the Pinterest tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;/docs/api-features/pinterest-tag/\&quot;&gt;Pinterest Tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;/docs/api-features/pinterest-tag/#enhanced-match\&quot;&gt;Enhanced match&lt;/a&gt;
/// </remarks>
class  Ad_accountsAd_account_idConversion_tagsResource: public restbed::Resource
{
public:
    Ad_accountsAd_account_idConversion_tagsResource(const std::string& context = "/v5");
    virtual ~Ad_accountsAd_account_idConversion_tagsResource() = default;

    Ad_accountsAd_account_idConversion_tagsResource(
        const Ad_accountsAd_account_idConversion_tagsResource& other) = default; // copy constructor
    Ad_accountsAd_account_idConversion_tagsResource(Ad_accountsAd_account_idConversion_tagsResource&& other) noexcept = default; // move constructor

    Ad_accountsAd_account_idConversion_tagsResource& operator=(const Ad_accountsAd_account_idConversion_tagsResource& other) = default; // copy assignment
    Ad_accountsAd_account_idConversion_tagsResource& operator=(Ad_accountsAd_account_idConversion_tagsResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, ConversionTagResponse>(
        std::string & adAccountId, ConversionTagCreate & conversionTagCreate)> handler_POST_func =
            [](std::string &, ConversionTagCreate &) -> std::pair<int, ConversionTagResponse>
                { throw ConversionTagsApiException(501, "Not implemented"); };

    std::function<std::pair<int, ConversionTagListResponse>(
        std::string & adAccountId, bool & filterDeleted)> handler_GET_func =
            [](std::string &, bool &) -> std::pair<int, ConversionTagListResponse>
                { throw ConversionTagsApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, ConversionTagResponse> handler_POST(
        std::string & adAccountId, ConversionTagCreate & conversionTagCreate);

    virtual std::pair<int, ConversionTagListResponse> handler_GET(
        std::string & adAccountId, bool & filterDeleted);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleConversionTagsApiException(const ConversionTagsApiException& e);
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
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Get conversion tag
/// </summary>
/// <remarks>
/// Get information about an existing conversion tag.
/// </remarks>
class  Ad_accountsAd_account_idConversion_tagsConversion_tag_idResource: public restbed::Resource
{
public:
    Ad_accountsAd_account_idConversion_tagsConversion_tag_idResource(const std::string& context = "/v5");
    virtual ~Ad_accountsAd_account_idConversion_tagsConversion_tag_idResource() = default;

    Ad_accountsAd_account_idConversion_tagsConversion_tag_idResource(
        const Ad_accountsAd_account_idConversion_tagsConversion_tag_idResource& other) = default; // copy constructor
    Ad_accountsAd_account_idConversion_tagsConversion_tag_idResource(Ad_accountsAd_account_idConversion_tagsConversion_tag_idResource&& other) noexcept = default; // move constructor

    Ad_accountsAd_account_idConversion_tagsConversion_tag_idResource& operator=(const Ad_accountsAd_account_idConversion_tagsConversion_tag_idResource& other) = default; // copy assignment
    Ad_accountsAd_account_idConversion_tagsConversion_tag_idResource& operator=(Ad_accountsAd_account_idConversion_tagsConversion_tag_idResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, ConversionTagResponse>(
        std::string & adAccountId, std::string & conversionTagId)> handler_GET_func =
            [](std::string &, std::string &) -> std::pair<int, ConversionTagResponse>
                { throw ConversionTagsApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, ConversionTagResponse> handler_GET(
        std::string & adAccountId, std::string & conversionTagId);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleConversionTagsApiException(const ConversionTagsApiException& e);
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
/// Get Ocpm eligible conversion tags
/// </summary>
/// <remarks>
/// Get Ocpm eligible conversion tag events for an ad account.
/// </remarks>
class  Ad_accountsAd_account_idConversion_tagsOcpm_eligibleResource: public restbed::Resource
{
public:
    Ad_accountsAd_account_idConversion_tagsOcpm_eligibleResource(const std::string& context = "/v5");
    virtual ~Ad_accountsAd_account_idConversion_tagsOcpm_eligibleResource() = default;

    Ad_accountsAd_account_idConversion_tagsOcpm_eligibleResource(
        const Ad_accountsAd_account_idConversion_tagsOcpm_eligibleResource& other) = default; // copy constructor
    Ad_accountsAd_account_idConversion_tagsOcpm_eligibleResource(Ad_accountsAd_account_idConversion_tagsOcpm_eligibleResource&& other) noexcept = default; // move constructor

    Ad_accountsAd_account_idConversion_tagsOcpm_eligibleResource& operator=(const Ad_accountsAd_account_idConversion_tagsOcpm_eligibleResource& other) = default; // copy assignment
    Ad_accountsAd_account_idConversion_tagsOcpm_eligibleResource& operator=(Ad_accountsAd_account_idConversion_tagsOcpm_eligibleResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::map<std::string, std::vector<ConversionEventResponse>>>(
        std::string & adAccountId)> handler_GET_func =
            [](std::string &) -> std::pair<int, std::map<std::string, std::vector<ConversionEventResponse>>>
                { throw ConversionTagsApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::map<std::string, std::vector<ConversionEventResponse>>> handler_GET(
        std::string & adAccountId);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleConversionTagsApiException(const ConversionTagsApiException& e);
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
/// Get page visit conversion tags
/// </summary>
/// <remarks>
/// Get all page visit conversion tag events for an ad account.
/// </remarks>
class  Ad_accountsAd_account_idConversion_tagsPage_visitResource: public restbed::Resource
{
public:
    Ad_accountsAd_account_idConversion_tagsPage_visitResource(const std::string& context = "/v5");
    virtual ~Ad_accountsAd_account_idConversion_tagsPage_visitResource() = default;

    Ad_accountsAd_account_idConversion_tagsPage_visitResource(
        const Ad_accountsAd_account_idConversion_tagsPage_visitResource& other) = default; // copy constructor
    Ad_accountsAd_account_idConversion_tagsPage_visitResource(Ad_accountsAd_account_idConversion_tagsPage_visitResource&& other) noexcept = default; // move constructor

    Ad_accountsAd_account_idConversion_tagsPage_visitResource& operator=(const Ad_accountsAd_account_idConversion_tagsPage_visitResource& other) = default; // copy assignment
    Ad_accountsAd_account_idConversion_tagsPage_visitResource& operator=(Ad_accountsAd_account_idConversion_tagsPage_visitResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, Page_visit_conversion_tags_get_200_response>(
        std::string & adAccountId, int32_t & pageSize, std::string & order, std::string & bookmark)> handler_GET_func =
            [](std::string &, int32_t &, std::string &, std::string &) -> std::pair<int, Page_visit_conversion_tags_get_200_response>
                { throw ConversionTagsApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, Page_visit_conversion_tags_get_200_response> handler_GET(
        std::string & adAccountId, int32_t & pageSize, std::string & order, std::string & bookmark);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleConversionTagsApiException(const ConversionTagsApiException& e);
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

} /* namespace ConversionTagsApiResources */

using ConversionTagsApiAd_accountsAd_account_idConversion_tagsResource [[deprecated]] = ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsResource;
using ConversionTagsApiAd_accountsAd_account_idConversion_tagsConversion_tag_idResource [[deprecated]] = ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsConversion_tag_idResource;
using ConversionTagsApiAd_accountsAd_account_idConversion_tagsOcpm_eligibleResource [[deprecated]] = ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsOcpm_eligibleResource;
using ConversionTagsApiAd_accountsAd_account_idConversion_tagsPage_visitResource [[deprecated]] = ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsPage_visitResource;

//
// The restbed service to actually implement the REST server
//
class  ConversionTagsApi
{
public:
    explicit ConversionTagsApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~ConversionTagsApi();

    std::shared_ptr<ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsResource> getAd_accountsAd_account_idConversion_tagsResource();
    std::shared_ptr<ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsConversion_tag_idResource> getAd_accountsAd_account_idConversion_tagsConversion_tag_idResource();
    std::shared_ptr<ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsOcpm_eligibleResource> getAd_accountsAd_account_idConversion_tagsOcpm_eligibleResource();
    std::shared_ptr<ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsPage_visitResource> getAd_accountsAd_account_idConversion_tagsPage_visitResource();

    void setResource(std::shared_ptr<ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsResource> resource);
    void setResource(std::shared_ptr<ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsConversion_tag_idResource> resource);
    void setResource(std::shared_ptr<ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsOcpm_eligibleResource> resource);
    void setResource(std::shared_ptr<ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsPage_visitResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setConversionTagsApiAd_accountsAd_account_idConversion_tagsResource(std::shared_ptr<ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsResource> spConversionTagsApiAd_accountsAd_account_idConversion_tagsResource);
    [[deprecated("use setResource()")]]
    virtual void setConversionTagsApiAd_accountsAd_account_idConversion_tagsConversion_tag_idResource(std::shared_ptr<ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsConversion_tag_idResource> spConversionTagsApiAd_accountsAd_account_idConversion_tagsConversion_tag_idResource);
    [[deprecated("use setResource()")]]
    virtual void setConversionTagsApiAd_accountsAd_account_idConversion_tagsOcpm_eligibleResource(std::shared_ptr<ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsOcpm_eligibleResource> spConversionTagsApiAd_accountsAd_account_idConversion_tagsOcpm_eligibleResource);
    [[deprecated("use setResource()")]]
    virtual void setConversionTagsApiAd_accountsAd_account_idConversion_tagsPage_visitResource(std::shared_ptr<ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsPage_visitResource> spConversionTagsApiAd_accountsAd_account_idConversion_tagsPage_visitResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsResource> m_spAd_accountsAd_account_idConversion_tagsResource;
    std::shared_ptr<ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsConversion_tag_idResource> m_spAd_accountsAd_account_idConversion_tagsConversion_tag_idResource;
    std::shared_ptr<ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsOcpm_eligibleResource> m_spAd_accountsAd_account_idConversion_tagsOcpm_eligibleResource;
    std::shared_ptr<ConversionTagsApiResources::Ad_accountsAd_account_idConversion_tagsPage_visitResource> m_spAd_accountsAd_account_idConversion_tagsPage_visitResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* ConversionTagsApi_H_ */

