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



#include "SingleInterestTargetingOptionResponse.h"

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

SingleInterestTargetingOptionResponse::SingleInterestTargetingOptionResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string SingleInterestTargetingOptionResponse::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void SingleInterestTargetingOptionResponse::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree SingleInterestTargetingOptionResponse::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("name", m_Name);
	// generate tree for Child_interests
    tmp_node.clear();
	if (!m_Child_interests.empty()) {
        tmp_node = toPt(m_Child_interests);
		pt.add_child("child_interests", tmp_node);
		tmp_node.clear();
	}
	pt.put("level", m_Level);
	return pt;
}

void SingleInterestTargetingOptionResponse::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", "");
	m_Name = pt.get("name", "");
	// push all items of Child_interests into member
	if (pt.get_child_optional("child_interests")) {
        m_Child_interests = fromPt<std::vector<std::string>>(pt.get_child("child_interests"));
	}
	m_Level = pt.get("level", 0);
}

std::string SingleInterestTargetingOptionResponse::getId() const
{
    return m_Id;
}

void SingleInterestTargetingOptionResponse::setId(std::string value)
{
    m_Id = value;
}


std::string SingleInterestTargetingOptionResponse::getName() const
{
    return m_Name;
}

void SingleInterestTargetingOptionResponse::setName(std::string value)
{
    m_Name = value;
}


std::vector<std::string> SingleInterestTargetingOptionResponse::getChildInterests() const
{
    return m_Child_interests;
}

void SingleInterestTargetingOptionResponse::setChildInterests(std::vector<std::string> value)
{
    m_Child_interests = value;
}


int32_t SingleInterestTargetingOptionResponse::getLevel() const
{
    return m_Level;
}

void SingleInterestTargetingOptionResponse::setLevel(int32_t value)
{
    m_Level = value;
}



std::vector<SingleInterestTargetingOptionResponse> createSingleInterestTargetingOptionResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<SingleInterestTargetingOptionResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(SingleInterestTargetingOptionResponse(child.second));
    }

    return vec;
}

}
}
}
}

