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



#include "CatalogsListProductsByFeedBasedFilter.h"

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

CatalogsListProductsByFeedBasedFilter::CatalogsListProductsByFeedBasedFilter(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CatalogsListProductsByFeedBasedFilter::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CatalogsListProductsByFeedBasedFilter::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CatalogsListProductsByFeedBasedFilter::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("feed_id", m_Feed_id);
	pt.add_child("filters", m_Filters.toPropertyTree());
	return pt;
}

void CatalogsListProductsByFeedBasedFilter::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Feed_id = pt.get("feed_id", "");
	if (pt.get_child_optional("filters")) {
        m_Filters = fromPt<CatalogsProductGroupFilters>(pt.get_child("filters"));
	}
}

std::string CatalogsListProductsByFeedBasedFilter::getFeedId() const
{
    return m_Feed_id;
}

void CatalogsListProductsByFeedBasedFilter::setFeedId(std::string value)
{
    m_Feed_id = value;
}


CatalogsProductGroupFilters CatalogsListProductsByFeedBasedFilter::getFilters() const
{
    return m_Filters;
}

void CatalogsListProductsByFeedBasedFilter::setFilters(CatalogsProductGroupFilters value)
{
    m_Filters = value;
}



std::vector<CatalogsListProductsByFeedBasedFilter> createCatalogsListProductsByFeedBasedFilterVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CatalogsListProductsByFeedBasedFilter>();
    for (const auto& child: pt) {
        vec.emplace_back(CatalogsListProductsByFeedBasedFilter(child.second));
    }

    return vec;
}

}
}
}
}

