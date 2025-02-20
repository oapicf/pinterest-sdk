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



#include "CppRestOpenAPIClient/model/CatalogsDbItem.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CatalogsDbItem::CatalogsDbItem()
{
    m_Created_at = utility::datetime();
    m_Created_atIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Updated_at = utility::datetime();
    m_Updated_atIsSet = false;
}

CatalogsDbItem::~CatalogsDbItem()
{
}

void CatalogsDbItem::validate()
{
    // TODO: implement validation
}

web::json::value CatalogsDbItem::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Created_atIsSet)
    {
        val[utility::conversions::to_string_t(U("created_at"))] = ModelBase::toJson(m_Created_at);
    }
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_Updated_atIsSet)
    {
        val[utility::conversions::to_string_t(U("updated_at"))] = ModelBase::toJson(m_Updated_at);
    }

    return val;
}

bool CatalogsDbItem::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("created_at"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("created_at")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setCreatedAt;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreatedAt);
            setCreatedAt(refVal_setCreatedAt);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("updated_at"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("updated_at")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setUpdatedAt;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUpdatedAt);
            setUpdatedAt(refVal_setUpdatedAt);
        }
    }
    return ok;
}

void CatalogsDbItem::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Created_atIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("created_at")), m_Created_at));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_Updated_atIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("updated_at")), m_Updated_at));
    }
}

bool CatalogsDbItem::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("created_at"))))
    {
        utility::datetime refVal_setCreatedAt;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("created_at"))), refVal_setCreatedAt );
        setCreatedAt(refVal_setCreatedAt);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("updated_at"))))
    {
        utility::datetime refVal_setUpdatedAt;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("updated_at"))), refVal_setUpdatedAt );
        setUpdatedAt(refVal_setUpdatedAt);
    }
    return ok;
}

utility::datetime CatalogsDbItem::getCreatedAt() const
{
    return m_Created_at;
}

void CatalogsDbItem::setCreatedAt(const utility::datetime& value)
{
    m_Created_at = value;
    m_Created_atIsSet = true;
}

bool CatalogsDbItem::createdAtIsSet() const
{
    return m_Created_atIsSet;
}

void CatalogsDbItem::unsetCreated_at()
{
    m_Created_atIsSet = false;
}
utility::string_t CatalogsDbItem::getId() const
{
    return m_Id;
}

void CatalogsDbItem::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool CatalogsDbItem::idIsSet() const
{
    return m_IdIsSet;
}

void CatalogsDbItem::unsetId()
{
    m_IdIsSet = false;
}
utility::datetime CatalogsDbItem::getUpdatedAt() const
{
    return m_Updated_at;
}

void CatalogsDbItem::setUpdatedAt(const utility::datetime& value)
{
    m_Updated_at = value;
    m_Updated_atIsSet = true;
}

bool CatalogsDbItem::updatedAtIsSet() const
{
    return m_Updated_atIsSet;
}

void CatalogsDbItem::unsetUpdated_at()
{
    m_Updated_atIsSet = false;
}
}
}
}
}


