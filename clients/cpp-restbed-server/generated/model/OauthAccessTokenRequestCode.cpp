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



#include "OauthAccessTokenRequestCode.h"

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

OauthAccessTokenRequestCode::OauthAccessTokenRequestCode(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string OauthAccessTokenRequestCode::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void OauthAccessTokenRequestCode::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree OauthAccessTokenRequestCode::toPropertyTree()
{
    return toPropertyTree_internal();
}

void OauthAccessTokenRequestCode::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string OauthAccessTokenRequestCode::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void OauthAccessTokenRequestCode::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree OauthAccessTokenRequestCode::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("grant_type", m_Grant_type);
	pt.put("code", m_Code);
	pt.put("redirect_uri", m_Redirect_uri);
	return pt;
}

void OauthAccessTokenRequestCode::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	setGrantType(pt.get("grant_type", ""));
	m_Code = pt.get("code", "");
	m_Redirect_uri = pt.get("redirect_uri", "");
}

std::string OauthAccessTokenRequestCode::getGrantType() const
{
    return m_Grant_type;
}

void OauthAccessTokenRequestCode::setGrantType(std::string value)
{
	if (std::find(m_Grant_typeEnum.begin(), m_Grant_typeEnum.end(), value) != m_Grant_typeEnum.end()) {
		m_Grant_type = value;
	} else {
		throw std::runtime_error("Value " + value + " not allowed");
	}
}
std::string OauthAccessTokenRequestCode::getCode() const
{
    return m_Code;
}

void OauthAccessTokenRequestCode::setCode(std::string value)
{
	m_Code = value;
}
std::string OauthAccessTokenRequestCode::getRedirectUri() const
{
    return m_Redirect_uri;
}

void OauthAccessTokenRequestCode::setRedirectUri(std::string value)
{
	m_Redirect_uri = value;
}

std::vector<OauthAccessTokenRequestCode> createOauthAccessTokenRequestCodeVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<OauthAccessTokenRequestCode>();
    for (const auto& child: pt) {
        vec.emplace_back(OauthAccessTokenRequestCode(child.second));
    }

    return vec;
}

}
}
}
}
