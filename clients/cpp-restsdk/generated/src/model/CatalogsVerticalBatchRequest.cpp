/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/CatalogsVerticalBatchRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CatalogsVerticalBatchRequest::CatalogsVerticalBatchRequest()
{
    m_Catalog_typeIsSet = false;
    m_CountryIsSet = false;
    m_LanguageIsSet = false;
    m_ItemsIsSet = false;
    m_Catalog_id = utility::conversions::to_string_t("");
    m_Catalog_idIsSet = false;
}

CatalogsVerticalBatchRequest::~CatalogsVerticalBatchRequest()
{
}

void CatalogsVerticalBatchRequest::validate()
{
    // TODO: implement validation
}

web::json::value CatalogsVerticalBatchRequest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Catalog_typeIsSet)
    {
        val[utility::conversions::to_string_t(U("catalog_type"))] = ModelBase::toJson(m_Catalog_type);
    }
    if(m_CountryIsSet)
    {
        val[utility::conversions::to_string_t(U("country"))] = ModelBase::toJson(m_Country);
    }
    if(m_LanguageIsSet)
    {
        val[utility::conversions::to_string_t(U("language"))] = ModelBase::toJson(m_Language);
    }
    if(m_ItemsIsSet)
    {
        val[utility::conversions::to_string_t(U("items"))] = ModelBase::toJson(m_Items);
    }
    if(m_Catalog_idIsSet)
    {
        val[utility::conversions::to_string_t(U("catalog_id"))] = ModelBase::toJson(m_Catalog_id);
    }

    return val;
}

bool CatalogsVerticalBatchRequest::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("catalog_type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("catalog_type")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<CatalogsType> refVal_setCatalogType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCatalogType);
            setCatalogType(refVal_setCatalogType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("country"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("country")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Country> refVal_setCountry;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCountry);
            setCountry(refVal_setCountry);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("language"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("language")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Language> refVal_setLanguage;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLanguage);
            setLanguage(refVal_setLanguage);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("items"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("items")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<CatalogsHotelBatchItem>> refVal_setItems;
            ok &= ModelBase::fromJson(fieldValue, refVal_setItems);
            setItems(refVal_setItems);
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
    return ok;
}

void CatalogsVerticalBatchRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_CountryIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("country")), m_Country));
    }
    if(m_LanguageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("language")), m_Language));
    }
    if(m_ItemsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("items")), m_Items));
    }
    if(m_Catalog_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("catalog_id")), m_Catalog_id));
    }
}

bool CatalogsVerticalBatchRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("catalog_type"))))
    {
        std::shared_ptr<CatalogsType> refVal_setCatalogType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("catalog_type"))), refVal_setCatalogType );
        setCatalogType(refVal_setCatalogType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("country"))))
    {
        std::shared_ptr<Country> refVal_setCountry;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("country"))), refVal_setCountry );
        setCountry(refVal_setCountry);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("language"))))
    {
        std::shared_ptr<Language> refVal_setLanguage;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("language"))), refVal_setLanguage );
        setLanguage(refVal_setLanguage);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("items"))))
    {
        std::vector<std::shared_ptr<CatalogsHotelBatchItem>> refVal_setItems;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("items"))), refVal_setItems );
        setItems(refVal_setItems);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("catalog_id"))))
    {
        utility::string_t refVal_setCatalogId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("catalog_id"))), refVal_setCatalogId );
        setCatalogId(refVal_setCatalogId);
    }
    return ok;
}

std::shared_ptr<CatalogsType> CatalogsVerticalBatchRequest::getCatalogType() const
{
    return m_Catalog_type;
}

void CatalogsVerticalBatchRequest::setCatalogType(const std::shared_ptr<CatalogsType>& value)
{
    m_Catalog_type = value;
    m_Catalog_typeIsSet = true;
}

bool CatalogsVerticalBatchRequest::catalogTypeIsSet() const
{
    return m_Catalog_typeIsSet;
}

void CatalogsVerticalBatchRequest::unsetCatalog_type()
{
    m_Catalog_typeIsSet = false;
}
std::shared_ptr<Country> CatalogsVerticalBatchRequest::getCountry() const
{
    return m_Country;
}

void CatalogsVerticalBatchRequest::setCountry(const std::shared_ptr<Country>& value)
{
    m_Country = value;
    m_CountryIsSet = true;
}

bool CatalogsVerticalBatchRequest::countryIsSet() const
{
    return m_CountryIsSet;
}

void CatalogsVerticalBatchRequest::unsetCountry()
{
    m_CountryIsSet = false;
}
std::shared_ptr<Language> CatalogsVerticalBatchRequest::getLanguage() const
{
    return m_Language;
}

void CatalogsVerticalBatchRequest::setLanguage(const std::shared_ptr<Language>& value)
{
    m_Language = value;
    m_LanguageIsSet = true;
}

bool CatalogsVerticalBatchRequest::languageIsSet() const
{
    return m_LanguageIsSet;
}

void CatalogsVerticalBatchRequest::unsetLanguage()
{
    m_LanguageIsSet = false;
}
std::vector<std::shared_ptr<CatalogsHotelBatchItem>>& CatalogsVerticalBatchRequest::getItems()
{
    return m_Items;
}

void CatalogsVerticalBatchRequest::setItems(const std::vector<std::shared_ptr<CatalogsHotelBatchItem>>& value)
{
    m_Items = value;
    m_ItemsIsSet = true;
}

bool CatalogsVerticalBatchRequest::itemsIsSet() const
{
    return m_ItemsIsSet;
}

void CatalogsVerticalBatchRequest::unsetItems()
{
    m_ItemsIsSet = false;
}
utility::string_t CatalogsVerticalBatchRequest::getCatalogId() const
{
    return m_Catalog_id;
}

void CatalogsVerticalBatchRequest::setCatalogId(const utility::string_t& value)
{
    m_Catalog_id = value;
    m_Catalog_idIsSet = true;
}

bool CatalogsVerticalBatchRequest::catalogIdIsSet() const
{
    return m_Catalog_idIsSet;
}

void CatalogsVerticalBatchRequest::unsetCatalog_id()
{
    m_Catalog_idIsSet = false;
}
}
}
}
}

