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
 * Items_batch_post_request.h
 *
 * 
 */

#ifndef Items_batch_post_request_H_
#define Items_batch_post_request_H_


#include "BatchOperation.h"
#include "Country.h"
#include "CatalogsVerticalBatchRequest.h"
#include <string>
#include "Language.h"
#include "ItemDeleteBatchRecord.h"
#include "CatalogsItemsBatchRequest.h"
#include <vector>
#include "CatalogsType.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  Items_batch_post_request
{
public:
    Items_batch_post_request();
    virtual ~Items_batch_post_request() = default;


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

    bool operator==(const Items_batch_post_request& rhs) const;
    bool operator!=(const Items_batch_post_request& rhs) const;

    /////////////////////////////////////////////
    /// Items_batch_post_request members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CatalogsType getCatalogType() const;
    void setCatalogType(org::openapitools::server::model::CatalogsType const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::Country getCountry() const;
    void setCountry(org::openapitools::server::model::Country const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::Language getLanguage() const;
    void setLanguage(org::openapitools::server::model::Language const& value);
    /// <summary>
    /// Array with catalogs items
    /// </summary>
    std::vector<org::openapitools::server::model::ItemDeleteBatchRecord> getItems() const;
    void setItems(std::vector<org::openapitools::server::model::ItemDeleteBatchRecord> const& value);
    /// <summary>
    /// Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
    /// </summary>
    std::string getCatalogId() const;
    void setCatalogId(std::string const& value);
    bool catalogIdIsSet() const;
    void unsetCatalog_id();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::BatchOperation getOperation() const;
    void setOperation(org::openapitools::server::model::BatchOperation const& value);

    friend  void to_json(nlohmann::json& j, const Items_batch_post_request& o);
    friend  void from_json(const nlohmann::json& j, Items_batch_post_request& o);
protected:
    org::openapitools::server::model::CatalogsType m_Catalog_type;

    org::openapitools::server::model::Country m_Country;

    org::openapitools::server::model::Language m_Language;

    std::vector<org::openapitools::server::model::ItemDeleteBatchRecord> m_Items;

    std::string m_Catalog_id;
    bool m_Catalog_idIsSet;
    org::openapitools::server::model::BatchOperation m_Operation;

    
};

} // namespace org::openapitools::server::model

#endif /* Items_batch_post_request_H_ */