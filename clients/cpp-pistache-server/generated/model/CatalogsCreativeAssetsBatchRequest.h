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
 * CatalogsCreativeAssetsBatchRequest.h
 *
 * Request object to update catalogs creative assets items
 */

#ifndef CatalogsCreativeAssetsBatchRequest_H_
#define CatalogsCreativeAssetsBatchRequest_H_


#include "Country.h"
#include "CatalogsCreativeAssetsBatchItem.h"
#include "CatalogsItemsRequest_language.h"
#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Request object to update catalogs creative assets items
/// </summary>
class  CatalogsCreativeAssetsBatchRequest
{
public:
    CatalogsCreativeAssetsBatchRequest();
    virtual ~CatalogsCreativeAssetsBatchRequest() = default;


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

    bool operator==(const CatalogsCreativeAssetsBatchRequest& rhs) const;
    bool operator!=(const CatalogsCreativeAssetsBatchRequest& rhs) const;

    /////////////////////////////////////////////
    /// CatalogsCreativeAssetsBatchRequest members

    /// <summary>
    /// 
    /// </summary>
    std::string getCatalogType() const;
    void setCatalogType(std::string const& value);
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
    /// Array with creative assets item operations
    /// </summary>
    std::vector<org::openapitools::server::model::CatalogsCreativeAssetsBatchItem> getItems() const;
    void setItems(std::vector<org::openapitools::server::model::CatalogsCreativeAssetsBatchItem> const& value);
    /// <summary>
    /// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
    /// </summary>
    std::string getCatalogId() const;
    void setCatalogId(std::string const& value);
    bool catalogIdIsSet() const;
    void unsetCatalog_id();

    friend  void to_json(nlohmann::json& j, const CatalogsCreativeAssetsBatchRequest& o);
    friend  void from_json(const nlohmann::json& j, CatalogsCreativeAssetsBatchRequest& o);
protected:
    std::string m_Catalog_type;

    org::openapitools::server::model::Country m_Country;

    org::openapitools::server::model::CatalogsItemsRequest_language m_Language;

    std::vector<org::openapitools::server::model::CatalogsCreativeAssetsBatchItem> m_Items;

    std::string m_Catalog_id;
    bool m_Catalog_idIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* CatalogsCreativeAssetsBatchRequest_H_ */
