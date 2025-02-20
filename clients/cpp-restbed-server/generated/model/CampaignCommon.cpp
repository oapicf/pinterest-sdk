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



#include "CampaignCommon.h"

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

CampaignCommon::CampaignCommon(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CampaignCommon::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CampaignCommon::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CampaignCommon::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("ad_account_id", m_Ad_account_id);
	pt.put("name", m_Name);
	pt.put("lifetime_spend_cap", m_Lifetime_spend_cap);
	pt.put("daily_spend_cap", m_Daily_spend_cap);
	pt.put("order_line_id", m_Order_line_id);
	pt.add_child("tracking_urls", m_Tracking_urls.toPropertyTree());
	pt.put("start_time", m_Start_time);
	pt.put("end_time", m_End_time);
	pt.put("is_flexible_daily_budgets", m_Is_flexible_daily_budgets);
	return pt;
}

void CampaignCommon::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Ad_account_id = pt.get("ad_account_id", "");
	m_Name = pt.get("name", "");
	m_Lifetime_spend_cap = pt.get("lifetime_spend_cap", 0);
	m_Daily_spend_cap = pt.get("daily_spend_cap", 0);
	m_Order_line_id = pt.get("order_line_id", "");
	if (pt.get_child_optional("tracking_urls")) {
        m_Tracking_urls = fromPt<TrackingUrls>(pt.get_child("tracking_urls"));
	}
	m_Start_time = pt.get("start_time", 0);
	m_End_time = pt.get("end_time", 0);
	m_Is_flexible_daily_budgets = pt.get("is_flexible_daily_budgets", false);
}

std::string CampaignCommon::getAdAccountId() const
{
    return m_Ad_account_id;
}

void CampaignCommon::setAdAccountId(std::string value)
{
    m_Ad_account_id = value;
}


std::string CampaignCommon::getName() const
{
    return m_Name;
}

void CampaignCommon::setName(std::string value)
{
    m_Name = value;
}


EntityStatus CampaignCommon::getStatus() const
{
    return m_Status;
}

void CampaignCommon::setStatus(EntityStatus value)
{
    m_Status = value;
}


int32_t CampaignCommon::getLifetimeSpendCap() const
{
    return m_Lifetime_spend_cap;
}

void CampaignCommon::setLifetimeSpendCap(int32_t value)
{
    m_Lifetime_spend_cap = value;
}


int32_t CampaignCommon::getDailySpendCap() const
{
    return m_Daily_spend_cap;
}

void CampaignCommon::setDailySpendCap(int32_t value)
{
    m_Daily_spend_cap = value;
}


std::string CampaignCommon::getOrderLineId() const
{
    return m_Order_line_id;
}

void CampaignCommon::setOrderLineId(std::string value)
{
    m_Order_line_id = value;
}


TrackingUrls CampaignCommon::getTrackingUrls() const
{
    return m_Tracking_urls;
}

void CampaignCommon::setTrackingUrls(TrackingUrls value)
{
    m_Tracking_urls = value;
}


int32_t CampaignCommon::getStartTime() const
{
    return m_Start_time;
}

void CampaignCommon::setStartTime(int32_t value)
{
    m_Start_time = value;
}


int32_t CampaignCommon::getEndTime() const
{
    return m_End_time;
}

void CampaignCommon::setEndTime(int32_t value)
{
    m_End_time = value;
}


bool CampaignCommon::isIsFlexibleDailyBudgets() const
{
    return m_Is_flexible_daily_budgets;
}

void CampaignCommon::setIsFlexibleDailyBudgets(bool value)
{
    m_Is_flexible_daily_budgets = value;
}



std::vector<CampaignCommon> createCampaignCommonVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CampaignCommon>();
    for (const auto& child: pt) {
        vec.emplace_back(CampaignCommon(child.second));
    }

    return vec;
}

}
}
}
}

