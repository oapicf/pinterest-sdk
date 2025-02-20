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
 * PinMediaWithVideo.h
 *
 * Pin with video.
 */

#ifndef PinMediaWithVideo_H_
#define PinMediaWithVideo_H_


#include "PinMediaWithImage_allOf_images.h"
#include "PinMedia.h"
#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Pin with video.
/// </summary>
class  PinMediaWithVideo
{
public:
    PinMediaWithVideo();
    virtual ~PinMediaWithVideo() = default;


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

    bool operator==(const PinMediaWithVideo& rhs) const;
    bool operator!=(const PinMediaWithVideo& rhs) const;

    /////////////////////////////////////////////
    /// PinMediaWithVideo members

    /// <summary>
    /// 
    /// </summary>
    std::string getMediaType() const;
    void setMediaType(std::string const& value);
    bool mediaTypeIsSet() const;
    void unsetMedia_type();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::PinMediaWithImage_allOf_images getImages() const;
    void setImages(org::openapitools::server::model::PinMediaWithImage_allOf_images const& value);
    bool imagesIsSet() const;
    void unsetImages();
    /// <summary>
    /// 
    /// </summary>
    std::string getCoverImageUrl() const;
    void setCoverImageUrl(std::string const& value);
    bool coverImageUrlIsSet() const;
    void unsetCover_image_url();
    /// <summary>
    /// Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps.
    /// </summary>
    std::string getVideoUrl() const;
    void setVideoUrl(std::string const& value);
    bool videoUrlIsSet() const;
    void unsetVideo_url();
    /// <summary>
    /// Duration (in milliseconds)
    /// </summary>
    double getDuration() const;
    void setDuration(double const value);
    bool durationIsSet() const;
    void unsetDuration();
    /// <summary>
    /// Height (in pixels)
    /// </summary>
    int32_t getHeight() const;
    void setHeight(int32_t const value);
    bool heightIsSet() const;
    void unsetHeight();
    /// <summary>
    /// Width (in pixels)
    /// </summary>
    int32_t getWidth() const;
    void setWidth(int32_t const value);
    bool widthIsSet() const;
    void unsetWidth();

    friend  void to_json(nlohmann::json& j, const PinMediaWithVideo& o);
    friend  void from_json(const nlohmann::json& j, PinMediaWithVideo& o);
protected:
    std::string m_Media_type;
    bool m_Media_typeIsSet;
    org::openapitools::server::model::PinMediaWithImage_allOf_images m_Images;
    bool m_ImagesIsSet;
    std::string m_Cover_image_url;
    bool m_Cover_image_urlIsSet;
    std::string m_Video_url;
    bool m_Video_urlIsSet;
    double m_Duration;
    bool m_DurationIsSet;
    int32_t m_Height;
    bool m_HeightIsSet;
    int32_t m_Width;
    bool m_WidthIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* PinMediaWithVideo_H_ */
