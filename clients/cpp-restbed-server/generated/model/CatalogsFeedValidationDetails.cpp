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



#include "CatalogsFeedValidationDetails.h"

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

CatalogsFeedValidationDetails::CatalogsFeedValidationDetails(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CatalogsFeedValidationDetails::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CatalogsFeedValidationDetails::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CatalogsFeedValidationDetails::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.add_child("errors", m_Errors.toPropertyTree());
	pt.add_child("warnings", m_Warnings.toPropertyTree());
	return pt;
}

void CatalogsFeedValidationDetails::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("errors")) {
        m_Errors = fromPt<CatalogsFeedValidationErrors>(pt.get_child("errors"));
	}
	if (pt.get_child_optional("warnings")) {
        m_Warnings = fromPt<CatalogsFeedValidationWarnings>(pt.get_child("warnings"));
	}
}

CatalogsFeedValidationErrors CatalogsFeedValidationDetails::getErrors() const
{
    return m_Errors;
}

void CatalogsFeedValidationDetails::setErrors(CatalogsFeedValidationErrors value)
{
    m_Errors = value;
}


CatalogsFeedValidationWarnings CatalogsFeedValidationDetails::getWarnings() const
{
    return m_Warnings;
}

void CatalogsFeedValidationDetails::setWarnings(CatalogsFeedValidationWarnings value)
{
    m_Warnings = value;
}



std::vector<CatalogsFeedValidationDetails> createCatalogsFeedValidationDetailsVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CatalogsFeedValidationDetails>();
    for (const auto& child: pt) {
        vec.emplace_back(CatalogsFeedValidationDetails(child.second));
    }

    return vec;
}

}
}
}
}

