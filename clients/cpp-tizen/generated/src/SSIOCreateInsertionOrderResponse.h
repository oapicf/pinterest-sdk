/*
 * SSIOCreateInsertionOrderResponse.h
 *
 * 
 */

#ifndef _SSIOCreateInsertionOrderResponse_H_
#define _SSIOCreateInsertionOrderResponse_H_


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

class SSIOCreateInsertionOrderResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	SSIOCreateInsertionOrderResponse();
	SSIOCreateInsertionOrderResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SSIOCreateInsertionOrderResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Salesforce order id
	 */
	std::string getPinOrderId();

	/*! \brief Set Salesforce order id
	 */
	void setPinOrderId(std::string  pin_order_id);

private:
	std::string pin_order_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SSIOCreateInsertionOrderResponse_H_ */
