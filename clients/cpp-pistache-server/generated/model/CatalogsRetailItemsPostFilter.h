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
 * CatalogsRetailItemsPostFilter.h
 *
 * 
 */

#ifndef CatalogsRetailItemsPostFilter_H_
#define CatalogsRetailItemsPostFilter_H_


#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  CatalogsRetailItemsPostFilter
{
public:
    CatalogsRetailItemsPostFilter();
    virtual ~CatalogsRetailItemsPostFilter() = default;


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

    bool operator==(const CatalogsRetailItemsPostFilter& rhs) const;
    bool operator!=(const CatalogsRetailItemsPostFilter& rhs) const;

    /////////////////////////////////////////////
    /// CatalogsRetailItemsPostFilter members

    /// <summary>
    /// 
    /// </summary>
    std::string getCatalogType() const;
    void setCatalogType(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    std::vector<std::string> getItemIds() const;
    void setItemIds(std::vector<std::string> const& value);
    /// <summary>
    /// Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
    /// </summary>
    std::string getCatalogId() const;
    void setCatalogId(std::string const& value);
    bool catalogIdIsSet() const;
    void unsetCatalog_id();

    friend  void to_json(nlohmann::json& j, const CatalogsRetailItemsPostFilter& o);
    friend  void from_json(const nlohmann::json& j, CatalogsRetailItemsPostFilter& o);
protected:
    std::string m_Catalog_type;

    std::vector<std::string> m_Item_ids;

    std::string m_Catalog_id;
    bool m_Catalog_idIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* CatalogsRetailItemsPostFilter_H_ */
