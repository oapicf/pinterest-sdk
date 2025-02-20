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
 * AudienceCreateCustomRequest.h
 *
 * 
 */

#ifndef AudienceCreateCustomRequest_H_
#define AudienceCreateCustomRequest_H_



#include "AudienceDataParty.h"
#include "AudienceRule.h"
#include <string>
#include "AudienceSharingType.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "AudienceCommon.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  AudienceCreateCustomRequest : public AudienceCommon
{
public:
    AudienceCreateCustomRequest() = default;
    explicit AudienceCreateCustomRequest(boost::property_tree::ptree const& pt);
    virtual ~AudienceCreateCustomRequest() = default;

    AudienceCreateCustomRequest(const AudienceCreateCustomRequest& other) = default; // copy constructor
    AudienceCreateCustomRequest(AudienceCreateCustomRequest&& other) noexcept = default; // move constructor

    AudienceCreateCustomRequest& operator=(const AudienceCreateCustomRequest& other) = default; // copy assignment
    AudienceCreateCustomRequest& operator=(AudienceCreateCustomRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// AudienceCreateCustomRequest members

    /// <summary>
    /// Ad account ID.
    /// </summary>
    std::string getAdAccountId() const;
    void setAdAccountId(std::string value);

    /// <summary>
    /// Audience name.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// 
    /// </summary>
    AudienceRule getRule() const;
    void setRule(AudienceRule value);

    /// <summary>
    /// 
    /// </summary>
    AudienceSharingType getSharingType() const;
    void setSharingType(AudienceSharingType value);

    /// <summary>
    /// 
    /// </summary>
    AudienceDataParty getDataParty() const;
    void setDataParty(AudienceDataParty value);

    /// <summary>
    /// 
    /// </summary>
    std::string getCategory() const;
    void setCategory(std::string value);

protected:
    std::string m_Ad_account_id = "";
    std::string m_Name = "";
    AudienceRule m_Rule;
    AudienceSharingType m_Sharing_type = AudienceSharingType{};
    AudienceDataParty m_Data_party = AudienceDataParty{};
    std::string m_Category = "";
};

std::vector<AudienceCreateCustomRequest> createAudienceCreateCustomRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<AudienceCreateCustomRequest>(const AudienceCreateCustomRequest& val) {
    return val.toPropertyTree();
}

template<>
inline AudienceCreateCustomRequest fromPt<AudienceCreateCustomRequest>(const boost::property_tree::ptree& pt) {
    AudienceCreateCustomRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* AudienceCreateCustomRequest_H_ */
