/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CatalogsCreativeAssetsProductGroupCreateRequest.h
 *
 * Request object for creating a creative assets product group.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsCreativeAssetsProductGroupCreateRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsCreativeAssetsProductGroupCreateRequest_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/CatalogsCreativeAssetsProductGroupFilters.h"
#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class CatalogsCreativeAssetsProductGroupFilters;


/// <summary>
/// Request object for creating a creative assets product group.
/// </summary>
class  CatalogsCreativeAssetsProductGroupCreateRequest
    : public ModelBase
{
public:
    CatalogsCreativeAssetsProductGroupCreateRequest();
    virtual ~CatalogsCreativeAssetsProductGroupCreateRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CatalogsCreativeAssetsProductGroupCreateRequest members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getCatalogType() const;
    bool catalogTypeIsSet() const;
    void unsetCatalog_type();

    void setCatalogType(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getName() const;
    bool nameIsSet() const;
    void unsetName();

    void setName(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getDescription() const;
    bool descriptionIsSet() const;
    void unsetDescription();

    void setDescription(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsCreativeAssetsProductGroupFilters> getFilters() const;
    bool filtersIsSet() const;
    void unsetFilters();

    void setFilters(const std::shared_ptr<CatalogsCreativeAssetsProductGroupFilters>& value);

    /// <summary>
    /// Catalog id pertaining to the creative assets product group.
    /// </summary>
    utility::string_t getCatalogId() const;
    bool catalogIdIsSet() const;
    void unsetCatalog_id();

    void setCatalogId(const utility::string_t& value);


protected:
    utility::string_t m_Catalog_type;
    bool m_Catalog_typeIsSet;
    utility::string_t m_Name;
    bool m_NameIsSet;
    utility::string_t m_Description;
    bool m_DescriptionIsSet;
    std::shared_ptr<CatalogsCreativeAssetsProductGroupFilters> m_Filters;
    bool m_FiltersIsSet;
    utility::string_t m_Catalog_id;
    bool m_Catalog_idIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CatalogsCreativeAssetsProductGroupCreateRequest_H_ */
