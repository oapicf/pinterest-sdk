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
 * SharedAudienceAccount.h
 *
 * 
 */

#ifndef SharedAudienceAccount_H_
#define SharedAudienceAccount_H_



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
/// 
/// </summary>
class  SharedAudienceAccount 
{
public:
    SharedAudienceAccount() = default;
    explicit SharedAudienceAccount(boost::property_tree::ptree const& pt);
    virtual ~SharedAudienceAccount() = default;

    SharedAudienceAccount(const SharedAudienceAccount& other) = default; // copy constructor
    SharedAudienceAccount(SharedAudienceAccount&& other) noexcept = default; // move constructor

    SharedAudienceAccount& operator=(const SharedAudienceAccount& other) = default; // copy assignment
    SharedAudienceAccount& operator=(SharedAudienceAccount&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// SharedAudienceAccount members

    /// <summary>
    /// Account ID (ad account or business ID).
    /// </summary>
    std::string getAccountId() const;
    void setAccountId(std::string value);

    /// <summary>
    /// Account name.
    /// </summary>
    std::string getAccountName() const;
    void setAccountName(std::string value);

    /// <summary>
    /// account type
    /// </summary>
    std::string getAccountType() const;
    void setAccountType(std::string value);

    /// <summary>
    /// Epoch timestamp in seconds for the shared audience event
    /// </summary>
    int32_t getSharedOnTimestamp() const;
    void setSharedOnTimestamp(int32_t value);

protected:
    std::string m_Account_id = "";
    std::string m_Account_name = "";
    std::string m_Account_type = "";
    int32_t m_Shared_on_timestamp = 0;
};

std::vector<SharedAudienceAccount> createSharedAudienceAccountVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<SharedAudienceAccount>(const SharedAudienceAccount& val) {
    return val.toPropertyTree();
}

template<>
inline SharedAudienceAccount fromPt<SharedAudienceAccount>(const boost::property_tree::ptree& pt) {
    SharedAudienceAccount ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* SharedAudienceAccount_H_ */
