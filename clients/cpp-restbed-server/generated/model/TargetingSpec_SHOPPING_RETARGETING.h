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
 * TargetingSpec_SHOPPING_RETARGETING.h
 *
 * 
 */

#ifndef TargetingSpec_SHOPPING_RETARGETING_H_
#define TargetingSpec_SHOPPING_RETARGETING_H_



#include <vector>
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
class  TargetingSpec_SHOPPING_RETARGETING 
{
public:
    TargetingSpec_SHOPPING_RETARGETING() = default;
    explicit TargetingSpec_SHOPPING_RETARGETING(boost::property_tree::ptree const& pt);
    virtual ~TargetingSpec_SHOPPING_RETARGETING() = default;

    TargetingSpec_SHOPPING_RETARGETING(const TargetingSpec_SHOPPING_RETARGETING& other) = default; // copy constructor
    TargetingSpec_SHOPPING_RETARGETING(TargetingSpec_SHOPPING_RETARGETING&& other) noexcept = default; // move constructor

    TargetingSpec_SHOPPING_RETARGETING& operator=(const TargetingSpec_SHOPPING_RETARGETING& other) = default; // copy assignment
    TargetingSpec_SHOPPING_RETARGETING& operator=(TargetingSpec_SHOPPING_RETARGETING&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// TargetingSpec_SHOPPING_RETARGETING members

    /// <summary>
    /// Number of days ago to start lookback timeframe for dynamic retargeting
    /// </summary>
    int32_t getLookbackWindow() const;
    void setLookbackWindow(int32_t value);

    /// <summary>
    /// Event types to target for dynamic retargeting
    /// </summary>
    std::vector<int32_t> getTagTypes() const;
    void setTagTypes(std::vector<int32_t> value);

    /// <summary>
    /// Number of days ago to stop lookback timeframe for dynamic retargeting
    /// </summary>
    int32_t getExclusionWindow() const;
    void setExclusionWindow(int32_t value);

protected:
    int32_t m_Lookback_window = 0;
    std::vector<int32_t> m_Tag_types;
    int32_t m_Exclusion_window = 0;
};

std::vector<TargetingSpec_SHOPPING_RETARGETING> createTargetingSpec_SHOPPING_RETARGETINGVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<TargetingSpec_SHOPPING_RETARGETING>(const TargetingSpec_SHOPPING_RETARGETING& val) {
    return val.toPropertyTree();
}

template<>
inline TargetingSpec_SHOPPING_RETARGETING fromPt<TargetingSpec_SHOPPING_RETARGETING>(const boost::property_tree::ptree& pt) {
    TargetingSpec_SHOPPING_RETARGETING ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* TargetingSpec_SHOPPING_RETARGETING_H_ */
