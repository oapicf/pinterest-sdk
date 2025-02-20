/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
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
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "SSIOInsertionOrderCommon.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  SSIOEditInsertionOrderRequest : public SSIOInsertionOrderCommon
{
public:
    SSIOEditInsertionOrderRequest() = default;
    explicit SSIOEditInsertionOrderRequest(boost::property_tree::ptree const& pt);
    virtual ~SSIOEditInsertionOrderRequest() = default;

    SSIOEditInsertionOrderRequest(const SSIOEditInsertionOrderRequest& other) = default; // copy constructor
    SSIOEditInsertionOrderRequest(SSIOEditInsertionOrderRequest&& other) noexcept = default; // move constructor

    SSIOEditInsertionOrderRequest& operator=(const SSIOEditInsertionOrderRequest& other) = default; // copy assignment
    SSIOEditInsertionOrderRequest& operator=(SSIOEditInsertionOrderRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// SSIOEditInsertionOrderRequest members

    /// <summary>
    /// Starting date of time period. Format: YYYY-MM-DD
    /// </summary>
    std::string getStartDate() const;
    void setStartDate(std::string value);

    /// <summary>
    /// End date of time period. Format: YYYY-MM-DD
    /// </summary>
    std::string getEndDate() const;
    void setEndDate(std::string value);

    /// <summary>
    /// The po number
    /// </summary>
    std::string getPoNumber() const;
    void setPoNumber(std::string value);

    /// <summary>
    /// If Budget order line, the budget amount.
    /// </summary>
    double getBudgetAmount() const;
    void setBudgetAmount(double value);

    /// <summary>
    /// The billing contact first name
    /// </summary>
    std::string getBillingContactFirstname() const;
    void setBillingContactFirstname(std::string value);

    /// <summary>
    /// The billing contact last name
    /// </summary>
    std::string getBillingContactLastname() const;
    void setBillingContactLastname(std::string value);

    /// <summary>
    /// The billing contact email
    /// </summary>
    std::string getBillingContactEmail() const;
    void setBillingContactEmail(std::string value);

    /// <summary>
    /// The media contact first name
    /// </summary>
    std::string getMediaContactFirstname() const;
    void setMediaContactFirstname(std::string value);

    /// <summary>
    /// The media contact last name
    /// </summary>
    std::string getMediaContactLastname() const;
    void setMediaContactLastname(std::string value);

    /// <summary>
    /// The media contact email
    /// </summary>
    std::string getMediaContactEmail() const;
    void setMediaContactEmail(std::string value);

    /// <summary>
    /// URL link for agency
    /// </summary>
    std::string getAgencyLink() const;
    void setAgencyLink(std::string value);

    /// <summary>
    /// The email of user submitting the insertion order
    /// </summary>
    std::string getUserEmail() const;
    void setUserEmail(std::string value);

    /// <summary>
    /// LineId in the Oracle DB
    /// </summary>
    std::string getOracleLineId() const;
    void setOracleLineId(std::string value);

    /// <summary>
    /// OrderId in SFDC
    /// </summary>
    std::string getSalesforceOrderId() const;
    void setSalesforceOrderId(std::string value);

    /// <summary>
    /// OrderLineId in SFDC
    /// </summary>
    std::string getSalesforceOrderLineId() const;
    void setSalesforceOrderLineId(std::string value);

    /// <summary>
    /// Ads manager OrderLineId
    /// </summary>
    std::string getAdsManagerOrderLineId() const;
    void setAdsManagerOrderLineId(std::string value);

protected:
    std::string m_Start_date = "";
    std::string m_End_date = "";
    std::string m_Po_number = "";
    double m_Budget_amount = 0.0;
    std::string m_Billing_contact_firstname = "";
    std::string m_Billing_contact_lastname = "";
    std::string m_Billing_contact_email = "";
    std::string m_Media_contact_firstname = "";
    std::string m_Media_contact_lastname = "";
    std::string m_Media_contact_email = "";
    std::string m_Agency_link = "";
    std::string m_User_email = "";
    std::string m_Oracle_line_id = "";
    std::string m_Salesforce_order_id = "";
    std::string m_Salesforce_order_line_id = "";
    std::string m_Ads_manager_order_line_id = "";
};

std::vector<SSIOEditInsertionOrderRequest> createSSIOEditInsertionOrderRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<SSIOEditInsertionOrderRequest>(const SSIOEditInsertionOrderRequest& val) {
    return val.toPropertyTree();
}

template<>
inline SSIOEditInsertionOrderRequest fromPt<SSIOEditInsertionOrderRequest>(const boost::property_tree::ptree& pt) {
    SSIOEditInsertionOrderRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* SSIOEditInsertionOrderRequest_H_ */
