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



#include "Keyword.h"

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

Keyword::Keyword(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string Keyword::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void Keyword::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Keyword::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("bid", m_Bid);
	pt.put("value", m_Value);
	pt.put("archived", m_Archived);
	pt.put("id", m_Id);
	pt.put("parent_id", m_Parent_id);
	pt.put("parent_type", m_Parent_type);
	pt.put("type", m_Type);
	return pt;
}

void Keyword::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Bid = pt.get("bid", 0);
	m_Value = pt.get("value", "");
	m_Archived = pt.get("archived", false);
	m_Id = pt.get("id", "");
	m_Parent_id = pt.get("parent_id", "");
	m_Parent_type = pt.get("parent_type", "");
	m_Type = pt.get("type", "");
}

int32_t Keyword::getBid() const
{
    return m_Bid;
}

void Keyword::setBid(int32_t value)
{
    m_Bid = value;
}


MatchTypeResponse Keyword::getMatchType() const
{
    return m_Match_type;
}

void Keyword::setMatchType(MatchTypeResponse value)
{
    m_Match_type = value;
}


std::string Keyword::getValue() const
{
    return m_Value;
}

void Keyword::setValue(std::string value)
{
    m_Value = value;
}


bool Keyword::isArchived() const
{
    return m_Archived;
}

void Keyword::setArchived(bool value)
{
    m_Archived = value;
}


std::string Keyword::getId() const
{
    return m_Id;
}

void Keyword::setId(std::string value)
{
    m_Id = value;
}


std::string Keyword::getParentId() const
{
    return m_Parent_id;
}

void Keyword::setParentId(std::string value)
{
    m_Parent_id = value;
}


std::string Keyword::getParentType() const
{
    return m_Parent_type;
}

void Keyword::setParentType(std::string value)
{
    m_Parent_type = value;
}


std::string Keyword::getType() const
{
    return m_Type;
}

void Keyword::setType(std::string value)
{
    m_Type = value;
}



std::vector<Keyword> createKeywordVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<Keyword>();
    for (const auto& child: pt) {
        vec.emplace_back(Keyword(child.second));
    }

    return vec;
}

}
}
}
}

