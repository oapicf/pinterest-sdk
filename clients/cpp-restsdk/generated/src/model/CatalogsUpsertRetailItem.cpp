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



#include "CppRestOpenAPIClient/model/CatalogsUpsertRetailItem.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CatalogsUpsertRetailItem::CatalogsUpsertRetailItem()
{
    m_Item_id = utility::conversions::to_string_t("");
    m_Item_idIsSet = false;
    m_Operation = utility::conversions::to_string_t("");
    m_OperationIsSet = false;
    m_AttributesIsSet = false;
}

CatalogsUpsertRetailItem::~CatalogsUpsertRetailItem()
{
}

void CatalogsUpsertRetailItem::validate()
{
    // TODO: implement validation
}

web::json::value CatalogsUpsertRetailItem::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Item_idIsSet)
    {
        val[utility::conversions::to_string_t(U("item_id"))] = ModelBase::toJson(m_Item_id);
    }
    if(m_OperationIsSet)
    {
        val[utility::conversions::to_string_t(U("operation"))] = ModelBase::toJson(m_Operation);
    }
    if(m_AttributesIsSet)
    {
        val[utility::conversions::to_string_t(U("attributes"))] = ModelBase::toJson(m_Attributes);
    }

    return val;
}

bool CatalogsUpsertRetailItem::fromJson(const web::json::value& val)
{
    bool ok = true;
    
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
    if(val.has_field(utility::conversions::to_string_t(U("operation"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("operation")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setOperation;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOperation);
            setOperation(refVal_setOperation);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("attributes"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("attributes")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<ItemAttributesRequest> refVal_setAttributes;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAttributes);
            setAttributes(refVal_setAttributes);
        }
    }
    return ok;
}

void CatalogsUpsertRetailItem::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Item_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("item_id")), m_Item_id));
    }
    if(m_OperationIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("operation")), m_Operation));
    }
    if(m_AttributesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("attributes")), m_Attributes));
    }
}

bool CatalogsUpsertRetailItem::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("item_id"))))
    {
        utility::string_t refVal_setItemId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("item_id"))), refVal_setItemId );
        setItemId(refVal_setItemId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("operation"))))
    {
        utility::string_t refVal_setOperation;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("operation"))), refVal_setOperation );
        setOperation(refVal_setOperation);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("attributes"))))
    {
        std::shared_ptr<ItemAttributesRequest> refVal_setAttributes;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("attributes"))), refVal_setAttributes );
        setAttributes(refVal_setAttributes);
    }
    return ok;
}

utility::string_t CatalogsUpsertRetailItem::getItemId() const
{
    return m_Item_id;
}

void CatalogsUpsertRetailItem::setItemId(const utility::string_t& value)
{
    m_Item_id = value;
    m_Item_idIsSet = true;
}

bool CatalogsUpsertRetailItem::itemIdIsSet() const
{
    return m_Item_idIsSet;
}

void CatalogsUpsertRetailItem::unsetItem_id()
{
    m_Item_idIsSet = false;
}
utility::string_t CatalogsUpsertRetailItem::getOperation() const
{
    return m_Operation;
}

void CatalogsUpsertRetailItem::setOperation(const utility::string_t& value)
{
    m_Operation = value;
    m_OperationIsSet = true;
}

bool CatalogsUpsertRetailItem::operationIsSet() const
{
    return m_OperationIsSet;
}

void CatalogsUpsertRetailItem::unsetOperation()
{
    m_OperationIsSet = false;
}
std::shared_ptr<ItemAttributesRequest> CatalogsUpsertRetailItem::getAttributes() const
{
    return m_Attributes;
}

void CatalogsUpsertRetailItem::setAttributes(const std::shared_ptr<ItemAttributesRequest>& value)
{
    m_Attributes = value;
    m_AttributesIsSet = true;
}

bool CatalogsUpsertRetailItem::attributesIsSet() const
{
    return m_AttributesIsSet;
}

void CatalogsUpsertRetailItem::unsetAttributes()
{
    m_AttributesIsSet = false;
}
}
}
}
}


