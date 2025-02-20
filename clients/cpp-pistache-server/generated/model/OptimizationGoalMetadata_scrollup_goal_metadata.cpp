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


#include "OptimizationGoalMetadata_scrollup_goal_metadata.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

OptimizationGoalMetadata_scrollup_goal_metadata::OptimizationGoalMetadata_scrollup_goal_metadata()
{
    m_Scrollup_goal_value_in_micro_currency = "";
    m_Scrollup_goal_value_in_micro_currencyIsSet = false;
    
}

void OptimizationGoalMetadata_scrollup_goal_metadata::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OptimizationGoalMetadata_scrollup_goal_metadata::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OptimizationGoalMetadata_scrollup_goal_metadata::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OptimizationGoalMetadata_scrollup_goal_metadata" : pathPrefix;

         
    if (scrollupGoalValueInMicroCurrencyIsSet())
    {
        const std::string& value = m_Scrollup_goal_value_in_micro_currency;
        const std::string currentValuePath = _pathPrefix + ".scrollupGoalValueInMicroCurrency";
                
        

    }
    
    return success;
}

bool OptimizationGoalMetadata_scrollup_goal_metadata::operator==(const OptimizationGoalMetadata_scrollup_goal_metadata& rhs) const
{
    return
    
    
    
    ((!scrollupGoalValueInMicroCurrencyIsSet() && !rhs.scrollupGoalValueInMicroCurrencyIsSet()) || (scrollupGoalValueInMicroCurrencyIsSet() && rhs.scrollupGoalValueInMicroCurrencyIsSet() && getScrollupGoalValueInMicroCurrency() == rhs.getScrollupGoalValueInMicroCurrency()))
    
    ;
}

bool OptimizationGoalMetadata_scrollup_goal_metadata::operator!=(const OptimizationGoalMetadata_scrollup_goal_metadata& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OptimizationGoalMetadata_scrollup_goal_metadata& o)
{
    j = nlohmann::json::object();
    if(o.scrollupGoalValueInMicroCurrencyIsSet())
        j["scrollup_goal_value_in_micro_currency"] = o.m_Scrollup_goal_value_in_micro_currency;
    
}

void from_json(const nlohmann::json& j, OptimizationGoalMetadata_scrollup_goal_metadata& o)
{
    if(j.find("scrollup_goal_value_in_micro_currency") != j.end())
    {
        j.at("scrollup_goal_value_in_micro_currency").get_to(o.m_Scrollup_goal_value_in_micro_currency);
        o.m_Scrollup_goal_value_in_micro_currencyIsSet = true;
    } 
    
}

std::string OptimizationGoalMetadata_scrollup_goal_metadata::getScrollupGoalValueInMicroCurrency() const
{
    return m_Scrollup_goal_value_in_micro_currency;
}
void OptimizationGoalMetadata_scrollup_goal_metadata::setScrollupGoalValueInMicroCurrency(std::string const& value)
{
    m_Scrollup_goal_value_in_micro_currency = value;
    m_Scrollup_goal_value_in_micro_currencyIsSet = true;
}
bool OptimizationGoalMetadata_scrollup_goal_metadata::scrollupGoalValueInMicroCurrencyIsSet() const
{
    return m_Scrollup_goal_value_in_micro_currencyIsSet;
}
void OptimizationGoalMetadata_scrollup_goal_metadata::unsetScrollup_goal_value_in_micro_currency()
{
    m_Scrollup_goal_value_in_micro_currencyIsSet = false;
}


} // namespace org::openapitools::server::model

