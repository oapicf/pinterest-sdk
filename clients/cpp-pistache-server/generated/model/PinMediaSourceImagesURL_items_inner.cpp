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


#include "PinMediaSourceImagesURL_items_inner.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

PinMediaSourceImagesURL_items_inner::PinMediaSourceImagesURL_items_inner()
{
    m_Title = "";
    m_TitleIsSet = false;
    m_Description = "";
    m_DescriptionIsSet = false;
    m_Link = "";
    m_LinkIsSet = false;
    m_Url = "";
    
}

void PinMediaSourceImagesURL_items_inner::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool PinMediaSourceImagesURL_items_inner::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool PinMediaSourceImagesURL_items_inner::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "PinMediaSourceImagesURL_items_inner" : pathPrefix;

                    
    return success;
}

bool PinMediaSourceImagesURL_items_inner::operator==(const PinMediaSourceImagesURL_items_inner& rhs) const
{
    return
    
    
    
    ((!titleIsSet() && !rhs.titleIsSet()) || (titleIsSet() && rhs.titleIsSet() && getTitle() == rhs.getTitle())) &&
    
    
    ((!descriptionIsSet() && !rhs.descriptionIsSet()) || (descriptionIsSet() && rhs.descriptionIsSet() && getDescription() == rhs.getDescription())) &&
    
    
    ((!linkIsSet() && !rhs.linkIsSet()) || (linkIsSet() && rhs.linkIsSet() && getLink() == rhs.getLink())) &&
    
    (getUrl() == rhs.getUrl())
    
    
    ;
}

bool PinMediaSourceImagesURL_items_inner::operator!=(const PinMediaSourceImagesURL_items_inner& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const PinMediaSourceImagesURL_items_inner& o)
{
    j = nlohmann::json::object();
    if(o.titleIsSet())
        j["title"] = o.m_Title;
    if(o.descriptionIsSet())
        j["description"] = o.m_Description;
    if(o.linkIsSet())
        j["link"] = o.m_Link;
    j["url"] = o.m_Url;
    
}

void from_json(const nlohmann::json& j, PinMediaSourceImagesURL_items_inner& o)
{
    if(j.find("title") != j.end())
    {
        j.at("title").get_to(o.m_Title);
        o.m_TitleIsSet = true;
    } 
    if(j.find("description") != j.end())
    {
        j.at("description").get_to(o.m_Description);
        o.m_DescriptionIsSet = true;
    } 
    if(j.find("link") != j.end())
    {
        j.at("link").get_to(o.m_Link);
        o.m_LinkIsSet = true;
    } 
    j.at("url").get_to(o.m_Url);
    
}

std::string PinMediaSourceImagesURL_items_inner::getTitle() const
{
    return m_Title;
}
void PinMediaSourceImagesURL_items_inner::setTitle(std::string const& value)
{
    m_Title = value;
    m_TitleIsSet = true;
}
bool PinMediaSourceImagesURL_items_inner::titleIsSet() const
{
    return m_TitleIsSet;
}
void PinMediaSourceImagesURL_items_inner::unsetTitle()
{
    m_TitleIsSet = false;
}
std::string PinMediaSourceImagesURL_items_inner::getDescription() const
{
    return m_Description;
}
void PinMediaSourceImagesURL_items_inner::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool PinMediaSourceImagesURL_items_inner::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void PinMediaSourceImagesURL_items_inner::unsetDescription()
{
    m_DescriptionIsSet = false;
}
std::string PinMediaSourceImagesURL_items_inner::getLink() const
{
    return m_Link;
}
void PinMediaSourceImagesURL_items_inner::setLink(std::string const& value)
{
    m_Link = value;
    m_LinkIsSet = true;
}
bool PinMediaSourceImagesURL_items_inner::linkIsSet() const
{
    return m_LinkIsSet;
}
void PinMediaSourceImagesURL_items_inner::unsetLink()
{
    m_LinkIsSet = false;
}
std::string PinMediaSourceImagesURL_items_inner::getUrl() const
{
    return m_Url;
}
void PinMediaSourceImagesURL_items_inner::setUrl(std::string const& value)
{
    m_Url = value;
}


} // namespace org::openapitools::server::model

