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



#include "CatalogsFeed.h"

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

CatalogsFeed::CatalogsFeed(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CatalogsFeed::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CatalogsFeed::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CatalogsFeed::toPropertyTree() const
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

void CatalogsFeed::fromPropertyTree(ptree const &pt)
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

std::string CatalogsFeed::getCreatedAt() const
{
    return m_Created_at;
}

void CatalogsFeed::setCreatedAt(std::string value)
{
    m_Created_at = value;
}


std::string CatalogsFeed::getId() const
{
    return m_Id;
}

void CatalogsFeed::setId(std::string value)
{
    m_Id = value;
}


std::string CatalogsFeed::getUpdatedAt() const
{
    return m_Updated_at;
}

void CatalogsFeed::setUpdatedAt(std::string value)
{
    m_Updated_at = value;
}


std::string CatalogsFeed::getName() const
{
    return m_Name;
}

void CatalogsFeed::setName(std::string value)
{
    m_Name = value;
}


CatalogsFormat CatalogsFeed::getFormat() const
{
    return m_Format;
}

void CatalogsFeed::setFormat(CatalogsFormat value)
{
    m_Format = value;
}


CatalogsType CatalogsFeed::getCatalogType() const
{
    return m_Catalog_type;
}

void CatalogsFeed::setCatalogType(CatalogsType value)
{
    m_Catalog_type = value;
}


CatalogsFeedCredentials CatalogsFeed::getCredentials() const
{
    return m_Credentials;
}

void CatalogsFeed::setCredentials(CatalogsFeedCredentials value)
{
    m_Credentials = value;
}


std::string CatalogsFeed::getLocation() const
{
    return m_Location;
}

void CatalogsFeed::setLocation(std::string value)
{
    m_Location = value;
}


CatalogsFeedProcessingSchedule CatalogsFeed::getPreferredProcessingSchedule() const
{
    return m_Preferred_processing_schedule;
}

void CatalogsFeed::setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule value)
{
    m_Preferred_processing_schedule = value;
}


CatalogsStatus CatalogsFeed::getStatus() const
{
    return m_Status;
}

void CatalogsFeed::setStatus(CatalogsStatus value)
{
    m_Status = value;
}


NullableCurrency CatalogsFeed::getDefaultCurrency() const
{
    return m_Default_currency;
}

void CatalogsFeed::setDefaultCurrency(NullableCurrency value)
{
    m_Default_currency = value;
}


std::string CatalogsFeed::getDefaultLocale() const
{
    return m_Default_locale;
}

void CatalogsFeed::setDefaultLocale(std::string value)
{
    m_Default_locale = value;
}


Country CatalogsFeed::getDefaultCountry() const
{
    return m_Default_country;
}

void CatalogsFeed::setDefaultCountry(Country value)
{
    m_Default_country = value;
}


ProductAvailabilityType CatalogsFeed::getDefaultAvailability() const
{
    return m_Default_availability;
}

void CatalogsFeed::setDefaultAvailability(ProductAvailabilityType value)
{
    m_Default_availability = value;
}


std::string CatalogsFeed::getCatalogId() const
{
    return m_Catalog_id;
}

void CatalogsFeed::setCatalogId(std::string value)
{
    m_Catalog_id = value;
}



std::vector<CatalogsFeed> createCatalogsFeedVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CatalogsFeed>();
    for (const auto& child: pt) {
        vec.emplace_back(CatalogsFeed(child.second));
    }

    return vec;
}

}
}
}
}

