
/*
 * SSIOAccount.h
 *
 * Salesforce account details including bill-to information.
 */

#ifndef TINY_CPP_CLIENT_SSIOAccount_H_
#define TINY_CPP_CLIENT_SSIOAccount_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "SSIOAccountItem.h"
#include "SSIOAccountPMPName.h"
#include <list>

namespace Tiny {


/*! \brief Salesforce account details including bill-to information.
 *
 *  \ingroup Models
 *
 */

class SSIOAccount{
public:

    /*! \brief Constructor.
	 */
    SSIOAccount();
    SSIOAccount(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SSIOAccount();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get An array of Salesforce account information that includes address, io terms, etc.
	 */
	std::list<SSIOAccountItem> getBilltoInfos();

	/*! \brief Set An array of Salesforce account information that includes address, io terms, etc.
	 */
	void setBilltoInfos(std::list<SSIOAccountItem> billto_infos);
	/*! \brief Get Advertiser eligible to update order lines
	 */
	bool isCanEdit();

	/*! \brief Set Advertiser eligible to update order lines
	 */
	void setCanEdit(bool can_edit);
	/*! \brief Get 
	 */
	std::string getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(std::string currency);
	/*! \brief Get Advertiser eligible to create order lines
	 */
	bool isEligible();

	/*! \brief Set Advertiser eligible to create order lines
	 */
	void setEligible(bool eligible);
	/*! \brief Get Error indicator from Salesforce which could be \"No Error\"
	 */
	std::string getError();

	/*! \brief Set Error indicator from Salesforce which could be \"No Error\"
	 */
	void setError(std::string error);
	/*! \brief Get 
	 */
	std::list<SSIOAccountPMPName> getPmpNames();

	/*! \brief Set 
	 */
	void setPmpNames(std::list<SSIOAccountPMPName> pmp_names);


    private:
    std::list<SSIOAccountItem> billto_infos;
    bool can_edit{};
    std::string currency{};
    bool eligible{};
    std::string error{};
    std::list<SSIOAccountPMPName> pmp_names;
};
}

#endif /* TINY_CPP_CLIENT_SSIOAccount_H_ */
