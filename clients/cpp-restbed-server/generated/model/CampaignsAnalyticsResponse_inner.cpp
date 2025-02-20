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



#include "CampaignsAnalyticsResponse_inner.h"

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

CampaignsAnalyticsResponse_inner::CampaignsAnalyticsResponse_inner(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CampaignsAnalyticsResponse_inner::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CampaignsAnalyticsResponse_inner::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CampaignsAnalyticsResponse_inner::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("CAMPAIGN_ID", m_CAMPAIGN_ID);
	pt.put("DATE", m_DATE);
	return pt;
}

void CampaignsAnalyticsResponse_inner::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_CAMPAIGN_ID = pt.get("CAMPAIGN_ID", "");
	m_DATE = pt.get("DATE", "");
}

std::string CampaignsAnalyticsResponse_inner::getCAMPAIGNID() const
{
    return m_CAMPAIGN_ID;
}

void CampaignsAnalyticsResponse_inner::setCAMPAIGNID(std::string value)
{
    m_CAMPAIGN_ID = value;
}


std::string CampaignsAnalyticsResponse_inner::getDATE() const
{
    return m_DATE;
}

void CampaignsAnalyticsResponse_inner::setDATE(std::string value)
{
    m_DATE = value;
}



std::vector<CampaignsAnalyticsResponse_inner> createCampaignsAnalyticsResponse_innerVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CampaignsAnalyticsResponse_inner>();
    for (const auto& child: pt) {
        vec.emplace_back(CampaignsAnalyticsResponse_inner(child.second));
    }

    return vec;
}

}
}
}
}

