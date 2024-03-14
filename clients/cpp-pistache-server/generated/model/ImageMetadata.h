/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.6.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
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


#include "ImageDetails.h"
#include <string>
#include <map>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  ImageMetadata
{
public:
    ImageMetadata();
    virtual ~ImageMetadata() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const ImageMetadata& rhs) const;
    bool operator!=(const ImageMetadata& rhs) const;

    /////////////////////////////////////////////
    /// ImageMetadata members

    /// <summary>
    /// 
    /// </summary>
    std::string getItemType() const;
    void setItemType(std::string const& value);
    bool itemTypeIsSet() const;
    void unsetItem_type();
    /// <summary>
    /// 
    /// </summary>
    std::map<std::string, org::openapitools::server::model::ImageDetails> getImages() const;
    void setImages(std::map<std::string, org::openapitools::server::model::ImageDetails> const& value);
    bool imagesIsSet() const;
    void unsetImages();

    friend  void to_json(nlohmann::json& j, const ImageMetadata& o);
    friend  void from_json(const nlohmann::json& j, ImageMetadata& o);
protected:
    std::string m_Item_type;
    bool m_Item_typeIsSet;
    std::map<std::string, org::openapitools::server::model::ImageDetails> m_Images;
    bool m_ImagesIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* ImageMetadata_H_ */