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
 * AdPreviewCreateFromPin.h
 *
 * 
 */

#ifndef AdPreviewCreateFromPin_H_
#define AdPreviewCreateFromPin_H_



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
class  AdPreviewCreateFromPin 
{
public:
    AdPreviewCreateFromPin() = default;
    explicit AdPreviewCreateFromPin(boost::property_tree::ptree const& pt);
    virtual ~AdPreviewCreateFromPin() = default;

    AdPreviewCreateFromPin(const AdPreviewCreateFromPin& other) = default; // copy constructor
    AdPreviewCreateFromPin(AdPreviewCreateFromPin&& other) noexcept = default; // move constructor

    AdPreviewCreateFromPin& operator=(const AdPreviewCreateFromPin& other) = default; // copy assignment
    AdPreviewCreateFromPin& operator=(AdPreviewCreateFromPin&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// AdPreviewCreateFromPin members

    /// <summary>
    /// Pin ID.
    /// </summary>
    std::string getPinId() const;
    void setPinId(std::string value);

protected:
    std::string m_Pin_id = "";
};

std::vector<AdPreviewCreateFromPin> createAdPreviewCreateFromPinVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<AdPreviewCreateFromPin>(const AdPreviewCreateFromPin& val) {
    return val.toPropertyTree();
}

template<>
inline AdPreviewCreateFromPin fromPt<AdPreviewCreateFromPin>(const boost::property_tree::ptree& pt) {
    AdPreviewCreateFromPin ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* AdPreviewCreateFromPin_H_ */
