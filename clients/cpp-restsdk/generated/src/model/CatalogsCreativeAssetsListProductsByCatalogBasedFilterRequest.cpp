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



#include "CppRestOpenAPIClient/model/CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest()
{
    m_Catalog_type = utility::conversions::to_string_t("");
    m_Catalog_typeIsSet = false;
    m_Catalog_id = utility::conversions::to_string_t("");
    m_Catalog_idIsSet = false;
    m_FiltersIsSet = false;
}

CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::~CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest()
{
}

void CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::validate()
{
    // TODO: implement validation
}

web::json::value CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Catalog_typeIsSet)
    {
        val[utility::conversions::to_string_t(U("catalog_type"))] = ModelBase::toJson(m_Catalog_type);
    }
    if(m_Catalog_idIsSet)
    {
        val[utility::conversions::to_string_t(U("catalog_id"))] = ModelBase::toJson(m_Catalog_id);
    }
    if(m_FiltersIsSet)
    {
        val[utility::conversions::to_string_t(U("filters"))] = ModelBase::toJson(m_Filters);
    }

    return val;
}

bool CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("catalog_type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("catalog_type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCatalogType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCatalogType);
            setCatalogType(refVal_setCatalogType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("catalog_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("catalog_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCatalogId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCatalogId);
            setCatalogId(refVal_setCatalogId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("filters"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("filters")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<CatalogsCreativeAssetsProductGroupFilters> refVal_setFilters;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFilters);
            setFilters(refVal_setFilters);
        }
    }
    return ok;
}

void CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Catalog_typeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("catalog_type")), m_Catalog_type));
    }
    if(m_Catalog_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("catalog_id")), m_Catalog_id));
    }
    if(m_FiltersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("filters")), m_Filters));
    }
}

bool CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("catalog_type"))))
    {
        utility::string_t refVal_setCatalogType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("catalog_type"))), refVal_setCatalogType );
        setCatalogType(refVal_setCatalogType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("catalog_id"))))
    {
        utility::string_t refVal_setCatalogId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("catalog_id"))), refVal_setCatalogId );
        setCatalogId(refVal_setCatalogId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("filters"))))
    {
        std::shared_ptr<CatalogsCreativeAssetsProductGroupFilters> refVal_setFilters;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("filters"))), refVal_setFilters );
        setFilters(refVal_setFilters);
    }
    return ok;
}

utility::string_t CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::getCatalogType() const
{
    return m_Catalog_type;
}

void CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::setCatalogType(const utility::string_t& value)
{
    m_Catalog_type = value;
    m_Catalog_typeIsSet = true;
}

bool CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::catalogTypeIsSet() const
{
    return m_Catalog_typeIsSet;
}

void CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::unsetCatalog_type()
{
    m_Catalog_typeIsSet = false;
}
utility::string_t CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::getCatalogId() const
{
    return m_Catalog_id;
}

void CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::setCatalogId(const utility::string_t& value)
{
    m_Catalog_id = value;
    m_Catalog_idIsSet = true;
}

bool CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::catalogIdIsSet() const
{
    return m_Catalog_idIsSet;
}

void CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::unsetCatalog_id()
{
    m_Catalog_idIsSet = false;
}
std::shared_ptr<CatalogsCreativeAssetsProductGroupFilters> CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::getFilters() const
{
    return m_Filters;
}

void CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::setFilters(const std::shared_ptr<CatalogsCreativeAssetsProductGroupFilters>& value)
{
    m_Filters = value;
    m_FiltersIsSet = true;
}

bool CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::filtersIsSet() const
{
    return m_FiltersIsSet;
}

void CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::unsetFilters()
{
    m_FiltersIsSet = false;
}
}
}
}
}


