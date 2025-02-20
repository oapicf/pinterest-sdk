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



#include "ConversionApiResponse.h"

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

ConversionApiResponse::ConversionApiResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ConversionApiResponse::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ConversionApiResponse::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ConversionApiResponse::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("num_events_received", m_Num_events_received);
	pt.put("num_events_processed", m_Num_events_processed);
	// generate tree for Events
    tmp_node.clear();
	if (!m_Events.empty()) {
        tmp_node = toPt(m_Events);
		pt.add_child("events", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void ConversionApiResponse::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Num_events_received = pt.get("num_events_received", 0);
	m_Num_events_processed = pt.get("num_events_processed", 0);
	// push all items of Events into member
	if (pt.get_child_optional("events")) {
        m_Events = fromPt<std::vector<ConversionApiResponse_events_inner>>(pt.get_child("events"));
	}
}

int32_t ConversionApiResponse::getNumEventsReceived() const
{
    return m_Num_events_received;
}

void ConversionApiResponse::setNumEventsReceived(int32_t value)
{
    m_Num_events_received = value;
}


int32_t ConversionApiResponse::getNumEventsProcessed() const
{
    return m_Num_events_processed;
}

void ConversionApiResponse::setNumEventsProcessed(int32_t value)
{
    m_Num_events_processed = value;
}


std::vector<ConversionApiResponse_events_inner> ConversionApiResponse::getEvents() const
{
    return m_Events;
}

void ConversionApiResponse::setEvents(std::vector<ConversionApiResponse_events_inner> value)
{
    m_Events = value;
}



std::vector<ConversionApiResponse> createConversionApiResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ConversionApiResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(ConversionApiResponse(child.second));
    }

    return vec;
}

}
}
}
}

