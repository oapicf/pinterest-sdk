/*
 * SSIOInsertionOrderStatusResponse.h
 *
 * 
 */

#ifndef _SSIOInsertionOrderStatusResponse_H_
#define _SSIOInsertionOrderStatusResponse_H_


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

class SSIOInsertionOrderStatusResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	SSIOInsertionOrderStatusResponse();
	SSIOInsertionOrderStatusResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SSIOInsertionOrderStatusResponse();

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
	/*! \brief Get Salesforce insertion order status
	 */
	std::string getStatus();

	/*! \brief Set Salesforce insertion order status
	 */
	void setStatus(std::string  status);
	/*! \brief Get Salesforce insertion order creation time
	 */
	std::string getCreationTime();

	/*! \brief Set Salesforce insertion order creation time
	 */
	void setCreationTime(std::string  creation_time);

private:
	std::string pin_order_id;
	std::string status;
	std::string creation_time;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SSIOInsertionOrderStatusResponse_H_ */
