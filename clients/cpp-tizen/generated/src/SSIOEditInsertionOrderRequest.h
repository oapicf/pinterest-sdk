/*
 * SSIOEditInsertionOrderRequest.h
 *
 * 
 */

#ifndef _SSIOEditInsertionOrderRequest_H_
#define _SSIOEditInsertionOrderRequest_H_


#include <string>
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

class SSIOEditInsertionOrderRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	SSIOEditInsertionOrderRequest();
	SSIOEditInsertionOrderRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SSIOEditInsertionOrderRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Starting date of time period. Format: YYYY-MM-DD
	 */
	std::string getStartDate();

	/*! \brief Set Starting date of time period. Format: YYYY-MM-DD
	 */
	void setStartDate(std::string  start_date);
	/*! \brief Get End date of time period. Format: YYYY-MM-DD
	 */
	std::string getEndDate();

	/*! \brief Set End date of time period. Format: YYYY-MM-DD
	 */
	void setEndDate(std::string  end_date);
	/*! \brief Get The po number
	 */
	std::string getPoNumber();

	/*! \brief Set The po number
	 */
	void setPoNumber(std::string  po_number);
	/*! \brief Get If Budget order line, the budget amount.
	 */
	long long getBudgetAmount();

	/*! \brief Set If Budget order line, the budget amount.
	 */
	void setBudgetAmount(long long  budget_amount);
	/*! \brief Get The billing contact first name
	 */
	std::string getBillingContactFirstname();

	/*! \brief Set The billing contact first name
	 */
	void setBillingContactFirstname(std::string  billing_contact_firstname);
	/*! \brief Get The billing contact last name
	 */
	std::string getBillingContactLastname();

	/*! \brief Set The billing contact last name
	 */
	void setBillingContactLastname(std::string  billing_contact_lastname);
	/*! \brief Get The billing contact email
	 */
	std::string getBillingContactEmail();

	/*! \brief Set The billing contact email
	 */
	void setBillingContactEmail(std::string  billing_contact_email);
	/*! \brief Get The media contact first name
	 */
	std::string getMediaContactFirstname();

	/*! \brief Set The media contact first name
	 */
	void setMediaContactFirstname(std::string  media_contact_firstname);
	/*! \brief Get The media contact last name
	 */
	std::string getMediaContactLastname();

	/*! \brief Set The media contact last name
	 */
	void setMediaContactLastname(std::string  media_contact_lastname);
	/*! \brief Get The media contact email
	 */
	std::string getMediaContactEmail();

	/*! \brief Set The media contact email
	 */
	void setMediaContactEmail(std::string  media_contact_email);
	/*! \brief Get URL link for agency
	 */
	std::string getAgencyLink();

	/*! \brief Set URL link for agency
	 */
	void setAgencyLink(std::string  agency_link);
	/*! \brief Get The email of user submitting the insertion order
	 */
	std::string getUserEmail();

	/*! \brief Set The email of user submitting the insertion order
	 */
	void setUserEmail(std::string  user_email);
	/*! \brief Get LineId in the Oracle DB
	 */
	std::string getOracleLineId();

	/*! \brief Set LineId in the Oracle DB
	 */
	void setOracleLineId(std::string  oracle_line_id);
	/*! \brief Get OrderId in SFDC
	 */
	std::string getSalesforceOrderId();

	/*! \brief Set OrderId in SFDC
	 */
	void setSalesforceOrderId(std::string  salesforce_order_id);
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

private:
	std::string start_date;
	std::string end_date;
	std::string po_number;
	long long budget_amount;
	std::string billing_contact_firstname;
	std::string billing_contact_lastname;
	std::string billing_contact_email;
	std::string media_contact_firstname;
	std::string media_contact_lastname;
	std::string media_contact_email;
	std::string agency_link;
	std::string user_email;
	std::string oracle_line_id;
	std::string salesforce_order_id;
	std::string salesforce_order_line_id;
	std::string ads_manager_order_line_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SSIOEditInsertionOrderRequest_H_ */
