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



#include "UserWebsiteVerifyRequest.h"

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

UserWebsiteVerifyRequest::UserWebsiteVerifyRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string UserWebsiteVerifyRequest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void UserWebsiteVerifyRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree UserWebsiteVerifyRequest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("website", m_Website);
	pt.put("verification_method", m_Verification_method);
	return pt;
}

void UserWebsiteVerifyRequest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Website = pt.get("website", "");
	setVerificationMethod(pt.get("verification_method", "METATAG"));
}

std::string UserWebsiteVerifyRequest::getWebsite() const
{
    return m_Website;
}

void UserWebsiteVerifyRequest::setWebsite(std::string value)
{
    m_Website = value;
}


std::string UserWebsiteVerifyRequest::getVerificationMethod() const
{
    return m_Verification_method;
}

void UserWebsiteVerifyRequest::setVerificationMethod(std::string value)
{
    static const std::array<std::string, 3> allowedValues = {
        "FILENAME", "METATAG", "DNSTXT"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Verification_method = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}



std::vector<UserWebsiteVerifyRequest> createUserWebsiteVerifyRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<UserWebsiteVerifyRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(UserWebsiteVerifyRequest(child.second));
    }

    return vec;
}

}
}
}
}

