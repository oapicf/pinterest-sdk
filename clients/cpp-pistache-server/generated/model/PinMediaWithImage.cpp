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


#include "PinMediaWithImage.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

PinMediaWithImage::PinMediaWithImage()
{
    m_Media_type = "";
    m_Media_typeIsSet = false;
    m_ImagesIsSet = false;
    
}

void PinMediaWithImage::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool PinMediaWithImage::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool PinMediaWithImage::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "PinMediaWithImage" : pathPrefix;

            
    return success;
}

bool PinMediaWithImage::operator==(const PinMediaWithImage& rhs) const
{
    return
    
    
    
    ((!mediaTypeIsSet() && !rhs.mediaTypeIsSet()) || (mediaTypeIsSet() && rhs.mediaTypeIsSet() && getMediaType() == rhs.getMediaType())) &&
    
    
    ((!imagesIsSet() && !rhs.imagesIsSet()) || (imagesIsSet() && rhs.imagesIsSet() && getImages() == rhs.getImages()))
    
    ;
}

bool PinMediaWithImage::operator!=(const PinMediaWithImage& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const PinMediaWithImage& o)
{
    j = nlohmann::json::object();
    if(o.mediaTypeIsSet())
        j["media_type"] = o.m_Media_type;
    if(o.imagesIsSet())
        j["images"] = o.m_Images;
    
}

void from_json(const nlohmann::json& j, PinMediaWithImage& o)
{
    if(j.find("media_type") != j.end())
    {
        j.at("media_type").get_to(o.m_Media_type);
        o.m_Media_typeIsSet = true;
    } 
    if(j.find("images") != j.end())
    {
        j.at("images").get_to(o.m_Images);
        o.m_ImagesIsSet = true;
    } 
    
}

std::string PinMediaWithImage::getMediaType() const
{
    return m_Media_type;
}
void PinMediaWithImage::setMediaType(std::string const& value)
{
    m_Media_type = value;
    m_Media_typeIsSet = true;
}
bool PinMediaWithImage::mediaTypeIsSet() const
{
    return m_Media_typeIsSet;
}
void PinMediaWithImage::unsetMedia_type()
{
    m_Media_typeIsSet = false;
}
org::openapitools::server::model::PinMediaWithImage_allOf_images PinMediaWithImage::getImages() const
{
    return m_Images;
}
void PinMediaWithImage::setImages(org::openapitools::server::model::PinMediaWithImage_allOf_images const& value)
{
    m_Images = value;
    m_ImagesIsSet = true;
}
bool PinMediaWithImage::imagesIsSet() const
{
    return m_ImagesIsSet;
}
void PinMediaWithImage::unsetImages()
{
    m_ImagesIsSet = false;
}


} // namespace org::openapitools::server::model

