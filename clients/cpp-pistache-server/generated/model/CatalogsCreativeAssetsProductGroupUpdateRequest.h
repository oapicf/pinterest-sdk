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
 * CatalogsCreativeAssetsProductGroupUpdateRequest.h
 *
 * Request object for updating a creative assets product group.
 */

#ifndef CatalogsCreativeAssetsProductGroupUpdateRequest_H_
#define CatalogsCreativeAssetsProductGroupUpdateRequest_H_


#include "CatalogsCreativeAssetsProductGroupFilters.h"
#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Request object for updating a creative assets product group.
/// </summary>
class  CatalogsCreativeAssetsProductGroupUpdateRequest
{
public:
    CatalogsCreativeAssetsProductGroupUpdateRequest();
    virtual ~CatalogsCreativeAssetsProductGroupUpdateRequest() = default;


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

    bool operator==(const CatalogsCreativeAssetsProductGroupUpdateRequest& rhs) const;
    bool operator!=(const CatalogsCreativeAssetsProductGroupUpdateRequest& rhs) const;

    /////////////////////////////////////////////
    /// CatalogsCreativeAssetsProductGroupUpdateRequest members

    /// <summary>
    /// 
    /// </summary>
    std::string getCatalogType() const;
    void setCatalogType(std::string const& value);
    bool catalogTypeIsSet() const;
    void unsetCatalog_type();
    /// <summary>
    /// 
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// 
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string const& value);
    bool descriptionIsSet() const;
    void unsetDescription();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CatalogsCreativeAssetsProductGroupFilters getFilters() const;
    void setFilters(org::openapitools::server::model::CatalogsCreativeAssetsProductGroupFilters const& value);
    bool filtersIsSet() const;
    void unsetFilters();

    friend  void to_json(nlohmann::json& j, const CatalogsCreativeAssetsProductGroupUpdateRequest& o);
    friend  void from_json(const nlohmann::json& j, CatalogsCreativeAssetsProductGroupUpdateRequest& o);
protected:
    std::string m_Catalog_type;
    bool m_Catalog_typeIsSet;
    std::string m_Name;
    bool m_NameIsSet;
    std::string m_Description;
    bool m_DescriptionIsSet;
    org::openapitools::server::model::CatalogsCreativeAssetsProductGroupFilters m_Filters;
    bool m_FiltersIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* CatalogsCreativeAssetsProductGroupUpdateRequest_H_ */
