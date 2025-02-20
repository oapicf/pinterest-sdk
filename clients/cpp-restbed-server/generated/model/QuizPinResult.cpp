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



#include "QuizPinResult.h"

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

QuizPinResult::QuizPinResult(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string QuizPinResult::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void QuizPinResult::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree QuizPinResult::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("organic_pin_id", m_Organic_pin_id);
	pt.put("android_deep_link", m_Android_deep_link);
	pt.put("ios_deep_link", m_Ios_deep_link);
	pt.put("destination_url", m_Destination_url);
	pt.put("result_id", m_Result_id);
	return pt;
}

void QuizPinResult::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Organic_pin_id = pt.get("organic_pin_id", "");
	m_Android_deep_link = pt.get("android_deep_link", "");
	m_Ios_deep_link = pt.get("ios_deep_link", "");
	m_Destination_url = pt.get("destination_url", "");
	m_Result_id = pt.get("result_id", 0.0);
}

std::string QuizPinResult::getOrganicPinId() const
{
    return m_Organic_pin_id;
}

void QuizPinResult::setOrganicPinId(std::string value)
{
    m_Organic_pin_id = value;
}


std::string QuizPinResult::getAndroidDeepLink() const
{
    return m_Android_deep_link;
}

void QuizPinResult::setAndroidDeepLink(std::string value)
{
    m_Android_deep_link = value;
}


std::string QuizPinResult::getIosDeepLink() const
{
    return m_Ios_deep_link;
}

void QuizPinResult::setIosDeepLink(std::string value)
{
    m_Ios_deep_link = value;
}


std::string QuizPinResult::getDestinationUrl() const
{
    return m_Destination_url;
}

void QuizPinResult::setDestinationUrl(std::string value)
{
    m_Destination_url = value;
}


double QuizPinResult::getResultId() const
{
    return m_Result_id;
}

void QuizPinResult::setResultId(double value)
{
    m_Result_id = value;
}



std::vector<QuizPinResult> createQuizPinResultVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<QuizPinResult>();
    for (const auto& child: pt) {
        vec.emplace_back(QuizPinResult(child.second));
    }

    return vec;
}

}
}
}
}

