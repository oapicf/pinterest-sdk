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


#include "AdGroupCreateRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

AdGroupCreateRequest::AdGroupCreateRequest()
{
    m_Name = "";
    m_StatusIsSet = false;
    m_Budget_in_micro_currency = 0;
    m_Budget_in_micro_currencyIsSet = false;
    m_Bid_in_micro_currency = 0;
    m_Bid_in_micro_currencyIsSet = false;
    m_Optimization_goal_metadataIsSet = false;
    m_Budget_typeIsSet = false;
    m_Start_time = 0;
    m_Start_timeIsSet = false;
    m_End_time = 0;
    m_End_timeIsSet = false;
    m_Targeting_specIsSet = false;
    m_Lifetime_frequency_cap = 0;
    m_Lifetime_frequency_capIsSet = false;
    m_Tracking_urlsIsSet = false;
    m_Auto_targeting_enabled = false;
    m_Auto_targeting_enabledIsSet = false;
    m_Placement_groupIsSet = false;
    m_Pacing_delivery_typeIsSet = false;
    m_Campaign_id = "";
    m_Bid_strategy_type = "";
    m_Bid_strategy_typeIsSet = false;
    m_Targeting_template_idsIsSet = false;
    
}

void AdGroupCreateRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool AdGroupCreateRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool AdGroupCreateRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "AdGroupCreateRequest" : pathPrefix;

                                                                 
    
    /* Campaign_id */ {
        const std::string& value = m_Campaign_id;
        const std::string currentValuePath = _pathPrefix + ".campaignId";
                
        

    }
                 
    if (targetingTemplateIdsIsSet())
    {
        const std::vector<std::string>& value = m_Targeting_template_ids;
        const std::string currentValuePath = _pathPrefix + ".targetingTemplateIds";
                
        
        if (value.size() > 1)
        {
            success = false;
            msg << currentValuePath << ": must have at most 1 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
    
    return success;
}

bool AdGroupCreateRequest::operator==(const AdGroupCreateRequest& rhs) const
{
    return
    
    
    (getName() == rhs.getName())
     &&
    
    
    ((!statusIsSet() && !rhs.statusIsSet()) || (statusIsSet() && rhs.statusIsSet() && getStatus() == rhs.getStatus())) &&
    
    
    ((!budgetInMicroCurrencyIsSet() && !rhs.budgetInMicroCurrencyIsSet()) || (budgetInMicroCurrencyIsSet() && rhs.budgetInMicroCurrencyIsSet() && getBudgetInMicroCurrency() == rhs.getBudgetInMicroCurrency())) &&
    
    
    ((!bidInMicroCurrencyIsSet() && !rhs.bidInMicroCurrencyIsSet()) || (bidInMicroCurrencyIsSet() && rhs.bidInMicroCurrencyIsSet() && getBidInMicroCurrency() == rhs.getBidInMicroCurrency())) &&
    
    
    ((!optimizationGoalMetadataIsSet() && !rhs.optimizationGoalMetadataIsSet()) || (optimizationGoalMetadataIsSet() && rhs.optimizationGoalMetadataIsSet() && getOptimizationGoalMetadata() == rhs.getOptimizationGoalMetadata())) &&
    
    
    ((!budgetTypeIsSet() && !rhs.budgetTypeIsSet()) || (budgetTypeIsSet() && rhs.budgetTypeIsSet() && getBudgetType() == rhs.getBudgetType())) &&
    
    
    ((!startTimeIsSet() && !rhs.startTimeIsSet()) || (startTimeIsSet() && rhs.startTimeIsSet() && getStartTime() == rhs.getStartTime())) &&
    
    
    ((!endTimeIsSet() && !rhs.endTimeIsSet()) || (endTimeIsSet() && rhs.endTimeIsSet() && getEndTime() == rhs.getEndTime())) &&
    
    
    ((!targetingSpecIsSet() && !rhs.targetingSpecIsSet()) || (targetingSpecIsSet() && rhs.targetingSpecIsSet() && getTargetingSpec() == rhs.getTargetingSpec())) &&
    
    
    ((!lifetimeFrequencyCapIsSet() && !rhs.lifetimeFrequencyCapIsSet()) || (lifetimeFrequencyCapIsSet() && rhs.lifetimeFrequencyCapIsSet() && getLifetimeFrequencyCap() == rhs.getLifetimeFrequencyCap())) &&
    
    
    ((!trackingUrlsIsSet() && !rhs.trackingUrlsIsSet()) || (trackingUrlsIsSet() && rhs.trackingUrlsIsSet() && getTrackingUrls() == rhs.getTrackingUrls())) &&
    
    
    ((!autoTargetingEnabledIsSet() && !rhs.autoTargetingEnabledIsSet()) || (autoTargetingEnabledIsSet() && rhs.autoTargetingEnabledIsSet() && isAutoTargetingEnabled() == rhs.isAutoTargetingEnabled())) &&
    
    
    ((!placementGroupIsSet() && !rhs.placementGroupIsSet()) || (placementGroupIsSet() && rhs.placementGroupIsSet() && getPlacementGroup() == rhs.getPlacementGroup())) &&
    
    
    ((!pacingDeliveryTypeIsSet() && !rhs.pacingDeliveryTypeIsSet()) || (pacingDeliveryTypeIsSet() && rhs.pacingDeliveryTypeIsSet() && getPacingDeliveryType() == rhs.getPacingDeliveryType())) &&
    
    (getCampaignId() == rhs.getCampaignId())
     &&
    
    (getBillableEvent() == rhs.getBillableEvent())
     &&
    
    
    ((!bidStrategyTypeIsSet() && !rhs.bidStrategyTypeIsSet()) || (bidStrategyTypeIsSet() && rhs.bidStrategyTypeIsSet() && getBidStrategyType() == rhs.getBidStrategyType())) &&
    
    
    ((!targetingTemplateIdsIsSet() && !rhs.targetingTemplateIdsIsSet()) || (targetingTemplateIdsIsSet() && rhs.targetingTemplateIdsIsSet() && getTargetingTemplateIds() == rhs.getTargetingTemplateIds()))
    
    ;
}

bool AdGroupCreateRequest::operator!=(const AdGroupCreateRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const AdGroupCreateRequest& o)
{
    j = nlohmann::json::object();
    j["name"] = o.m_Name;
    if(o.statusIsSet())
        j["status"] = o.m_Status;
    if(o.budgetInMicroCurrencyIsSet())
        j["budget_in_micro_currency"] = o.m_Budget_in_micro_currency;
    if(o.bidInMicroCurrencyIsSet())
        j["bid_in_micro_currency"] = o.m_Bid_in_micro_currency;
    if(o.optimizationGoalMetadataIsSet())
        j["optimization_goal_metadata"] = o.m_Optimization_goal_metadata;
    if(o.budgetTypeIsSet())
        j["budget_type"] = o.m_Budget_type;
    if(o.startTimeIsSet())
        j["start_time"] = o.m_Start_time;
    if(o.endTimeIsSet())
        j["end_time"] = o.m_End_time;
    if(o.targetingSpecIsSet())
        j["targeting_spec"] = o.m_Targeting_spec;
    if(o.lifetimeFrequencyCapIsSet())
        j["lifetime_frequency_cap"] = o.m_Lifetime_frequency_cap;
    if(o.trackingUrlsIsSet())
        j["tracking_urls"] = o.m_Tracking_urls;
    if(o.autoTargetingEnabledIsSet())
        j["auto_targeting_enabled"] = o.m_Auto_targeting_enabled;
    if(o.placementGroupIsSet())
        j["placement_group"] = o.m_Placement_group;
    if(o.pacingDeliveryTypeIsSet())
        j["pacing_delivery_type"] = o.m_Pacing_delivery_type;
    j["campaign_id"] = o.m_Campaign_id;
    j["billable_event"] = o.m_Billable_event;
    if(o.bidStrategyTypeIsSet())
        j["bid_strategy_type"] = o.m_Bid_strategy_type;
    if(o.targetingTemplateIdsIsSet() || !o.m_Targeting_template_ids.empty())
        j["targeting_template_ids"] = o.m_Targeting_template_ids;
    
}

void from_json(const nlohmann::json& j, AdGroupCreateRequest& o)
{
    j.at("name").get_to(o.m_Name);
    if(j.find("status") != j.end())
    {
        j.at("status").get_to(o.m_Status);
        o.m_StatusIsSet = true;
    } 
    if(j.find("budget_in_micro_currency") != j.end())
    {
        j.at("budget_in_micro_currency").get_to(o.m_Budget_in_micro_currency);
        o.m_Budget_in_micro_currencyIsSet = true;
    } 
    if(j.find("bid_in_micro_currency") != j.end())
    {
        j.at("bid_in_micro_currency").get_to(o.m_Bid_in_micro_currency);
        o.m_Bid_in_micro_currencyIsSet = true;
    } 
    if(j.find("optimization_goal_metadata") != j.end())
    {
        j.at("optimization_goal_metadata").get_to(o.m_Optimization_goal_metadata);
        o.m_Optimization_goal_metadataIsSet = true;
    } 
    if(j.find("budget_type") != j.end())
    {
        j.at("budget_type").get_to(o.m_Budget_type);
        o.m_Budget_typeIsSet = true;
    } 
    if(j.find("start_time") != j.end())
    {
        j.at("start_time").get_to(o.m_Start_time);
        o.m_Start_timeIsSet = true;
    } 
    if(j.find("end_time") != j.end())
    {
        j.at("end_time").get_to(o.m_End_time);
        o.m_End_timeIsSet = true;
    } 
    if(j.find("targeting_spec") != j.end())
    {
        j.at("targeting_spec").get_to(o.m_Targeting_spec);
        o.m_Targeting_specIsSet = true;
    } 
    if(j.find("lifetime_frequency_cap") != j.end())
    {
        j.at("lifetime_frequency_cap").get_to(o.m_Lifetime_frequency_cap);
        o.m_Lifetime_frequency_capIsSet = true;
    } 
    if(j.find("tracking_urls") != j.end())
    {
        j.at("tracking_urls").get_to(o.m_Tracking_urls);
        o.m_Tracking_urlsIsSet = true;
    } 
    if(j.find("auto_targeting_enabled") != j.end())
    {
        j.at("auto_targeting_enabled").get_to(o.m_Auto_targeting_enabled);
        o.m_Auto_targeting_enabledIsSet = true;
    } 
    if(j.find("placement_group") != j.end())
    {
        j.at("placement_group").get_to(o.m_Placement_group);
        o.m_Placement_groupIsSet = true;
    } 
    if(j.find("pacing_delivery_type") != j.end())
    {
        j.at("pacing_delivery_type").get_to(o.m_Pacing_delivery_type);
        o.m_Pacing_delivery_typeIsSet = true;
    } 
    j.at("campaign_id").get_to(o.m_Campaign_id);
    j.at("billable_event").get_to(o.m_Billable_event);
    if(j.find("bid_strategy_type") != j.end())
    {
        j.at("bid_strategy_type").get_to(o.m_Bid_strategy_type);
        o.m_Bid_strategy_typeIsSet = true;
    } 
    if(j.find("targeting_template_ids") != j.end())
    {
        j.at("targeting_template_ids").get_to(o.m_Targeting_template_ids);
        o.m_Targeting_template_idsIsSet = true;
    } 
    
}

std::string AdGroupCreateRequest::getName() const
{
    return m_Name;
}
void AdGroupCreateRequest::setName(std::string const& value)
{
    m_Name = value;
}
org::openapitools::server::model::EntityStatus AdGroupCreateRequest::getStatus() const
{
    return m_Status;
}
void AdGroupCreateRequest::setStatus(org::openapitools::server::model::EntityStatus const& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}
bool AdGroupCreateRequest::statusIsSet() const
{
    return m_StatusIsSet;
}
void AdGroupCreateRequest::unsetStatus()
{
    m_StatusIsSet = false;
}
int32_t AdGroupCreateRequest::getBudgetInMicroCurrency() const
{
    return m_Budget_in_micro_currency;
}
void AdGroupCreateRequest::setBudgetInMicroCurrency(int32_t const value)
{
    m_Budget_in_micro_currency = value;
    m_Budget_in_micro_currencyIsSet = true;
}
bool AdGroupCreateRequest::budgetInMicroCurrencyIsSet() const
{
    return m_Budget_in_micro_currencyIsSet;
}
void AdGroupCreateRequest::unsetBudget_in_micro_currency()
{
    m_Budget_in_micro_currencyIsSet = false;
}
int32_t AdGroupCreateRequest::getBidInMicroCurrency() const
{
    return m_Bid_in_micro_currency;
}
void AdGroupCreateRequest::setBidInMicroCurrency(int32_t const value)
{
    m_Bid_in_micro_currency = value;
    m_Bid_in_micro_currencyIsSet = true;
}
bool AdGroupCreateRequest::bidInMicroCurrencyIsSet() const
{
    return m_Bid_in_micro_currencyIsSet;
}
void AdGroupCreateRequest::unsetBid_in_micro_currency()
{
    m_Bid_in_micro_currencyIsSet = false;
}
org::openapitools::server::model::OptimizationGoalMetadata AdGroupCreateRequest::getOptimizationGoalMetadata() const
{
    return m_Optimization_goal_metadata;
}
void AdGroupCreateRequest::setOptimizationGoalMetadata(org::openapitools::server::model::OptimizationGoalMetadata const& value)
{
    m_Optimization_goal_metadata = value;
    m_Optimization_goal_metadataIsSet = true;
}
bool AdGroupCreateRequest::optimizationGoalMetadataIsSet() const
{
    return m_Optimization_goal_metadataIsSet;
}
void AdGroupCreateRequest::unsetOptimization_goal_metadata()
{
    m_Optimization_goal_metadataIsSet = false;
}
org::openapitools::server::model::BudgetType AdGroupCreateRequest::getBudgetType() const
{
    return m_Budget_type;
}
void AdGroupCreateRequest::setBudgetType(org::openapitools::server::model::BudgetType const& value)
{
    m_Budget_type = value;
    m_Budget_typeIsSet = true;
}
bool AdGroupCreateRequest::budgetTypeIsSet() const
{
    return m_Budget_typeIsSet;
}
void AdGroupCreateRequest::unsetBudget_type()
{
    m_Budget_typeIsSet = false;
}
int32_t AdGroupCreateRequest::getStartTime() const
{
    return m_Start_time;
}
void AdGroupCreateRequest::setStartTime(int32_t const value)
{
    m_Start_time = value;
    m_Start_timeIsSet = true;
}
bool AdGroupCreateRequest::startTimeIsSet() const
{
    return m_Start_timeIsSet;
}
void AdGroupCreateRequest::unsetStart_time()
{
    m_Start_timeIsSet = false;
}
int32_t AdGroupCreateRequest::getEndTime() const
{
    return m_End_time;
}
void AdGroupCreateRequest::setEndTime(int32_t const value)
{
    m_End_time = value;
    m_End_timeIsSet = true;
}
bool AdGroupCreateRequest::endTimeIsSet() const
{
    return m_End_timeIsSet;
}
void AdGroupCreateRequest::unsetEnd_time()
{
    m_End_timeIsSet = false;
}
org::openapitools::server::model::TargetingSpec AdGroupCreateRequest::getTargetingSpec() const
{
    return m_Targeting_spec;
}
void AdGroupCreateRequest::setTargetingSpec(org::openapitools::server::model::TargetingSpec const& value)
{
    m_Targeting_spec = value;
    m_Targeting_specIsSet = true;
}
bool AdGroupCreateRequest::targetingSpecIsSet() const
{
    return m_Targeting_specIsSet;
}
void AdGroupCreateRequest::unsetTargeting_spec()
{
    m_Targeting_specIsSet = false;
}
int32_t AdGroupCreateRequest::getLifetimeFrequencyCap() const
{
    return m_Lifetime_frequency_cap;
}
void AdGroupCreateRequest::setLifetimeFrequencyCap(int32_t const value)
{
    m_Lifetime_frequency_cap = value;
    m_Lifetime_frequency_capIsSet = true;
}
bool AdGroupCreateRequest::lifetimeFrequencyCapIsSet() const
{
    return m_Lifetime_frequency_capIsSet;
}
void AdGroupCreateRequest::unsetLifetime_frequency_cap()
{
    m_Lifetime_frequency_capIsSet = false;
}
org::openapitools::server::model::TrackingUrls AdGroupCreateRequest::getTrackingUrls() const
{
    return m_Tracking_urls;
}
void AdGroupCreateRequest::setTrackingUrls(org::openapitools::server::model::TrackingUrls const& value)
{
    m_Tracking_urls = value;
    m_Tracking_urlsIsSet = true;
}
bool AdGroupCreateRequest::trackingUrlsIsSet() const
{
    return m_Tracking_urlsIsSet;
}
void AdGroupCreateRequest::unsetTracking_urls()
{
    m_Tracking_urlsIsSet = false;
}
bool AdGroupCreateRequest::isAutoTargetingEnabled() const
{
    return m_Auto_targeting_enabled;
}
void AdGroupCreateRequest::setAutoTargetingEnabled(bool const value)
{
    m_Auto_targeting_enabled = value;
    m_Auto_targeting_enabledIsSet = true;
}
bool AdGroupCreateRequest::autoTargetingEnabledIsSet() const
{
    return m_Auto_targeting_enabledIsSet;
}
void AdGroupCreateRequest::unsetAuto_targeting_enabled()
{
    m_Auto_targeting_enabledIsSet = false;
}
org::openapitools::server::model::PlacementGroupType AdGroupCreateRequest::getPlacementGroup() const
{
    return m_Placement_group;
}
void AdGroupCreateRequest::setPlacementGroup(org::openapitools::server::model::PlacementGroupType const& value)
{
    m_Placement_group = value;
    m_Placement_groupIsSet = true;
}
bool AdGroupCreateRequest::placementGroupIsSet() const
{
    return m_Placement_groupIsSet;
}
void AdGroupCreateRequest::unsetPlacement_group()
{
    m_Placement_groupIsSet = false;
}
org::openapitools::server::model::PacingDeliveryType AdGroupCreateRequest::getPacingDeliveryType() const
{
    return m_Pacing_delivery_type;
}
void AdGroupCreateRequest::setPacingDeliveryType(org::openapitools::server::model::PacingDeliveryType const& value)
{
    m_Pacing_delivery_type = value;
    m_Pacing_delivery_typeIsSet = true;
}
bool AdGroupCreateRequest::pacingDeliveryTypeIsSet() const
{
    return m_Pacing_delivery_typeIsSet;
}
void AdGroupCreateRequest::unsetPacing_delivery_type()
{
    m_Pacing_delivery_typeIsSet = false;
}
std::string AdGroupCreateRequest::getCampaignId() const
{
    return m_Campaign_id;
}
void AdGroupCreateRequest::setCampaignId(std::string const& value)
{
    m_Campaign_id = value;
}
org::openapitools::server::model::ActionType AdGroupCreateRequest::getBillableEvent() const
{
    return m_Billable_event;
}
void AdGroupCreateRequest::setBillableEvent(org::openapitools::server::model::ActionType const& value)
{
    m_Billable_event = value;
}
std::string AdGroupCreateRequest::getBidStrategyType() const
{
    return m_Bid_strategy_type;
}
void AdGroupCreateRequest::setBidStrategyType(std::string const& value)
{
    m_Bid_strategy_type = value;
    m_Bid_strategy_typeIsSet = true;
}
bool AdGroupCreateRequest::bidStrategyTypeIsSet() const
{
    return m_Bid_strategy_typeIsSet;
}
void AdGroupCreateRequest::unsetBid_strategy_type()
{
    m_Bid_strategy_typeIsSet = false;
}
std::vector<std::string> AdGroupCreateRequest::getTargetingTemplateIds() const
{
    return m_Targeting_template_ids;
}
void AdGroupCreateRequest::setTargetingTemplateIds(std::vector<std::string> const& value)
{
    m_Targeting_template_ids = value;
    m_Targeting_template_idsIsSet = true;
}
bool AdGroupCreateRequest::targetingTemplateIdsIsSet() const
{
    return m_Targeting_template_idsIsSet;
}
void AdGroupCreateRequest::unsetTargeting_template_ids()
{
    m_Targeting_template_idsIsSet = false;
}


} // namespace org::openapitools::server::model

