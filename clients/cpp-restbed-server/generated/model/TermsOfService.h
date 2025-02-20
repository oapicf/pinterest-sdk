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
 * TermsOfService.h
 *
 * 
 */

#ifndef TermsOfService_H_
#define TermsOfService_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  TermsOfService 
{
public:
    TermsOfService() = default;
    explicit TermsOfService(boost::property_tree::ptree const& pt);
    virtual ~TermsOfService() = default;

    TermsOfService(const TermsOfService& other) = default; // copy constructor
    TermsOfService(TermsOfService&& other) noexcept = default; // move constructor

    TermsOfService& operator=(const TermsOfService& other) = default; // copy assignment
    TermsOfService& operator=(TermsOfService&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// TermsOfService members

    /// <summary>
    /// The ID of the terms of service
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// The terms of service content
    /// </summary>
    std::string getHtml() const;
    void setHtml(std::string value);

    /// <summary>
    /// Whether the ad account has accepted terms of service.
    /// </summary>
    bool isHasAccepted() const;
    void setHasAccepted(bool value);

    /// <summary>
    /// The ID of the ad account.
    /// </summary>
    std::string getAdAccountId() const;
    void setAdAccountId(std::string value);

protected:
    std::string m_Id = "";
    std::string m_Html = "";
    bool m_Has_accepted = false;
    std::string m_Ad_account_id = "";
};

std::vector<TermsOfService> createTermsOfServiceVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<TermsOfService>(const TermsOfService& val) {
    return val.toPropertyTree();
}

template<>
inline TermsOfService fromPt<TermsOfService>(const boost::property_tree::ptree& pt) {
    TermsOfService ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* TermsOfService_H_ */
