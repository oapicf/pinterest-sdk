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



#include "CustomLabel2Filter.h"

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

CustomLabel2Filter::CustomLabel2Filter(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CustomLabel2Filter::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CustomLabel2Filter::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CustomLabel2Filter::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	return pt;
}

void CustomLabel2Filter::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
}

CatalogsProductGroupMultipleStringCriteria CustomLabel2Filter::getCUSTOMLABEL2() const
{
    return m_CUSTOM_LABEL_2;
}

void CustomLabel2Filter::setCUSTOMLABEL2(CatalogsProductGroupMultipleStringCriteria value)
{
    m_CUSTOM_LABEL_2 = value;
}



std::vector<CustomLabel2Filter> createCustomLabel2FilterVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CustomLabel2Filter>();
    for (const auto& child: pt) {
        vec.emplace_back(CustomLabel2Filter(child.second));
    }

    return vec;
}

}
}
}
}

