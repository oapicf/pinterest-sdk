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



#include "SSIOAccountPMPName.h"

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

SSIOAccountPMPName::SSIOAccountPMPName(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string SSIOAccountPMPName::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void SSIOAccountPMPName::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree SSIOAccountPMPName::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("name", m_Name);
	pt.put("id", m_Id);
	return pt;
}

void SSIOAccountPMPName::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Name = pt.get("name", "");
	m_Id = pt.get("id", "");
}

std::string SSIOAccountPMPName::getName() const
{
    return m_Name;
}

void SSIOAccountPMPName::setName(std::string value)
{
    m_Name = value;
}


std::string SSIOAccountPMPName::getId() const
{
    return m_Id;
}

void SSIOAccountPMPName::setId(std::string value)
{
    m_Id = value;
}



std::vector<SSIOAccountPMPName> createSSIOAccountPMPNameVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<SSIOAccountPMPName>();
    for (const auto& child: pt) {
        vec.emplace_back(SSIOAccountPMPName(child.second));
    }

    return vec;
}

}
}
}
}

