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



#include "AdAccountGetSubscriptionResponse.h"

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

AdAccountGetSubscriptionResponse::AdAccountGetSubscriptionResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string AdAccountGetSubscriptionResponse::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void AdAccountGetSubscriptionResponse::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree AdAccountGetSubscriptionResponse::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("lead_form_id", m_Lead_form_id);
	pt.put("webhook_url", m_Webhook_url);
	pt.put("id", m_Id);
	pt.put("user_account_id", m_User_account_id);
	pt.put("ad_account_id", m_Ad_account_id);
	pt.put("api_version", m_Api_version);
	pt.put("cryptographic_key", m_Cryptographic_key);
	pt.put("cryptographic_algorithm", m_Cryptographic_algorithm);
	pt.put("created_time", m_Created_time);
	return pt;
}

void AdAccountGetSubscriptionResponse::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Lead_form_id = pt.get("lead_form_id", "");
	m_Webhook_url = pt.get("webhook_url", "");
	m_Id = pt.get("id", "");
	m_User_account_id = pt.get("user_account_id", "");
	m_Ad_account_id = pt.get("ad_account_id", "");
	m_Api_version = pt.get("api_version", "");
	m_Cryptographic_key = pt.get("cryptographic_key", "");
	m_Cryptographic_algorithm = pt.get("cryptographic_algorithm", "");
	m_Created_time = pt.get("created_time", 0);
}

std::string AdAccountGetSubscriptionResponse::getLeadFormId() const
{
    return m_Lead_form_id;
}

void AdAccountGetSubscriptionResponse::setLeadFormId(std::string value)
{
    m_Lead_form_id = value;
}


std::string AdAccountGetSubscriptionResponse::getWebhookUrl() const
{
    return m_Webhook_url;
}

void AdAccountGetSubscriptionResponse::setWebhookUrl(std::string value)
{
    m_Webhook_url = value;
}


std::string AdAccountGetSubscriptionResponse::getId() const
{
    return m_Id;
}

void AdAccountGetSubscriptionResponse::setId(std::string value)
{
    m_Id = value;
}


std::string AdAccountGetSubscriptionResponse::getUserAccountId() const
{
    return m_User_account_id;
}

void AdAccountGetSubscriptionResponse::setUserAccountId(std::string value)
{
    m_User_account_id = value;
}


std::string AdAccountGetSubscriptionResponse::getAdAccountId() const
{
    return m_Ad_account_id;
}

void AdAccountGetSubscriptionResponse::setAdAccountId(std::string value)
{
    m_Ad_account_id = value;
}


std::string AdAccountGetSubscriptionResponse::getApiVersion() const
{
    return m_Api_version;
}

void AdAccountGetSubscriptionResponse::setApiVersion(std::string value)
{
    m_Api_version = value;
}


std::string AdAccountGetSubscriptionResponse::getCryptographicKey() const
{
    return m_Cryptographic_key;
}

void AdAccountGetSubscriptionResponse::setCryptographicKey(std::string value)
{
    m_Cryptographic_key = value;
}


std::string AdAccountGetSubscriptionResponse::getCryptographicAlgorithm() const
{
    return m_Cryptographic_algorithm;
}

void AdAccountGetSubscriptionResponse::setCryptographicAlgorithm(std::string value)
{
    m_Cryptographic_algorithm = value;
}


int32_t AdAccountGetSubscriptionResponse::getCreatedTime() const
{
    return m_Created_time;
}

void AdAccountGetSubscriptionResponse::setCreatedTime(int32_t value)
{
    m_Created_time = value;
}



std::vector<AdAccountGetSubscriptionResponse> createAdAccountGetSubscriptionResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<AdAccountGetSubscriptionResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(AdAccountGetSubscriptionResponse(child.second));
    }

    return vec;
}

}
}
}
}

