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



#include "CppRestOpenAPIClient/model/CatalogsDeleteCreativeAssetsItem.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CatalogsDeleteCreativeAssetsItem::CatalogsDeleteCreativeAssetsItem()
{
    m_Creative_assets_id = utility::conversions::to_string_t("");
    m_Creative_assets_idIsSet = false;
    m_Operation = utility::conversions::to_string_t("");
    m_OperationIsSet = false;
}

CatalogsDeleteCreativeAssetsItem::~CatalogsDeleteCreativeAssetsItem()
{
}

void CatalogsDeleteCreativeAssetsItem::validate()
{
    // TODO: implement validation
}

web::json::value CatalogsDeleteCreativeAssetsItem::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Creative_assets_idIsSet)
    {
        val[utility::conversions::to_string_t(U("creative_assets_id"))] = ModelBase::toJson(m_Creative_assets_id);
    }
    if(m_OperationIsSet)
    {
        val[utility::conversions::to_string_t(U("operation"))] = ModelBase::toJson(m_Operation);
    }

    return val;
}

bool CatalogsDeleteCreativeAssetsItem::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("creative_assets_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("creative_assets_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCreativeAssetsId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreativeAssetsId);
            setCreativeAssetsId(refVal_setCreativeAssetsId);
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
    return ok;
}

void CatalogsDeleteCreativeAssetsItem::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Creative_assets_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("creative_assets_id")), m_Creative_assets_id));
    }
    if(m_OperationIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("operation")), m_Operation));
    }
}

bool CatalogsDeleteCreativeAssetsItem::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("creative_assets_id"))))
    {
        utility::string_t refVal_setCreativeAssetsId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("creative_assets_id"))), refVal_setCreativeAssetsId );
        setCreativeAssetsId(refVal_setCreativeAssetsId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("operation"))))
    {
        utility::string_t refVal_setOperation;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("operation"))), refVal_setOperation );
        setOperation(refVal_setOperation);
    }
    return ok;
}

utility::string_t CatalogsDeleteCreativeAssetsItem::getCreativeAssetsId() const
{
    return m_Creative_assets_id;
}

void CatalogsDeleteCreativeAssetsItem::setCreativeAssetsId(const utility::string_t& value)
{
    m_Creative_assets_id = value;
    m_Creative_assets_idIsSet = true;
}

bool CatalogsDeleteCreativeAssetsItem::creativeAssetsIdIsSet() const
{
    return m_Creative_assets_idIsSet;
}

void CatalogsDeleteCreativeAssetsItem::unsetCreative_assets_id()
{
    m_Creative_assets_idIsSet = false;
}
utility::string_t CatalogsDeleteCreativeAssetsItem::getOperation() const
{
    return m_Operation;
}

void CatalogsDeleteCreativeAssetsItem::setOperation(const utility::string_t& value)
{
    m_Operation = value;
    m_OperationIsSet = true;
}

bool CatalogsDeleteCreativeAssetsItem::operationIsSet() const
{
    return m_OperationIsSet;
}

void CatalogsDeleteCreativeAssetsItem::unsetOperation()
{
    m_OperationIsSet = false;
}
}
}
}
}


