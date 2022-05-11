/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "AdGroupResponse_allOf.h"

#include <string>
#include <vector>
#include <sstream>
#include <stdexcept>
#include <algorithm>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

AdGroupResponse_allOf::AdGroupResponse_allOf(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string AdGroupResponse_allOf::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void AdGroupResponse_allOf::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree AdGroupResponse_allOf::toPropertyTree()
{
    return toPropertyTree_internal();
}

void AdGroupResponse_allOf::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string AdGroupResponse_allOf::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void AdGroupResponse_allOf::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree AdGroupResponse_allOf::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("name", m_Name);
	pt.put("status", m_Status);
	if (m_Status != nullptr) {
		pt.add_child("status", m_Status->toPropertyTree());
	}
	pt.put("budget_in_micro_currency", m_Budget_in_micro_currency);
	pt.put("bid_in_micro_currency", m_Bid_in_micro_currency);
	pt.put("budget_type", m_Budget_type);
	pt.put("start_time", m_Start_time);
	pt.put("end_time", m_End_time);
	// generate tree for Targeting_spec
	if (!m_Targeting_spec.empty()) {
		for (const auto &childEntry : m_Targeting_spec) {
            ptree Inner_node;
            Inner_node.put("", childEntry);
            tmp_node.push_back(std::make_pair("", Inner_node));
		}
		pt.add_child("targeting_spec", tmp_node);
		tmp_node.clear();
	}
	pt.put("lifetime_frequency_cap", m_Lifetime_frequency_cap);
	if (m_Tracking_urls != nullptr) {
		pt.add_child("tracking_urls", m_Tracking_urls->toPropertyTree());
	}
	pt.put("auto_targeting_enabled", m_Auto_targeting_enabled);
	pt.put("placement_group", m_Placement_group);
	if (m_Placement_group != nullptr) {
		pt.add_child("placement_group", m_Placement_group->toPropertyTree());
	}
	pt.put("pacing_delivery_type", m_Pacing_delivery_type);
	if (m_Pacing_delivery_type != nullptr) {
		pt.add_child("pacing_delivery_type", m_Pacing_delivery_type->toPropertyTree());
	}
	pt.put("conversion_learning_mode_type", m_Conversion_learning_mode_type);
	pt.put("summary_status", m_Summary_status);
	if (m_Summary_status != nullptr) {
		pt.add_child("summary_status", m_Summary_status->toPropertyTree());
	}
	pt.put("feed_profile_id", m_Feed_profile_id);
	return pt;
}

void AdGroupResponse_allOf::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_Name = pt.get("name", "");
	m_Status = pt.get("status", "");
	if (pt.get_child_optional("status")) {
		m_Status = "";
		m_Status->fromPropertyTree(pt.get_child("status"));
	}
	m_Budget_in_micro_currency = pt.get("budget_in_micro_currency", 0);
	m_Bid_in_micro_currency = pt.get("bid_in_micro_currency", 0);
	setBudgetType(pt.get("budget_type", ""));
	m_Start_time = pt.get("start_time", 0);
	m_End_time = pt.get("end_time", 0);
	// push all items of Targeting_spec into member vector
	if (pt.get_child_optional("targeting_spec")) {
		for (const auto &childTree : pt.get_child("targeting_spec")) {
            std::string val =
                childTree.second.data();
            m_Inner.emplace_back(std::move(val));
		}
	}
	m_Lifetime_frequency_cap = pt.get("lifetime_frequency_cap", 0);
	if (pt.get_child_optional("tracking_urls")) {
		m_Tracking_urls = nullptr;
		m_Tracking_urls->fromPropertyTree(pt.get_child("tracking_urls"));
	}
	m_Auto_targeting_enabled = pt.get("auto_targeting_enabled", false);
	m_Placement_group = pt.get("placement_group", "");
	if (pt.get_child_optional("placement_group")) {
		m_Placement_group = "";
		m_Placement_group->fromPropertyTree(pt.get_child("placement_group"));
	}
	m_Pacing_delivery_type = pt.get("pacing_delivery_type", "");
	if (pt.get_child_optional("pacing_delivery_type")) {
		m_Pacing_delivery_type = "";
		m_Pacing_delivery_type->fromPropertyTree(pt.get_child("pacing_delivery_type"));
	}
	setConversionLearningModeType(pt.get("conversion_learning_mode_type", ""));
	m_Summary_status = pt.get("summary_status", "");
	if (pt.get_child_optional("summary_status")) {
		m_Summary_status = "";
		m_Summary_status->fromPropertyTree(pt.get_child("summary_status"));
	}
	m_Feed_profile_id = pt.get("feed_profile_id", "");
}

std::string AdGroupResponse_allOf::getName() const
{
    return m_Name;
}

void AdGroupResponse_allOf::setName(std::string value)
{
	m_Name = value;
}
EntityStatus AdGroupResponse_allOf::getStatus() const
{
    return m_Status;
}

void AdGroupResponse_allOf::setStatus(EntityStatus value)
{
	m_Status = value;
}
int32_t AdGroupResponse_allOf::getBudgetInMicroCurrency() const
{
    return m_Budget_in_micro_currency;
}

void AdGroupResponse_allOf::setBudgetInMicroCurrency(int32_t value)
{
	m_Budget_in_micro_currency = value;
}
int32_t AdGroupResponse_allOf::getBidInMicroCurrency() const
{
    return m_Bid_in_micro_currency;
}

void AdGroupResponse_allOf::setBidInMicroCurrency(int32_t value)
{
	m_Bid_in_micro_currency = value;
}
std::string AdGroupResponse_allOf::getBudgetType() const
{
    return m_Budget_type;
}

void AdGroupResponse_allOf::setBudgetType(std::string value)
{
	if (std::find(m_Budget_typeEnum.begin(), m_Budget_typeEnum.end(), value) != m_Budget_typeEnum.end()) {
		m_Budget_type = value;
	} else {
		throw std::runtime_error("Value " + value + " not allowed");
	}
}
int32_t AdGroupResponse_allOf::getStartTime() const
{
    return m_Start_time;
}

void AdGroupResponse_allOf::setStartTime(int32_t value)
{
	m_Start_time = value;
}
int32_t AdGroupResponse_allOf::getEndTime() const
{
    return m_End_time;
}

void AdGroupResponse_allOf::setEndTime(int32_t value)
{
	m_End_time = value;
}
std::map<std::string, std::vector<std::string>> AdGroupResponse_allOf::getTargetingSpec() const
{
    return m_Targeting_spec;
}

void AdGroupResponse_allOf::setTargetingSpec(std::map<std::string, std::vector<std::string>> value)
{
	m_Targeting_spec = value;
}
int32_t AdGroupResponse_allOf::getLifetimeFrequencyCap() const
{
    return m_Lifetime_frequency_cap;
}

void AdGroupResponse_allOf::setLifetimeFrequencyCap(int32_t value)
{
	m_Lifetime_frequency_cap = value;
}
std::shared_ptr<TrackingUrls> AdGroupResponse_allOf::getTrackingUrls() const
{
    return m_Tracking_urls;
}

void AdGroupResponse_allOf::setTrackingUrls(std::shared_ptr<TrackingUrls> value)
{
	m_Tracking_urls = value;
}
bool AdGroupResponse_allOf::isAutoTargetingEnabled() const
{
    return m_Auto_targeting_enabled;
}

void AdGroupResponse_allOf::setAutoTargetingEnabled(bool value)
{
	m_Auto_targeting_enabled = value;
}
PlacementGroupType AdGroupResponse_allOf::getPlacementGroup() const
{
    return m_Placement_group;
}

void AdGroupResponse_allOf::setPlacementGroup(PlacementGroupType value)
{
	m_Placement_group = value;
}
PacingDeliveryType AdGroupResponse_allOf::getPacingDeliveryType() const
{
    return m_Pacing_delivery_type;
}

void AdGroupResponse_allOf::setPacingDeliveryType(PacingDeliveryType value)
{
	m_Pacing_delivery_type = value;
}
std::string AdGroupResponse_allOf::getConversionLearningModeType() const
{
    return m_Conversion_learning_mode_type;
}

void AdGroupResponse_allOf::setConversionLearningModeType(std::string value)
{
	if (std::find(m_Conversion_learning_mode_typeEnum.begin(), m_Conversion_learning_mode_typeEnum.end(), value) != m_Conversion_learning_mode_typeEnum.end()) {
		m_Conversion_learning_mode_type = value;
	} else {
		throw std::runtime_error("Value " + value + " not allowed");
	}
}
AdGroupSummaryStatus AdGroupResponse_allOf::getSummaryStatus() const
{
    return m_Summary_status;
}

void AdGroupResponse_allOf::setSummaryStatus(AdGroupSummaryStatus value)
{
	m_Summary_status = value;
}
std::string AdGroupResponse_allOf::getFeedProfileId() const
{
    return m_Feed_profile_id;
}

void AdGroupResponse_allOf::setFeedProfileId(std::string value)
{
	m_Feed_profile_id = value;
}

std::vector<AdGroupResponse_allOf> createAdGroupResponse_allOfVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<AdGroupResponse_allOf>();
    for (const auto& child: pt) {
        vec.emplace_back(AdGroupResponse_allOf(child.second));
    }

    return vec;
}

}
}
}
}
