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
 * FollowUserRequest.h
 *
 * 
 */

#ifndef FollowUserRequest_H_
#define FollowUserRequest_H_



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
class  FollowUserRequest 
{
public:
    FollowUserRequest() = default;
    explicit FollowUserRequest(boost::property_tree::ptree const& pt);
    virtual ~FollowUserRequest() = default;

    FollowUserRequest(const FollowUserRequest& other) = default; // copy constructor
    FollowUserRequest(FollowUserRequest&& other) noexcept = default; // move constructor

    FollowUserRequest& operator=(const FollowUserRequest& other) = default; // copy assignment
    FollowUserRequest& operator=(FollowUserRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// FollowUserRequest members

    /// <summary>
    /// Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.
    /// </summary>
    bool isAutoFollow() const;
    void setAutoFollow(bool value);

protected:
    bool m_Auto_follow = false;
};

std::vector<FollowUserRequest> createFollowUserRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<FollowUserRequest>(const FollowUserRequest& val) {
    return val.toPropertyTree();
}

template<>
inline FollowUserRequest fromPt<FollowUserRequest>(const boost::property_tree::ptree& pt) {
    FollowUserRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* FollowUserRequest_H_ */
