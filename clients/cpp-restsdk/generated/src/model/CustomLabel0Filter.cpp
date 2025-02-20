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



#include "CppRestOpenAPIClient/model/CustomLabel0Filter.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CustomLabel0Filter::CustomLabel0Filter()
{
    m_CUSTOM_LABEL_0IsSet = false;
}

CustomLabel0Filter::~CustomLabel0Filter()
{
}

void CustomLabel0Filter::validate()
{
    // TODO: implement validation
}

web::json::value CustomLabel0Filter::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_CUSTOM_LABEL_0IsSet)
    {
        val[utility::conversions::to_string_t(U("CUSTOM_LABEL_0"))] = ModelBase::toJson(m_CUSTOM_LABEL_0);
    }

    return val;
}

bool CustomLabel0Filter::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("CUSTOM_LABEL_0"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("CUSTOM_LABEL_0")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> refVal_setCUSTOMLABEL0;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCUSTOMLABEL0);
            setCUSTOMLABEL0(refVal_setCUSTOMLABEL0);
        }
    }
    return ok;
}

void CustomLabel0Filter::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_CUSTOM_LABEL_0IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("CUSTOM_LABEL_0")), m_CUSTOM_LABEL_0));
    }
}

bool CustomLabel0Filter::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("CUSTOM_LABEL_0"))))
    {
        std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> refVal_setCUSTOMLABEL0;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("CUSTOM_LABEL_0"))), refVal_setCUSTOMLABEL0 );
        setCUSTOMLABEL0(refVal_setCUSTOMLABEL0);
    }
    return ok;
}

std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> CustomLabel0Filter::getCUSTOMLABEL0() const
{
    return m_CUSTOM_LABEL_0;
}

void CustomLabel0Filter::setCUSTOMLABEL0(const std::shared_ptr<CatalogsProductGroupMultipleStringCriteria>& value)
{
    m_CUSTOM_LABEL_0 = value;
    m_CUSTOM_LABEL_0IsSet = true;
}

bool CustomLabel0Filter::cUSTOMLABEL0IsSet() const
{
    return m_CUSTOM_LABEL_0IsSet;
}

void CustomLabel0Filter::unsetCUSTOM_LABEL_0()
{
    m_CUSTOM_LABEL_0IsSet = false;
}
}
}
}
}


