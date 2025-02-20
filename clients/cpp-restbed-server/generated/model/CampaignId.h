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
 * CampaignId.h
 *
 * 
 */

#ifndef CampaignId_H_
#define CampaignId_H_



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
class  CampaignId 
{
public:
    CampaignId() = default;
    explicit CampaignId(boost::property_tree::ptree const& pt);
    virtual ~CampaignId() = default;

    CampaignId(const CampaignId& other) = default; // copy constructor
    CampaignId(CampaignId&& other) noexcept = default; // move constructor

    CampaignId& operator=(const CampaignId& other) = default; // copy assignment
    CampaignId& operator=(CampaignId&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CampaignId members

    /// <summary>
    /// Campaign ID.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

protected:
    std::string m_Id = "";
};

std::vector<CampaignId> createCampaignIdVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CampaignId>(const CampaignId& val) {
    return val.toPropertyTree();
}

template<>
inline CampaignId fromPt<CampaignId>(const boost::property_tree::ptree& pt) {
    CampaignId ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CampaignId_H_ */
