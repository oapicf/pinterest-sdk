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


#include "OptimizationGoalMetadata_frequency_goal_metadata.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

OptimizationGoalMetadata_frequency_goal_metadata::OptimizationGoalMetadata_frequency_goal_metadata()
{
    m_Frequency = 0;
    m_FrequencyIsSet = false;
    m_Timerange = "";
    m_TimerangeIsSet = false;
    
}

void OptimizationGoalMetadata_frequency_goal_metadata::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OptimizationGoalMetadata_frequency_goal_metadata::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OptimizationGoalMetadata_frequency_goal_metadata::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OptimizationGoalMetadata_frequency_goal_metadata" : pathPrefix;

            
    return success;
}

bool OptimizationGoalMetadata_frequency_goal_metadata::operator==(const OptimizationGoalMetadata_frequency_goal_metadata& rhs) const
{
    return
    
    
    
    ((!frequencyIsSet() && !rhs.frequencyIsSet()) || (frequencyIsSet() && rhs.frequencyIsSet() && getFrequency() == rhs.getFrequency())) &&
    
    
    ((!timerangeIsSet() && !rhs.timerangeIsSet()) || (timerangeIsSet() && rhs.timerangeIsSet() && getTimerange() == rhs.getTimerange()))
    
    ;
}

bool OptimizationGoalMetadata_frequency_goal_metadata::operator!=(const OptimizationGoalMetadata_frequency_goal_metadata& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OptimizationGoalMetadata_frequency_goal_metadata& o)
{
    j = nlohmann::json::object();
    if(o.frequencyIsSet())
        j["frequency"] = o.m_Frequency;
    if(o.timerangeIsSet())
        j["timerange"] = o.m_Timerange;
    
}

void from_json(const nlohmann::json& j, OptimizationGoalMetadata_frequency_goal_metadata& o)
{
    if(j.find("frequency") != j.end())
    {
        j.at("frequency").get_to(o.m_Frequency);
        o.m_FrequencyIsSet = true;
    } 
    if(j.find("timerange") != j.end())
    {
        j.at("timerange").get_to(o.m_Timerange);
        o.m_TimerangeIsSet = true;
    } 
    
}

int32_t OptimizationGoalMetadata_frequency_goal_metadata::getFrequency() const
{
    return m_Frequency;
}
void OptimizationGoalMetadata_frequency_goal_metadata::setFrequency(int32_t const value)
{
    m_Frequency = value;
    m_FrequencyIsSet = true;
}
bool OptimizationGoalMetadata_frequency_goal_metadata::frequencyIsSet() const
{
    return m_FrequencyIsSet;
}
void OptimizationGoalMetadata_frequency_goal_metadata::unsetFrequency()
{
    m_FrequencyIsSet = false;
}
std::string OptimizationGoalMetadata_frequency_goal_metadata::getTimerange() const
{
    return m_Timerange;
}
void OptimizationGoalMetadata_frequency_goal_metadata::setTimerange(std::string const& value)
{
    m_Timerange = value;
    m_TimerangeIsSet = true;
}
bool OptimizationGoalMetadata_frequency_goal_metadata::timerangeIsSet() const
{
    return m_TimerangeIsSet;
}
void OptimizationGoalMetadata_frequency_goal_metadata::unsetTimerange()
{
    m_TimerangeIsSet = false;
}


} // namespace org::openapitools::server::model
