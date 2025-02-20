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
 * OauthAccessTokenRequestCode.h
 *
 * A request to exchange an authorization code for an access token.
 */

#ifndef OauthAccessTokenRequestCode_H_
#define OauthAccessTokenRequestCode_H_



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
/// A request to exchange an authorization code for an access token.
/// </summary>
class  OauthAccessTokenRequestCode 
{
public:
    OauthAccessTokenRequestCode() = default;
    explicit OauthAccessTokenRequestCode(boost::property_tree::ptree const& pt);
    virtual ~OauthAccessTokenRequestCode() = default;

    OauthAccessTokenRequestCode(const OauthAccessTokenRequestCode& other) = default; // copy constructor
    OauthAccessTokenRequestCode(OauthAccessTokenRequestCode&& other) noexcept = default; // move constructor

    OauthAccessTokenRequestCode& operator=(const OauthAccessTokenRequestCode& other) = default; // copy assignment
    OauthAccessTokenRequestCode& operator=(OauthAccessTokenRequestCode&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// OauthAccessTokenRequestCode members

    /// <summary>
    /// 
    /// </summary>
    std::string getGrantType() const;
    void setGrantType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getCode() const;
    void setCode(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getRedirectUri() const;
    void setRedirectUri(std::string value);

protected:
    std::string m_Grant_type = "";
    std::string m_Code = "";
    std::string m_Redirect_uri = "";
};

std::vector<OauthAccessTokenRequestCode> createOauthAccessTokenRequestCodeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<OauthAccessTokenRequestCode>(const OauthAccessTokenRequestCode& val) {
    return val.toPropertyTree();
}

template<>
inline OauthAccessTokenRequestCode fromPt<OauthAccessTokenRequestCode>(const boost::property_tree::ptree& pt) {
    OauthAccessTokenRequestCode ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* OauthAccessTokenRequestCode_H_ */
