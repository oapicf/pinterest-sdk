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



#include "CppRestOpenAPIClient/model/CatalogsRetailItemResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CatalogsRetailItemResponse::CatalogsRetailItemResponse()
{
    m_Catalog_typeIsSet = false;
    m_Item_id = utility::conversions::to_string_t("");
    m_Item_idIsSet = false;
    m_PinsIsSet = false;
    m_AttributesIsSet = false;
}

CatalogsRetailItemResponse::~CatalogsRetailItemResponse()
{
}

void CatalogsRetailItemResponse::validate()
{
    // TODO: implement validation
}

web::json::value CatalogsRetailItemResponse::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Catalog_typeIsSet)
    {
        val[utility::conversions::to_string_t(U("catalog_type"))] = ModelBase::toJson(m_Catalog_type);
    }
    if(m_Item_idIsSet)
    {
        val[utility::conversions::to_string_t(U("item_id"))] = ModelBase::toJson(m_Item_id);
    }
    if(m_PinsIsSet)
    {
        val[utility::conversions::to_string_t(U("pins"))] = ModelBase::toJson(m_Pins);
    }
    if(m_AttributesIsSet)
    {
        val[utility::conversions::to_string_t(U("attributes"))] = ModelBase::toJson(m_Attributes);
    }

    return val;
}

bool CatalogsRetailItemResponse::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("item_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("item_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setItemId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setItemId);
            setItemId(refVal_setItemId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("pins"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("pins")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<Pin>> refVal_setPins;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPins);
            setPins(refVal_setPins);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("attributes"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("attributes")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<ItemAttributes> refVal_setAttributes;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAttributes);
            setAttributes(refVal_setAttributes);
        }
    }
    return ok;
}

void CatalogsRetailItemResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_Item_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("item_id")), m_Item_id));
    }
    if(m_PinsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pins")), m_Pins));
    }
    if(m_AttributesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("attributes")), m_Attributes));
    }
}

bool CatalogsRetailItemResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("item_id"))))
    {
        utility::string_t refVal_setItemId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("item_id"))), refVal_setItemId );
        setItemId(refVal_setItemId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("pins"))))
    {
        std::vector<std::shared_ptr<Pin>> refVal_setPins;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pins"))), refVal_setPins );
        setPins(refVal_setPins);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("attributes"))))
    {
        std::shared_ptr<ItemAttributes> refVal_setAttributes;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("attributes"))), refVal_setAttributes );
        setAttributes(refVal_setAttributes);
    }
    return ok;
}

std::shared_ptr<CatalogsType> CatalogsRetailItemResponse::getCatalogType() const
{
    return m_Catalog_type;
}

void CatalogsRetailItemResponse::setCatalogType(const std::shared_ptr<CatalogsType>& value)
{
    m_Catalog_type = value;
    m_Catalog_typeIsSet = true;
}

bool CatalogsRetailItemResponse::catalogTypeIsSet() const
{
    return m_Catalog_typeIsSet;
}

void CatalogsRetailItemResponse::unsetCatalog_type()
{
    m_Catalog_typeIsSet = false;
}
utility::string_t CatalogsRetailItemResponse::getItemId() const
{
    return m_Item_id;
}

void CatalogsRetailItemResponse::setItemId(const utility::string_t& value)
{
    m_Item_id = value;
    m_Item_idIsSet = true;
}

bool CatalogsRetailItemResponse::itemIdIsSet() const
{
    return m_Item_idIsSet;
}

void CatalogsRetailItemResponse::unsetItem_id()
{
    m_Item_idIsSet = false;
}
std::vector<std::shared_ptr<Pin>>& CatalogsRetailItemResponse::getPins()
{
    return m_Pins;
}

void CatalogsRetailItemResponse::setPins(const std::vector<std::shared_ptr<Pin>>& value)
{
    m_Pins = value;
    m_PinsIsSet = true;
}

bool CatalogsRetailItemResponse::pinsIsSet() const
{
    return m_PinsIsSet;
}

void CatalogsRetailItemResponse::unsetPins()
{
    m_PinsIsSet = false;
}
std::shared_ptr<ItemAttributes> CatalogsRetailItemResponse::getAttributes() const
{
    return m_Attributes;
}

void CatalogsRetailItemResponse::setAttributes(const std::shared_ptr<ItemAttributes>& value)
{
    m_Attributes = value;
    m_AttributesIsSet = true;
}

bool CatalogsRetailItemResponse::attributesIsSet() const
{
    return m_AttributesIsSet;
}

void CatalogsRetailItemResponse::unsetAttributes()
{
    m_AttributesIsSet = false;
}
}
}
}
}


