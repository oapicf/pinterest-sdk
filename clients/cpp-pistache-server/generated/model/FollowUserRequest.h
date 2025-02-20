/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
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


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  FollowUserRequest
{
public:
    FollowUserRequest();
    virtual ~FollowUserRequest() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const FollowUserRequest& rhs) const;
    bool operator!=(const FollowUserRequest& rhs) const;

    /////////////////////////////////////////////
    /// FollowUserRequest members

    /// <summary>
    /// Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.
    /// </summary>
    bool isAutoFollow() const;
    void setAutoFollow(bool const value);
    bool autoFollowIsSet() const;
    void unsetAuto_follow();

    friend  void to_json(nlohmann::json& j, const FollowUserRequest& o);
    friend  void from_json(const nlohmann::json& j, FollowUserRequest& o);
protected:
    bool m_Auto_follow;
    bool m_Auto_followIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* FollowUserRequest_H_ */
