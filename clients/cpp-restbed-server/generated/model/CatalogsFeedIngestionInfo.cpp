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



#include "CatalogsFeedIngestionInfo.h"

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

CatalogsFeedIngestionInfo::CatalogsFeedIngestionInfo(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CatalogsFeedIngestionInfo::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CatalogsFeedIngestionInfo::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CatalogsFeedIngestionInfo::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("IN_STOCK", m_IN_STOCK);
	pt.put("OUT_OF_STOCK", m_OUT_OF_STOCK);
	pt.put("PREORDER", m_PREORDER);
	return pt;
}

void CatalogsFeedIngestionInfo::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_IN_STOCK = pt.get("IN_STOCK", 0);
	m_OUT_OF_STOCK = pt.get("OUT_OF_STOCK", 0);
	m_PREORDER = pt.get("PREORDER", 0);
}

int32_t CatalogsFeedIngestionInfo::getINSTOCK() const
{
    return m_IN_STOCK;
}

void CatalogsFeedIngestionInfo::setINSTOCK(int32_t value)
{
    m_IN_STOCK = value;
}


int32_t CatalogsFeedIngestionInfo::getOUTOFSTOCK() const
{
    return m_OUT_OF_STOCK;
}

void CatalogsFeedIngestionInfo::setOUTOFSTOCK(int32_t value)
{
    m_OUT_OF_STOCK = value;
}


int32_t CatalogsFeedIngestionInfo::getPREORDER() const
{
    return m_PREORDER;
}

void CatalogsFeedIngestionInfo::setPREORDER(int32_t value)
{
    m_PREORDER = value;
}



std::vector<CatalogsFeedIngestionInfo> createCatalogsFeedIngestionInfoVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CatalogsFeedIngestionInfo>();
    for (const auto& child: pt) {
        vec.emplace_back(CatalogsFeedIngestionInfo(child.second));
    }

    return vec;
}

}
}
}
}

