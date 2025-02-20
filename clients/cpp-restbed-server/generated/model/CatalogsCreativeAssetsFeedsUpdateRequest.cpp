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



#include "CatalogsCreativeAssetsFeedsUpdateRequest.h"

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

CatalogsCreativeAssetsFeedsUpdateRequest::CatalogsCreativeAssetsFeedsUpdateRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CatalogsCreativeAssetsFeedsUpdateRequest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CatalogsCreativeAssetsFeedsUpdateRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CatalogsCreativeAssetsFeedsUpdateRequest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("name", m_Name);
	pt.add_child("credentials", m_Credentials.toPropertyTree());
	pt.put("location", m_Location);
	pt.add_child("preferred_processing_schedule", m_Preferred_processing_schedule.toPropertyTree());
	return pt;
}

void CatalogsCreativeAssetsFeedsUpdateRequest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Name = pt.get("name", "");
	if (pt.get_child_optional("credentials")) {
        m_Credentials = fromPt<CatalogsFeedCredentials>(pt.get_child("credentials"));
	}
	m_Location = pt.get("location", "");
	if (pt.get_child_optional("preferred_processing_schedule")) {
        m_Preferred_processing_schedule = fromPt<CatalogsFeedProcessingSchedule>(pt.get_child("preferred_processing_schedule"));
	}
}

NullableCurrency CatalogsCreativeAssetsFeedsUpdateRequest::getDefaultCurrency() const
{
    return m_Default_currency;
}

void CatalogsCreativeAssetsFeedsUpdateRequest::setDefaultCurrency(NullableCurrency value)
{
    m_Default_currency = value;
}


std::string CatalogsCreativeAssetsFeedsUpdateRequest::getName() const
{
    return m_Name;
}

void CatalogsCreativeAssetsFeedsUpdateRequest::setName(std::string value)
{
    m_Name = value;
}


CatalogsFormat CatalogsCreativeAssetsFeedsUpdateRequest::getFormat() const
{
    return m_Format;
}

void CatalogsCreativeAssetsFeedsUpdateRequest::setFormat(CatalogsFormat value)
{
    m_Format = value;
}


CatalogsFeedCredentials CatalogsCreativeAssetsFeedsUpdateRequest::getCredentials() const
{
    return m_Credentials;
}

void CatalogsCreativeAssetsFeedsUpdateRequest::setCredentials(CatalogsFeedCredentials value)
{
    m_Credentials = value;
}


std::string CatalogsCreativeAssetsFeedsUpdateRequest::getLocation() const
{
    return m_Location;
}

void CatalogsCreativeAssetsFeedsUpdateRequest::setLocation(std::string value)
{
    m_Location = value;
}


CatalogsFeedProcessingSchedule CatalogsCreativeAssetsFeedsUpdateRequest::getPreferredProcessingSchedule() const
{
    return m_Preferred_processing_schedule;
}

void CatalogsCreativeAssetsFeedsUpdateRequest::setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule value)
{
    m_Preferred_processing_schedule = value;
}


CatalogsStatus CatalogsCreativeAssetsFeedsUpdateRequest::getStatus() const
{
    return m_Status;
}

void CatalogsCreativeAssetsFeedsUpdateRequest::setStatus(CatalogsStatus value)
{
    m_Status = value;
}


CatalogsType CatalogsCreativeAssetsFeedsUpdateRequest::getCatalogType() const
{
    return m_Catalog_type;
}

void CatalogsCreativeAssetsFeedsUpdateRequest::setCatalogType(CatalogsType value)
{
    m_Catalog_type = value;
}



std::vector<CatalogsCreativeAssetsFeedsUpdateRequest> createCatalogsCreativeAssetsFeedsUpdateRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CatalogsCreativeAssetsFeedsUpdateRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(CatalogsCreativeAssetsFeedsUpdateRequest(child.second));
    }

    return vec;
}

}
}
}
}

