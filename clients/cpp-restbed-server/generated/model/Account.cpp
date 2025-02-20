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



#include "Account.h"

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

Account::Account(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string Account::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void Account::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Account::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("account_type", m_Account_type);
	pt.put("id", m_Id);
	pt.put("profile_image", m_Profile_image);
	pt.put("website_url", m_Website_url);
	pt.put("username", m_Username);
	pt.put("about", m_About);
	pt.put("business_name", m_Business_name);
	pt.put("board_count", m_Board_count);
	pt.put("pin_count", m_Pin_count);
	pt.put("follower_count", m_Follower_count);
	pt.put("following_count", m_Following_count);
	pt.put("monthly_views", m_Monthly_views);
	return pt;
}

void Account::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	setAccountType(pt.get("account_type", ""));
	m_Id = pt.get("id", "");
	m_Profile_image = pt.get("profile_image", "");
	m_Website_url = pt.get("website_url", "");
	m_Username = pt.get("username", "");
	m_About = pt.get("about", "");
	m_Business_name = pt.get("business_name", "");
	m_Board_count = pt.get("board_count", 0);
	m_Pin_count = pt.get("pin_count", 0);
	m_Follower_count = pt.get("follower_count", 0);
	m_Following_count = pt.get("following_count", 0);
	m_Monthly_views = pt.get("monthly_views", 0);
}

std::string Account::getAccountType() const
{
    return m_Account_type;
}

void Account::setAccountType(std::string value)
{
    static const std::array<std::string, 2> allowedValues = {
        "PINNER", "BUSINESS"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Account_type = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


std::string Account::getId() const
{
    return m_Id;
}

void Account::setId(std::string value)
{
    m_Id = value;
}


std::string Account::getProfileImage() const
{
    return m_Profile_image;
}

void Account::setProfileImage(std::string value)
{
    m_Profile_image = value;
}


std::string Account::getWebsiteUrl() const
{
    return m_Website_url;
}

void Account::setWebsiteUrl(std::string value)
{
    m_Website_url = value;
}


std::string Account::getUsername() const
{
    return m_Username;
}

void Account::setUsername(std::string value)
{
    m_Username = value;
}


std::string Account::getAbout() const
{
    return m_About;
}

void Account::setAbout(std::string value)
{
    m_About = value;
}


std::string Account::getBusinessName() const
{
    return m_Business_name;
}

void Account::setBusinessName(std::string value)
{
    m_Business_name = value;
}


int32_t Account::getBoardCount() const
{
    return m_Board_count;
}

void Account::setBoardCount(int32_t value)
{
    m_Board_count = value;
}


int32_t Account::getPinCount() const
{
    return m_Pin_count;
}

void Account::setPinCount(int32_t value)
{
    m_Pin_count = value;
}


int32_t Account::getFollowerCount() const
{
    return m_Follower_count;
}

void Account::setFollowerCount(int32_t value)
{
    m_Follower_count = value;
}


int32_t Account::getFollowingCount() const
{
    return m_Following_count;
}

void Account::setFollowingCount(int32_t value)
{
    m_Following_count = value;
}


int32_t Account::getMonthlyViews() const
{
    return m_Monthly_views;
}

void Account::setMonthlyViews(int32_t value)
{
    m_Monthly_views = value;
}



std::vector<Account> createAccountVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<Account>();
    for (const auto& child: pt) {
        vec.emplace_back(Account(child.second));
    }

    return vec;
}

}
}
}
}

