/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * AdPinId.h
 *
 * 
 */

#ifndef AdPinId_H_
#define AdPinId_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  AdPinId
{
public:
    AdPinId();
    virtual ~AdPinId() = default;


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

    bool operator==(const AdPinId& rhs) const;
    bool operator!=(const AdPinId& rhs) const;

    /////////////////////////////////////////////
    /// AdPinId members

    /// <summary>
    /// Pin ID.
    /// </summary>
    std::string getPinId() const;
    void setPinId(std::string const& value);
    bool pinIdIsSet() const;
    void unsetPin_id();

    friend  void to_json(nlohmann::json& j, const AdPinId& o);
    friend  void from_json(const nlohmann::json& j, AdPinId& o);
protected:
    std::string m_Pin_id;
    bool m_Pin_idIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* AdPinId_H_ */