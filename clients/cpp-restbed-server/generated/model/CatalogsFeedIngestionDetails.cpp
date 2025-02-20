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



#include "CatalogsFeedIngestionDetails.h"

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

CatalogsFeedIngestionDetails::CatalogsFeedIngestionDetails(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CatalogsFeedIngestionDetails::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CatalogsFeedIngestionDetails::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CatalogsFeedIngestionDetails::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.add_child("errors", m_Errors.toPropertyTree());
	pt.add_child("info", m_Info.toPropertyTree());
	pt.add_child("warnings", m_Warnings.toPropertyTree());
	return pt;
}

void CatalogsFeedIngestionDetails::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("errors")) {
        m_Errors = fromPt<CatalogsFeedIngestionErrors>(pt.get_child("errors"));
	}
	if (pt.get_child_optional("info")) {
        m_Info = fromPt<CatalogsFeedIngestionInfo>(pt.get_child("info"));
	}
	if (pt.get_child_optional("warnings")) {
        m_Warnings = fromPt<CatalogsFeedIngestionWarnings>(pt.get_child("warnings"));
	}
}

CatalogsFeedIngestionErrors CatalogsFeedIngestionDetails::getErrors() const
{
    return m_Errors;
}

void CatalogsFeedIngestionDetails::setErrors(CatalogsFeedIngestionErrors value)
{
    m_Errors = value;
}


CatalogsFeedIngestionInfo CatalogsFeedIngestionDetails::getInfo() const
{
    return m_Info;
}

void CatalogsFeedIngestionDetails::setInfo(CatalogsFeedIngestionInfo value)
{
    m_Info = value;
}


CatalogsFeedIngestionWarnings CatalogsFeedIngestionDetails::getWarnings() const
{
    return m_Warnings;
}

void CatalogsFeedIngestionDetails::setWarnings(CatalogsFeedIngestionWarnings value)
{
    m_Warnings = value;
}



std::vector<CatalogsFeedIngestionDetails> createCatalogsFeedIngestionDetailsVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CatalogsFeedIngestionDetails>();
    for (const auto& child: pt) {
        vec.emplace_back(CatalogsFeedIngestionDetails(child.second));
    }

    return vec;
}

}
}
}
}

