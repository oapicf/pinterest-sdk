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



#include "CatalogsHotelAttributes_allOf_main_image.h"

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

CatalogsHotelAttributes_allOf_main_image::CatalogsHotelAttributes_allOf_main_image(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CatalogsHotelAttributes_allOf_main_image::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CatalogsHotelAttributes_allOf_main_image::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CatalogsHotelAttributes_allOf_main_image::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("link", m_Link);
	// generate tree for Tag
    tmp_node.clear();
	if (!m_Tag.empty()) {
        tmp_node = toPt(m_Tag);
		pt.add_child("tag", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void CatalogsHotelAttributes_allOf_main_image::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Link = pt.get("link", "");
	// push all items of Tag into member
	if (pt.get_child_optional("tag")) {
        m_Tag = fromPt<std::vector<std::string>>(pt.get_child("tag"));
	}
}

std::string CatalogsHotelAttributes_allOf_main_image::getLink() const
{
    return m_Link;
}

void CatalogsHotelAttributes_allOf_main_image::setLink(std::string value)
{
    m_Link = value;
}


std::vector<std::string> CatalogsHotelAttributes_allOf_main_image::getTag() const
{
    return m_Tag;
}

void CatalogsHotelAttributes_allOf_main_image::setTag(std::vector<std::string> value)
{
    m_Tag = value;
}



std::vector<CatalogsHotelAttributes_allOf_main_image> createCatalogsHotelAttributes_allOf_main_imageVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CatalogsHotelAttributes_allOf_main_image>();
    for (const auto& child: pt) {
        vec.emplace_back(CatalogsHotelAttributes_allOf_main_image(child.second));
    }

    return vec;
}

}
}
}
}

