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



#include "CatalogsProductGroupMultipleStringCriteria.h"

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

CatalogsProductGroupMultipleStringCriteria::CatalogsProductGroupMultipleStringCriteria(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CatalogsProductGroupMultipleStringCriteria::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CatalogsProductGroupMultipleStringCriteria::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CatalogsProductGroupMultipleStringCriteria::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Values
    tmp_node.clear();
	if (!m_Values.empty()) {
        tmp_node = toPt(m_Values);
		pt.add_child("values", tmp_node);
		tmp_node.clear();
	}
	pt.put("negated", m_Negated);
	return pt;
}

void CatalogsProductGroupMultipleStringCriteria::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Values into member
	if (pt.get_child_optional("values")) {
        m_Values = fromPt<std::vector<std::string>>(pt.get_child("values"));
	}
	m_Negated = pt.get("negated", false);
}

std::vector<std::string> CatalogsProductGroupMultipleStringCriteria::getValues() const
{
    return m_Values;
}

void CatalogsProductGroupMultipleStringCriteria::setValues(std::vector<std::string> value)
{
    m_Values = value;
}


bool CatalogsProductGroupMultipleStringCriteria::isNegated() const
{
    return m_Negated;
}

void CatalogsProductGroupMultipleStringCriteria::setNegated(bool value)
{
    m_Negated = value;
}



std::vector<CatalogsProductGroupMultipleStringCriteria> createCatalogsProductGroupMultipleStringCriteriaVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CatalogsProductGroupMultipleStringCriteria>();
    for (const auto& child: pt) {
        vec.emplace_back(CatalogsProductGroupMultipleStringCriteria(child.second));
    }

    return vec;
}

}
}
}
}

