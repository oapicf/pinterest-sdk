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
 * OauthAccessTokenResponse.h
 *
 * A successful OAuth access token response.
 */

#ifndef OauthAccessTokenResponse_H_
#define OauthAccessTokenResponse_H_



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
/// A successful OAuth access token response.
/// </summary>
class  OauthAccessTokenResponse 
{
public:
    OauthAccessTokenResponse() = default;
    explicit OauthAccessTokenResponse(boost::property_tree::ptree const& pt);
    virtual ~OauthAccessTokenResponse() = default;

    OauthAccessTokenResponse(const OauthAccessTokenResponse& other) = default; // copy constructor
    OauthAccessTokenResponse(OauthAccessTokenResponse&& other) noexcept = default; // move constructor

    OauthAccessTokenResponse& operator=(const OauthAccessTokenResponse& other) = default; // copy assignment
    OauthAccessTokenResponse& operator=(OauthAccessTokenResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// OauthAccessTokenResponse members

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

protected:
    std::string m_Response_type = "";
    std::string m_Access_token = "";
    std::string m_Token_type = "bearer";
    int32_t m_Expires_in = 0;
    std::string m_Scope = "";
};

std::vector<OauthAccessTokenResponse> createOauthAccessTokenResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<OauthAccessTokenResponse>(const OauthAccessTokenResponse& val) {
    return val.toPropertyTree();
}

template<>
inline OauthAccessTokenResponse fromPt<OauthAccessTokenResponse>(const boost::property_tree::ptree& pt) {
    OauthAccessTokenResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* OauthAccessTokenResponse_H_ */
