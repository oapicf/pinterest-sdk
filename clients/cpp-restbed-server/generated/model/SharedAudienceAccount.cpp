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



#include "SharedAudienceAccount.h"

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

SharedAudienceAccount::SharedAudienceAccount(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string SharedAudienceAccount::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void SharedAudienceAccount::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree SharedAudienceAccount::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("account_id", m_Account_id);
	pt.put("account_name", m_Account_name);
	pt.put("account_type", m_Account_type);
	pt.put("shared_on_timestamp", m_Shared_on_timestamp);
	return pt;
}

void SharedAudienceAccount::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Account_id = pt.get("account_id", "");
	m_Account_name = pt.get("account_name", "");
	setAccountType(pt.get("account_type", ""));
	m_Shared_on_timestamp = pt.get("shared_on_timestamp", 0);
}

std::string SharedAudienceAccount::getAccountId() const
{
    return m_Account_id;
}

void SharedAudienceAccount::setAccountId(std::string value)
{
    m_Account_id = value;
}


std::string SharedAudienceAccount::getAccountName() const
{
    return m_Account_name;
}

void SharedAudienceAccount::setAccountName(std::string value)
{
    m_Account_name = value;
}


std::string SharedAudienceAccount::getAccountType() const
{
    return m_Account_type;
}

void SharedAudienceAccount::setAccountType(std::string value)
{
    static const std::array<std::string, 2> allowedValues = {
        "AD_ACCOUNT", "BUSINESS_ACCOUNT"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Account_type = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


int32_t SharedAudienceAccount::getSharedOnTimestamp() const
{
    return m_Shared_on_timestamp;
}

void SharedAudienceAccount::setSharedOnTimestamp(int32_t value)
{
    m_Shared_on_timestamp = value;
}



std::vector<SharedAudienceAccount> createSharedAudienceAccountVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<SharedAudienceAccount>();
    for (const auto& child: pt) {
        vec.emplace_back(SharedAudienceAccount(child.second));
    }

    return vec;
}

}
}
}
}

