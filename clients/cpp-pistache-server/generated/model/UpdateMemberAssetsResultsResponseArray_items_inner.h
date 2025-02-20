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
 * UpdateMemberAssetsResultsResponseArray_items_inner.h
 *
 * 
 */

#ifndef UpdateMemberAssetsResultsResponseArray_items_inner_H_
#define UpdateMemberAssetsResultsResponseArray_items_inner_H_


#include "UsersForIndividualAssetResponse.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  UpdateMemberAssetsResultsResponseArray_items_inner
{
public:
    UpdateMemberAssetsResultsResponseArray_items_inner();
    virtual ~UpdateMemberAssetsResultsResponseArray_items_inner() = default;


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

    bool operator==(const UpdateMemberAssetsResultsResponseArray_items_inner& rhs) const;
    bool operator!=(const UpdateMemberAssetsResultsResponseArray_items_inner& rhs) const;

    /////////////////////////////////////////////
    /// UpdateMemberAssetsResultsResponseArray_items_inner members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::UsersForIndividualAssetResponse getResponse() const;
    void setResponse(org::openapitools::server::model::UsersForIndividualAssetResponse const& value);
    bool responseIsSet() const;
    void unsetResponse();

    friend  void to_json(nlohmann::json& j, const UpdateMemberAssetsResultsResponseArray_items_inner& o);
    friend  void from_json(const nlohmann::json& j, UpdateMemberAssetsResultsResponseArray_items_inner& o);
protected:
    org::openapitools::server::model::UsersForIndividualAssetResponse m_Response;
    bool m_ResponseIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* UpdateMemberAssetsResultsResponseArray_items_inner_H_ */
