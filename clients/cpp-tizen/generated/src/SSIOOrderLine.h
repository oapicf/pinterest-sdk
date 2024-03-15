/*
 * SSIOOrderLine.h
 *
 * 
 */

#ifndef _SSIOOrderLine_H_
#define _SSIOOrderLine_H_


#include <string>
#include "Currency.h"
#include "Date.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SSIOOrderLine : public Object {
public:
	/*! \brief Constructor.
	 */
	SSIOOrderLine();
	SSIOOrderLine(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SSIOOrderLine();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get OrderLineId in SFDC
	 */
	std::string getSalesforceOrderLineId();

	/*! \brief Set OrderLineId in SFDC
	 */
	void setSalesforceOrderLineId(std::string  salesforce_order_line_id);
	/*! \brief Get Ads manager OrderLineId
	 */
	std::string getAdsManagerOrderLineId();

	/*! \brief Set Ads manager OrderLineId
	 */
	void setAdsManagerOrderLineId(std::string  ads_manager_order_line_id);
	/*! \brief Get The pin order id associated with the order line in SFDC
	 */
	std::string getPinOrderId();

	/*! \brief Set The pin order id associated with the order line in SFDC
	 */
	void setPinOrderId(std::string  pin_order_id);
	/*! \brief Get Last modified date.
	 */
	std::string getLastModifiedDateTime();

	/*! \brief Set Last modified date.
	 */
	void setLastModifiedDateTime(std::string  last_modified_date_time);
	/*! \brief Get Start date of the order line.
	 */
	Date getStartDate();

	/*! \brief Set Start date of the order line.
	 */
	void setStartDate(Date  start_date);
	/*! \brief Get End date of the order line.
	 */
	Date getEndDate();

	/*! \brief Set End date of the order line.
	 */
	void setEndDate(Date  end_date);
	/*! \brief Get Bill To Company name
	 */
	std::string getBillToCompanyName();

	/*! \brief Set Bill To Company name
	 */
	void setBillToCompanyName(std::string  bill_to_company_name);
	/*! \brief Get Billing contact first name
	 */
	std::string getBillingContactFirstname();

	/*! \brief Set Billing contact first name
	 */
	void setBillingContactFirstname(std::string  billing_contact_firstname);
	/*! \brief Get Billing contact last name
	 */
	std::string getBillingContactLastname();

	/*! \brief Set Billing contact last name
	 */
	void setBillingContactLastname(std::string  billing_contact_lastname);
	/*! \brief Get Billing contact email
	 */
	std::string getBillingContactEmail();

	/*! \brief Set Billing contact email
	 */
	void setBillingContactEmail(std::string  billing_contact_email);
	/*! \brief Get Billing media email
	 */
	std::string getMediaContactEmail();

	/*! \brief Set Billing media email
	 */
	void setMediaContactEmail(std::string  media_contact_email);
	/*! \brief Get Billing contact first name
	 */
	std::string getMediaContactFirstname();

	/*! \brief Set Billing contact first name
	 */
	void setMediaContactFirstname(std::string  media_contact_firstname);
	/*! \brief Get Billing contact first name
	 */
	std::string getMediaContactLastname();

	/*! \brief Set Billing contact first name
	 */
	void setMediaContactLastname(std::string  media_contact_lastname);
	/*! \brief Get 
	 */
	Currency getCurrencyInfo();

	/*! \brief Set 
	 */
	void setCurrencyInfo(Currency  currency_info);
	/*! \brief Get Agency link
	 */
	std::string getAgencyLink();

	/*! \brief Set Agency link
	 */
	void setAgencyLink(std::string  agency_link);
	/*! \brief Get The po number
	 */
	std::string getPoNumber();

	/*! \brief Set The po number
	 */
	void setPoNumber(std::string  po_number);
	/*! \brief Get The order name
	 */
	std::string getOrderName();

	/*! \brief Set The order name
	 */
	void setOrderName(std::string  order_name);
	/*! \brief Get The Pinterest marketing partner name
	 */
	std::string getPmpName();

	/*! \brief Set The Pinterest marketing partner name
	 */
	void setPmpName(std::string  pmp_name);
	/*! \brief Get The SFDC id for the terms
	 */
	std::string getAcceptedTermsId();

	/*! \brief Set The SFDC id for the terms
	 */
	void setAcceptedTermsId(std::string  accepted_terms_id);
	/*! \brief Get The UTC timestamp (to the nearest sec) of when terms were accepted
	 */
	std::string getAcceptedTermsTime();

	/*! \brief Set The UTC timestamp (to the nearest sec) of when terms were accepted
	 */
	void setAcceptedTermsTime(std::string  accepted_terms_time);
	/*! \brief Get If Budget order line, the budget amount.
	 */
	long long getBudgetAmount();

	/*! \brief Set If Budget order line, the budget amount.
	 */
	void setBudgetAmount(long long  budget_amount);
	/*! \brief Get If Ongoing (perpetual) order line, the estimated monthly spend
	 */
	long long getEstimatedMonthlySpend();

	/*! \brief Set If Ongoing (perpetual) order line, the estimated monthly spend
	 */
	void setEstimatedMonthlySpend(long long  estimated_monthly_spend);

private:
	std::string salesforce_order_line_id;
	std::string ads_manager_order_line_id;
	std::string pin_order_id;
	std::string last_modified_date_time;
	Date start_date;
	Date end_date;
	std::string bill_to_company_name;
	std::string billing_contact_firstname;
	std::string billing_contact_lastname;
	std::string billing_contact_email;
	std::string media_contact_email;
	std::string media_contact_firstname;
	std::string media_contact_lastname;
	Currency currency_info;
	std::string agency_link;
	std::string po_number;
	std::string order_name;
	std::string pmp_name;
	std::string accepted_terms_id;
	std::string accepted_terms_time;
	long long budget_amount;
	long long estimated_monthly_spend;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SSIOOrderLine_H_ */
