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
 * PinMediaSourceImagesURL.h
 *
 * Multiple images urls-based media source
 */

#ifndef PinMediaSourceImagesURL_H_
#define PinMediaSourceImagesURL_H_



#include "PinMediaSourceImagesURL_items_inner.h"
#include <string>
#include <vector>
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
/// Multiple images urls-based media source
/// </summary>
class  PinMediaSourceImagesURL 
{
public:
    PinMediaSourceImagesURL() = default;
    explicit PinMediaSourceImagesURL(boost::property_tree::ptree const& pt);
    virtual ~PinMediaSourceImagesURL() = default;

    PinMediaSourceImagesURL(const PinMediaSourceImagesURL& other) = default; // copy constructor
    PinMediaSourceImagesURL(PinMediaSourceImagesURL&& other) noexcept = default; // move constructor

    PinMediaSourceImagesURL& operator=(const PinMediaSourceImagesURL& other) = default; // copy assignment
    PinMediaSourceImagesURL& operator=(PinMediaSourceImagesURL&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// PinMediaSourceImagesURL members

    /// <summary>
    /// 
    /// </summary>
    std::string getSourceType() const;
    void setSourceType(std::string value);

    /// <summary>
    /// Array with image objects.
    /// </summary>
    std::vector<PinMediaSourceImagesURL_items_inner> getItems() const;
    void setItems(std::vector<PinMediaSourceImagesURL_items_inner> value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getIndex() const;
    void setIndex(int32_t value);

protected:
    std::string m_Source_type = "";
    std::vector<PinMediaSourceImagesURL_items_inner> m_Items;
    int32_t m_Index = 0;
};

std::vector<PinMediaSourceImagesURL> createPinMediaSourceImagesURLVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<PinMediaSourceImagesURL>(const PinMediaSourceImagesURL& val) {
    return val.toPropertyTree();
}

template<>
inline PinMediaSourceImagesURL fromPt<PinMediaSourceImagesURL>(const boost::property_tree::ptree& pt) {
    PinMediaSourceImagesURL ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* PinMediaSourceImagesURL_H_ */
