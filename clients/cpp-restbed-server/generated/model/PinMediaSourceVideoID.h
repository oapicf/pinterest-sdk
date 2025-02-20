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
 * PinMediaSourceVideoID.h
 *
 * Video ID-based media source
 */

#ifndef PinMediaSourceVideoID_H_
#define PinMediaSourceVideoID_H_



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
/// Video ID-based media source
/// </summary>
class  PinMediaSourceVideoID 
{
public:
    PinMediaSourceVideoID() = default;
    explicit PinMediaSourceVideoID(boost::property_tree::ptree const& pt);
    virtual ~PinMediaSourceVideoID() = default;

    PinMediaSourceVideoID(const PinMediaSourceVideoID& other) = default; // copy constructor
    PinMediaSourceVideoID(PinMediaSourceVideoID&& other) noexcept = default; // move constructor

    PinMediaSourceVideoID& operator=(const PinMediaSourceVideoID& other) = default; // copy assignment
    PinMediaSourceVideoID& operator=(PinMediaSourceVideoID&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// PinMediaSourceVideoID members

    /// <summary>
    /// 
    /// </summary>
    std::string getSourceType() const;
    void setSourceType(std::string value);

    /// <summary>
    /// Cover image url.
    /// </summary>
    std::string getCoverImageUrl() const;
    void setCoverImageUrl(std::string value);

    /// <summary>
    /// Content type for cover image Base64.
    /// </summary>
    std::string getCoverImageContentType() const;
    void setCoverImageContentType(std::string value);

    /// <summary>
    /// Cover image Base64.
    /// </summary>
    std::string getCoverImageData() const;
    void setCoverImageData(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getMediaId() const;
    void setMediaId(std::string value);

    /// <summary>
    /// Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
    /// </summary>
    bool isIsStandard() const;
    void setIsStandard(bool value);

protected:
    std::string m_Source_type = "";
    std::string m_Cover_image_url = "";
    std::string m_Cover_image_content_type = "";
    std::string m_Cover_image_data = "";
    std::string m_Media_id = "";
    bool m_Is_standard = true;
};

std::vector<PinMediaSourceVideoID> createPinMediaSourceVideoIDVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<PinMediaSourceVideoID>(const PinMediaSourceVideoID& val) {
    return val.toPropertyTree();
}

template<>
inline PinMediaSourceVideoID fromPt<PinMediaSourceVideoID>(const boost::property_tree::ptree& pt) {
    PinMediaSourceVideoID ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* PinMediaSourceVideoID_H_ */
