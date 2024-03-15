/*
 * OrderLineResponse.h
 *
 * 
 */

#ifndef _OrderLineResponse_H_
#define _OrderLineResponse_H_


#include <string>
#include "OrderLine.h"
#include "OrderLineError.h"
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

class OrderLineResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderLineResponse();
	OrderLineResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderLineResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Error list if update(s) fail.
	 */
	std::list<OrderLineError> getErrors();

	/*! \brief Set Error list if update(s) fail.
	 */
	void setErrors(std::list <OrderLineError> errors);
	/*! \brief Get Order Line object array.
	 */
	std::list<OrderLine> getOrderLine();

	/*! \brief Set Order Line object array.
	 */
	void setOrderLine(std::list <OrderLine> order_line);

private:
	std::list <OrderLineError>errors;
	std::list <OrderLine>order_line;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderLineResponse_H_ */
