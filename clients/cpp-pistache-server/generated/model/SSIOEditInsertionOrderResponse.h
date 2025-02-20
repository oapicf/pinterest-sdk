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
 * SSIOEditInsertionOrderResponse.h
 *
 * 
 */

#ifndef SSIOEditInsertionOrderResponse_H_
#define SSIOEditInsertionOrderResponse_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  SSIOEditInsertionOrderResponse
{
public:
    SSIOEditInsertionOrderResponse();
    virtual ~SSIOEditInsertionOrderResponse() = default;


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

    bool operator==(const SSIOEditInsertionOrderResponse& rhs) const;
    bool operator!=(const SSIOEditInsertionOrderResponse& rhs) const;

    /////////////////////////////////////////////
    /// SSIOEditInsertionOrderResponse members

    /// <summary>
    /// Salesforce order id
    /// </summary>
    std::string getPinOrderId() const;
    void setPinOrderId(std::string const& value);
    bool pinOrderIdIsSet() const;
    void unsetPin_order_id();

    friend  void to_json(nlohmann::json& j, const SSIOEditInsertionOrderResponse& o);
    friend  void from_json(const nlohmann::json& j, SSIOEditInsertionOrderResponse& o);
protected:
    std::string m_Pin_order_id;
    bool m_Pin_order_idIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* SSIOEditInsertionOrderResponse_H_ */
