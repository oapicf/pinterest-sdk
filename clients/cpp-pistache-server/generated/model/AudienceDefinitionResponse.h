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
 * AudienceDefinitionResponse.h
 *
 * 
 */

#ifndef AudienceDefinitionResponse_H_
#define AudienceDefinitionResponse_H_


#include "AudienceDefinition.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  AudienceDefinitionResponse
{
public:
    AudienceDefinitionResponse();
    virtual ~AudienceDefinitionResponse() = default;


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

    bool operator==(const AudienceDefinitionResponse& rhs) const;
    bool operator!=(const AudienceDefinitionResponse& rhs) const;

    /////////////////////////////////////////////
    /// AudienceDefinitionResponse members

    /// <summary>
    /// 
    /// </summary>
    std::vector<org::openapitools::server::model::AudienceDefinition> getItems() const;
    void setItems(std::vector<org::openapitools::server::model::AudienceDefinition> const& value);
    bool itemsIsSet() const;
    void unsetItems();

    friend  void to_json(nlohmann::json& j, const AudienceDefinitionResponse& o);
    friend  void from_json(const nlohmann::json& j, AudienceDefinitionResponse& o);
protected:
    std::vector<org::openapitools::server::model::AudienceDefinition> m_Items;
    bool m_ItemsIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* AudienceDefinitionResponse_H_ */
