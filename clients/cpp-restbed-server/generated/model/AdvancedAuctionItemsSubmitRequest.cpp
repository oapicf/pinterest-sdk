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



#include "AdvancedAuctionItemsSubmitRequest.h"

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

AdvancedAuctionItemsSubmitRequest::AdvancedAuctionItemsSubmitRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string AdvancedAuctionItemsSubmitRequest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void AdvancedAuctionItemsSubmitRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree AdvancedAuctionItemsSubmitRequest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("catalog_id", m_Catalog_id);
	// generate tree for Items
    tmp_node.clear();
	if (!m_Items.empty()) {
        tmp_node = toPt(m_Items);
		pt.add_child("items", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void AdvancedAuctionItemsSubmitRequest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Catalog_id = pt.get("catalog_id", "");
	// push all items of Items into member
	if (pt.get_child_optional("items")) {
        m_Items = fromPt<std::vector<AdvancedAuctionItemsSubmitRecord>>(pt.get_child("items"));
	}
}

std::string AdvancedAuctionItemsSubmitRequest::getCatalogId() const
{
    return m_Catalog_id;
}

void AdvancedAuctionItemsSubmitRequest::setCatalogId(std::string value)
{
    m_Catalog_id = value;
}


std::vector<AdvancedAuctionItemsSubmitRecord> AdvancedAuctionItemsSubmitRequest::getItems() const
{
    return m_Items;
}

void AdvancedAuctionItemsSubmitRequest::setItems(std::vector<AdvancedAuctionItemsSubmitRecord> value)
{
    m_Items = value;
}



std::vector<AdvancedAuctionItemsSubmitRequest> createAdvancedAuctionItemsSubmitRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<AdvancedAuctionItemsSubmitRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(AdvancedAuctionItemsSubmitRequest(child.second));
    }

    return vec;
}

}
}
}
}

