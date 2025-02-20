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



#include "AdAccountCreateSubscriptionRequest.h"

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

AdAccountCreateSubscriptionRequest::AdAccountCreateSubscriptionRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string AdAccountCreateSubscriptionRequest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void AdAccountCreateSubscriptionRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree AdAccountCreateSubscriptionRequest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("webhook_url", m_Webhook_url);
	pt.put("lead_form_id", m_Lead_form_id);
	pt.put("partner_access_token", m_Partner_access_token);
	pt.put("partner_refresh_token", m_Partner_refresh_token);
	pt.add_child("partner_metadata", m_Partner_metadata.toPropertyTree());
	return pt;
}

void AdAccountCreateSubscriptionRequest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Webhook_url = pt.get("webhook_url", "");
	m_Lead_form_id = pt.get("lead_form_id", "");
	m_Partner_access_token = pt.get("partner_access_token", "");
	m_Partner_refresh_token = pt.get("partner_refresh_token", "");
	if (pt.get_child_optional("partner_metadata")) {
        m_Partner_metadata = fromPt<AdAccountCreateSubscriptionRequest_partner_metadata>(pt.get_child("partner_metadata"));
	}
}

std::string AdAccountCreateSubscriptionRequest::getWebhookUrl() const
{
    return m_Webhook_url;
}

void AdAccountCreateSubscriptionRequest::setWebhookUrl(std::string value)
{
    m_Webhook_url = value;
}


std::string AdAccountCreateSubscriptionRequest::getLeadFormId() const
{
    return m_Lead_form_id;
}

void AdAccountCreateSubscriptionRequest::setLeadFormId(std::string value)
{
    m_Lead_form_id = value;
}


std::string AdAccountCreateSubscriptionRequest::getPartnerAccessToken() const
{
    return m_Partner_access_token;
}

void AdAccountCreateSubscriptionRequest::setPartnerAccessToken(std::string value)
{
    m_Partner_access_token = value;
}


std::string AdAccountCreateSubscriptionRequest::getPartnerRefreshToken() const
{
    return m_Partner_refresh_token;
}

void AdAccountCreateSubscriptionRequest::setPartnerRefreshToken(std::string value)
{
    m_Partner_refresh_token = value;
}


AdAccountCreateSubscriptionRequest_partner_metadata AdAccountCreateSubscriptionRequest::getPartnerMetadata() const
{
    return m_Partner_metadata;
}

void AdAccountCreateSubscriptionRequest::setPartnerMetadata(AdAccountCreateSubscriptionRequest_partner_metadata value)
{
    m_Partner_metadata = value;
}



std::vector<AdAccountCreateSubscriptionRequest> createAdAccountCreateSubscriptionRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<AdAccountCreateSubscriptionRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(AdAccountCreateSubscriptionRequest(child.second));
    }

    return vec;
}

}
}
}
}

