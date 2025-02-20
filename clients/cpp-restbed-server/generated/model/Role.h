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

/*
 * Role.h
 *
 * An internal role type used on business access, EMPLOYEE, ADMIN.
 */

#ifndef Role_H_
#define Role_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// An internal role type used on business access, EMPLOYEE, ADMIN.
/// </summary>
class  Role 
{
public:
    Role() = default;
    explicit Role(boost::property_tree::ptree const& pt);
    virtual ~Role() = default;

    Role(const Role& other) = default; // copy constructor
    Role(Role&& other) noexcept = default; // move constructor

    Role& operator=(const Role& other) = default; // copy assignment
    Role& operator=(Role&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// Role members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_RoleEnumValue;
};

std::vector<Role> createRoleVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Role>(const Role& val) {
    return val.toPropertyTree();
}

template<>
inline Role fromPt<Role>(const boost::property_tree::ptree& pt) {
    Role ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Role_H_ */
