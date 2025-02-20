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
 * AudienceCommon.h
 *
 * 
 */

#ifndef AudienceCommon_H_
#define AudienceCommon_H_


#include "AudienceRule.h"
#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  AudienceCommon
{
public:
    AudienceCommon();
    virtual ~AudienceCommon() = default;


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

    bool operator==(const AudienceCommon& rhs) const;
    bool operator!=(const AudienceCommon& rhs) const;

    /////////////////////////////////////////////
    /// AudienceCommon members

    /// <summary>
    /// Ad account ID.
    /// </summary>
    std::string getAdAccountId() const;
    void setAdAccountId(std::string const& value);
    bool adAccountIdIsSet() const;
    void unsetAd_account_id();
    /// <summary>
    /// Audience name.
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::AudienceRule getRule() const;
    void setRule(org::openapitools::server::model::AudienceRule const& value);
    bool ruleIsSet() const;
    void unsetRule();

    friend  void to_json(nlohmann::json& j, const AudienceCommon& o);
    friend  void from_json(const nlohmann::json& j, AudienceCommon& o);
protected:
    std::string m_Ad_account_id;
    bool m_Ad_account_idIsSet;
    std::string m_Name;
    bool m_NameIsSet;
    org::openapitools::server::model::AudienceRule m_Rule;
    bool m_RuleIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* AudienceCommon_H_ */
