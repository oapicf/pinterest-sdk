/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "OauthAccessTokenResponseRefresh.h"

#include <string>
#include <vector>
#include <sstream>
#include <stdexcept>
#include <algorithm>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

OauthAccessTokenResponseRefresh::OauthAccessTokenResponseRefresh(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string OauthAccessTokenResponseRefresh::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void OauthAccessTokenResponseRefresh::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree OauthAccessTokenResponseRefresh::toPropertyTree()
{
    return toPropertyTree_internal();
}

void OauthAccessTokenResponseRefresh::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string OauthAccessTokenResponseRefresh::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void OauthAccessTokenResponseRefresh::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree OauthAccessTokenResponseRefresh::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("response_type", m_Response_type);
	pt.put("access_token", m_Access_token);
	pt.put("token_type", m_Token_type);
	pt.put("expires_in", m_Expires_in);
	pt.put("scope", m_Scope);
	return pt;
}

void OauthAccessTokenResponseRefresh::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	setResponseType(pt.get("response_type", ""));
	m_Access_token = pt.get("access_token", "");
	m_Token_type = pt.get("token_type", "bearer");
	m_Expires_in = pt.get("expires_in", 0);
	m_Scope = pt.get("scope", "");
}

std::string OauthAccessTokenResponseRefresh::getResponseType() const
{
    return m_Response_type;
}

void OauthAccessTokenResponseRefresh::setResponseType(std::string value)
{
	if (std::find(m_Response_typeEnum.begin(), m_Response_typeEnum.end(), value) != m_Response_typeEnum.end()) {
		m_Response_type = value;
	} else {
		throw std::runtime_error("Value " + value + " not allowed");
	}
}
std::string OauthAccessTokenResponseRefresh::getAccessToken() const
{
    return m_Access_token;
}

void OauthAccessTokenResponseRefresh::setAccessToken(std::string value)
{
	m_Access_token = value;
}
std::string OauthAccessTokenResponseRefresh::getTokenType() const
{
    return m_Token_type;
}

void OauthAccessTokenResponseRefresh::setTokenType(std::string value)
{
	m_Token_type = value;
}
int32_t OauthAccessTokenResponseRefresh::getExpiresIn() const
{
    return m_Expires_in;
}

void OauthAccessTokenResponseRefresh::setExpiresIn(int32_t value)
{
	m_Expires_in = value;
}
std::string OauthAccessTokenResponseRefresh::getScope() const
{
    return m_Scope;
}

void OauthAccessTokenResponseRefresh::setScope(std::string value)
{
	m_Scope = value;
}

std::vector<OauthAccessTokenResponseRefresh> createOauthAccessTokenResponseRefreshVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<OauthAccessTokenResponseRefresh>();
    for (const auto& child: pt) {
        vec.emplace_back(OauthAccessTokenResponseRefresh(child.second));
    }

    return vec;
}

}
}
}
}
