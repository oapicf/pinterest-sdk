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



#include "AdGroupResponse.h"

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

AdGroupResponse::AdGroupResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string AdGroupResponse::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void AdGroupResponse::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree AdGroupResponse::toPropertyTree() const
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
	pt.put("id", m_Id);
	pt.put("ad_account_id", m_Ad_account_id);
	pt.put("created_time", m_Created_time);
	pt.put("updated_time", m_Updated_time);
	pt.put("type", m_Type);
	pt.put("conversion_learning_mode_type", m_Conversion_learning_mode_type);
	pt.put("feed_profile_id", m_Feed_profile_id);
	return pt;
}

void AdGroupResponse::fromPropertyTree(ptree const &pt)
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
	m_Id = pt.get("id", "");
	m_Ad_account_id = pt.get("ad_account_id", "");
	m_Created_time = pt.get("created_time", 0);
	m_Updated_time = pt.get("updated_time", 0);
	m_Type = pt.get("type", "adgroup");
	setConversionLearningModeType(pt.get("conversion_learning_mode_type", ""));
	m_Feed_profile_id = pt.get("feed_profile_id", "");
}

std::string AdGroupResponse::getName() const
{
    return m_Name;
}

void AdGroupResponse::setName(std::string value)
{
    m_Name = value;
}


EntityStatus AdGroupResponse::getStatus() const
{
    return m_Status;
}

void AdGroupResponse::setStatus(EntityStatus value)
{
    m_Status = value;
}


int32_t AdGroupResponse::getBudgetInMicroCurrency() const
{
    return m_Budget_in_micro_currency;
}

void AdGroupResponse::setBudgetInMicroCurrency(int32_t value)
{
    m_Budget_in_micro_currency = value;
}


int32_t AdGroupResponse::getBidInMicroCurrency() const
{
    return m_Bid_in_micro_currency;
}

void AdGroupResponse::setBidInMicroCurrency(int32_t value)
{
    m_Bid_in_micro_currency = value;
}


OptimizationGoalMetadata AdGroupResponse::getOptimizationGoalMetadata() const
{
    return m_Optimization_goal_metadata;
}

void AdGroupResponse::setOptimizationGoalMetadata(OptimizationGoalMetadata value)
{
    m_Optimization_goal_metadata = value;
}


BudgetType AdGroupResponse::getBudgetType() const
{
    return m_Budget_type;
}

void AdGroupResponse::setBudgetType(BudgetType value)
{
    m_Budget_type = value;
}


int32_t AdGroupResponse::getStartTime() const
{
    return m_Start_time;
}

void AdGroupResponse::setStartTime(int32_t value)
{
    m_Start_time = value;
}


int32_t AdGroupResponse::getEndTime() const
{
    return m_End_time;
}

void AdGroupResponse::setEndTime(int32_t value)
{
    m_End_time = value;
}


TargetingSpec AdGroupResponse::getTargetingSpec() const
{
    return m_Targeting_spec;
}

void AdGroupResponse::setTargetingSpec(TargetingSpec value)
{
    m_Targeting_spec = value;
}


int32_t AdGroupResponse::getLifetimeFrequencyCap() const
{
    return m_Lifetime_frequency_cap;
}

void AdGroupResponse::setLifetimeFrequencyCap(int32_t value)
{
    m_Lifetime_frequency_cap = value;
}


TrackingUrls AdGroupResponse::getTrackingUrls() const
{
    return m_Tracking_urls;
}

void AdGroupResponse::setTrackingUrls(TrackingUrls value)
{
    m_Tracking_urls = value;
}


bool AdGroupResponse::isAutoTargetingEnabled() const
{
    return m_Auto_targeting_enabled;
}

void AdGroupResponse::setAutoTargetingEnabled(bool value)
{
    m_Auto_targeting_enabled = value;
}


PlacementGroupType AdGroupResponse::getPlacementGroup() const
{
    return m_Placement_group;
}

void AdGroupResponse::setPlacementGroup(PlacementGroupType value)
{
    m_Placement_group = value;
}


PacingDeliveryType AdGroupResponse::getPacingDeliveryType() const
{
    return m_Pacing_delivery_type;
}

void AdGroupResponse::setPacingDeliveryType(PacingDeliveryType value)
{
    m_Pacing_delivery_type = value;
}


std::string AdGroupResponse::getCampaignId() const
{
    return m_Campaign_id;
}

void AdGroupResponse::setCampaignId(std::string value)
{
    m_Campaign_id = value;
}


ActionType AdGroupResponse::getBillableEvent() const
{
    return m_Billable_event;
}

void AdGroupResponse::setBillableEvent(ActionType value)
{
    m_Billable_event = value;
}


std::string AdGroupResponse::getBidStrategyType() const
{
    return m_Bid_strategy_type;
}

void AdGroupResponse::setBidStrategyType(std::string value)
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


std::vector<std::string> AdGroupResponse::getTargetingTemplateIds() const
{
    return m_Targeting_template_ids;
}

void AdGroupResponse::setTargetingTemplateIds(std::vector<std::string> value)
{
    m_Targeting_template_ids = value;
}


std::string AdGroupResponse::getId() const
{
    return m_Id;
}

void AdGroupResponse::setId(std::string value)
{
    m_Id = value;
}


std::string AdGroupResponse::getAdAccountId() const
{
    return m_Ad_account_id;
}

void AdGroupResponse::setAdAccountId(std::string value)
{
    m_Ad_account_id = value;
}


int32_t AdGroupResponse::getCreatedTime() const
{
    return m_Created_time;
}

void AdGroupResponse::setCreatedTime(int32_t value)
{
    m_Created_time = value;
}


int32_t AdGroupResponse::getUpdatedTime() const
{
    return m_Updated_time;
}

void AdGroupResponse::setUpdatedTime(int32_t value)
{
    m_Updated_time = value;
}


std::string AdGroupResponse::getType() const
{
    return m_Type;
}

void AdGroupResponse::setType(std::string value)
{
    m_Type = value;
}


std::string AdGroupResponse::getConversionLearningModeType() const
{
    return m_Conversion_learning_mode_type;
}

void AdGroupResponse::setConversionLearningModeType(std::string value)
{
    static const std::array<std::string, 2> allowedValues = {
        "NOT_ACTIVE", "ACTIVE"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Conversion_learning_mode_type = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


AdGroupSummaryStatus AdGroupResponse::getSummaryStatus() const
{
    return m_Summary_status;
}

void AdGroupResponse::setSummaryStatus(AdGroupSummaryStatus value)
{
    m_Summary_status = value;
}


std::string AdGroupResponse::getFeedProfileId() const
{
    return m_Feed_profile_id;
}

void AdGroupResponse::setFeedProfileId(std::string value)
{
    m_Feed_profile_id = value;
}


AnyType AdGroupResponse::getDcaAssets() const
{
    return m_Dca_assets;
}

void AdGroupResponse::setDcaAssets(AnyType value)
{
    m_Dca_assets = value;
}



std::vector<AdGroupResponse> createAdGroupResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<AdGroupResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(AdGroupResponse(child.second));
    }

    return vec;
}

}
}
}
}

