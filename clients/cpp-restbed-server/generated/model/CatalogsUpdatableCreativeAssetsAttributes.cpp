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



#include "CatalogsUpdatableCreativeAssetsAttributes.h"

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

CatalogsUpdatableCreativeAssetsAttributes::CatalogsUpdatableCreativeAssetsAttributes(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CatalogsUpdatableCreativeAssetsAttributes::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CatalogsUpdatableCreativeAssetsAttributes::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CatalogsUpdatableCreativeAssetsAttributes::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("title", m_Title);
	pt.put("description", m_Description);
	pt.put("link", m_Link);
	pt.put("ios_deep_link", m_Ios_deep_link);
	pt.put("android_deep_link", m_Android_deep_link);
	pt.put("google_product_category", m_Google_product_category);
	pt.put("custom_label_0", m_Custom_label_0);
	pt.put("custom_label_1", m_Custom_label_1);
	pt.put("custom_label_2", m_Custom_label_2);
	pt.put("custom_label_3", m_Custom_label_3);
	pt.put("custom_label_4", m_Custom_label_4);
	pt.put("visibility", m_Visibility);
	return pt;
}

void CatalogsUpdatableCreativeAssetsAttributes::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Title = pt.get("title", "");
	m_Description = pt.get("description", "");
	m_Link = pt.get("link", "");
	m_Ios_deep_link = pt.get("ios_deep_link", "");
	m_Android_deep_link = pt.get("android_deep_link", "");
	m_Google_product_category = pt.get("google_product_category", "");
	m_Custom_label_0 = pt.get("custom_label_0", "");
	m_Custom_label_1 = pt.get("custom_label_1", "");
	m_Custom_label_2 = pt.get("custom_label_2", "");
	m_Custom_label_3 = pt.get("custom_label_3", "");
	m_Custom_label_4 = pt.get("custom_label_4", "");
	m_Visibility = pt.get("visibility", "");
}

std::string CatalogsUpdatableCreativeAssetsAttributes::getTitle() const
{
    return m_Title;
}

void CatalogsUpdatableCreativeAssetsAttributes::setTitle(std::string value)
{
    m_Title = value;
}


std::string CatalogsUpdatableCreativeAssetsAttributes::getDescription() const
{
    return m_Description;
}

void CatalogsUpdatableCreativeAssetsAttributes::setDescription(std::string value)
{
    m_Description = value;
}


std::string CatalogsUpdatableCreativeAssetsAttributes::getLink() const
{
    return m_Link;
}

void CatalogsUpdatableCreativeAssetsAttributes::setLink(std::string value)
{
    m_Link = value;
}


std::string CatalogsUpdatableCreativeAssetsAttributes::getIosDeepLink() const
{
    return m_Ios_deep_link;
}

void CatalogsUpdatableCreativeAssetsAttributes::setIosDeepLink(std::string value)
{
    m_Ios_deep_link = value;
}


std::string CatalogsUpdatableCreativeAssetsAttributes::getAndroidDeepLink() const
{
    return m_Android_deep_link;
}

void CatalogsUpdatableCreativeAssetsAttributes::setAndroidDeepLink(std::string value)
{
    m_Android_deep_link = value;
}


std::string CatalogsUpdatableCreativeAssetsAttributes::getGoogleProductCategory() const
{
    return m_Google_product_category;
}

void CatalogsUpdatableCreativeAssetsAttributes::setGoogleProductCategory(std::string value)
{
    m_Google_product_category = value;
}


std::string CatalogsUpdatableCreativeAssetsAttributes::getCustomLabel0() const
{
    return m_Custom_label_0;
}

void CatalogsUpdatableCreativeAssetsAttributes::setCustomLabel0(std::string value)
{
    m_Custom_label_0 = value;
}


std::string CatalogsUpdatableCreativeAssetsAttributes::getCustomLabel1() const
{
    return m_Custom_label_1;
}

void CatalogsUpdatableCreativeAssetsAttributes::setCustomLabel1(std::string value)
{
    m_Custom_label_1 = value;
}


std::string CatalogsUpdatableCreativeAssetsAttributes::getCustomLabel2() const
{
    return m_Custom_label_2;
}

void CatalogsUpdatableCreativeAssetsAttributes::setCustomLabel2(std::string value)
{
    m_Custom_label_2 = value;
}


std::string CatalogsUpdatableCreativeAssetsAttributes::getCustomLabel3() const
{
    return m_Custom_label_3;
}

void CatalogsUpdatableCreativeAssetsAttributes::setCustomLabel3(std::string value)
{
    m_Custom_label_3 = value;
}


std::string CatalogsUpdatableCreativeAssetsAttributes::getCustomLabel4() const
{
    return m_Custom_label_4;
}

void CatalogsUpdatableCreativeAssetsAttributes::setCustomLabel4(std::string value)
{
    m_Custom_label_4 = value;
}


std::string CatalogsUpdatableCreativeAssetsAttributes::getVisibility() const
{
    return m_Visibility;
}

void CatalogsUpdatableCreativeAssetsAttributes::setVisibility(std::string value)
{
    m_Visibility = value;
}



std::vector<CatalogsUpdatableCreativeAssetsAttributes> createCatalogsUpdatableCreativeAssetsAttributesVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CatalogsUpdatableCreativeAssetsAttributes>();
    for (const auto& child: pt) {
        vec.emplace_back(CatalogsUpdatableCreativeAssetsAttributes(child.second));
    }

    return vec;
}

}
}
}
}

