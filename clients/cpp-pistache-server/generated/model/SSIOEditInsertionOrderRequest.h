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
/*
 * SSIOEditInsertionOrderRequest.h
 *
 * 
 */

#ifndef SSIOEditInsertionOrderRequest_H_
#define SSIOEditInsertionOrderRequest_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  SSIOEditInsertionOrderRequest
{
public:
    SSIOEditInsertionOrderRequest();
    virtual ~SSIOEditInsertionOrderRequest() = default;


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

    bool operator==(const SSIOEditInsertionOrderRequest& rhs) const;
    bool operator!=(const SSIOEditInsertionOrderRequest& rhs) const;

    /////////////////////////////////////////////
    /// SSIOEditInsertionOrderRequest members

    /// <summary>
    /// Starting date of time period. Format: YYYY-MM-DD
    /// </summary>
    std::string getStartDate() const;
    void setStartDate(std::string const& value);
    bool startDateIsSet() const;
    void unsetStart_date();
    /// <summary>
    /// End date of time period. Format: YYYY-MM-DD
    /// </summary>
    std::string getEndDate() const;
    void setEndDate(std::string const& value);
    bool endDateIsSet() const;
    void unsetEnd_date();
    /// <summary>
    /// The po number
    /// </summary>
    std::string getPoNumber() const;
    void setPoNumber(std::string const& value);
    bool poNumberIsSet() const;
    void unsetPo_number();
    /// <summary>
    /// If Budget order line, the budget amount.
    /// </summary>
    double getBudgetAmount() const;
    void setBudgetAmount(double const value);
    bool budgetAmountIsSet() const;
    void unsetBudget_amount();
    /// <summary>
    /// The billing contact first name
    /// </summary>
    std::string getBillingContactFirstname() const;
    void setBillingContactFirstname(std::string const& value);
    bool billingContactFirstnameIsSet() const;
    void unsetBilling_contact_firstname();
    /// <summary>
    /// The billing contact last name
    /// </summary>
    std::string getBillingContactLastname() const;
    void setBillingContactLastname(std::string const& value);
    bool billingContactLastnameIsSet() const;
    void unsetBilling_contact_lastname();
    /// <summary>
    /// The billing contact email
    /// </summary>
    std::string getBillingContactEmail() const;
    void setBillingContactEmail(std::string const& value);
    bool billingContactEmailIsSet() const;
    void unsetBilling_contact_email();
    /// <summary>
    /// The media contact first name
    /// </summary>
    std::string getMediaContactFirstname() const;
    void setMediaContactFirstname(std::string const& value);
    bool mediaContactFirstnameIsSet() const;
    void unsetMedia_contact_firstname();
    /// <summary>
    /// The media contact last name
    /// </summary>
    std::string getMediaContactLastname() const;
    void setMediaContactLastname(std::string const& value);
    bool mediaContactLastnameIsSet() const;
    void unsetMedia_contact_lastname();
    /// <summary>
    /// The media contact email
    /// </summary>
    std::string getMediaContactEmail() const;
    void setMediaContactEmail(std::string const& value);
    bool mediaContactEmailIsSet() const;
    void unsetMedia_contact_email();
    /// <summary>
    /// URL link for agency
    /// </summary>
    std::string getAgencyLink() const;
    void setAgencyLink(std::string const& value);
    bool agencyLinkIsSet() const;
    void unsetAgency_link();
    /// <summary>
    /// The email of user submitting the insertion order
    /// </summary>
    std::string getUserEmail() const;
    void setUserEmail(std::string const& value);
    bool userEmailIsSet() const;
    void unsetUser_email();
    /// <summary>
    /// LineId in the Oracle DB
    /// </summary>
    std::string getOracleLineId() const;
    void setOracleLineId(std::string const& value);
    bool oracleLineIdIsSet() const;
    void unsetOracle_line_id();
    /// <summary>
    /// OrderId in SFDC
    /// </summary>
    std::string getSalesforceOrderId() const;
    void setSalesforceOrderId(std::string const& value);
    bool salesforceOrderIdIsSet() const;
    void unsetSalesforce_order_id();
    /// <summary>
    /// OrderLineId in SFDC
    /// </summary>
    std::string getSalesforceOrderLineId() const;
    void setSalesforceOrderLineId(std::string const& value);
    bool salesforceOrderLineIdIsSet() const;
    void unsetSalesforce_order_line_id();
    /// <summary>
    /// Ads manager OrderLineId
    /// </summary>
    std::string getAdsManagerOrderLineId() const;
    void setAdsManagerOrderLineId(std::string const& value);
    bool adsManagerOrderLineIdIsSet() const;
    void unsetAds_manager_order_line_id();

    friend  void to_json(nlohmann::json& j, const SSIOEditInsertionOrderRequest& o);
    friend  void from_json(const nlohmann::json& j, SSIOEditInsertionOrderRequest& o);
protected:
    std::string m_Start_date;
    bool m_Start_dateIsSet;
    std::string m_End_date;
    bool m_End_dateIsSet;
    std::string m_Po_number;
    bool m_Po_numberIsSet;
    double m_Budget_amount;
    bool m_Budget_amountIsSet;
    std::string m_Billing_contact_firstname;
    bool m_Billing_contact_firstnameIsSet;
    std::string m_Billing_contact_lastname;
    bool m_Billing_contact_lastnameIsSet;
    std::string m_Billing_contact_email;
    bool m_Billing_contact_emailIsSet;
    std::string m_Media_contact_firstname;
    bool m_Media_contact_firstnameIsSet;
    std::string m_Media_contact_lastname;
    bool m_Media_contact_lastnameIsSet;
    std::string m_Media_contact_email;
    bool m_Media_contact_emailIsSet;
    std::string m_Agency_link;
    bool m_Agency_linkIsSet;
    std::string m_User_email;
    bool m_User_emailIsSet;
    std::string m_Oracle_line_id;
    bool m_Oracle_line_idIsSet;
    std::string m_Salesforce_order_id;
    bool m_Salesforce_order_idIsSet;
    std::string m_Salesforce_order_line_id;
    bool m_Salesforce_order_line_idIsSet;
    std::string m_Ads_manager_order_line_id;
    bool m_Ads_manager_order_line_idIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* SSIOEditInsertionOrderRequest_H_ */