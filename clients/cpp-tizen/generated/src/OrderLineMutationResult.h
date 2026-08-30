/*
 * OrderLineMutationResult.h
 *
 * 
 */

#ifndef _OrderLineMutationResult_H_
#define _OrderLineMutationResult_H_


#include <string>
#include "OrderLine.h"
#include "OrderLineMutationError.h"
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

class OrderLineMutationResult : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderLineMutationResult();
	OrderLineMutationResult(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderLineMutationResult();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Error list if update(s) fail.
	 */
	std::list<OrderLineMutationError> getErrors();

	/*! \brief Set Error list if update(s) fail.
	 */
	void setErrors(std::list <OrderLineMutationError> errors);
	/*! \brief Get Order Line object array.
	 */
	std::list<OrderLine> getOrderLine();

	/*! \brief Set Order Line object array.
	 */
	void setOrderLine(std::list <OrderLine> order_line);

private:
	std::list <OrderLineMutationError>errors;
	std::list <OrderLine>order_line;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderLineMutationResult_H_ */
