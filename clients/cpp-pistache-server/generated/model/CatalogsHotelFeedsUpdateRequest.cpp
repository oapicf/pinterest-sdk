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


#include "CatalogsHotelFeedsUpdateRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsHotelFeedsUpdateRequest::CatalogsHotelFeedsUpdateRequest()
{
    m_Default_currencyIsSet = false;
    m_Name = "";
    m_NameIsSet = false;
    m_FormatIsSet = false;
    m_CredentialsIsSet = false;
    m_Location = "";
    m_LocationIsSet = false;
    m_Preferred_processing_scheduleIsSet = false;
    m_StatusIsSet = false;
    
}

void CatalogsHotelFeedsUpdateRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsHotelFeedsUpdateRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsHotelFeedsUpdateRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsHotelFeedsUpdateRequest" : pathPrefix;

                         
    if (locationIsSet())
    {
        const std::string& value = m_Location;
        const std::string currentValuePath = _pathPrefix + ".location";
                
        

    }
                
    return success;
}

bool CatalogsHotelFeedsUpdateRequest::operator==(const CatalogsHotelFeedsUpdateRequest& rhs) const
{
    return
    
    
    
    ((!defaultCurrencyIsSet() && !rhs.defaultCurrencyIsSet()) || (defaultCurrencyIsSet() && rhs.defaultCurrencyIsSet() && getDefaultCurrency() == rhs.getDefaultCurrency())) &&
    
    
    ((!nameIsSet() && !rhs.nameIsSet()) || (nameIsSet() && rhs.nameIsSet() && getName() == rhs.getName())) &&
    
    
    ((!formatIsSet() && !rhs.formatIsSet()) || (formatIsSet() && rhs.formatIsSet() && getFormat() == rhs.getFormat())) &&
    
    
    ((!credentialsIsSet() && !rhs.credentialsIsSet()) || (credentialsIsSet() && rhs.credentialsIsSet() && getCredentials() == rhs.getCredentials())) &&
    
    
    ((!locationIsSet() && !rhs.locationIsSet()) || (locationIsSet() && rhs.locationIsSet() && getLocation() == rhs.getLocation())) &&
    
    
    ((!preferredProcessingScheduleIsSet() && !rhs.preferredProcessingScheduleIsSet()) || (preferredProcessingScheduleIsSet() && rhs.preferredProcessingScheduleIsSet() && getPreferredProcessingSchedule() == rhs.getPreferredProcessingSchedule())) &&
    
    
    ((!statusIsSet() && !rhs.statusIsSet()) || (statusIsSet() && rhs.statusIsSet() && getStatus() == rhs.getStatus())) &&
    
    (getCatalogType() == rhs.getCatalogType())
    
    
    ;
}

bool CatalogsHotelFeedsUpdateRequest::operator!=(const CatalogsHotelFeedsUpdateRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsHotelFeedsUpdateRequest& o)
{
    j = nlohmann::json::object();
    if(o.defaultCurrencyIsSet())
        j["default_currency"] = o.m_Default_currency;
    if(o.nameIsSet())
        j["name"] = o.m_Name;
    if(o.formatIsSet())
        j["format"] = o.m_Format;
    if(o.credentialsIsSet())
        j["credentials"] = o.m_Credentials;
    if(o.locationIsSet())
        j["location"] = o.m_Location;
    if(o.preferredProcessingScheduleIsSet())
        j["preferred_processing_schedule"] = o.m_Preferred_processing_schedule;
    if(o.statusIsSet())
        j["status"] = o.m_Status;
    j["catalog_type"] = o.m_Catalog_type;
    
}

void from_json(const nlohmann::json& j, CatalogsHotelFeedsUpdateRequest& o)
{
    if(j.find("default_currency") != j.end())
    {
        j.at("default_currency").get_to(o.m_Default_currency);
        o.m_Default_currencyIsSet = true;
    } 
    if(j.find("name") != j.end())
    {
        j.at("name").get_to(o.m_Name);
        o.m_NameIsSet = true;
    } 
    if(j.find("format") != j.end())
    {
        j.at("format").get_to(o.m_Format);
        o.m_FormatIsSet = true;
    } 
    if(j.find("credentials") != j.end())
    {
        j.at("credentials").get_to(o.m_Credentials);
        o.m_CredentialsIsSet = true;
    } 
    if(j.find("location") != j.end())
    {
        j.at("location").get_to(o.m_Location);
        o.m_LocationIsSet = true;
    } 
    if(j.find("preferred_processing_schedule") != j.end())
    {
        j.at("preferred_processing_schedule").get_to(o.m_Preferred_processing_schedule);
        o.m_Preferred_processing_scheduleIsSet = true;
    } 
    if(j.find("status") != j.end())
    {
        j.at("status").get_to(o.m_Status);
        o.m_StatusIsSet = true;
    } 
    j.at("catalog_type").get_to(o.m_Catalog_type);
    
}

org::openapitools::server::model::NullableCurrency CatalogsHotelFeedsUpdateRequest::getDefaultCurrency() const
{
    return m_Default_currency;
}
void CatalogsHotelFeedsUpdateRequest::setDefaultCurrency(org::openapitools::server::model::NullableCurrency const& value)
{
    m_Default_currency = value;
    m_Default_currencyIsSet = true;
}
bool CatalogsHotelFeedsUpdateRequest::defaultCurrencyIsSet() const
{
    return m_Default_currencyIsSet;
}
void CatalogsHotelFeedsUpdateRequest::unsetDefault_currency()
{
    m_Default_currencyIsSet = false;
}
std::string CatalogsHotelFeedsUpdateRequest::getName() const
{
    return m_Name;
}
void CatalogsHotelFeedsUpdateRequest::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool CatalogsHotelFeedsUpdateRequest::nameIsSet() const
{
    return m_NameIsSet;
}
void CatalogsHotelFeedsUpdateRequest::unsetName()
{
    m_NameIsSet = false;
}
org::openapitools::server::model::CatalogsFormat CatalogsHotelFeedsUpdateRequest::getFormat() const
{
    return m_Format;
}
void CatalogsHotelFeedsUpdateRequest::setFormat(org::openapitools::server::model::CatalogsFormat const& value)
{
    m_Format = value;
    m_FormatIsSet = true;
}
bool CatalogsHotelFeedsUpdateRequest::formatIsSet() const
{
    return m_FormatIsSet;
}
void CatalogsHotelFeedsUpdateRequest::unsetFormat()
{
    m_FormatIsSet = false;
}
org::openapitools::server::model::CatalogsFeedCredentials CatalogsHotelFeedsUpdateRequest::getCredentials() const
{
    return m_Credentials;
}
void CatalogsHotelFeedsUpdateRequest::setCredentials(org::openapitools::server::model::CatalogsFeedCredentials const& value)
{
    m_Credentials = value;
    m_CredentialsIsSet = true;
}
bool CatalogsHotelFeedsUpdateRequest::credentialsIsSet() const
{
    return m_CredentialsIsSet;
}
void CatalogsHotelFeedsUpdateRequest::unsetCredentials()
{
    m_CredentialsIsSet = false;
}
std::string CatalogsHotelFeedsUpdateRequest::getLocation() const
{
    return m_Location;
}
void CatalogsHotelFeedsUpdateRequest::setLocation(std::string const& value)
{
    m_Location = value;
    m_LocationIsSet = true;
}
bool CatalogsHotelFeedsUpdateRequest::locationIsSet() const
{
    return m_LocationIsSet;
}
void CatalogsHotelFeedsUpdateRequest::unsetLocation()
{
    m_LocationIsSet = false;
}
org::openapitools::server::model::CatalogsFeedProcessingSchedule CatalogsHotelFeedsUpdateRequest::getPreferredProcessingSchedule() const
{
    return m_Preferred_processing_schedule;
}
void CatalogsHotelFeedsUpdateRequest::setPreferredProcessingSchedule(org::openapitools::server::model::CatalogsFeedProcessingSchedule const& value)
{
    m_Preferred_processing_schedule = value;
    m_Preferred_processing_scheduleIsSet = true;
}
bool CatalogsHotelFeedsUpdateRequest::preferredProcessingScheduleIsSet() const
{
    return m_Preferred_processing_scheduleIsSet;
}
void CatalogsHotelFeedsUpdateRequest::unsetPreferred_processing_schedule()
{
    m_Preferred_processing_scheduleIsSet = false;
}
org::openapitools::server::model::CatalogsStatus CatalogsHotelFeedsUpdateRequest::getStatus() const
{
    return m_Status;
}
void CatalogsHotelFeedsUpdateRequest::setStatus(org::openapitools::server::model::CatalogsStatus const& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}
bool CatalogsHotelFeedsUpdateRequest::statusIsSet() const
{
    return m_StatusIsSet;
}
void CatalogsHotelFeedsUpdateRequest::unsetStatus()
{
    m_StatusIsSet = false;
}
org::openapitools::server::model::CatalogsType CatalogsHotelFeedsUpdateRequest::getCatalogType() const
{
    return m_Catalog_type;
}
void CatalogsHotelFeedsUpdateRequest::setCatalogType(org::openapitools::server::model::CatalogsType const& value)
{
    m_Catalog_type = value;
}


} // namespace org::openapitools::server::model
