/*
 * SSIOAccountAddress.h
 *
 * 
 */

#ifndef _SSIOAccountAddress_H_
#define _SSIOAccountAddress_H_


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

class SSIOAccountAddress : public Object {
public:
	/*! \brief Constructor.
	 */
	SSIOAccountAddress();
	SSIOAccountAddress(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SSIOAccountAddress();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Address display
	 */
	std::string getDisplay();

	/*! \brief Set Address display
	 */
	void setDisplay(std::string  display);
	/*! \brief Get Purpose for which the address is used, usually Billing or Businness
	 */
	std::string getPurpose();

	/*! \brief Set Purpose for which the address is used, usually Billing or Businness
	 */
	void setPurpose(std::string  purpose);
	/*! \brief Get Salesforce id for address
	 */
	std::string getAddressId();

	/*! \brief Set Salesforce id for address
	 */
	void setAddressId(std::string  address_id);
	/*! \brief Get Legal entity for this insertion order
	 */
	std::string getOrderLegalEntity();

	/*! \brief Set Legal entity for this insertion order
	 */
	void setOrderLegalEntity(std::string  order_legal_entity);

private:
	std::string display;
	std::string purpose;
	std::string address_id;
	std::string order_legal_entity;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SSIOAccountAddress_H_ */
