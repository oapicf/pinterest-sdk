/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "AdsAnalyticsCreateAsyncResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

AdsAnalyticsCreateAsyncResponse::AdsAnalyticsCreateAsyncResponse()
{
    m_Report_statusIsSet = false;
    m_Token = "";
    m_TokenIsSet = false;
    m_Message = "";
    m_MessageIsSet = false;
    
}

void AdsAnalyticsCreateAsyncResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool AdsAnalyticsCreateAsyncResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool AdsAnalyticsCreateAsyncResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "AdsAnalyticsCreateAsyncResponse" : pathPrefix;

                
    return success;
}

bool AdsAnalyticsCreateAsyncResponse::operator==(const AdsAnalyticsCreateAsyncResponse& rhs) const
{
    return
    
    
    
    ((!reportStatusIsSet() && !rhs.reportStatusIsSet()) || (reportStatusIsSet() && rhs.reportStatusIsSet() && getReportStatus() == rhs.getReportStatus())) &&
    
    
    ((!tokenIsSet() && !rhs.tokenIsSet()) || (tokenIsSet() && rhs.tokenIsSet() && getToken() == rhs.getToken())) &&
    
    
    ((!messageIsSet() && !rhs.messageIsSet()) || (messageIsSet() && rhs.messageIsSet() && getMessage() == rhs.getMessage()))
    
    ;
}

bool AdsAnalyticsCreateAsyncResponse::operator!=(const AdsAnalyticsCreateAsyncResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const AdsAnalyticsCreateAsyncResponse& o)
{
    j = nlohmann::json::object();
    if(o.reportStatusIsSet())
        j["report_status"] = o.m_Report_status;
    if(o.tokenIsSet())
        j["token"] = o.m_Token;
    if(o.messageIsSet())
        j["message"] = o.m_Message;
    
}

void from_json(const nlohmann::json& j, AdsAnalyticsCreateAsyncResponse& o)
{
    if(j.find("report_status") != j.end())
    {
        j.at("report_status").get_to(o.m_Report_status);
        o.m_Report_statusIsSet = true;
    } 
    if(j.find("token") != j.end())
    {
        j.at("token").get_to(o.m_Token);
        o.m_TokenIsSet = true;
    } 
    if(j.find("message") != j.end())
    {
        j.at("message").get_to(o.m_Message);
        o.m_MessageIsSet = true;
    } 
    
}

org::openapitools::server::model::BulkReportingJobStatus AdsAnalyticsCreateAsyncResponse::getReportStatus() const
{
    return m_Report_status;
}
void AdsAnalyticsCreateAsyncResponse::setReportStatus(org::openapitools::server::model::BulkReportingJobStatus const& value)
{
    m_Report_status = value;
    m_Report_statusIsSet = true;
}
bool AdsAnalyticsCreateAsyncResponse::reportStatusIsSet() const
{
    return m_Report_statusIsSet;
}
void AdsAnalyticsCreateAsyncResponse::unsetReport_status()
{
    m_Report_statusIsSet = false;
}
std::string AdsAnalyticsCreateAsyncResponse::getToken() const
{
    return m_Token;
}
void AdsAnalyticsCreateAsyncResponse::setToken(std::string const& value)
{
    m_Token = value;
    m_TokenIsSet = true;
}
bool AdsAnalyticsCreateAsyncResponse::tokenIsSet() const
{
    return m_TokenIsSet;
}
void AdsAnalyticsCreateAsyncResponse::unsetToken()
{
    m_TokenIsSet = false;
}
std::string AdsAnalyticsCreateAsyncResponse::getMessage() const
{
    return m_Message;
}
void AdsAnalyticsCreateAsyncResponse::setMessage(std::string const& value)
{
    m_Message = value;
    m_MessageIsSet = true;
}
bool AdsAnalyticsCreateAsyncResponse::messageIsSet() const
{
    return m_MessageIsSet;
}
void AdsAnalyticsCreateAsyncResponse::unsetMessage()
{
    m_MessageIsSet = false;
}


} // namespace org::openapitools::server::model

