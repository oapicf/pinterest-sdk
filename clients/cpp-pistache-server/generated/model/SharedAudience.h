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
 * SharedAudience.h
 *
 * 
 */

#ifndef SharedAudience_H_
#define SharedAudience_H_


#include <string>
#include "OperationType.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  SharedAudience
{
public:
    SharedAudience();
    virtual ~SharedAudience() = default;


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

    bool operator==(const SharedAudience& rhs) const;
    bool operator!=(const SharedAudience& rhs) const;

    /////////////////////////////////////////////
    /// SharedAudience members

    /// <summary>
    /// Unique identifier of an audience
    /// </summary>
    std::string getAudienceId() const;
    void setAudienceId(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OperationType getOperationType() const;
    void setOperationType(org::openapitools::server::model::OperationType const& value);
    /// <summary>
    /// List of ad account IDs to share with or revoke from.
    /// </summary>
    std::vector<std::string> getRecipientAccountIds() const;
    void setRecipientAccountIds(std::vector<std::string> const& value);

    friend  void to_json(nlohmann::json& j, const SharedAudience& o);
    friend  void from_json(const nlohmann::json& j, SharedAudience& o);
protected:
    std::string m_Audience_id;

    org::openapitools::server::model::OperationType m_Operation_type;

    std::vector<std::string> m_Recipient_account_ids;

    
};

} // namespace org::openapitools::server::model

#endif /* SharedAudience_H_ */
