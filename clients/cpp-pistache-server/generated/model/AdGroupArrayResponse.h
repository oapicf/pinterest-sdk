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
 * AdGroupArrayResponse.h
 *
 * 
 */

#ifndef AdGroupArrayResponse_H_
#define AdGroupArrayResponse_H_


#include "AdGroupArrayResponseElement.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  AdGroupArrayResponse
{
public:
    AdGroupArrayResponse();
    virtual ~AdGroupArrayResponse() = default;


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

    bool operator==(const AdGroupArrayResponse& rhs) const;
    bool operator!=(const AdGroupArrayResponse& rhs) const;

    /////////////////////////////////////////////
    /// AdGroupArrayResponse members

    /// <summary>
    /// 
    /// </summary>
    std::vector<org::openapitools::server::model::AdGroupArrayResponseElement> getItems() const;
    void setItems(std::vector<org::openapitools::server::model::AdGroupArrayResponseElement> const& value);
    bool itemsIsSet() const;
    void unsetItems();

    friend  void to_json(nlohmann::json& j, const AdGroupArrayResponse& o);
    friend  void from_json(const nlohmann::json& j, AdGroupArrayResponse& o);
protected:
    std::vector<org::openapitools::server::model::AdGroupArrayResponseElement> m_Items;
    bool m_ItemsIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* AdGroupArrayResponse_H_ */
