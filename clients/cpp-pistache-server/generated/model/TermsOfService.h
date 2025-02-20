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
 * TermsOfService.h
 *
 * 
 */

#ifndef TermsOfService_H_
#define TermsOfService_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  TermsOfService
{
public:
    TermsOfService();
    virtual ~TermsOfService() = default;


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

    bool operator==(const TermsOfService& rhs) const;
    bool operator!=(const TermsOfService& rhs) const;

    /////////////////////////////////////////////
    /// TermsOfService members

    /// <summary>
    /// The ID of the terms of service
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// The terms of service content
    /// </summary>
    std::string getHtml() const;
    void setHtml(std::string const& value);
    bool htmlIsSet() const;
    void unsetHtml();
    /// <summary>
    /// Whether the ad account has accepted terms of service.
    /// </summary>
    bool isHasAccepted() const;
    void setHasAccepted(bool const value);
    bool hasAcceptedIsSet() const;
    void unsetHas_accepted();
    /// <summary>
    /// The ID of the ad account.
    /// </summary>
    std::string getAdAccountId() const;
    void setAdAccountId(std::string const& value);
    bool adAccountIdIsSet() const;
    void unsetAd_account_id();

    friend  void to_json(nlohmann::json& j, const TermsOfService& o);
    friend  void from_json(const nlohmann::json& j, TermsOfService& o);
protected:
    std::string m_Id;
    bool m_IdIsSet;
    std::string m_Html;
    bool m_HtmlIsSet;
    bool m_Has_accepted;
    bool m_Has_acceptedIsSet;
    std::string m_Ad_account_id;
    bool m_Ad_account_idIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* TermsOfService_H_ */
