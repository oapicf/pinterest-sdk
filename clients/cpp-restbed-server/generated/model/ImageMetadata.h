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
 * ImageMetadata.h
 *
 * 
 */

#ifndef ImageMetadata_H_
#define ImageMetadata_H_



#include <string>
#include "ImageMetadata_images.h"
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
class  ImageMetadata 
{
public:
    ImageMetadata() = default;
    explicit ImageMetadata(boost::property_tree::ptree const& pt);
    virtual ~ImageMetadata() = default;

    ImageMetadata(const ImageMetadata& other) = default; // copy constructor
    ImageMetadata(ImageMetadata&& other) noexcept = default; // move constructor

    ImageMetadata& operator=(const ImageMetadata& other) = default; // copy assignment
    ImageMetadata& operator=(ImageMetadata&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ImageMetadata members

    /// <summary>
    /// 
    /// </summary>
    std::string getItemType() const;
    void setItemType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getTitle() const;
    void setTitle(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getLink() const;
    void setLink(std::string value);

    /// <summary>
    /// 
    /// </summary>
    ImageMetadata_images getImages() const;
    void setImages(ImageMetadata_images value);

protected:
    std::string m_Item_type = "";
    std::string m_Title = "";
    std::string m_Description = "";
    std::string m_Link = "";
    ImageMetadata_images m_Images;
};

std::vector<ImageMetadata> createImageMetadataVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ImageMetadata>(const ImageMetadata& val) {
    return val.toPropertyTree();
}

template<>
inline ImageMetadata fromPt<ImageMetadata>(const boost::property_tree::ptree& pt) {
    ImageMetadata ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ImageMetadata_H_ */
