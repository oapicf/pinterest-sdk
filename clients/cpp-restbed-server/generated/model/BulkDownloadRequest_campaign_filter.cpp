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



#include "BulkDownloadRequest_campaign_filter.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
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

BulkDownloadRequest_campaign_filter::BulkDownloadRequest_campaign_filter(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string BulkDownloadRequest_campaign_filter::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void BulkDownloadRequest_campaign_filter::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree BulkDownloadRequest_campaign_filter::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("start_time", m_Start_time);
	pt.put("end_time", m_End_time);
	pt.put("name", m_Name);
	// generate tree for Campaign_status
    tmp_node.clear();
	if (!m_Campaign_status.empty()) {
        tmp_node = toPt(m_Campaign_status);
		pt.add_child("campaign_status", tmp_node);
		tmp_node.clear();
	}
	// generate tree for Objective_type
    tmp_node.clear();
	if (!m_Objective_type.empty()) {
        tmp_node = toPt(m_Objective_type);
		pt.add_child("objective_type", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void BulkDownloadRequest_campaign_filter::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Start_time = pt.get("start_time", "");
	m_End_time = pt.get("end_time", "");
	m_Name = pt.get("name", "");
	// push all items of Campaign_status into member
	if (pt.get_child_optional("campaign_status")) {
        m_Campaign_status = fromPt<std::vector<CampaignSummaryStatus>>(pt.get_child("campaign_status"));
	}
	// push all items of Objective_type into member
	if (pt.get_child_optional("objective_type")) {
        m_Objective_type = fromPt<std::vector<ObjectiveType>>(pt.get_child("objective_type"));
	}
}

std::string BulkDownloadRequest_campaign_filter::getStartTime() const
{
    return m_Start_time;
}

void BulkDownloadRequest_campaign_filter::setStartTime(std::string value)
{
    m_Start_time = value;
}


std::string BulkDownloadRequest_campaign_filter::getEndTime() const
{
    return m_End_time;
}

void BulkDownloadRequest_campaign_filter::setEndTime(std::string value)
{
    m_End_time = value;
}


std::string BulkDownloadRequest_campaign_filter::getName() const
{
    return m_Name;
}

void BulkDownloadRequest_campaign_filter::setName(std::string value)
{
    m_Name = value;
}


std::vector<CampaignSummaryStatus> BulkDownloadRequest_campaign_filter::getCampaignStatus() const
{
    return m_Campaign_status;
}

void BulkDownloadRequest_campaign_filter::setCampaignStatus(std::vector<CampaignSummaryStatus> value)
{
    m_Campaign_status = value;
}


std::vector<ObjectiveType> BulkDownloadRequest_campaign_filter::getObjectiveType() const
{
    return m_Objective_type;
}

void BulkDownloadRequest_campaign_filter::setObjectiveType(std::vector<ObjectiveType> value)
{
    m_Objective_type = value;
}



std::vector<BulkDownloadRequest_campaign_filter> createBulkDownloadRequest_campaign_filterVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<BulkDownloadRequest_campaign_filter>();
    for (const auto& child: pt) {
        vec.emplace_back(BulkDownloadRequest_campaign_filter(child.second));
    }

    return vec;
}

}
}
}
}

