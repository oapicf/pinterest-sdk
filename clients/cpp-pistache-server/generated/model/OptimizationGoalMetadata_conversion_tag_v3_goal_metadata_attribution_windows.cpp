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


#include "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows()
{
    m_Click_window_days = 0;
    m_Click_window_daysIsSet = false;
    m_Engagement_window_days = 0;
    m_Engagement_window_daysIsSet = false;
    m_View_window_days = 0;
    m_View_window_daysIsSet = false;
    
}

void OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows" : pathPrefix;

                
    return success;
}

bool OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::operator==(const OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows& rhs) const
{
    return
    
    
    
    ((!clickWindowDaysIsSet() && !rhs.clickWindowDaysIsSet()) || (clickWindowDaysIsSet() && rhs.clickWindowDaysIsSet() && getClickWindowDays() == rhs.getClickWindowDays())) &&
    
    
    ((!engagementWindowDaysIsSet() && !rhs.engagementWindowDaysIsSet()) || (engagementWindowDaysIsSet() && rhs.engagementWindowDaysIsSet() && getEngagementWindowDays() == rhs.getEngagementWindowDays())) &&
    
    
    ((!viewWindowDaysIsSet() && !rhs.viewWindowDaysIsSet()) || (viewWindowDaysIsSet() && rhs.viewWindowDaysIsSet() && getViewWindowDays() == rhs.getViewWindowDays()))
    
    ;
}

bool OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::operator!=(const OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows& o)
{
    j = nlohmann::json::object();
    if(o.clickWindowDaysIsSet())
        j["click_window_days"] = o.m_Click_window_days;
    if(o.engagementWindowDaysIsSet())
        j["engagement_window_days"] = o.m_Engagement_window_days;
    if(o.viewWindowDaysIsSet())
        j["view_window_days"] = o.m_View_window_days;
    
}

void from_json(const nlohmann::json& j, OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows& o)
{
    if(j.find("click_window_days") != j.end())
    {
        j.at("click_window_days").get_to(o.m_Click_window_days);
        o.m_Click_window_daysIsSet = true;
    } 
    if(j.find("engagement_window_days") != j.end())
    {
        j.at("engagement_window_days").get_to(o.m_Engagement_window_days);
        o.m_Engagement_window_daysIsSet = true;
    } 
    if(j.find("view_window_days") != j.end())
    {
        j.at("view_window_days").get_to(o.m_View_window_days);
        o.m_View_window_daysIsSet = true;
    } 
    
}

int32_t OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::getClickWindowDays() const
{
    return m_Click_window_days;
}
void OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::setClickWindowDays(int32_t const value)
{
    m_Click_window_days = value;
    m_Click_window_daysIsSet = true;
}
bool OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::clickWindowDaysIsSet() const
{
    return m_Click_window_daysIsSet;
}
void OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::unsetClick_window_days()
{
    m_Click_window_daysIsSet = false;
}
int32_t OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::getEngagementWindowDays() const
{
    return m_Engagement_window_days;
}
void OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::setEngagementWindowDays(int32_t const value)
{
    m_Engagement_window_days = value;
    m_Engagement_window_daysIsSet = true;
}
bool OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::engagementWindowDaysIsSet() const
{
    return m_Engagement_window_daysIsSet;
}
void OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::unsetEngagement_window_days()
{
    m_Engagement_window_daysIsSet = false;
}
int32_t OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::getViewWindowDays() const
{
    return m_View_window_days;
}
void OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::setViewWindowDays(int32_t const value)
{
    m_View_window_days = value;
    m_View_window_daysIsSet = true;
}
bool OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::viewWindowDaysIsSet() const
{
    return m_View_window_daysIsSet;
}
void OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::unsetView_window_days()
{
    m_View_window_daysIsSet = false;
}


} // namespace org::openapitools::server::model
