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



#include "AdvancedAuctionItemsSubmitUpsertRecord.h"

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

AdvancedAuctionItemsSubmitUpsertRecord::AdvancedAuctionItemsSubmitUpsertRecord(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string AdvancedAuctionItemsSubmitUpsertRecord::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void AdvancedAuctionItemsSubmitUpsertRecord::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree AdvancedAuctionItemsSubmitUpsertRecord::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("item_id", m_Item_id);
	pt.add_child("bid_options", m_Bid_options.toPropertyTree());
	// generate tree for Update_mask
    tmp_node.clear();
	if (!m_Update_mask.empty()) {
        tmp_node = toPt(m_Update_mask);
		pt.add_child("update_mask", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void AdvancedAuctionItemsSubmitUpsertRecord::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Item_id = pt.get("item_id", "");
	if (pt.get_child_optional("bid_options")) {
        m_Bid_options = fromPt<AdvancedAuctionBidOptions>(pt.get_child("bid_options"));
	}
	// push all items of Update_mask into member
	if (pt.get_child_optional("update_mask")) {
        m_Update_mask = fromPt<std::vector<UpdateMaskBidOptionField>>(pt.get_child("update_mask"));
	}
}

std::string AdvancedAuctionItemsSubmitUpsertRecord::getItemId() const
{
    return m_Item_id;
}

void AdvancedAuctionItemsSubmitUpsertRecord::setItemId(std::string value)
{
    m_Item_id = value;
}


Country AdvancedAuctionItemsSubmitUpsertRecord::getCountry() const
{
    return m_Country;
}

void AdvancedAuctionItemsSubmitUpsertRecord::setCountry(Country value)
{
    m_Country = value;
}


Language AdvancedAuctionItemsSubmitUpsertRecord::getLanguage() const
{
    return m_Language;
}

void AdvancedAuctionItemsSubmitUpsertRecord::setLanguage(Language value)
{
    m_Language = value;
}


AdvancedAuctionBidOptions AdvancedAuctionItemsSubmitUpsertRecord::getBidOptions() const
{
    return m_Bid_options;
}

void AdvancedAuctionItemsSubmitUpsertRecord::setBidOptions(AdvancedAuctionBidOptions value)
{
    m_Bid_options = value;
}


std::vector<UpdateMaskBidOptionField> AdvancedAuctionItemsSubmitUpsertRecord::getUpdateMask() const
{
    return m_Update_mask;
}

void AdvancedAuctionItemsSubmitUpsertRecord::setUpdateMask(std::vector<UpdateMaskBidOptionField> value)
{
    m_Update_mask = value;
}



std::vector<AdvancedAuctionItemsSubmitUpsertRecord> createAdvancedAuctionItemsSubmitUpsertRecordVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<AdvancedAuctionItemsSubmitUpsertRecord>();
    for (const auto& child: pt) {
        vec.emplace_back(AdvancedAuctionItemsSubmitUpsertRecord(child.second));
    }

    return vec;
}

}
}
}
}

