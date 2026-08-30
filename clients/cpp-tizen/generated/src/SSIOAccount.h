/*
 * SSIOAccount.h
 *
 * Salesforce account details including bill-to information.
 */

#ifndef _SSIOAccount_H_
#define _SSIOAccount_H_


#include <string>
#include "SSIOAccountItem.h"
#include "SSIOAccountPMPName.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Salesforce account details including bill-to information.
 *
 *  \ingroup Models
 *
 */

class SSIOAccount : public Object {
public:
	/*! \brief Constructor.
	 */
	SSIOAccount();
	SSIOAccount(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SSIOAccount();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get An array of Salesforce account information that includes address, io terms, etc.
	 */
	std::list<SSIOAccountItem> getBilltoInfos();

	/*! \brief Set An array of Salesforce account information that includes address, io terms, etc.
	 */
	void setBilltoInfos(std::list <SSIOAccountItem> billto_infos);
	/*! \brief Get Advertiser eligible to update order lines
	 */
	bool getCanEdit();

	/*! \brief Set Advertiser eligible to update order lines
	 */
	void setCanEdit(bool  can_edit);
	/*! \brief Get 
	 */
	std::string getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(std::string  currency);
	/*! \brief Get Advertiser eligible to create order lines
	 */
	bool getEligible();

	/*! \brief Set Advertiser eligible to create order lines
	 */
	void setEligible(bool  eligible);
	/*! \brief Get Error indicator from Salesforce which could be \"No Error\"
	 */
	std::string getError();

	/*! \brief Set Error indicator from Salesforce which could be \"No Error\"
	 */
	void setError(std::string  error);
	/*! \brief Get 
	 */
	std::list<SSIOAccountPMPName> getPmpNames();

	/*! \brief Set 
	 */
	void setPmpNames(std::list <SSIOAccountPMPName> pmp_names);

private:
	std::list <SSIOAccountItem>billto_infos;
	bool can_edit;
	std::string currency;
	bool eligible;
	std::string error;
	std::list <SSIOAccountPMPName>pmp_names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SSIOAccount_H_ */
