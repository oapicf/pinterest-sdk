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



#include "UserBusinessRoleBinding.h"

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

UserBusinessRoleBinding::UserBusinessRoleBinding(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string UserBusinessRoleBinding::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void UserBusinessRoleBinding::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree UserBusinessRoleBinding::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.add_child("assets_summary", m_Assets_summary.toPropertyTree());
	// generate tree for Business_roles
    tmp_node.clear();
	if (!m_Business_roles.empty()) {
        tmp_node = toPt(m_Business_roles);
		pt.add_child("business_roles", tmp_node);
		tmp_node.clear();
	}
	pt.add_child("created_by_business", m_Created_by_business.toPropertyTree());
	pt.add_child("created_by_user", m_Created_by_user.toPropertyTree());
	pt.put("created_time", m_Created_time);
	pt.put("id", m_Id);
	pt.put("is_shared_partner", m_Is_shared_partner);
	pt.add_child("user", m_User.toPropertyTree());
	return pt;
}

void UserBusinessRoleBinding::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("assets_summary")) {
        m_Assets_summary = fromPt<BusinessMemberAssetsSummary>(pt.get_child("assets_summary"));
	}
	// push all items of Business_roles into member
	if (pt.get_child_optional("business_roles")) {
        m_Business_roles = fromPt<std::vector<std::string>>(pt.get_child("business_roles"));
	}
	if (pt.get_child_optional("created_by_business")) {
        m_Created_by_business = fromPt<BusinessAccessUserSummary>(pt.get_child("created_by_business"));
	}
	if (pt.get_child_optional("created_by_user")) {
        m_Created_by_user = fromPt<BusinessAccessUserSummary>(pt.get_child("created_by_user"));
	}
	m_Created_time = pt.get("created_time", 0);
	m_Id = pt.get("id", "");
	m_Is_shared_partner = pt.get("is_shared_partner", false);
	if (pt.get_child_optional("user")) {
        m_User = fromPt<BusinessAccessUserSummary>(pt.get_child("user"));
	}
}

BusinessMemberAssetsSummary UserBusinessRoleBinding::getAssetsSummary() const
{
    return m_Assets_summary;
}

void UserBusinessRoleBinding::setAssetsSummary(BusinessMemberAssetsSummary value)
{
    m_Assets_summary = value;
}


std::vector<std::string> UserBusinessRoleBinding::getBusinessRoles() const
{
    return m_Business_roles;
}

void UserBusinessRoleBinding::setBusinessRoles(std::vector<std::string> value)
{
    m_Business_roles = value;
}


BusinessAccessUserSummary UserBusinessRoleBinding::getCreatedByBusiness() const
{
    return m_Created_by_business;
}

void UserBusinessRoleBinding::setCreatedByBusiness(BusinessAccessUserSummary value)
{
    m_Created_by_business = value;
}


BusinessAccessUserSummary UserBusinessRoleBinding::getCreatedByUser() const
{
    return m_Created_by_user;
}

void UserBusinessRoleBinding::setCreatedByUser(BusinessAccessUserSummary value)
{
    m_Created_by_user = value;
}


int32_t UserBusinessRoleBinding::getCreatedTime() const
{
    return m_Created_time;
}

void UserBusinessRoleBinding::setCreatedTime(int32_t value)
{
    m_Created_time = value;
}


std::string UserBusinessRoleBinding::getId() const
{
    return m_Id;
}

void UserBusinessRoleBinding::setId(std::string value)
{
    m_Id = value;
}


bool UserBusinessRoleBinding::isIsSharedPartner() const
{
    return m_Is_shared_partner;
}

void UserBusinessRoleBinding::setIsSharedPartner(bool value)
{
    m_Is_shared_partner = value;
}


BusinessAccessUserSummary UserBusinessRoleBinding::getUser() const
{
    return m_User;
}

void UserBusinessRoleBinding::setUser(BusinessAccessUserSummary value)
{
    m_User = value;
}



std::vector<UserBusinessRoleBinding> createUserBusinessRoleBindingVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<UserBusinessRoleBinding>();
    for (const auto& child: pt) {
        vec.emplace_back(UserBusinessRoleBinding(child.second));
    }

    return vec;
}

}
}
}
}

