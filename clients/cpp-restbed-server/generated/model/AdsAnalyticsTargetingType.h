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
 * AdsAnalyticsTargetingType.h
 *
 * Reporting targeting type
 */

#ifndef AdsAnalyticsTargetingType_H_
#define AdsAnalyticsTargetingType_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Reporting targeting type
/// </summary>
class  AdsAnalyticsTargetingType 
{
public:
    AdsAnalyticsTargetingType() = default;
    explicit AdsAnalyticsTargetingType(boost::property_tree::ptree const& pt);
    virtual ~AdsAnalyticsTargetingType() = default;

    AdsAnalyticsTargetingType(const AdsAnalyticsTargetingType& other) = default; // copy constructor
    AdsAnalyticsTargetingType(AdsAnalyticsTargetingType&& other) noexcept = default; // move constructor

    AdsAnalyticsTargetingType& operator=(const AdsAnalyticsTargetingType& other) = default; // copy assignment
    AdsAnalyticsTargetingType& operator=(AdsAnalyticsTargetingType&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// AdsAnalyticsTargetingType members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_AdsAnalyticsTargetingTypeEnumValue;
};

std::vector<AdsAnalyticsTargetingType> createAdsAnalyticsTargetingTypeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<AdsAnalyticsTargetingType>(const AdsAnalyticsTargetingType& val) {
    return val.toPropertyTree();
}

template<>
inline AdsAnalyticsTargetingType fromPt<AdsAnalyticsTargetingType>(const boost::property_tree::ptree& pt) {
    AdsAnalyticsTargetingType ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* AdsAnalyticsTargetingType_H_ */
