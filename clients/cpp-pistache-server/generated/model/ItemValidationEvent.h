/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.6.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * ItemValidationEvent.h
 *
 * Object describing an item validation event
 */

#ifndef ItemValidationEvent_H_
#define ItemValidationEvent_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Object describing an item validation event
/// </summary>
class  ItemValidationEvent
{
public:
    ItemValidationEvent();
    virtual ~ItemValidationEvent() = default;


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

    bool operator==(const ItemValidationEvent& rhs) const;
    bool operator!=(const ItemValidationEvent& rhs) const;

    /////////////////////////////////////////////
    /// ItemValidationEvent members

    /// <summary>
    /// The attribute that the item validation event references
    /// </summary>
    std::string getAttribute() const;
    void setAttribute(std::string const& value);
    bool attributeIsSet() const;
    void unsetAttribute();
    /// <summary>
    /// The event code that the item validation event references
    /// </summary>
    int32_t getCode() const;
    void setCode(int32_t const value);
    bool codeIsSet() const;
    void unsetCode();
    /// <summary>
    /// Title message describing the item validation event
    /// </summary>
    std::string getMessage() const;
    void setMessage(std::string const& value);
    bool messageIsSet() const;
    void unsetMessage();

    friend  void to_json(nlohmann::json& j, const ItemValidationEvent& o);
    friend  void from_json(const nlohmann::json& j, ItemValidationEvent& o);
protected:
    std::string m_Attribute;
    bool m_AttributeIsSet;
    int32_t m_Code;
    bool m_CodeIsSet;
    std::string m_Message;
    bool m_MessageIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* ItemValidationEvent_H_ */