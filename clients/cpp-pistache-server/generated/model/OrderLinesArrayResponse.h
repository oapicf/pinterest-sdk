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
 * OrderLinesArrayResponse.h
 *
 * 
 */

#ifndef OrderLinesArrayResponse_H_
#define OrderLinesArrayResponse_H_


#include "OrderLines.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  OrderLinesArrayResponse
{
public:
    OrderLinesArrayResponse();
    virtual ~OrderLinesArrayResponse() = default;


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

    bool operator==(const OrderLinesArrayResponse& rhs) const;
    bool operator!=(const OrderLinesArrayResponse& rhs) const;

    /////////////////////////////////////////////
    /// OrderLinesArrayResponse members

    /// <summary>
    /// 
    /// </summary>
    std::vector<org::openapitools::server::model::OrderLines> getItems() const;
    void setItems(std::vector<org::openapitools::server::model::OrderLines> const& value);
    bool itemsIsSet() const;
    void unsetItems();

    friend  void to_json(nlohmann::json& j, const OrderLinesArrayResponse& o);
    friend  void from_json(const nlohmann::json& j, OrderLinesArrayResponse& o);
protected:
    std::vector<org::openapitools::server::model::OrderLines> m_Items;
    bool m_ItemsIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* OrderLinesArrayResponse_H_ */
