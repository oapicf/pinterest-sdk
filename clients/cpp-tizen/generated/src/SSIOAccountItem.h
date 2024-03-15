/*
 * SSIOAccountItem.h
 *
 * 
 */

#ifndef _SSIOAccountItem_H_
#define _SSIOAccountItem_H_


#include <string>
#include "SSIOAccountAddress.h"
#include <list>
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

class SSIOAccountItem : public Object {
public:
	/*! \brief Constructor.
	 */
	SSIOAccountItem();
	SSIOAccountItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SSIOAccountItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Salesforce id for billto_info
	 */
	std::string getId();

	/*! \brief Set Salesforce id for billto_info
	 */
	void setId(std::string  id);
	/*! \brief Get Salesforce id for IO Terms and Conditions
	 */
	std::string getIoTermsId();

	/*! \brief Set Salesforce id for IO Terms and Conditions
	 */
	void setIoTermsId(std::string  io_terms_id);
	/*! \brief Get Salesforce text for IO Terms and Conditions
	 */
	std::string getIoTerms();

	/*! \brief Set Salesforce text for IO Terms and Conditions
	 */
	void setIoTerms(std::string  io_terms);
	/*! \brief Get Salesforce id for US Terms and Conditions
	 */
	std::string getUsTermsId();

	/*! \brief Set Salesforce id for US Terms and Conditions
	 */
	void setUsTermsId(std::string  us_terms_id);
	/*! \brief Get Salesforce text for US Terms and Conditions
	 */
	std::string getUsTerms();

	/*! \brief Set Salesforce text for US Terms and Conditions
	 */
	void setUsTerms(std::string  us_terms);
	/*! \brief Get Salesforce id for Rest of the World Terms and Conditions
	 */
	std::string getRowTermsId();

	/*! \brief Set Salesforce id for Rest of the World Terms and Conditions
	 */
	void setRowTermsId(std::string  row_terms_id);
	/*! \brief Get Salesforce text for Rest of the World Terms and Conditions
	 */
	std::string getRowTerms();

	/*! \brief Set Salesforce text for Rest of the World Terms and Conditions
	 */
	void setRowTerms(std::string  row_terms);
	/*! \brief Get Insertion Order Type - Pinterest Paper or Agency Paper
	 */
	std::string getIoType();

	/*! \brief Set Insertion Order Type - Pinterest Paper or Agency Paper
	 */
	void setIoType(std::string  io_type);
	/*! \brief Get Address information that is associated with this account.
	 */
	std::list<SSIOAccountAddress> getAddresses();

	/*! \brief Set Address information that is associated with this account.
	 */
	void setAddresses(std::list <SSIOAccountAddress> addresses);

private:
	std::string id;
	std::string io_terms_id;
	std::string io_terms;
	std::string us_terms_id;
	std::string us_terms;
	std::string row_terms_id;
	std::string row_terms;
	std::string io_type;
	std::list <SSIOAccountAddress>addresses;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SSIOAccountItem_H_ */
