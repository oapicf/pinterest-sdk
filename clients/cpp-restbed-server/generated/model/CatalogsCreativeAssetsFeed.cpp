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



#include "CatalogsCreativeAssetsFeed.h"

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

CatalogsCreativeAssetsFeed::CatalogsCreativeAssetsFeed(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CatalogsCreativeAssetsFeed::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CatalogsCreativeAssetsFeed::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CatalogsCreativeAssetsFeed::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("created_at", m_Created_at);
	pt.put("id", m_Id);
	pt.put("updated_at", m_Updated_at);
	pt.put("name", m_Name);
	pt.add_child("credentials", m_Credentials.toPropertyTree());
	pt.put("location", m_Location);
	pt.add_child("preferred_processing_schedule", m_Preferred_processing_schedule.toPropertyTree());
	pt.put("default_locale", m_Default_locale);
	pt.put("catalog_id", m_Catalog_id);
	return pt;
}

void CatalogsCreativeAssetsFeed::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Created_at = pt.get("created_at", "");
	m_Id = pt.get("id", "");
	m_Updated_at = pt.get("updated_at", "");
	m_Name = pt.get("name", "");
	if (pt.get_child_optional("credentials")) {
        m_Credentials = fromPt<CatalogsFeedCredentials>(pt.get_child("credentials"));
	}
	m_Location = pt.get("location", "");
	if (pt.get_child_optional("preferred_processing_schedule")) {
        m_Preferred_processing_schedule = fromPt<CatalogsFeedProcessingSchedule>(pt.get_child("preferred_processing_schedule"));
	}
	m_Default_locale = pt.get("default_locale", "");
	m_Catalog_id = pt.get("catalog_id", "");
}

std::string CatalogsCreativeAssetsFeed::getCreatedAt() const
{
    return m_Created_at;
}

void CatalogsCreativeAssetsFeed::setCreatedAt(std::string value)
{
    m_Created_at = value;
}


std::string CatalogsCreativeAssetsFeed::getId() const
{
    return m_Id;
}

void CatalogsCreativeAssetsFeed::setId(std::string value)
{
    m_Id = value;
}


std::string CatalogsCreativeAssetsFeed::getUpdatedAt() const
{
    return m_Updated_at;
}

void CatalogsCreativeAssetsFeed::setUpdatedAt(std::string value)
{
    m_Updated_at = value;
}


std::string CatalogsCreativeAssetsFeed::getName() const
{
    return m_Name;
}

void CatalogsCreativeAssetsFeed::setName(std::string value)
{
    m_Name = value;
}


CatalogsFormat CatalogsCreativeAssetsFeed::getFormat() const
{
    return m_Format;
}

void CatalogsCreativeAssetsFeed::setFormat(CatalogsFormat value)
{
    m_Format = value;
}


CatalogsType CatalogsCreativeAssetsFeed::getCatalogType() const
{
    return m_Catalog_type;
}

void CatalogsCreativeAssetsFeed::setCatalogType(CatalogsType value)
{
    m_Catalog_type = value;
}


CatalogsFeedCredentials CatalogsCreativeAssetsFeed::getCredentials() const
{
    return m_Credentials;
}

void CatalogsCreativeAssetsFeed::setCredentials(CatalogsFeedCredentials value)
{
    m_Credentials = value;
}


std::string CatalogsCreativeAssetsFeed::getLocation() const
{
    return m_Location;
}

void CatalogsCreativeAssetsFeed::setLocation(std::string value)
{
    m_Location = value;
}


CatalogsFeedProcessingSchedule CatalogsCreativeAssetsFeed::getPreferredProcessingSchedule() const
{
    return m_Preferred_processing_schedule;
}

void CatalogsCreativeAssetsFeed::setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule value)
{
    m_Preferred_processing_schedule = value;
}


CatalogsStatus CatalogsCreativeAssetsFeed::getStatus() const
{
    return m_Status;
}

void CatalogsCreativeAssetsFeed::setStatus(CatalogsStatus value)
{
    m_Status = value;
}


NullableCurrency CatalogsCreativeAssetsFeed::getDefaultCurrency() const
{
    return m_Default_currency;
}

void CatalogsCreativeAssetsFeed::setDefaultCurrency(NullableCurrency value)
{
    m_Default_currency = value;
}


std::string CatalogsCreativeAssetsFeed::getDefaultLocale() const
{
    return m_Default_locale;
}

void CatalogsCreativeAssetsFeed::setDefaultLocale(std::string value)
{
    m_Default_locale = value;
}


Country CatalogsCreativeAssetsFeed::getDefaultCountry() const
{
    return m_Default_country;
}

void CatalogsCreativeAssetsFeed::setDefaultCountry(Country value)
{
    m_Default_country = value;
}


std::string CatalogsCreativeAssetsFeed::getCatalogId() const
{
    return m_Catalog_id;
}

void CatalogsCreativeAssetsFeed::setCatalogId(std::string value)
{
    m_Catalog_id = value;
}



std::vector<CatalogsCreativeAssetsFeed> createCatalogsCreativeAssetsFeedVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CatalogsCreativeAssetsFeed>();
    for (const auto& child: pt) {
        vec.emplace_back(CatalogsCreativeAssetsFeed(child.second));
    }

    return vec;
}

}
}
}
}

