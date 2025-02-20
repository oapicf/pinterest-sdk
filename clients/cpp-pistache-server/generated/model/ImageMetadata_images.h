/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * ImageMetadata_images.h
 *
 * 
 */

#ifndef ImageMetadata_images_H_
#define ImageMetadata_images_H_


#include "ImageDetails.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  ImageMetadata_images
{
public:
    ImageMetadata_images();
    virtual ~ImageMetadata_images() = default;


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

    bool operator==(const ImageMetadata_images& rhs) const;
    bool operator!=(const ImageMetadata_images& rhs) const;

    /////////////////////////////////////////////
    /// ImageMetadata_images members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::ImageDetails getR150x150() const;
    void setR150x150(org::openapitools::server::model::ImageDetails const& value);
    bool r150x150IsSet() const;
    void unsetr_150x150();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::ImageDetails getR400x300() const;
    void setR400x300(org::openapitools::server::model::ImageDetails const& value);
    bool r400x300IsSet() const;
    void unsetr_400x300();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::ImageDetails getR600x() const;
    void setR600x(org::openapitools::server::model::ImageDetails const& value);
    bool r600xIsSet() const;
    void unsetr_600x();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::ImageDetails getR1200x() const;
    void setR1200x(org::openapitools::server::model::ImageDetails const& value);
    bool r1200xIsSet() const;
    void unsetr_1200x();

    friend  void to_json(nlohmann::json& j, const ImageMetadata_images& o);
    friend  void from_json(const nlohmann::json& j, ImageMetadata_images& o);
protected:
    org::openapitools::server::model::ImageDetails m_r_150x150;
    bool m_r_150x150IsSet;
    org::openapitools::server::model::ImageDetails m_r_400x300;
    bool m_r_400x300IsSet;
    org::openapitools::server::model::ImageDetails m_r_600x;
    bool m_r_600xIsSet;
    org::openapitools::server::model::ImageDetails m_r_1200x;
    bool m_r_1200xIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* ImageMetadata_images_H_ */
