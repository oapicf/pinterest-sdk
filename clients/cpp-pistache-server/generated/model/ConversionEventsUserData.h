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
/*
 * ConversionEventsUserData.h
 *
 * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
 */

#ifndef ConversionEventsUserData_H_
#define ConversionEventsUserData_H_


#include "ConversionEventsUserData_anyOf_2.h"
#include <string>
#include "ConversionEventsUserData_anyOf_1.h"
#include <vector>
#include "ConversionEventsUserData_anyOf.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
/// </summary>
class  ConversionEventsUserData
{
public:
    ConversionEventsUserData();
    virtual ~ConversionEventsUserData() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const ConversionEventsUserData& rhs) const;
    bool operator!=(const ConversionEventsUserData& rhs) const;

    /////////////////////////////////////////////
    /// ConversionEventsUserData members

    /// <summary>
    /// Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    /// </summary>
    std::vector<std::string> getPh() const;
    void setPh(std::vector<std::string> const& value);
    bool phIsSet() const;
    void unsetPh();
    /// <summary>
    /// Sha256 hashes of user&#39;s gender, in lowercase. Either \&quot;f\&quot; or \&quot;m\&quot; or \&quot;n\&quot; for non-binary gender. The string should be in the UTF-8 format.
    /// </summary>
    std::vector<std::string> getGe() const;
    void setGe(std::vector<std::string> const& value);
    bool geIsSet() const;
    void unsetGe();
    /// <summary>
    /// Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
    /// </summary>
    std::vector<std::string> getDb() const;
    void setDb(std::vector<std::string> const& value);
    bool dbIsSet() const;
    void unsetDb();
    /// <summary>
    /// Sha256 hashes of user&#39;s last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    /// </summary>
    std::vector<std::string> getLn() const;
    void setLn(std::vector<std::string> const& value);
    bool lnIsSet() const;
    void unsetLn();
    /// <summary>
    /// Sha256 hashes of user&#39;s first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    /// </summary>
    std::vector<std::string> getFn() const;
    void setFn(std::vector<std::string> const& value);
    bool fnIsSet() const;
    void unsetFn();
    /// <summary>
    /// Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
    /// </summary>
    std::vector<std::string> getCt() const;
    void setCt(std::vector<std::string> const& value);
    bool ctIsSet() const;
    void unsetCt();
    /// <summary>
    /// Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
    /// </summary>
    std::vector<std::string> getSt() const;
    void setSt(std::vector<std::string> const& value);
    bool stIsSet() const;
    void unsetSt();
    /// <summary>
    /// Sha256 hashes of user&#39;s zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
    /// </summary>
    std::vector<std::string> getZp() const;
    void setZp(std::vector<std::string> const& value);
    bool zpIsSet() const;
    void unsetZp();
    /// <summary>
    /// Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. The string should be in the UTF-8 format.
    /// </summary>
    std::vector<std::string> getCountry() const;
    void setCountry(std::vector<std::string> const& value);
    bool countryIsSet() const;
    void unsetCountry();
    /// <summary>
    /// Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    /// </summary>
    std::vector<std::string> getExternalId() const;
    void setExternalId(std::vector<std::string> const& value);
    bool externalIdIsSet() const;
    void unsetExternal_id();
    /// <summary>
    /// The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
    /// </summary>
    std::string getClickId() const;
    void setClickId(std::string const& value);
    bool clickIdIsSet() const;
    void unsetClick_id();
    /// <summary>
    /// A unique identifier of visitors&#39; information defined by third party partners. e.g RampID
    /// </summary>
    std::string getPartnerId() const;
    void setPartnerId(std::string const& value);
    bool partnerIdIsSet() const;
    void unsetPartner_id();
    /// <summary>
    /// Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    /// </summary>
    std::vector<std::string> getEm() const;
    void setEm(std::vector<std::string> const& value);
    /// <summary>
    /// Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    /// </summary>
    std::vector<std::string> getHashedMaids() const;
    void setHashedMaids(std::vector<std::string> const& value);
    /// <summary>
    /// The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
    /// </summary>
    std::string getClientIpAddress() const;
    void setClientIpAddress(std::string const& value);
    /// <summary>
    /// The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
    /// </summary>
    std::string getClientUserAgent() const;
    void setClientUserAgent(std::string const& value);

    friend  void to_json(nlohmann::json& j, const ConversionEventsUserData& o);
    friend  void from_json(const nlohmann::json& j, ConversionEventsUserData& o);
protected:
    std::vector<std::string> m_Ph;
    bool m_PhIsSet;
    std::vector<std::string> m_Ge;
    bool m_GeIsSet;
    std::vector<std::string> m_Db;
    bool m_DbIsSet;
    std::vector<std::string> m_Ln;
    bool m_LnIsSet;
    std::vector<std::string> m_Fn;
    bool m_FnIsSet;
    std::vector<std::string> m_Ct;
    bool m_CtIsSet;
    std::vector<std::string> m_St;
    bool m_StIsSet;
    std::vector<std::string> m_Zp;
    bool m_ZpIsSet;
    std::vector<std::string> m_Country;
    bool m_CountryIsSet;
    std::vector<std::string> m_External_id;
    bool m_External_idIsSet;
    std::string m_Click_id;
    bool m_Click_idIsSet;
    std::string m_Partner_id;
    bool m_Partner_idIsSet;
    std::vector<std::string> m_Em;

    std::vector<std::string> m_Hashed_maids;

    std::string m_Client_ip_address;

    std::string m_Client_user_agent;

    
};

} // namespace org::openapitools::server::model

#endif /* ConversionEventsUserData_H_ */
