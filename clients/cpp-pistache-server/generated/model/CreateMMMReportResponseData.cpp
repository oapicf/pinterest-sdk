/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "CreateMMMReportResponseData.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateMMMReportResponseData::CreateMMMReportResponseData()
{
    m_Report_statusIsSet = false;
    m_Token = "";
    m_TokenIsSet = false;
    m_Message = "";
    m_MessageIsSet = false;
    m_Status = "";
    m_StatusIsSet = false;
    
}

void CreateMMMReportResponseData::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateMMMReportResponseData::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateMMMReportResponseData::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateMMMReportResponseData" : pathPrefix;

                    
    return success;
}

bool CreateMMMReportResponseData::operator==(const CreateMMMReportResponseData& rhs) const
{
    return
    
    
    
    ((!reportStatusIsSet() && !rhs.reportStatusIsSet()) || (reportStatusIsSet() && rhs.reportStatusIsSet() && getReportStatus() == rhs.getReportStatus())) &&
    
    
    ((!tokenIsSet() && !rhs.tokenIsSet()) || (tokenIsSet() && rhs.tokenIsSet() && getToken() == rhs.getToken())) &&
    
    
    ((!messageIsSet() && !rhs.messageIsSet()) || (messageIsSet() && rhs.messageIsSet() && getMessage() == rhs.getMessage())) &&
    
    
    ((!statusIsSet() && !rhs.statusIsSet()) || (statusIsSet() && rhs.statusIsSet() && getStatus() == rhs.getStatus()))
    
    ;
}

bool CreateMMMReportResponseData::operator!=(const CreateMMMReportResponseData& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateMMMReportResponseData& o)
{
    j = nlohmann::json::object();
    if(o.reportStatusIsSet())
        j["report_status"] = o.m_Report_status;
    if(o.tokenIsSet())
        j["token"] = o.m_Token;
    if(o.messageIsSet())
        j["message"] = o.m_Message;
    if(o.statusIsSet())
        j["status"] = o.m_Status;
    
}

void from_json(const nlohmann::json& j, CreateMMMReportResponseData& o)
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
    if(j.find("status") != j.end())
    {
        j.at("status").get_to(o.m_Status);
        o.m_StatusIsSet = true;
    } 
    
}

org::openapitools::server::model::BulkReportingJobStatus CreateMMMReportResponseData::getReportStatus() const
{
    return m_Report_status;
}
void CreateMMMReportResponseData::setReportStatus(org::openapitools::server::model::BulkReportingJobStatus const& value)
{
    m_Report_status = value;
    m_Report_statusIsSet = true;
}
bool CreateMMMReportResponseData::reportStatusIsSet() const
{
    return m_Report_statusIsSet;
}
void CreateMMMReportResponseData::unsetReport_status()
{
    m_Report_statusIsSet = false;
}
std::string CreateMMMReportResponseData::getToken() const
{
    return m_Token;
}
void CreateMMMReportResponseData::setToken(std::string const& value)
{
    m_Token = value;
    m_TokenIsSet = true;
}
bool CreateMMMReportResponseData::tokenIsSet() const
{
    return m_TokenIsSet;
}
void CreateMMMReportResponseData::unsetToken()
{
    m_TokenIsSet = false;
}
std::string CreateMMMReportResponseData::getMessage() const
{
    return m_Message;
}
void CreateMMMReportResponseData::setMessage(std::string const& value)
{
    m_Message = value;
    m_MessageIsSet = true;
}
bool CreateMMMReportResponseData::messageIsSet() const
{
    return m_MessageIsSet;
}
void CreateMMMReportResponseData::unsetMessage()
{
    m_MessageIsSet = false;
}
std::string CreateMMMReportResponseData::getStatus() const
{
    return m_Status;
}
void CreateMMMReportResponseData::setStatus(std::string const& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}
bool CreateMMMReportResponseData::statusIsSet() const
{
    return m_StatusIsSet;
}
void CreateMMMReportResponseData::unsetStatus()
{
    m_StatusIsSet = false;
}


} // namespace org::openapitools::server::model
