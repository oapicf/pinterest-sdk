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
 * AdAccount.h
 *
 * 
 */

#ifndef AdAccount_H_
#define AdAccount_H_


#include "Country.h"
#include "Ad_account_owner.h"
#include <string>
#include "BusinessAccessRole.h"
#include "Currency.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  AdAccount
{
public:
    AdAccount();
    virtual ~AdAccount() = default;


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

    bool operator==(const AdAccount& rhs) const;
    bool operator!=(const AdAccount& rhs) const;

    /////////////////////////////////////////////
    /// AdAccount members

    /// <summary>
    /// 
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// 
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::Ad_account_owner getOwner() const;
    void setOwner(org::openapitools::server::model::Ad_account_owner const& value);
    bool ownerIsSet() const;
    void unsetOwner();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::Country getCountry() const;
    void setCountry(org::openapitools::server::model::Country const& value);
    bool countryIsSet() const;
    void unsetCountry();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::Currency getCurrency() const;
    void setCurrency(org::openapitools::server::model::Currency const& value);
    bool currencyIsSet() const;
    void unsetCurrency();
    /// <summary>
    /// 
    /// </summary>
    std::vector<org::openapitools::server::model::BusinessAccessRole> getPermissions() const;
    void setPermissions(std::vector<org::openapitools::server::model::BusinessAccessRole> const& value);
    bool permissionsIsSet() const;
    void unsetPermissions();
    /// <summary>
    /// Creation time. Unix timestamp in seconds.
    /// </summary>
    int32_t getCreatedTime() const;
    void setCreatedTime(int32_t const value);
    bool createdTimeIsSet() const;
    void unsetCreated_time();
    /// <summary>
    /// Last update time. Unix timestamp in seconds.
    /// </summary>
    int32_t getUpdatedTime() const;
    void setUpdatedTime(int32_t const value);
    bool updatedTimeIsSet() const;
    void unsetUpdated_time();

    friend  void to_json(nlohmann::json& j, const AdAccount& o);
    friend  void from_json(const nlohmann::json& j, AdAccount& o);
protected:
    std::string m_Id;
    bool m_IdIsSet;
    std::string m_Name;
    bool m_NameIsSet;
    org::openapitools::server::model::Ad_account_owner m_Owner;
    bool m_OwnerIsSet;
    org::openapitools::server::model::Country m_Country;
    bool m_CountryIsSet;
    org::openapitools::server::model::Currency m_Currency;
    bool m_CurrencyIsSet;
    std::vector<org::openapitools::server::model::BusinessAccessRole> m_Permissions;
    bool m_PermissionsIsSet;
    int32_t m_Created_time;
    bool m_Created_timeIsSet;
    int32_t m_Updated_time;
    bool m_Updated_timeIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* AdAccount_H_ */
