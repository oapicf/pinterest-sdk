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
 * CatalogsCreativeAssetsProductGroup.h
 *
 * 
 */

#ifndef CatalogsCreativeAssetsProductGroup_H_
#define CatalogsCreativeAssetsProductGroup_H_


#include "CatalogsCreativeAssetsProductGroupFilters.h"
#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  CatalogsCreativeAssetsProductGroup
{
public:
    CatalogsCreativeAssetsProductGroup();
    virtual ~CatalogsCreativeAssetsProductGroup() = default;


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

    bool operator==(const CatalogsCreativeAssetsProductGroup& rhs) const;
    bool operator!=(const CatalogsCreativeAssetsProductGroup& rhs) const;

    /////////////////////////////////////////////
    /// CatalogsCreativeAssetsProductGroup members

    /// <summary>
    /// 
    /// </summary>
    std::string getCatalogType() const;
    void setCatalogType(std::string const& value);
    /// <summary>
    /// ID of the creative assets product group.
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    /// <summary>
    /// Name of creative assets product group
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
    /// <summary>
    /// Unix timestamp in seconds of when catalog product group was created.
    /// </summary>
    int32_t getCreatedAt() const;
    void setCreatedAt(int32_t const value);
    bool createdAtIsSet() const;
    void unsetCreated_at();
    /// <summary>
    /// Unix timestamp in seconds of last time catalog product group was updated.
    /// </summary>
    int32_t getUpdatedAt() const;
    void setUpdatedAt(int32_t const value);
    bool updatedAtIsSet() const;
    void unsetUpdated_at();
    /// <summary>
    /// Catalog id pertaining to the creative assets product group.
    /// </summary>
    std::string getCatalogId() const;
    void setCatalogId(std::string const& value);

    friend  void to_json(nlohmann::json& j, const CatalogsCreativeAssetsProductGroup& o);
    friend  void from_json(const nlohmann::json& j, CatalogsCreativeAssetsProductGroup& o);
protected:
    std::string m_Catalog_type;

    std::string m_Id;

    std::string m_Name;
    bool m_NameIsSet;
    std::string m_Description;
    bool m_DescriptionIsSet;
    org::openapitools::server::model::CatalogsCreativeAssetsProductGroupFilters m_Filters;

    int32_t m_Created_at;
    bool m_Created_atIsSet;
    int32_t m_Updated_at;
    bool m_Updated_atIsSet;
    std::string m_Catalog_id;

    
};

} // namespace org::openapitools::server::model

#endif /* CatalogsCreativeAssetsProductGroup_H_ */
