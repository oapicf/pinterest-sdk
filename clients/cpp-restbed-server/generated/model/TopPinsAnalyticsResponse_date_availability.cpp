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



#include "TopPinsAnalyticsResponse_date_availability.h"

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

TopPinsAnalyticsResponse_date_availability::TopPinsAnalyticsResponse_date_availability(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string TopPinsAnalyticsResponse_date_availability::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void TopPinsAnalyticsResponse_date_availability::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree TopPinsAnalyticsResponse_date_availability::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("latest_available_timestamp", m_Latest_available_timestamp);
	pt.put("is_realtime", m_Is_realtime);
	return pt;
}

void TopPinsAnalyticsResponse_date_availability::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Latest_available_timestamp = pt.get("latest_available_timestamp", 0.0);
	m_Is_realtime = pt.get("is_realtime", false);
}

double TopPinsAnalyticsResponse_date_availability::getLatestAvailableTimestamp() const
{
    return m_Latest_available_timestamp;
}

void TopPinsAnalyticsResponse_date_availability::setLatestAvailableTimestamp(double value)
{
    m_Latest_available_timestamp = value;
}


bool TopPinsAnalyticsResponse_date_availability::isIsRealtime() const
{
    return m_Is_realtime;
}

void TopPinsAnalyticsResponse_date_availability::setIsRealtime(bool value)
{
    m_Is_realtime = value;
}



std::vector<TopPinsAnalyticsResponse_date_availability> createTopPinsAnalyticsResponse_date_availabilityVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<TopPinsAnalyticsResponse_date_availability>();
    for (const auto& child: pt) {
        vec.emplace_back(TopPinsAnalyticsResponse_date_availability(child.second));
    }

    return vec;
}

}
}
}
}

