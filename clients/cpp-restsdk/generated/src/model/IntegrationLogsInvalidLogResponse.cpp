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



#include "CppRestOpenAPIClient/model/IntegrationLogsInvalidLogResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



IntegrationLogsInvalidLogResponse::IntegrationLogsInvalidLogResponse()
{
    m_Rejected_logsIsSet = false;
}

IntegrationLogsInvalidLogResponse::~IntegrationLogsInvalidLogResponse()
{
}

void IntegrationLogsInvalidLogResponse::validate()
{
    // TODO: implement validation
}

web::json::value IntegrationLogsInvalidLogResponse::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Rejected_logsIsSet)
    {
        val[utility::conversions::to_string_t(U("rejected_logs"))] = ModelBase::toJson(m_Rejected_logs);
    }

    return val;
}

bool IntegrationLogsInvalidLogResponse::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("rejected_logs"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("rejected_logs")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<IntegrationLogsInvalidLogResponse_rejected_logs_inner>> refVal_setRejectedLogs;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRejectedLogs);
            setRejectedLogs(refVal_setRejectedLogs);
        }
    }
    return ok;
}

void IntegrationLogsInvalidLogResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Rejected_logsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("rejected_logs")), m_Rejected_logs));
    }
}

bool IntegrationLogsInvalidLogResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("rejected_logs"))))
    {
        std::vector<std::shared_ptr<IntegrationLogsInvalidLogResponse_rejected_logs_inner>> refVal_setRejectedLogs;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("rejected_logs"))), refVal_setRejectedLogs );
        setRejectedLogs(refVal_setRejectedLogs);
    }
    return ok;
}

std::vector<std::shared_ptr<IntegrationLogsInvalidLogResponse_rejected_logs_inner>>& IntegrationLogsInvalidLogResponse::getRejectedLogs()
{
    return m_Rejected_logs;
}

void IntegrationLogsInvalidLogResponse::setRejectedLogs(const std::vector<std::shared_ptr<IntegrationLogsInvalidLogResponse_rejected_logs_inner>>& value)
{
    m_Rejected_logs = value;
    m_Rejected_logsIsSet = true;
}

bool IntegrationLogsInvalidLogResponse::rejectedLogsIsSet() const
{
    return m_Rejected_logsIsSet;
}

void IntegrationLogsInvalidLogResponse::unsetRejected_logs()
{
    m_Rejected_logsIsSet = false;
}
}
}
}
}

