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



#include "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata.h"

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

OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::OptimizationGoalMetadata_conversion_tag_v3_goal_metadata(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.add_child("attribution_windows", m_Attribution_windows.toPropertyTree());
	pt.put("conversion_event", m_Conversion_event);
	pt.put("conversion_tag_id", m_Conversion_tag_id);
	pt.put("cpa_goal_value_in_micro_currency", m_Cpa_goal_value_in_micro_currency);
	pt.put("is_roas_optimized", m_Is_roas_optimized);
	pt.put("learning_mode_type", m_Learning_mode_type);
	return pt;
}

void OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("attribution_windows")) {
        m_Attribution_windows = fromPt<OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows>(pt.get_child("attribution_windows"));
	}
	setConversionEvent(pt.get("conversion_event", ""));
	m_Conversion_tag_id = pt.get("conversion_tag_id", "");
	m_Cpa_goal_value_in_micro_currency = pt.get("cpa_goal_value_in_micro_currency", "");
	m_Is_roas_optimized = pt.get("is_roas_optimized", false);
	setLearningModeType(pt.get("learning_mode_type", ""));
}

OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::getAttributionWindows() const
{
    return m_Attribution_windows;
}

void OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setAttributionWindows(OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows value)
{
    m_Attribution_windows = value;
}


std::string OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::getConversionEvent() const
{
    return m_Conversion_event;
}

void OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setConversionEvent(std::string value)
{
    static const std::array<std::string, 10> allowedValues = {
        "PAGE_VISIT", "SIGNUP", "CHECKOUT", "CUSTOM", "VIEW_CATEGORY", "SEARCH", "ADD_TO_CART", "WATCH_VIDEO", "LEAD", "APP_INSTALL"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Conversion_event = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


std::string OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::getConversionTagId() const
{
    return m_Conversion_tag_id;
}

void OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setConversionTagId(std::string value)
{
    m_Conversion_tag_id = value;
}


std::string OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::getCpaGoalValueInMicroCurrency() const
{
    return m_Cpa_goal_value_in_micro_currency;
}

void OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setCpaGoalValueInMicroCurrency(std::string value)
{
    m_Cpa_goal_value_in_micro_currency = value;
}


bool OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::isIsRoasOptimized() const
{
    return m_Is_roas_optimized;
}

void OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setIsRoasOptimized(bool value)
{
    m_Is_roas_optimized = value;
}


std::string OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::getLearningModeType() const
{
    return m_Learning_mode_type;
}

void OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setLearningModeType(std::string value)
{
    static const std::array<std::string, 2> allowedValues = {
        "NOT_ACTIVE", "ACTIVE"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Learning_mode_type = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}



std::vector<OptimizationGoalMetadata_conversion_tag_v3_goal_metadata> createOptimizationGoalMetadata_conversion_tag_v3_goal_metadataVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<OptimizationGoalMetadata_conversion_tag_v3_goal_metadata>();
    for (const auto& child: pt) {
        vec.emplace_back(OptimizationGoalMetadata_conversion_tag_v3_goal_metadata(child.second));
    }

    return vec;
}

}
}
}
}

