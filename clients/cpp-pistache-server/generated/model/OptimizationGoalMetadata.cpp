/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "OptimizationGoalMetadata.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

OptimizationGoalMetadata::OptimizationGoalMetadata()
{
    m_Conversion_tag_v3_goal_metadataIsSet = false;
    m_Frequency_goal_metadataIsSet = false;
    m_Scrollup_goal_metadataIsSet = false;
    
}

void OptimizationGoalMetadata::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OptimizationGoalMetadata::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OptimizationGoalMetadata::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OptimizationGoalMetadata" : pathPrefix;

                
    return success;
}

bool OptimizationGoalMetadata::operator==(const OptimizationGoalMetadata& rhs) const
{
    return
    
    
    
    ((!conversionTagV3GoalMetadataIsSet() && !rhs.conversionTagV3GoalMetadataIsSet()) || (conversionTagV3GoalMetadataIsSet() && rhs.conversionTagV3GoalMetadataIsSet() && getConversionTagV3GoalMetadata() == rhs.getConversionTagV3GoalMetadata())) &&
    
    
    ((!frequencyGoalMetadataIsSet() && !rhs.frequencyGoalMetadataIsSet()) || (frequencyGoalMetadataIsSet() && rhs.frequencyGoalMetadataIsSet() && getFrequencyGoalMetadata() == rhs.getFrequencyGoalMetadata())) &&
    
    
    ((!scrollupGoalMetadataIsSet() && !rhs.scrollupGoalMetadataIsSet()) || (scrollupGoalMetadataIsSet() && rhs.scrollupGoalMetadataIsSet() && getScrollupGoalMetadata() == rhs.getScrollupGoalMetadata()))
    
    ;
}

bool OptimizationGoalMetadata::operator!=(const OptimizationGoalMetadata& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OptimizationGoalMetadata& o)
{
    j = nlohmann::json::object();
    if(o.conversionTagV3GoalMetadataIsSet())
        j["conversion_tag_v3_goal_metadata"] = o.m_Conversion_tag_v3_goal_metadata;
    if(o.frequencyGoalMetadataIsSet())
        j["frequency_goal_metadata"] = o.m_Frequency_goal_metadata;
    if(o.scrollupGoalMetadataIsSet())
        j["scrollup_goal_metadata"] = o.m_Scrollup_goal_metadata;
    
}

void from_json(const nlohmann::json& j, OptimizationGoalMetadata& o)
{
    if(j.find("conversion_tag_v3_goal_metadata") != j.end())
    {
        j.at("conversion_tag_v3_goal_metadata").get_to(o.m_Conversion_tag_v3_goal_metadata);
        o.m_Conversion_tag_v3_goal_metadataIsSet = true;
    } 
    if(j.find("frequency_goal_metadata") != j.end())
    {
        j.at("frequency_goal_metadata").get_to(o.m_Frequency_goal_metadata);
        o.m_Frequency_goal_metadataIsSet = true;
    } 
    if(j.find("scrollup_goal_metadata") != j.end())
    {
        j.at("scrollup_goal_metadata").get_to(o.m_Scrollup_goal_metadata);
        o.m_Scrollup_goal_metadataIsSet = true;
    } 
    
}

org::openapitools::server::model::OptimizationGoalMetadata_conversion_tag_v3_goal_metadata OptimizationGoalMetadata::getConversionTagV3GoalMetadata() const
{
    return m_Conversion_tag_v3_goal_metadata;
}
void OptimizationGoalMetadata::setConversionTagV3GoalMetadata(org::openapitools::server::model::OptimizationGoalMetadata_conversion_tag_v3_goal_metadata const& value)
{
    m_Conversion_tag_v3_goal_metadata = value;
    m_Conversion_tag_v3_goal_metadataIsSet = true;
}
bool OptimizationGoalMetadata::conversionTagV3GoalMetadataIsSet() const
{
    return m_Conversion_tag_v3_goal_metadataIsSet;
}
void OptimizationGoalMetadata::unsetConversion_tag_v3_goal_metadata()
{
    m_Conversion_tag_v3_goal_metadataIsSet = false;
}
org::openapitools::server::model::OptimizationGoalMetadata_frequency_goal_metadata OptimizationGoalMetadata::getFrequencyGoalMetadata() const
{
    return m_Frequency_goal_metadata;
}
void OptimizationGoalMetadata::setFrequencyGoalMetadata(org::openapitools::server::model::OptimizationGoalMetadata_frequency_goal_metadata const& value)
{
    m_Frequency_goal_metadata = value;
    m_Frequency_goal_metadataIsSet = true;
}
bool OptimizationGoalMetadata::frequencyGoalMetadataIsSet() const
{
    return m_Frequency_goal_metadataIsSet;
}
void OptimizationGoalMetadata::unsetFrequency_goal_metadata()
{
    m_Frequency_goal_metadataIsSet = false;
}
org::openapitools::server::model::OptimizationGoalMetadata_scrollup_goal_metadata OptimizationGoalMetadata::getScrollupGoalMetadata() const
{
    return m_Scrollup_goal_metadata;
}
void OptimizationGoalMetadata::setScrollupGoalMetadata(org::openapitools::server::model::OptimizationGoalMetadata_scrollup_goal_metadata const& value)
{
    m_Scrollup_goal_metadata = value;
    m_Scrollup_goal_metadataIsSet = true;
}
bool OptimizationGoalMetadata::scrollupGoalMetadataIsSet() const
{
    return m_Scrollup_goal_metadataIsSet;
}
void OptimizationGoalMetadata::unsetScrollup_goal_metadata()
{
    m_Scrollup_goal_metadataIsSet = false;
}


} // namespace org::openapitools::server::model
