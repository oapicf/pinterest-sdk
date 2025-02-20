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
 * OauthAccessTokenResponseIntegrationRefresh.h
 *
 * A successful OAuth access token response for the refresh token flow, with an added refresh token.
 */

#ifndef OauthAccessTokenResponseIntegrationRefresh_H_
#define OauthAccessTokenResponseIntegrationRefresh_H_



#include <string>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// A successful OAuth access token response for the refresh token flow, with an added refresh token.
/// </summary>
class  OauthAccessTokenResponseIntegrationRefresh 
{
public:
    OauthAccessTokenResponseIntegrationRefresh() = default;
    explicit OauthAccessTokenResponseIntegrationRefresh(boost::property_tree::ptree const& pt);
    virtual ~OauthAccessTokenResponseIntegrationRefresh() = default;

    OauthAccessTokenResponseIntegrationRefresh(const OauthAccessTokenResponseIntegrationRefresh& other) = default; // copy constructor
    OauthAccessTokenResponseIntegrationRefresh(OauthAccessTokenResponseIntegrationRefresh&& other) noexcept = default; // move constructor

    OauthAccessTokenResponseIntegrationRefresh& operator=(const OauthAccessTokenResponseIntegrationRefresh& other) = default; // copy assignment
    OauthAccessTokenResponseIntegrationRefresh& operator=(OauthAccessTokenResponseIntegrationRefresh&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// OauthAccessTokenResponseIntegrationRefresh members

    /// <summary>
    /// 
    /// </summary>
    std::string getResponseType() const;
    void setResponseType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getAccessToken() const;
    void setAccessToken(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getTokenType() const;
    void setTokenType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getExpiresIn() const;
    void setExpiresIn(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::string getScope() const;
    void setScope(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getRefreshToken() const;
    void setRefreshToken(std::string value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getRefreshTokenExpiresIn() const;
    void setRefreshTokenExpiresIn(int32_t value);

protected:
    std::string m_Response_type = "";
    std::string m_Access_token = "";
    std::string m_Token_type = "bearer";
    int32_t m_Expires_in = 0;
    std::string m_Scope = "";
    std::string m_Refresh_token = "";
    int32_t m_Refresh_token_expires_in = 0;
};

std::vector<OauthAccessTokenResponseIntegrationRefresh> createOauthAccessTokenResponseIntegrationRefreshVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<OauthAccessTokenResponseIntegrationRefresh>(const OauthAccessTokenResponseIntegrationRefresh& val) {
    return val.toPropertyTree();
}

template<>
inline OauthAccessTokenResponseIntegrationRefresh fromPt<OauthAccessTokenResponseIntegrationRefresh>(const boost::property_tree::ptree& pt) {
    OauthAccessTokenResponseIntegrationRefresh ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* OauthAccessTokenResponseIntegrationRefresh_H_ */
