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


#include "AudienceInsightCategoryCommon.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

AudienceInsightCategoryCommon::AudienceInsightCategoryCommon()
{
    m_Key = "";
    m_KeyIsSet = false;
    m_Name = "";
    m_NameIsSet = false;
    m_Ratio = 0.0;
    m_RatioIsSet = false;
    m_Index = 0.0;
    m_IndexIsSet = false;
    m_Id = "";
    m_IdIsSet = false;
    
}

void AudienceInsightCategoryCommon::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool AudienceInsightCategoryCommon::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool AudienceInsightCategoryCommon::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "AudienceInsightCategoryCommon" : pathPrefix;

                        
    return success;
}

bool AudienceInsightCategoryCommon::operator==(const AudienceInsightCategoryCommon& rhs) const
{
    return
    
    
    
    ((!keyIsSet() && !rhs.keyIsSet()) || (keyIsSet() && rhs.keyIsSet() && getKey() == rhs.getKey())) &&
    
    
    ((!nameIsSet() && !rhs.nameIsSet()) || (nameIsSet() && rhs.nameIsSet() && getName() == rhs.getName())) &&
    
    
    ((!ratioIsSet() && !rhs.ratioIsSet()) || (ratioIsSet() && rhs.ratioIsSet() && getRatio() == rhs.getRatio())) &&
    
    
    ((!indexIsSet() && !rhs.indexIsSet()) || (indexIsSet() && rhs.indexIsSet() && getIndex() == rhs.getIndex())) &&
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId()))
    
    ;
}

bool AudienceInsightCategoryCommon::operator!=(const AudienceInsightCategoryCommon& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const AudienceInsightCategoryCommon& o)
{
    j = nlohmann::json::object();
    if(o.keyIsSet())
        j["key"] = o.m_Key;
    if(o.nameIsSet())
        j["name"] = o.m_Name;
    if(o.ratioIsSet())
        j["ratio"] = o.m_Ratio;
    if(o.indexIsSet())
        j["index"] = o.m_Index;
    if(o.idIsSet())
        j["id"] = o.m_Id;
    
}

void from_json(const nlohmann::json& j, AudienceInsightCategoryCommon& o)
{
    if(j.find("key") != j.end())
    {
        j.at("key").get_to(o.m_Key);
        o.m_KeyIsSet = true;
    } 
    if(j.find("name") != j.end())
    {
        j.at("name").get_to(o.m_Name);
        o.m_NameIsSet = true;
    } 
    if(j.find("ratio") != j.end())
    {
        j.at("ratio").get_to(o.m_Ratio);
        o.m_RatioIsSet = true;
    } 
    if(j.find("index") != j.end())
    {
        j.at("index").get_to(o.m_Index);
        o.m_IndexIsSet = true;
    } 
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    
}

std::string AudienceInsightCategoryCommon::getKey() const
{
    return m_Key;
}
void AudienceInsightCategoryCommon::setKey(std::string const& value)
{
    m_Key = value;
    m_KeyIsSet = true;
}
bool AudienceInsightCategoryCommon::keyIsSet() const
{
    return m_KeyIsSet;
}
void AudienceInsightCategoryCommon::unsetKey()
{
    m_KeyIsSet = false;
}
std::string AudienceInsightCategoryCommon::getName() const
{
    return m_Name;
}
void AudienceInsightCategoryCommon::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool AudienceInsightCategoryCommon::nameIsSet() const
{
    return m_NameIsSet;
}
void AudienceInsightCategoryCommon::unsetName()
{
    m_NameIsSet = false;
}
double AudienceInsightCategoryCommon::getRatio() const
{
    return m_Ratio;
}
void AudienceInsightCategoryCommon::setRatio(double const value)
{
    m_Ratio = value;
    m_RatioIsSet = true;
}
bool AudienceInsightCategoryCommon::ratioIsSet() const
{
    return m_RatioIsSet;
}
void AudienceInsightCategoryCommon::unsetRatio()
{
    m_RatioIsSet = false;
}
double AudienceInsightCategoryCommon::getIndex() const
{
    return m_Index;
}
void AudienceInsightCategoryCommon::setIndex(double const value)
{
    m_Index = value;
    m_IndexIsSet = true;
}
bool AudienceInsightCategoryCommon::indexIsSet() const
{
    return m_IndexIsSet;
}
void AudienceInsightCategoryCommon::unsetIndex()
{
    m_IndexIsSet = false;
}
std::string AudienceInsightCategoryCommon::getId() const
{
    return m_Id;
}
void AudienceInsightCategoryCommon::setId(std::string const& value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool AudienceInsightCategoryCommon::idIsSet() const
{
    return m_IdIsSet;
}
void AudienceInsightCategoryCommon::unsetId()
{
    m_IdIsSet = false;
}


} // namespace org::openapitools::server::model

