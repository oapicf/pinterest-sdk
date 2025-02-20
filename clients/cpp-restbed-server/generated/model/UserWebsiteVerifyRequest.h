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
 * UserWebsiteVerifyRequest.h
 *
 * User website verification request
 */

#ifndef UserWebsiteVerifyRequest_H_
#define UserWebsiteVerifyRequest_H_



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
/// User website verification request
/// </summary>
class  UserWebsiteVerifyRequest 
{
public:
    UserWebsiteVerifyRequest() = default;
    explicit UserWebsiteVerifyRequest(boost::property_tree::ptree const& pt);
    virtual ~UserWebsiteVerifyRequest() = default;

    UserWebsiteVerifyRequest(const UserWebsiteVerifyRequest& other) = default; // copy constructor
    UserWebsiteVerifyRequest(UserWebsiteVerifyRequest&& other) noexcept = default; // move constructor

    UserWebsiteVerifyRequest& operator=(const UserWebsiteVerifyRequest& other) = default; // copy assignment
    UserWebsiteVerifyRequest& operator=(UserWebsiteVerifyRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// UserWebsiteVerifyRequest members

    /// <summary>
    /// 
    /// </summary>
    std::string getWebsite() const;
    void setWebsite(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getVerificationMethod() const;
    void setVerificationMethod(std::string value);

protected:
    std::string m_Website = "";
    std::string m_Verification_method = "METATAG";
};

std::vector<UserWebsiteVerifyRequest> createUserWebsiteVerifyRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<UserWebsiteVerifyRequest>(const UserWebsiteVerifyRequest& val) {
    return val.toPropertyTree();
}

template<>
inline UserWebsiteVerifyRequest fromPt<UserWebsiteVerifyRequest>(const boost::property_tree::ptree& pt) {
    UserWebsiteVerifyRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* UserWebsiteVerifyRequest_H_ */
