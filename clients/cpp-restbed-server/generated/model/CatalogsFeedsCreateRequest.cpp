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



#include "CatalogsFeedsCreateRequest.h"

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

CatalogsFeedsCreateRequest::CatalogsFeedsCreateRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CatalogsFeedsCreateRequest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CatalogsFeedsCreateRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CatalogsFeedsCreateRequest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("name", m_Name);
	pt.add_child("default_locale", m_Default_locale.toPropertyTree());
	pt.add_child("credentials", m_Credentials.toPropertyTree());
	pt.put("location", m_Location);
	pt.add_child("preferred_processing_schedule", m_Preferred_processing_schedule.toPropertyTree());
	pt.put("status", m_Status);
	pt.add_child("status", m_Status.toPropertyTree());
	return pt;
}

void CatalogsFeedsCreateRequest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Name = pt.get("name", "");
	if (pt.get_child_optional("default_locale")) {
        m_Default_locale = fromPt<CatalogsFeedsCreateRequest_default_locale>(pt.get_child("default_locale"));
	}
	if (pt.get_child_optional("credentials")) {
        m_Credentials = fromPt<CatalogsFeedCredentials>(pt.get_child("credentials"));
	}
	m_Location = pt.get("location", "");
	if (pt.get_child_optional("preferred_processing_schedule")) {
        m_Preferred_processing_schedule = fromPt<CatalogsFeedProcessingSchedule>(pt.get_child("preferred_processing_schedule"));
	}
	m_Status = pt.get("status", "");
	if (pt.get_child_optional("status")) {
        m_Status = fromPt<CatalogsStatus>(pt.get_child("status"));
	}
}

NullableCurrency CatalogsFeedsCreateRequest::getDefaultCurrency() const
{
    return m_Default_currency;
}

void CatalogsFeedsCreateRequest::setDefaultCurrency(NullableCurrency value)
{
    m_Default_currency = value;
}


std::string CatalogsFeedsCreateRequest::getName() const
{
    return m_Name;
}

void CatalogsFeedsCreateRequest::setName(std::string value)
{
    m_Name = value;
}


CatalogsFormat CatalogsFeedsCreateRequest::getFormat() const
{
    return m_Format;
}

void CatalogsFeedsCreateRequest::setFormat(CatalogsFormat value)
{
    m_Format = value;
}


CatalogsFeedsCreateRequest_default_locale CatalogsFeedsCreateRequest::getDefaultLocale() const
{
    return m_Default_locale;
}

void CatalogsFeedsCreateRequest::setDefaultLocale(CatalogsFeedsCreateRequest_default_locale value)
{
    m_Default_locale = value;
}


CatalogsFeedCredentials CatalogsFeedsCreateRequest::getCredentials() const
{
    return m_Credentials;
}

void CatalogsFeedsCreateRequest::setCredentials(CatalogsFeedCredentials value)
{
    m_Credentials = value;
}


std::string CatalogsFeedsCreateRequest::getLocation() const
{
    return m_Location;
}

void CatalogsFeedsCreateRequest::setLocation(std::string value)
{
    m_Location = value;
}


CatalogsFeedProcessingSchedule CatalogsFeedsCreateRequest::getPreferredProcessingSchedule() const
{
    return m_Preferred_processing_schedule;
}

void CatalogsFeedsCreateRequest::setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule value)
{
    m_Preferred_processing_schedule = value;
}


Country CatalogsFeedsCreateRequest::getDefaultCountry() const
{
    return m_Default_country;
}

void CatalogsFeedsCreateRequest::setDefaultCountry(Country value)
{
    m_Default_country = value;
}


ProductAvailabilityType CatalogsFeedsCreateRequest::getDefaultAvailability() const
{
    return m_Default_availability;
}

void CatalogsFeedsCreateRequest::setDefaultAvailability(ProductAvailabilityType value)
{
    m_Default_availability = value;
}


CatalogsStatus CatalogsFeedsCreateRequest::getStatus() const
{
    return m_Status;
}

void CatalogsFeedsCreateRequest::setStatus(CatalogsStatus value)
{
    m_Status = value;
}



std::vector<CatalogsFeedsCreateRequest> createCatalogsFeedsCreateRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CatalogsFeedsCreateRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(CatalogsFeedsCreateRequest(child.second));
    }

    return vec;
}

}
}
}
}

