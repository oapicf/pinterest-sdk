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


#include "CatalogsFeed.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsFeed::CatalogsFeed()
{
    m_Created_at = "";
    m_Id = "";
    m_Updated_at = "";
    m_Name = "";
    m_Location = "";
    m_Default_locale = "";
    m_Catalog_id = "";
    
}

void CatalogsFeed::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsFeed::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsFeed::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsFeed" : pathPrefix;

                                
    if (!m_Credentials.validate(msg, _pathPrefix + ".credentials")) {
        msg << _pathPrefix << ": Credentials is invalid;";
        success = false;
    }        
    if (!m_Preferred_processing_schedule.validate(msg, _pathPrefix + ".preferredProcessingSchedule")) {
        msg << _pathPrefix << ": Preferred_processing_schedule is invalid;";
        success = false;
    }                         
    
    /* Catalog_id */ {
        const std::string& value = m_Catalog_id;
        const std::string currentValuePath = _pathPrefix + ".catalogId";
                
        

    }
    
    return success;
}

bool CatalogsFeed::operator==(const CatalogsFeed& rhs) const
{
    return
    
    
    (getCreatedAt() == rhs.getCreatedAt())
     &&
    
    (getId() == rhs.getId())
     &&
    
    (getUpdatedAt() == rhs.getUpdatedAt())
     &&
    
    (getName() == rhs.getName())
     &&
    
    (getFormat() == rhs.getFormat())
     &&
    
    (getCatalogType() == rhs.getCatalogType())
     &&
    
    (getCredentials() == rhs.getCredentials())
     &&
    
    (getLocation() == rhs.getLocation())
     &&
    
    (getPreferredProcessingSchedule() == rhs.getPreferredProcessingSchedule())
     &&
    
    (getStatus() == rhs.getStatus())
     &&
    
    (getDefaultCurrency() == rhs.getDefaultCurrency())
     &&
    
    (getDefaultLocale() == rhs.getDefaultLocale())
     &&
    
    (getDefaultCountry() == rhs.getDefaultCountry())
     &&
    
    (getDefaultAvailability() == rhs.getDefaultAvailability())
     &&
    
    (getCatalogId() == rhs.getCatalogId())
    
    
    ;
}

bool CatalogsFeed::operator!=(const CatalogsFeed& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsFeed& o)
{
    j = nlohmann::json::object();
    j["created_at"] = o.m_Created_at;
    j["id"] = o.m_Id;
    j["updated_at"] = o.m_Updated_at;
    j["name"] = o.m_Name;
    j["format"] = o.m_Format;
    j["catalog_type"] = o.m_Catalog_type;
    j["credentials"] = o.m_Credentials;
    j["location"] = o.m_Location;
    j["preferred_processing_schedule"] = o.m_Preferred_processing_schedule;
    j["status"] = o.m_Status;
    j["default_currency"] = o.m_Default_currency;
    j["default_locale"] = o.m_Default_locale;
    j["default_country"] = o.m_Default_country;
    j["default_availability"] = o.m_Default_availability;
    j["catalog_id"] = o.m_Catalog_id;
    
}

void from_json(const nlohmann::json& j, CatalogsFeed& o)
{
    j.at("created_at").get_to(o.m_Created_at);
    j.at("id").get_to(o.m_Id);
    j.at("updated_at").get_to(o.m_Updated_at);
    j.at("name").get_to(o.m_Name);
    j.at("format").get_to(o.m_Format);
    j.at("catalog_type").get_to(o.m_Catalog_type);
    j.at("credentials").get_to(o.m_Credentials);
    j.at("location").get_to(o.m_Location);
    j.at("preferred_processing_schedule").get_to(o.m_Preferred_processing_schedule);
    j.at("status").get_to(o.m_Status);
    j.at("default_currency").get_to(o.m_Default_currency);
    j.at("default_locale").get_to(o.m_Default_locale);
    j.at("default_country").get_to(o.m_Default_country);
    j.at("default_availability").get_to(o.m_Default_availability);
    j.at("catalog_id").get_to(o.m_Catalog_id);
    
}

std::string CatalogsFeed::getCreatedAt() const
{
    return m_Created_at;
}
void CatalogsFeed::setCreatedAt(std::string const& value)
{
    m_Created_at = value;
}
std::string CatalogsFeed::getId() const
{
    return m_Id;
}
void CatalogsFeed::setId(std::string const& value)
{
    m_Id = value;
}
std::string CatalogsFeed::getUpdatedAt() const
{
    return m_Updated_at;
}
void CatalogsFeed::setUpdatedAt(std::string const& value)
{
    m_Updated_at = value;
}
std::string CatalogsFeed::getName() const
{
    return m_Name;
}
void CatalogsFeed::setName(std::string const& value)
{
    m_Name = value;
}
org::openapitools::server::model::CatalogsFormat CatalogsFeed::getFormat() const
{
    return m_Format;
}
void CatalogsFeed::setFormat(org::openapitools::server::model::CatalogsFormat const& value)
{
    m_Format = value;
}
org::openapitools::server::model::CatalogsType CatalogsFeed::getCatalogType() const
{
    return m_Catalog_type;
}
void CatalogsFeed::setCatalogType(org::openapitools::server::model::CatalogsType const& value)
{
    m_Catalog_type = value;
}
org::openapitools::server::model::CatalogsFeedCredentials CatalogsFeed::getCredentials() const
{
    return m_Credentials;
}
void CatalogsFeed::setCredentials(org::openapitools::server::model::CatalogsFeedCredentials const& value)
{
    m_Credentials = value;
}
std::string CatalogsFeed::getLocation() const
{
    return m_Location;
}
void CatalogsFeed::setLocation(std::string const& value)
{
    m_Location = value;
}
org::openapitools::server::model::CatalogsFeedProcessingSchedule CatalogsFeed::getPreferredProcessingSchedule() const
{
    return m_Preferred_processing_schedule;
}
void CatalogsFeed::setPreferredProcessingSchedule(org::openapitools::server::model::CatalogsFeedProcessingSchedule const& value)
{
    m_Preferred_processing_schedule = value;
}
org::openapitools::server::model::CatalogsStatus CatalogsFeed::getStatus() const
{
    return m_Status;
}
void CatalogsFeed::setStatus(org::openapitools::server::model::CatalogsStatus const& value)
{
    m_Status = value;
}
org::openapitools::server::model::NullableCurrency CatalogsFeed::getDefaultCurrency() const
{
    return m_Default_currency;
}
void CatalogsFeed::setDefaultCurrency(org::openapitools::server::model::NullableCurrency const& value)
{
    m_Default_currency = value;
}
std::string CatalogsFeed::getDefaultLocale() const
{
    return m_Default_locale;
}
void CatalogsFeed::setDefaultLocale(std::string const& value)
{
    m_Default_locale = value;
}
org::openapitools::server::model::Country CatalogsFeed::getDefaultCountry() const
{
    return m_Default_country;
}
void CatalogsFeed::setDefaultCountry(org::openapitools::server::model::Country const& value)
{
    m_Default_country = value;
}
org::openapitools::server::model::ProductAvailabilityType CatalogsFeed::getDefaultAvailability() const
{
    return m_Default_availability;
}
void CatalogsFeed::setDefaultAvailability(org::openapitools::server::model::ProductAvailabilityType const& value)
{
    m_Default_availability = value;
}
std::string CatalogsFeed::getCatalogId() const
{
    return m_Catalog_id;
}
void CatalogsFeed::setCatalogId(std::string const& value)
{
    m_Catalog_id = value;
}


} // namespace org::openapitools::server::model

