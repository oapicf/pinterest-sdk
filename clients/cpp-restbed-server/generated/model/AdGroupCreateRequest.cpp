/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "AdGroupCreateRequest.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <algorithm>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

AdGroupCreateRequest::AdGroupCreateRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string AdGroupCreateRequest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void AdGroupCreateRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree AdGroupCreateRequest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("name", m_Name);
	pt.put("budget_in_micro_currency", m_Budget_in_micro_currency);
	pt.put("bid_in_micro_currency", m_Bid_in_micro_currency);
	pt.add_child("optimization_goal_metadata", m_Optimization_goal_metadata.toPropertyTree());
	pt.put("start_time", m_Start_time);
	pt.put("end_time", m_End_time);
	pt.add_child("targeting_spec", m_Targeting_spec.toPropertyTree());
	pt.put("lifetime_frequency_cap", m_Lifetime_frequency_cap);
	pt.add_child("tracking_urls", m_Tracking_urls.toPropertyTree());
	pt.put("auto_targeting_enabled", m_Auto_targeting_enabled);
	pt.put("campaign_id", m_Campaign_id);
	pt.put("bid_strategy_type", m_Bid_strategy_type);
	// generate tree for Targeting_template_ids
    tmp_node.clear();
	if (!m_Targeting_template_ids.empty()) {
        tmp_node = toPt(m_Targeting_template_ids);
		pt.add_child("targeting_template_ids", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void AdGroupCreateRequest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Name = pt.get("name", "");
	m_Budget_in_micro_currency = pt.get("budget_in_micro_currency", 0);
	m_Bid_in_micro_currency = pt.get("bid_in_micro_currency", 0);
	if (pt.get_child_optional("optimization_goal_metadata")) {
        m_Optimization_goal_metadata = fromPt<OptimizationGoalMetadata>(pt.get_child("optimization_goal_metadata"));
	}
	m_Start_time = pt.get("start_time", 0);
	m_End_time = pt.get("end_time", 0);
	if (pt.get_child_optional("targeting_spec")) {
        m_Targeting_spec = fromPt<TargetingSpec>(pt.get_child("targeting_spec"));
	}
	m_Lifetime_frequency_cap = pt.get("lifetime_frequency_cap", 0);
	if (pt.get_child_optional("tracking_urls")) {
        m_Tracking_urls = fromPt<TrackingUrls>(pt.get_child("tracking_urls"));
	}
	m_Auto_targeting_enabled = pt.get("auto_targeting_enabled", false);
	m_Campaign_id = pt.get("campaign_id", "");
	setBidStrategyType(pt.get("bid_strategy_type", ""));
	// push all items of Targeting_template_ids into member
	if (pt.get_child_optional("targeting_template_ids")) {
        m_Targeting_template_ids = fromPt<std::vector<std::string>>(pt.get_child("targeting_template_ids"));
	}
}

std::string AdGroupCreateRequest::getName() const
{
    return m_Name;
}

void AdGroupCreateRequest::setName(std::string value)
{
    m_Name = value;
}


EntityStatus AdGroupCreateRequest::getStatus() const
{
    return m_Status;
}

void AdGroupCreateRequest::setStatus(EntityStatus value)
{
    m_Status = value;
}


int32_t AdGroupCreateRequest::getBudgetInMicroCurrency() const
{
    return m_Budget_in_micro_currency;
}

void AdGroupCreateRequest::setBudgetInMicroCurrency(int32_t value)
{
    m_Budget_in_micro_currency = value;
}


int32_t AdGroupCreateRequest::getBidInMicroCurrency() const
{
    return m_Bid_in_micro_currency;
}

void AdGroupCreateRequest::setBidInMicroCurrency(int32_t value)
{
    m_Bid_in_micro_currency = value;
}


OptimizationGoalMetadata AdGroupCreateRequest::getOptimizationGoalMetadata() const
{
    return m_Optimization_goal_metadata;
}

void AdGroupCreateRequest::setOptimizationGoalMetadata(OptimizationGoalMetadata value)
{
    m_Optimization_goal_metadata = value;
}


BudgetType AdGroupCreateRequest::getBudgetType() const
{
    return m_Budget_type;
}

void AdGroupCreateRequest::setBudgetType(BudgetType value)
{
    m_Budget_type = value;
}


int32_t AdGroupCreateRequest::getStartTime() const
{
    return m_Start_time;
}

void AdGroupCreateRequest::setStartTime(int32_t value)
{
    m_Start_time = value;
}


int32_t AdGroupCreateRequest::getEndTime() const
{
    return m_End_time;
}

void AdGroupCreateRequest::setEndTime(int32_t value)
{
    m_End_time = value;
}


TargetingSpec AdGroupCreateRequest::getTargetingSpec() const
{
    return m_Targeting_spec;
}

void AdGroupCreateRequest::setTargetingSpec(TargetingSpec value)
{
    m_Targeting_spec = value;
}


int32_t AdGroupCreateRequest::getLifetimeFrequencyCap() const
{
    return m_Lifetime_frequency_cap;
}

void AdGroupCreateRequest::setLifetimeFrequencyCap(int32_t value)
{
    m_Lifetime_frequency_cap = value;
}


TrackingUrls AdGroupCreateRequest::getTrackingUrls() const
{
    return m_Tracking_urls;
}

void AdGroupCreateRequest::setTrackingUrls(TrackingUrls value)
{
    m_Tracking_urls = value;
}


bool AdGroupCreateRequest::isAutoTargetingEnabled() const
{
    return m_Auto_targeting_enabled;
}

void AdGroupCreateRequest::setAutoTargetingEnabled(bool value)
{
    m_Auto_targeting_enabled = value;
}


PlacementGroupType AdGroupCreateRequest::getPlacementGroup() const
{
    return m_Placement_group;
}

void AdGroupCreateRequest::setPlacementGroup(PlacementGroupType value)
{
    m_Placement_group = value;
}


PacingDeliveryType AdGroupCreateRequest::getPacingDeliveryType() const
{
    return m_Pacing_delivery_type;
}

void AdGroupCreateRequest::setPacingDeliveryType(PacingDeliveryType value)
{
    m_Pacing_delivery_type = value;
}


std::string AdGroupCreateRequest::getCampaignId() const
{
    return m_Campaign_id;
}

void AdGroupCreateRequest::setCampaignId(std::string value)
{
    m_Campaign_id = value;
}


ActionType AdGroupCreateRequest::getBillableEvent() const
{
    return m_Billable_event;
}

void AdGroupCreateRequest::setBillableEvent(ActionType value)
{
    m_Billable_event = value;
}


std::string AdGroupCreateRequest::getBidStrategyType() const
{
    return m_Bid_strategy_type;
}

void AdGroupCreateRequest::setBidStrategyType(std::string value)
{
    static const std::array<std::string, 3> allowedValues = {
        "AUTOMATIC_BID", "MAX_BID", "TARGET_AVG"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Bid_strategy_type = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


std::vector<std::string> AdGroupCreateRequest::getTargetingTemplateIds() const
{
    return m_Targeting_template_ids;
}

void AdGroupCreateRequest::setTargetingTemplateIds(std::vector<std::string> value)
{
    m_Targeting_template_ids = value;
}



std::vector<AdGroupCreateRequest> createAdGroupCreateRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<AdGroupCreateRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(AdGroupCreateRequest(child.second));
    }

    return vec;
}

}
}
}
}

