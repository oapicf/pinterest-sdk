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



#include "CppRestOpenAPIClient/model/BulkUpsertStatusResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



BulkUpsertStatusResponse::BulkUpsertStatusResponse()
{
    m_StatusIsSet = false;
    m_Result_url = utility::conversions::to_string_t("");
    m_Result_urlIsSet = false;
}

BulkUpsertStatusResponse::~BulkUpsertStatusResponse()
{
}

void BulkUpsertStatusResponse::validate()
{
    // TODO: implement validation
}

web::json::value BulkUpsertStatusResponse::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_StatusIsSet)
    {
        val[utility::conversions::to_string_t(U("status"))] = ModelBase::toJson(m_Status);
    }
    if(m_Result_urlIsSet)
    {
        val[utility::conversions::to_string_t(U("result_url"))] = ModelBase::toJson(m_Result_url);
    }

    return val;
}

bool BulkUpsertStatusResponse::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("status"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("status")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<BulkUpsertStatus> refVal_setStatus;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStatus);
            setStatus(refVal_setStatus);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("result_url"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("result_url")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setResultUrl;
            ok &= ModelBase::fromJson(fieldValue, refVal_setResultUrl);
            setResultUrl(refVal_setResultUrl);
        }
    }
    return ok;
}

void BulkUpsertStatusResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_StatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("status")), m_Status));
    }
    if(m_Result_urlIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("result_url")), m_Result_url));
    }
}

bool BulkUpsertStatusResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("status"))))
    {
        std::shared_ptr<BulkUpsertStatus> refVal_setStatus;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("status"))), refVal_setStatus );
        setStatus(refVal_setStatus);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("result_url"))))
    {
        utility::string_t refVal_setResultUrl;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("result_url"))), refVal_setResultUrl );
        setResultUrl(refVal_setResultUrl);
    }
    return ok;
}

std::shared_ptr<BulkUpsertStatus> BulkUpsertStatusResponse::getStatus() const
{
    return m_Status;
}

void BulkUpsertStatusResponse::setStatus(const std::shared_ptr<BulkUpsertStatus>& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool BulkUpsertStatusResponse::statusIsSet() const
{
    return m_StatusIsSet;
}

void BulkUpsertStatusResponse::unsetStatus()
{
    m_StatusIsSet = false;
}
utility::string_t BulkUpsertStatusResponse::getResultUrl() const
{
    return m_Result_url;
}

void BulkUpsertStatusResponse::setResultUrl(const utility::string_t& value)
{
    m_Result_url = value;
    m_Result_urlIsSet = true;
}

bool BulkUpsertStatusResponse::resultUrlIsSet() const
{
    return m_Result_urlIsSet;
}

void BulkUpsertStatusResponse::unsetResult_url()
{
    m_Result_urlIsSet = false;
}
}
}
}
}


