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



#include "CatalogsRetailProductMetadata.h"

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

CatalogsRetailProductMetadata::CatalogsRetailProductMetadata(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CatalogsRetailProductMetadata::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CatalogsRetailProductMetadata::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CatalogsRetailProductMetadata::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("item_id", m_Item_id);
	pt.put("item_group_id", m_Item_group_id);
	pt.put("price", m_Price);
	pt.put("sale_price", m_Sale_price);
	return pt;
}

void CatalogsRetailProductMetadata::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Item_id = pt.get("item_id", "");
	m_Item_group_id = pt.get("item_group_id", "");
	m_Price = pt.get("price", 0.0);
	m_Sale_price = pt.get("sale_price", 0.0);
}

std::string CatalogsRetailProductMetadata::getItemId() const
{
    return m_Item_id;
}

void CatalogsRetailProductMetadata::setItemId(std::string value)
{
    m_Item_id = value;
}


std::string CatalogsRetailProductMetadata::getItemGroupId() const
{
    return m_Item_group_id;
}

void CatalogsRetailProductMetadata::setItemGroupId(std::string value)
{
    m_Item_group_id = value;
}


NonNullableProductAvailabilityType CatalogsRetailProductMetadata::getAvailability() const
{
    return m_Availability;
}

void CatalogsRetailProductMetadata::setAvailability(NonNullableProductAvailabilityType value)
{
    m_Availability = value;
}


double CatalogsRetailProductMetadata::getPrice() const
{
    return m_Price;
}

void CatalogsRetailProductMetadata::setPrice(double value)
{
    m_Price = value;
}


double CatalogsRetailProductMetadata::getSalePrice() const
{
    return m_Sale_price;
}

void CatalogsRetailProductMetadata::setSalePrice(double value)
{
    m_Sale_price = value;
}


NonNullableCatalogsCurrency CatalogsRetailProductMetadata::getCurrency() const
{
    return m_Currency;
}

void CatalogsRetailProductMetadata::setCurrency(NonNullableCatalogsCurrency value)
{
    m_Currency = value;
}



std::vector<CatalogsRetailProductMetadata> createCatalogsRetailProductMetadataVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CatalogsRetailProductMetadata>();
    for (const auto& child: pt) {
        vec.emplace_back(CatalogsRetailProductMetadata(child.second));
    }

    return vec;
}

}
}
}
}

