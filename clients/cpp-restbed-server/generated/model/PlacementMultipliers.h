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
 * PlacementMultipliers.h
 *
 * This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */

#ifndef PlacementMultipliers_H_
#define PlacementMultipliers_H_



#include <string>
#include <map>
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
/// This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
/// </summary>
class  PlacementMultipliers 
{
public:
    PlacementMultipliers() = default;
    explicit PlacementMultipliers(boost::property_tree::ptree const& pt);
    virtual ~PlacementMultipliers() = default;

    PlacementMultipliers(const PlacementMultipliers& other) = default; // copy constructor
    PlacementMultipliers(PlacementMultipliers&& other) noexcept = default; // move constructor

    PlacementMultipliers& operator=(const PlacementMultipliers& other) = default; // copy assignment
    PlacementMultipliers& operator=(PlacementMultipliers&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// PlacementMultipliers members

    /// <summary>
    /// 
    /// </summary>
    std::string getPLACEMENT() const;
    void setPLACEMENT(std::string value);

protected:
    std::string m_PLACEMENT = "";
};

std::vector<PlacementMultipliers> createPlacementMultipliersVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<PlacementMultipliers>(const PlacementMultipliers& val) {
    return val.toPropertyTree();
}

template<>
inline PlacementMultipliers fromPt<PlacementMultipliers>(const boost::property_tree::ptree& pt) {
    PlacementMultipliers ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* PlacementMultipliers_H_ */
