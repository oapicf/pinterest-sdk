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



#include "CatalogsDeleteCreativeAssetsItem.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <algorithm>
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

CatalogsDeleteCreativeAssetsItem::CatalogsDeleteCreativeAssetsItem(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CatalogsDeleteCreativeAssetsItem::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CatalogsDeleteCreativeAssetsItem::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CatalogsDeleteCreativeAssetsItem::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("creative_assets_id", m_Creative_assets_id);
	pt.put("operation", m_Operation);
	return pt;
}

void CatalogsDeleteCreativeAssetsItem::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Creative_assets_id = pt.get("creative_assets_id", "");
	setOperation(pt.get("operation", ""));
}

std::string CatalogsDeleteCreativeAssetsItem::getCreativeAssetsId() const
{
    return m_Creative_assets_id;
}

void CatalogsDeleteCreativeAssetsItem::setCreativeAssetsId(std::string value)
{
    m_Creative_assets_id = value;
}


std::string CatalogsDeleteCreativeAssetsItem::getOperation() const
{
    return m_Operation;
}

void CatalogsDeleteCreativeAssetsItem::setOperation(std::string value)
{
    static const std::array<std::string, 1> allowedValues = {
        "DELETE"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Operation = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}



std::vector<CatalogsDeleteCreativeAssetsItem> createCatalogsDeleteCreativeAssetsItemVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CatalogsDeleteCreativeAssetsItem>();
    for (const auto& child: pt) {
        vec.emplace_back(CatalogsDeleteCreativeAssetsItem(child.second));
    }

    return vec;
}

}
}
}
}

