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


#include "CatalogsReportFeedIngestionStats.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsReportFeedIngestionStats::CatalogsReportFeedIngestionStats()
{
    m_Report_type = "";
    m_Report_typeIsSet = false;
    m_Catalog_id = "";
    m_Catalog_idIsSet = false;
    m_Code = 0;
    m_CodeIsSet = false;
    m_Code_label = "";
    m_Code_labelIsSet = false;
    m_Message = "";
    m_MessageIsSet = false;
    m_Occurrences = 0;
    m_OccurrencesIsSet = false;
    m_Severity = "";
    m_SeverityIsSet = false;
    
}

void CatalogsReportFeedIngestionStats::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsReportFeedIngestionStats::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsReportFeedIngestionStats::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsReportFeedIngestionStats" : pathPrefix;

             
    if (catalogIdIsSet())
    {
        const std::string& value = m_Catalog_id;
        const std::string currentValuePath = _pathPrefix + ".catalogId";
                
        

    }
                        
    return success;
}

bool CatalogsReportFeedIngestionStats::operator==(const CatalogsReportFeedIngestionStats& rhs) const
{
    return
    
    
    
    ((!reportTypeIsSet() && !rhs.reportTypeIsSet()) || (reportTypeIsSet() && rhs.reportTypeIsSet() && getReportType() == rhs.getReportType())) &&
    
    
    ((!catalogIdIsSet() && !rhs.catalogIdIsSet()) || (catalogIdIsSet() && rhs.catalogIdIsSet() && getCatalogId() == rhs.getCatalogId())) &&
    
    
    ((!codeIsSet() && !rhs.codeIsSet()) || (codeIsSet() && rhs.codeIsSet() && getCode() == rhs.getCode())) &&
    
    
    ((!codeLabelIsSet() && !rhs.codeLabelIsSet()) || (codeLabelIsSet() && rhs.codeLabelIsSet() && getCodeLabel() == rhs.getCodeLabel())) &&
    
    
    ((!messageIsSet() && !rhs.messageIsSet()) || (messageIsSet() && rhs.messageIsSet() && getMessage() == rhs.getMessage())) &&
    
    
    ((!occurrencesIsSet() && !rhs.occurrencesIsSet()) || (occurrencesIsSet() && rhs.occurrencesIsSet() && getOccurrences() == rhs.getOccurrences())) &&
    
    
    ((!severityIsSet() && !rhs.severityIsSet()) || (severityIsSet() && rhs.severityIsSet() && getSeverity() == rhs.getSeverity()))
    
    ;
}

bool CatalogsReportFeedIngestionStats::operator!=(const CatalogsReportFeedIngestionStats& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsReportFeedIngestionStats& o)
{
    j = nlohmann::json::object();
    if(o.reportTypeIsSet())
        j["report_type"] = o.m_Report_type;
    if(o.catalogIdIsSet())
        j["catalog_id"] = o.m_Catalog_id;
    if(o.codeIsSet())
        j["code"] = o.m_Code;
    if(o.codeLabelIsSet())
        j["code_label"] = o.m_Code_label;
    if(o.messageIsSet())
        j["message"] = o.m_Message;
    if(o.occurrencesIsSet())
        j["occurrences"] = o.m_Occurrences;
    if(o.severityIsSet())
        j["severity"] = o.m_Severity;
    
}

void from_json(const nlohmann::json& j, CatalogsReportFeedIngestionStats& o)
{
    if(j.find("report_type") != j.end())
    {
        j.at("report_type").get_to(o.m_Report_type);
        o.m_Report_typeIsSet = true;
    } 
    if(j.find("catalog_id") != j.end())
    {
        j.at("catalog_id").get_to(o.m_Catalog_id);
        o.m_Catalog_idIsSet = true;
    } 
    if(j.find("code") != j.end())
    {
        j.at("code").get_to(o.m_Code);
        o.m_CodeIsSet = true;
    } 
    if(j.find("code_label") != j.end())
    {
        j.at("code_label").get_to(o.m_Code_label);
        o.m_Code_labelIsSet = true;
    } 
    if(j.find("message") != j.end())
    {
        j.at("message").get_to(o.m_Message);
        o.m_MessageIsSet = true;
    } 
    if(j.find("occurrences") != j.end())
    {
        j.at("occurrences").get_to(o.m_Occurrences);
        o.m_OccurrencesIsSet = true;
    } 
    if(j.find("severity") != j.end())
    {
        j.at("severity").get_to(o.m_Severity);
        o.m_SeverityIsSet = true;
    } 
    
}

std::string CatalogsReportFeedIngestionStats::getReportType() const
{
    return m_Report_type;
}
void CatalogsReportFeedIngestionStats::setReportType(std::string const& value)
{
    m_Report_type = value;
    m_Report_typeIsSet = true;
}
bool CatalogsReportFeedIngestionStats::reportTypeIsSet() const
{
    return m_Report_typeIsSet;
}
void CatalogsReportFeedIngestionStats::unsetReport_type()
{
    m_Report_typeIsSet = false;
}
std::string CatalogsReportFeedIngestionStats::getCatalogId() const
{
    return m_Catalog_id;
}
void CatalogsReportFeedIngestionStats::setCatalogId(std::string const& value)
{
    m_Catalog_id = value;
    m_Catalog_idIsSet = true;
}
bool CatalogsReportFeedIngestionStats::catalogIdIsSet() const
{
    return m_Catalog_idIsSet;
}
void CatalogsReportFeedIngestionStats::unsetCatalog_id()
{
    m_Catalog_idIsSet = false;
}
int32_t CatalogsReportFeedIngestionStats::getCode() const
{
    return m_Code;
}
void CatalogsReportFeedIngestionStats::setCode(int32_t const value)
{
    m_Code = value;
    m_CodeIsSet = true;
}
bool CatalogsReportFeedIngestionStats::codeIsSet() const
{
    return m_CodeIsSet;
}
void CatalogsReportFeedIngestionStats::unsetCode()
{
    m_CodeIsSet = false;
}
std::string CatalogsReportFeedIngestionStats::getCodeLabel() const
{
    return m_Code_label;
}
void CatalogsReportFeedIngestionStats::setCodeLabel(std::string const& value)
{
    m_Code_label = value;
    m_Code_labelIsSet = true;
}
bool CatalogsReportFeedIngestionStats::codeLabelIsSet() const
{
    return m_Code_labelIsSet;
}
void CatalogsReportFeedIngestionStats::unsetCode_label()
{
    m_Code_labelIsSet = false;
}
std::string CatalogsReportFeedIngestionStats::getMessage() const
{
    return m_Message;
}
void CatalogsReportFeedIngestionStats::setMessage(std::string const& value)
{
    m_Message = value;
    m_MessageIsSet = true;
}
bool CatalogsReportFeedIngestionStats::messageIsSet() const
{
    return m_MessageIsSet;
}
void CatalogsReportFeedIngestionStats::unsetMessage()
{
    m_MessageIsSet = false;
}
int32_t CatalogsReportFeedIngestionStats::getOccurrences() const
{
    return m_Occurrences;
}
void CatalogsReportFeedIngestionStats::setOccurrences(int32_t const value)
{
    m_Occurrences = value;
    m_OccurrencesIsSet = true;
}
bool CatalogsReportFeedIngestionStats::occurrencesIsSet() const
{
    return m_OccurrencesIsSet;
}
void CatalogsReportFeedIngestionStats::unsetOccurrences()
{
    m_OccurrencesIsSet = false;
}
std::string CatalogsReportFeedIngestionStats::getSeverity() const
{
    return m_Severity;
}
void CatalogsReportFeedIngestionStats::setSeverity(std::string const& value)
{
    m_Severity = value;
    m_SeverityIsSet = true;
}
bool CatalogsReportFeedIngestionStats::severityIsSet() const
{
    return m_SeverityIsSet;
}
void CatalogsReportFeedIngestionStats::unsetSeverity()
{
    m_SeverityIsSet = false;
}


} // namespace org::openapitools::server::model

