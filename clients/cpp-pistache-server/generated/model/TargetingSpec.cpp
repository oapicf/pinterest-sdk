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


#include "TargetingSpec.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

TargetingSpec::TargetingSpec()
{
    m_AGE_BUCKETIsSet = false;
    m_APPTYPEIsSet = false;
    m_AUDIENCE_EXCLUDEIsSet = false;
    m_AUDIENCE_INCLUDEIsSet = false;
    m_GENDERIsSet = false;
    m_GEOIsSet = false;
    m_INTERESTIsSet = false;
    m_LOCALEIsSet = false;
    m_LOCATIONIsSet = false;
    m_SHOPPING_RETARGETINGIsSet = false;
    m_TARGETING_STRATEGYIsSet = false;
    
}

void TargetingSpec::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool TargetingSpec::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool TargetingSpec::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "TargetingSpec" : pathPrefix;

         
    if (aGEBUCKETIsSet())
    {
        const std::vector<std::string>& value = m_AGE_BUCKET;
        const std::string currentValuePath = _pathPrefix + ".aGEBUCKET";
                
        success = value.validate(msg, currentValuePath) && success;
        
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
        if (
            value != "18-24" &&
            value != "21+" &&
            value != "25-34" &&
            value != "35-44" &&
            value != "45-49" &&
            value != "50-54" &&
            value != "55-64" &&
            value != "65+"
        ) {
            success = false;
            msg << currentValuePath << ": has invalid value \"" << value << "\";";
        }
 
                i++;
            }
        }

    }
         
    if (aPPTYPEIsSet())
    {
        const std::vector<std::string>& value = m_APPTYPE;
        const std::string currentValuePath = _pathPrefix + ".aPPTYPE";
                
        success = value.validate(msg, currentValuePath) && success;
        
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
        if (
            value != "android_mobile" &&
            value != "android_tablet" &&
            value != "ipad" &&
            value != "iphone" &&
            value != "web" &&
            value != "web_mobile"
        ) {
            success = false;
            msg << currentValuePath << ": has invalid value \"" << value << "\";";
        }
 
                i++;
            }
        }

    }
         
    if (aUDIENCEEXCLUDEIsSet())
    {
        const std::vector<std::string>& value = m_AUDIENCE_EXCLUDE;
        const std::string currentValuePath = _pathPrefix + ".aUDIENCEEXCLUDE";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
         
    if (aUDIENCEINCLUDEIsSet())
    {
        const std::vector<std::string>& value = m_AUDIENCE_INCLUDE;
        const std::string currentValuePath = _pathPrefix + ".aUDIENCEINCLUDE";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
         
    if (gENDERIsSet())
    {
        const std::vector<std::string>& value = m_GENDER;
        const std::string currentValuePath = _pathPrefix + ".gENDER";
                
        success = value.validate(msg, currentValuePath) && success;
        
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
        if (
            value != "unknown" &&
            value != "male" &&
            value != "female"
        ) {
            success = false;
            msg << currentValuePath << ": has invalid value \"" << value << "\";";
        }
 
                i++;
            }
        }

    }
         
    if (gEOIsSet())
    {
        const std::vector<std::string>& value = m_GEO;
        const std::string currentValuePath = _pathPrefix + ".gEO";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
         
    if (iNTERESTIsSet())
    {
        const std::vector<std::string>& value = m_INTEREST;
        const std::string currentValuePath = _pathPrefix + ".iNTEREST";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
         
    if (lOCALEIsSet())
    {
        const std::vector<std::string>& value = m_LOCALE;
        const std::string currentValuePath = _pathPrefix + ".lOCALE";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
         
    if (lOCATIONIsSet())
    {
        const std::vector<std::string>& value = m_LOCATION;
        const std::string currentValuePath = _pathPrefix + ".lOCATION";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
         
    if (sHOPPINGRETARGETINGIsSet())
    {
        const std::vector<org::openapitools::server::model::TargetingSpec_SHOPPING_RETARGETING>& value = m_SHOPPING_RETARGETING;
        const std::string currentValuePath = _pathPrefix + ".sHOPPINGRETARGETING";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::TargetingSpec_SHOPPING_RETARGETING& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".sHOPPINGRETARGETING") && success;
 
                i++;
            }
        }

    }
         
    if (tARGETINGSTRATEGYIsSet())
    {
        const std::vector<std::string>& value = m_TARGETING_STRATEGY;
        const std::string currentValuePath = _pathPrefix + ".tARGETINGSTRATEGY";
                
        success = value.validate(msg, currentValuePath) && success;
        
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
        if (
            value != "CHOOSE_YOUR_OWN" &&
            value != "FIND_NEW_CUSTOMERS" &&
            value != "RECONNECT_WITH_USERS"
        ) {
            success = false;
            msg << currentValuePath << ": has invalid value \"" << value << "\";";
        }
 
                i++;
            }
        }

    }
    
    return success;
}

bool TargetingSpec::operator==(const TargetingSpec& rhs) const
{
    return
    
    
    
    ((!aGEBUCKETIsSet() && !rhs.aGEBUCKETIsSet()) || (aGEBUCKETIsSet() && rhs.aGEBUCKETIsSet() && getAGEBUCKET() == rhs.getAGEBUCKET())) &&
    
    
    ((!aPPTYPEIsSet() && !rhs.aPPTYPEIsSet()) || (aPPTYPEIsSet() && rhs.aPPTYPEIsSet() && getAPPTYPE() == rhs.getAPPTYPE())) &&
    
    
    ((!aUDIENCEEXCLUDEIsSet() && !rhs.aUDIENCEEXCLUDEIsSet()) || (aUDIENCEEXCLUDEIsSet() && rhs.aUDIENCEEXCLUDEIsSet() && getAUDIENCEEXCLUDE() == rhs.getAUDIENCEEXCLUDE())) &&
    
    
    ((!aUDIENCEINCLUDEIsSet() && !rhs.aUDIENCEINCLUDEIsSet()) || (aUDIENCEINCLUDEIsSet() && rhs.aUDIENCEINCLUDEIsSet() && getAUDIENCEINCLUDE() == rhs.getAUDIENCEINCLUDE())) &&
    
    
    ((!gENDERIsSet() && !rhs.gENDERIsSet()) || (gENDERIsSet() && rhs.gENDERIsSet() && getGENDER() == rhs.getGENDER())) &&
    
    
    ((!gEOIsSet() && !rhs.gEOIsSet()) || (gEOIsSet() && rhs.gEOIsSet() && getGEO() == rhs.getGEO())) &&
    
    
    ((!iNTERESTIsSet() && !rhs.iNTERESTIsSet()) || (iNTERESTIsSet() && rhs.iNTERESTIsSet() && getINTEREST() == rhs.getINTEREST())) &&
    
    
    ((!lOCALEIsSet() && !rhs.lOCALEIsSet()) || (lOCALEIsSet() && rhs.lOCALEIsSet() && getLOCALE() == rhs.getLOCALE())) &&
    
    
    ((!lOCATIONIsSet() && !rhs.lOCATIONIsSet()) || (lOCATIONIsSet() && rhs.lOCATIONIsSet() && getLOCATION() == rhs.getLOCATION())) &&
    
    
    ((!sHOPPINGRETARGETINGIsSet() && !rhs.sHOPPINGRETARGETINGIsSet()) || (sHOPPINGRETARGETINGIsSet() && rhs.sHOPPINGRETARGETINGIsSet() && getSHOPPINGRETARGETING() == rhs.getSHOPPINGRETARGETING())) &&
    
    
    ((!tARGETINGSTRATEGYIsSet() && !rhs.tARGETINGSTRATEGYIsSet()) || (tARGETINGSTRATEGYIsSet() && rhs.tARGETINGSTRATEGYIsSet() && getTARGETINGSTRATEGY() == rhs.getTARGETINGSTRATEGY()))
    
    ;
}

bool TargetingSpec::operator!=(const TargetingSpec& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const TargetingSpec& o)
{
    j = nlohmann::json::object();
    if(o.aGEBUCKETIsSet() || !o.m_AGE_BUCKET.empty())
        j["AGE_BUCKET"] = o.m_AGE_BUCKET;
    if(o.aPPTYPEIsSet() || !o.m_APPTYPE.empty())
        j["APPTYPE"] = o.m_APPTYPE;
    if(o.aUDIENCEEXCLUDEIsSet() || !o.m_AUDIENCE_EXCLUDE.empty())
        j["AUDIENCE_EXCLUDE"] = o.m_AUDIENCE_EXCLUDE;
    if(o.aUDIENCEINCLUDEIsSet() || !o.m_AUDIENCE_INCLUDE.empty())
        j["AUDIENCE_INCLUDE"] = o.m_AUDIENCE_INCLUDE;
    if(o.gENDERIsSet() || !o.m_GENDER.empty())
        j["GENDER"] = o.m_GENDER;
    if(o.gEOIsSet() || !o.m_GEO.empty())
        j["GEO"] = o.m_GEO;
    if(o.iNTERESTIsSet() || !o.m_INTEREST.empty())
        j["INTEREST"] = o.m_INTEREST;
    if(o.lOCALEIsSet() || !o.m_LOCALE.empty())
        j["LOCALE"] = o.m_LOCALE;
    if(o.lOCATIONIsSet() || !o.m_LOCATION.empty())
        j["LOCATION"] = o.m_LOCATION;
    if(o.sHOPPINGRETARGETINGIsSet() || !o.m_SHOPPING_RETARGETING.empty())
        j["SHOPPING_RETARGETING"] = o.m_SHOPPING_RETARGETING;
    if(o.tARGETINGSTRATEGYIsSet() || !o.m_TARGETING_STRATEGY.empty())
        j["TARGETING_STRATEGY"] = o.m_TARGETING_STRATEGY;
    
}

void from_json(const nlohmann::json& j, TargetingSpec& o)
{
    if(j.find("AGE_BUCKET") != j.end())
    {
        j.at("AGE_BUCKET").get_to(o.m_AGE_BUCKET);
        o.m_AGE_BUCKETIsSet = true;
    } 
    if(j.find("APPTYPE") != j.end())
    {
        j.at("APPTYPE").get_to(o.m_APPTYPE);
        o.m_APPTYPEIsSet = true;
    } 
    if(j.find("AUDIENCE_EXCLUDE") != j.end())
    {
        j.at("AUDIENCE_EXCLUDE").get_to(o.m_AUDIENCE_EXCLUDE);
        o.m_AUDIENCE_EXCLUDEIsSet = true;
    } 
    if(j.find("AUDIENCE_INCLUDE") != j.end())
    {
        j.at("AUDIENCE_INCLUDE").get_to(o.m_AUDIENCE_INCLUDE);
        o.m_AUDIENCE_INCLUDEIsSet = true;
    } 
    if(j.find("GENDER") != j.end())
    {
        j.at("GENDER").get_to(o.m_GENDER);
        o.m_GENDERIsSet = true;
    } 
    if(j.find("GEO") != j.end())
    {
        j.at("GEO").get_to(o.m_GEO);
        o.m_GEOIsSet = true;
    } 
    if(j.find("INTEREST") != j.end())
    {
        j.at("INTEREST").get_to(o.m_INTEREST);
        o.m_INTERESTIsSet = true;
    } 
    if(j.find("LOCALE") != j.end())
    {
        j.at("LOCALE").get_to(o.m_LOCALE);
        o.m_LOCALEIsSet = true;
    } 
    if(j.find("LOCATION") != j.end())
    {
        j.at("LOCATION").get_to(o.m_LOCATION);
        o.m_LOCATIONIsSet = true;
    } 
    if(j.find("SHOPPING_RETARGETING") != j.end())
    {
        j.at("SHOPPING_RETARGETING").get_to(o.m_SHOPPING_RETARGETING);
        o.m_SHOPPING_RETARGETINGIsSet = true;
    } 
    if(j.find("TARGETING_STRATEGY") != j.end())
    {
        j.at("TARGETING_STRATEGY").get_to(o.m_TARGETING_STRATEGY);
        o.m_TARGETING_STRATEGYIsSet = true;
    } 
    
}

std::vector<std::string> TargetingSpec::getAGEBUCKET() const
{
    return m_AGE_BUCKET;
}
void TargetingSpec::setAGEBUCKET(std::vector<std::string> const& value)
{
    m_AGE_BUCKET = value;
    m_AGE_BUCKETIsSet = true;
}
bool TargetingSpec::aGEBUCKETIsSet() const
{
    return m_AGE_BUCKETIsSet;
}
void TargetingSpec::unsetAGE_BUCKET()
{
    m_AGE_BUCKETIsSet = false;
}
std::vector<std::string> TargetingSpec::getAPPTYPE() const
{
    return m_APPTYPE;
}
void TargetingSpec::setAPPTYPE(std::vector<std::string> const& value)
{
    m_APPTYPE = value;
    m_APPTYPEIsSet = true;
}
bool TargetingSpec::aPPTYPEIsSet() const
{
    return m_APPTYPEIsSet;
}
void TargetingSpec::unsetAPPTYPE()
{
    m_APPTYPEIsSet = false;
}
std::vector<std::string> TargetingSpec::getAUDIENCEEXCLUDE() const
{
    return m_AUDIENCE_EXCLUDE;
}
void TargetingSpec::setAUDIENCEEXCLUDE(std::vector<std::string> const& value)
{
    m_AUDIENCE_EXCLUDE = value;
    m_AUDIENCE_EXCLUDEIsSet = true;
}
bool TargetingSpec::aUDIENCEEXCLUDEIsSet() const
{
    return m_AUDIENCE_EXCLUDEIsSet;
}
void TargetingSpec::unsetAUDIENCE_EXCLUDE()
{
    m_AUDIENCE_EXCLUDEIsSet = false;
}
std::vector<std::string> TargetingSpec::getAUDIENCEINCLUDE() const
{
    return m_AUDIENCE_INCLUDE;
}
void TargetingSpec::setAUDIENCEINCLUDE(std::vector<std::string> const& value)
{
    m_AUDIENCE_INCLUDE = value;
    m_AUDIENCE_INCLUDEIsSet = true;
}
bool TargetingSpec::aUDIENCEINCLUDEIsSet() const
{
    return m_AUDIENCE_INCLUDEIsSet;
}
void TargetingSpec::unsetAUDIENCE_INCLUDE()
{
    m_AUDIENCE_INCLUDEIsSet = false;
}
std::vector<std::string> TargetingSpec::getGENDER() const
{
    return m_GENDER;
}
void TargetingSpec::setGENDER(std::vector<std::string> const& value)
{
    m_GENDER = value;
    m_GENDERIsSet = true;
}
bool TargetingSpec::gENDERIsSet() const
{
    return m_GENDERIsSet;
}
void TargetingSpec::unsetGENDER()
{
    m_GENDERIsSet = false;
}
std::vector<std::string> TargetingSpec::getGEO() const
{
    return m_GEO;
}
void TargetingSpec::setGEO(std::vector<std::string> const& value)
{
    m_GEO = value;
    m_GEOIsSet = true;
}
bool TargetingSpec::gEOIsSet() const
{
    return m_GEOIsSet;
}
void TargetingSpec::unsetGEO()
{
    m_GEOIsSet = false;
}
std::vector<std::string> TargetingSpec::getINTEREST() const
{
    return m_INTEREST;
}
void TargetingSpec::setINTEREST(std::vector<std::string> const& value)
{
    m_INTEREST = value;
    m_INTERESTIsSet = true;
}
bool TargetingSpec::iNTERESTIsSet() const
{
    return m_INTERESTIsSet;
}
void TargetingSpec::unsetINTEREST()
{
    m_INTERESTIsSet = false;
}
std::vector<std::string> TargetingSpec::getLOCALE() const
{
    return m_LOCALE;
}
void TargetingSpec::setLOCALE(std::vector<std::string> const& value)
{
    m_LOCALE = value;
    m_LOCALEIsSet = true;
}
bool TargetingSpec::lOCALEIsSet() const
{
    return m_LOCALEIsSet;
}
void TargetingSpec::unsetLOCALE()
{
    m_LOCALEIsSet = false;
}
std::vector<std::string> TargetingSpec::getLOCATION() const
{
    return m_LOCATION;
}
void TargetingSpec::setLOCATION(std::vector<std::string> const& value)
{
    m_LOCATION = value;
    m_LOCATIONIsSet = true;
}
bool TargetingSpec::lOCATIONIsSet() const
{
    return m_LOCATIONIsSet;
}
void TargetingSpec::unsetLOCATION()
{
    m_LOCATIONIsSet = false;
}
std::vector<org::openapitools::server::model::TargetingSpec_SHOPPING_RETARGETING> TargetingSpec::getSHOPPINGRETARGETING() const
{
    return m_SHOPPING_RETARGETING;
}
void TargetingSpec::setSHOPPINGRETARGETING(std::vector<org::openapitools::server::model::TargetingSpec_SHOPPING_RETARGETING> const& value)
{
    m_SHOPPING_RETARGETING = value;
    m_SHOPPING_RETARGETINGIsSet = true;
}
bool TargetingSpec::sHOPPINGRETARGETINGIsSet() const
{
    return m_SHOPPING_RETARGETINGIsSet;
}
void TargetingSpec::unsetSHOPPING_RETARGETING()
{
    m_SHOPPING_RETARGETINGIsSet = false;
}
std::vector<std::string> TargetingSpec::getTARGETINGSTRATEGY() const
{
    return m_TARGETING_STRATEGY;
}
void TargetingSpec::setTARGETINGSTRATEGY(std::vector<std::string> const& value)
{
    m_TARGETING_STRATEGY = value;
    m_TARGETING_STRATEGYIsSet = true;
}
bool TargetingSpec::tARGETINGSTRATEGYIsSet() const
{
    return m_TARGETING_STRATEGYIsSet;
}
void TargetingSpec::unsetTARGETING_STRATEGY()
{
    m_TARGETING_STRATEGYIsSet = false;
}


} // namespace org::openapitools::server::model

