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



#include "CppRestOpenAPIClient/model/AudienceDemographicValue.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



AudienceDemographicValue::AudienceDemographicValue()
{
    m_Key = utility::conversions::to_string_t("");
    m_KeyIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_Ratio = 0.0;
    m_RatioIsSet = false;
}

AudienceDemographicValue::~AudienceDemographicValue()
{
}

void AudienceDemographicValue::validate()
{
    // TODO: implement validation
}

web::json::value AudienceDemographicValue::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_KeyIsSet)
    {
        val[utility::conversions::to_string_t(U("key"))] = ModelBase::toJson(m_Key);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t(U("name"))] = ModelBase::toJson(m_Name);
    }
    if(m_RatioIsSet)
    {
        val[utility::conversions::to_string_t(U("ratio"))] = ModelBase::toJson(m_Ratio);
    }

    return val;
}

bool AudienceDemographicValue::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("key"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("key")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setKey;
            ok &= ModelBase::fromJson(fieldValue, refVal_setKey);
            setKey(refVal_setKey);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setName);
            setName(refVal_setName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("ratio"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("ratio")));
        if(!fieldValue.is_null())
        {
            double refVal_setRatio;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRatio);
            setRatio(refVal_setRatio);
        }
    }
    return ok;
}

void AudienceDemographicValue::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_KeyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("key")), m_Key));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("name")), m_Name));
    }
    if(m_RatioIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("ratio")), m_Ratio));
    }
}

bool AudienceDemographicValue::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("key"))))
    {
        utility::string_t refVal_setKey;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("key"))), refVal_setKey );
        setKey(refVal_setKey);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("name"))))
    {
        utility::string_t refVal_setName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("name"))), refVal_setName );
        setName(refVal_setName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("ratio"))))
    {
        double refVal_setRatio;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("ratio"))), refVal_setRatio );
        setRatio(refVal_setRatio);
    }
    return ok;
}

utility::string_t AudienceDemographicValue::getKey() const
{
    return m_Key;
}

void AudienceDemographicValue::setKey(const utility::string_t& value)
{
    m_Key = value;
    m_KeyIsSet = true;
}

bool AudienceDemographicValue::keyIsSet() const
{
    return m_KeyIsSet;
}

void AudienceDemographicValue::unsetKey()
{
    m_KeyIsSet = false;
}
utility::string_t AudienceDemographicValue::getName() const
{
    return m_Name;
}

void AudienceDemographicValue::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool AudienceDemographicValue::nameIsSet() const
{
    return m_NameIsSet;
}

void AudienceDemographicValue::unsetName()
{
    m_NameIsSet = false;
}
double AudienceDemographicValue::getRatio() const
{
    return m_Ratio;
}

void AudienceDemographicValue::setRatio(double value)
{
    m_Ratio = value;
    m_RatioIsSet = true;
}

bool AudienceDemographicValue::ratioIsSet() const
{
    return m_RatioIsSet;
}

void AudienceDemographicValue::unsetRatio()
{
    m_RatioIsSet = false;
}
}
}
}
}

