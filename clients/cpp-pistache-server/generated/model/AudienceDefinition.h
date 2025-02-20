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
 * AudienceDefinition.h
 *
 * Queryable audience representation.
 */

#ifndef AudienceDefinition_H_
#define AudienceDefinition_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Queryable audience representation.
/// </summary>
class  AudienceDefinition
{
public:
    AudienceDefinition();
    virtual ~AudienceDefinition() = default;


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

    bool operator==(const AudienceDefinition& rhs) const;
    bool operator!=(const AudienceDefinition& rhs) const;

    /////////////////////////////////////////////
    /// AudienceDefinition members

    /// <summary>
    /// Generation date
    /// </summary>
    std::string getDate() const;
    void setDate(std::string const& value);
    bool dateIsSet() const;
    void unsetdate();
    /// <summary>
    /// Generated audience type to request.
    /// </summary>
    std::string getType() const;
    void setType(std::string const& value);
    bool typeIsSet() const;
    void unsetType();
    /// <summary>
    /// Generated audience scope to request.
    /// </summary>
    std::string getScope() const;
    void setScope(std::string const& value);
    bool scopeIsSet() const;
    void unsetScope();

    friend  void to_json(nlohmann::json& j, const AudienceDefinition& o);
    friend  void from_json(const nlohmann::json& j, AudienceDefinition& o);
protected:
    std::string m_date;
    bool m_dateIsSet;
    std::string m_Type;
    bool m_TypeIsSet;
    std::string m_Scope;
    bool m_ScopeIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* AudienceDefinition_H_ */
