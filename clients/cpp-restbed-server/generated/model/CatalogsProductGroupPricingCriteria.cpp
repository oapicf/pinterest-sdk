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



#include "CatalogsProductGroupPricingCriteria.h"

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

CatalogsProductGroupPricingCriteria::CatalogsProductGroupPricingCriteria(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CatalogsProductGroupPricingCriteria::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CatalogsProductGroupPricingCriteria::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CatalogsProductGroupPricingCriteria::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("inclusion", m_Inclusion);
	pt.put("values", m_Values);
	pt.put("negated", m_Negated);
	return pt;
}

void CatalogsProductGroupPricingCriteria::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Inclusion = pt.get("inclusion", true);
	m_Values = pt.get("values", 0.0);
	m_Negated = pt.get("negated", false);
}

bool CatalogsProductGroupPricingCriteria::isInclusion() const
{
    return m_Inclusion;
}

void CatalogsProductGroupPricingCriteria::setInclusion(bool value)
{
    m_Inclusion = value;
}


double CatalogsProductGroupPricingCriteria::getValues() const
{
    return m_Values;
}

void CatalogsProductGroupPricingCriteria::setValues(double value)
{
    m_Values = value;
}


bool CatalogsProductGroupPricingCriteria::isNegated() const
{
    return m_Negated;
}

void CatalogsProductGroupPricingCriteria::setNegated(bool value)
{
    m_Negated = value;
}



std::vector<CatalogsProductGroupPricingCriteria> createCatalogsProductGroupPricingCriteriaVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CatalogsProductGroupPricingCriteria>();
    for (const auto& child: pt) {
        vec.emplace_back(CatalogsProductGroupPricingCriteria(child.second));
    }

    return vec;
}

}
}
}
}

