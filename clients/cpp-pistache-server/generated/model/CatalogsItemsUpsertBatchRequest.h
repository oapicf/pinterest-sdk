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
 * CatalogsItemsUpsertBatchRequest.h
 *
 * Request object to upsert catalogs items
 */

#ifndef CatalogsItemsUpsertBatchRequest_H_
#define CatalogsItemsUpsertBatchRequest_H_


#include "BatchOperation.h"
#include "Country.h"
#include "CatalogsItemsRequest_language.h"
#include "ItemUpsertBatchRecord.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Request object to upsert catalogs items
/// </summary>
class  CatalogsItemsUpsertBatchRequest
{
public:
    CatalogsItemsUpsertBatchRequest();
    virtual ~CatalogsItemsUpsertBatchRequest() = default;


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

    bool operator==(const CatalogsItemsUpsertBatchRequest& rhs) const;
    bool operator!=(const CatalogsItemsUpsertBatchRequest& rhs) const;

    /////////////////////////////////////////////
    /// CatalogsItemsUpsertBatchRequest members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::Country getCountry() const;
    void setCountry(org::openapitools::server::model::Country const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CatalogsItemsRequest_language getLanguage() const;
    void setLanguage(org::openapitools::server::model::CatalogsItemsRequest_language const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::BatchOperation getOperation() const;
    void setOperation(org::openapitools::server::model::BatchOperation const& value);
    /// <summary>
    /// Array with catalogs items
    /// </summary>
    std::vector<org::openapitools::server::model::ItemUpsertBatchRecord> getItems() const;
    void setItems(std::vector<org::openapitools::server::model::ItemUpsertBatchRecord> const& value);

    friend  void to_json(nlohmann::json& j, const CatalogsItemsUpsertBatchRequest& o);
    friend  void from_json(const nlohmann::json& j, CatalogsItemsUpsertBatchRequest& o);
protected:
    org::openapitools::server::model::Country m_Country;

    org::openapitools::server::model::CatalogsItemsRequest_language m_Language;

    org::openapitools::server::model::BatchOperation m_Operation;

    std::vector<org::openapitools::server::model::ItemUpsertBatchRecord> m_Items;

    
};

} // namespace org::openapitools::server::model

#endif /* CatalogsItemsUpsertBatchRequest_H_ */
