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
 * BusinessAccessRole.h
 *
 * Permission role for business access.
 */

#ifndef BusinessAccessRole_H_
#define BusinessAccessRole_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Permission role for business access.
/// </summary>
class  BusinessAccessRole 
{
public:
    BusinessAccessRole() = default;
    explicit BusinessAccessRole(boost::property_tree::ptree const& pt);
    virtual ~BusinessAccessRole() = default;

    BusinessAccessRole(const BusinessAccessRole& other) = default; // copy constructor
    BusinessAccessRole(BusinessAccessRole&& other) noexcept = default; // move constructor

    BusinessAccessRole& operator=(const BusinessAccessRole& other) = default; // copy assignment
    BusinessAccessRole& operator=(BusinessAccessRole&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// BusinessAccessRole members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_BusinessAccessRoleEnumValue;
};

std::vector<BusinessAccessRole> createBusinessAccessRoleVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<BusinessAccessRole>(const BusinessAccessRole& val) {
    return val.toPropertyTree();
}

template<>
inline BusinessAccessRole fromPt<BusinessAccessRole>(const boost::property_tree::ptree& pt) {
    BusinessAccessRole ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* BusinessAccessRole_H_ */
