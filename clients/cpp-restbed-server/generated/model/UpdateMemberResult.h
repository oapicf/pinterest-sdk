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
 * UpdateMemberResult.h
 *
 * 
 */

#ifndef UpdateMemberResult_H_
#define UpdateMemberResult_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  UpdateMemberResult 
{
public:
    UpdateMemberResult() = default;
    explicit UpdateMemberResult(boost::property_tree::ptree const& pt);
    virtual ~UpdateMemberResult() = default;

    UpdateMemberResult(const UpdateMemberResult& other) = default; // copy constructor
    UpdateMemberResult(UpdateMemberResult&& other) noexcept = default; // move constructor

    UpdateMemberResult& operator=(const UpdateMemberResult& other) = default; // copy assignment
    UpdateMemberResult& operator=(UpdateMemberResult&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// UpdateMemberResult members

    /// <summary>
    /// The access level a member has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
    /// </summary>
    std::string getBusinessRole() const;
    void setBusinessRole(std::string value);

    /// <summary>
    /// Unique identifier of the business member.
    /// </summary>
    std::string getMemberId() const;
    void setMemberId(std::string value);

protected:
    std::string m_Business_role = "";
    std::string m_Member_id = "";
};

std::vector<UpdateMemberResult> createUpdateMemberResultVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<UpdateMemberResult>(const UpdateMemberResult& val) {
    return val.toPropertyTree();
}

template<>
inline UpdateMemberResult fromPt<UpdateMemberResult>(const boost::property_tree::ptree& pt) {
    UpdateMemberResult ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* UpdateMemberResult_H_ */
