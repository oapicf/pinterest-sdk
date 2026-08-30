
/*
 * SSIOOrderLine.h
 *
 * A Salesforce SSIO order line.
 */

#ifndef TINY_CPP_CLIENT_SSIOOrderLine_H_
#define TINY_CPP_CLIENT_SSIOOrderLine_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Currency.h"
#include "Date.h"

namespace Tiny {


/*! \brief A Salesforce SSIO order line.
 *
 *  \ingroup Models
 *
 */

class SSIOOrderLine{
public:

    /*! \brief Constructor.
	 */
    SSIOOrderLine();
    SSIOOrderLine(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SSIOOrderLine();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The SFDC id for the terms
	 */
	std::string getAcceptedTermsId();

	/*! \brief Set The SFDC id for the terms
	 */
	void setAcceptedTermsId(std::string accepted_terms_id);
	/*! \brief Get The UTC timestamp (to the nearest second) when terms were accepted.
	 */
	std::string getAcceptedTermsTime();

	/*! \brief Set The UTC timestamp (to the nearest second) when terms were accepted.
	 */
	void setAcceptedTermsTime(std::string accepted_terms_time);
	/*! \brief Get Ads manager order line id
	 */
	std::string getAdsManagerOrderLineId();

	/*! \brief Set Ads manager order line id
	 */
	void setAdsManagerOrderLineId(std::string ads_manager_order_line_id);
	/*! \brief Get Agency link
	 */
	std::string getAgencyLink();

	/*! \brief Set Agency link
	 */
	void setAgencyLink(std::string agency_link);
	/*! \brief Get Bill-to company name
	 */
	std::string getBillToCompanyName();

	/*! \brief Set Bill-to company name
	 */
	void setBillToCompanyName(std::string bill_to_company_name);
	/*! \brief Get Billing contact email
	 */
	std::string getBillingContactEmail();

	/*! \brief Set Billing contact email
	 */
	void setBillingContactEmail(std::string billing_contact_email);
	/*! \brief Get Billing contact first name
	 */
	std::string getBillingContactFirstname();

	/*! \brief Set Billing contact first name
	 */
	void setBillingContactFirstname(std::string billing_contact_firstname);
	/*! \brief Get Billing contact last name
	 */
	std::string getBillingContactLastname();

	/*! \brief Set Billing contact last name
	 */
	void setBillingContactLastname(std::string billing_contact_lastname);
	/*! \brief Get If budget order line, the budget amount.
	 */
	long getBudgetAmount();

	/*! \brief Set If budget order line, the budget amount.
	 */
	void setBudgetAmount(long budget_amount);
	/*! \brief Get 
	 */
	Currency getCurrencyInfo();

	/*! \brief Set 
	 */
	void setCurrencyInfo(Currency currency_info);
	/*! \brief Get End date of the order line.
	 */
	Date getEndDate();

	/*! \brief Set End date of the order line.
	 */
	void setEndDate(Date end_date);
	/*! \brief Get If ongoing (perpetual) order line, the estimated monthly spend.
	 */
	long getEstimatedMonthlySpend();

	/*! \brief Set If ongoing (perpetual) order line, the estimated monthly spend.
	 */
	void setEstimatedMonthlySpend(long estimated_monthly_spend);
	/*! \brief Get Last modified date.
	 */
	std::string getLastModifiedDateTime();

	/*! \brief Set Last modified date.
	 */
	void setLastModifiedDateTime(std::string last_modified_date_time);
	/*! \brief Get Billing media email
	 */
	std::string getMediaContactEmail();

	/*! \brief Set Billing media email
	 */
	void setMediaContactEmail(std::string media_contact_email);
	/*! \brief Get Billing media contact first name
	 */
	std::string getMediaContactFirstname();

	/*! \brief Set Billing media contact first name
	 */
	void setMediaContactFirstname(std::string media_contact_firstname);
	/*! \brief Get Billing media contact last name
	 */
	std::string getMediaContactLastname();

	/*! \brief Set Billing media contact last name
	 */
	void setMediaContactLastname(std::string media_contact_lastname);
	/*! \brief Get The order name
	 */
	std::string getOrderName();

	/*! \brief Set The order name
	 */
	void setOrderName(std::string order_name);
	/*! \brief Get The pin order id associated with the order line in SFDC
	 */
	std::string getPinOrderId();

	/*! \brief Set The pin order id associated with the order line in SFDC
	 */
	void setPinOrderId(std::string pin_order_id);
	/*! \brief Get The Pinterest marketing partner name
	 */
	std::string getPmpName();

	/*! \brief Set The Pinterest marketing partner name
	 */
	void setPmpName(std::string pmp_name);
	/*! \brief Get The PO number
	 */
	std::string getPoNumber();

	/*! \brief Set The PO number
	 */
	void setPoNumber(std::string po_number);
	/*! \brief Get Order line id in SFDC
	 */
	std::string getSalesforceOrderLineId();

	/*! \brief Set Order line id in SFDC
	 */
	void setSalesforceOrderLineId(std::string salesforce_order_line_id);
	/*! \brief Get Start date of the order line.
	 */
	Date getStartDate();

	/*! \brief Set Start date of the order line.
	 */
	void setStartDate(Date start_date);


    private:
    std::string accepted_terms_id{};
    std::string accepted_terms_time{};
    std::string ads_manager_order_line_id{};
    std::string agency_link{};
    std::string bill_to_company_name{};
    std::string billing_contact_email{};
    std::string billing_contact_firstname{};
    std::string billing_contact_lastname{};
    long budget_amount{};
    Currency currency_info;
    Date end_date;
    long estimated_monthly_spend{};
    std::string last_modified_date_time{};
    std::string media_contact_email{};
    std::string media_contact_firstname{};
    std::string media_contact_lastname{};
    std::string order_name{};
    std::string pin_order_id{};
    std::string pmp_name{};
    std::string po_number{};
    std::string salesforce_order_line_id{};
    Date start_date;
};
}

#endif /* TINY_CPP_CLIENT_SSIOOrderLine_H_ */
