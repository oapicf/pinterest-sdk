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
 * MembersToDeleteBody.h
 *
 * 
 */

#ifndef MembersToDeleteBody_H_
#define MembersToDeleteBody_H_



#include "MembersToDeleteBody_members_inner.h"
#include <vector>
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
class  MembersToDeleteBody 
{
public:
    MembersToDeleteBody() = default;
    explicit MembersToDeleteBody(boost::property_tree::ptree const& pt);
    virtual ~MembersToDeleteBody() = default;

    MembersToDeleteBody(const MembersToDeleteBody& other) = default; // copy constructor
    MembersToDeleteBody(MembersToDeleteBody&& other) noexcept = default; // move constructor

    MembersToDeleteBody& operator=(const MembersToDeleteBody& other) = default; // copy assignment
    MembersToDeleteBody& operator=(MembersToDeleteBody&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// MembersToDeleteBody members

    /// <summary>
    /// 
    /// </summary>
    std::vector<MembersToDeleteBody_members_inner> getMembers() const;
    void setMembers(std::vector<MembersToDeleteBody_members_inner> value);

protected:
    std::vector<MembersToDeleteBody_members_inner> m_Members;
};

std::vector<MembersToDeleteBody> createMembersToDeleteBodyVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<MembersToDeleteBody>(const MembersToDeleteBody& val) {
    return val.toPropertyTree();
}

template<>
inline MembersToDeleteBody fromPt<MembersToDeleteBody>(const boost::property_tree::ptree& pt) {
    MembersToDeleteBody ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* MembersToDeleteBody_H_ */
