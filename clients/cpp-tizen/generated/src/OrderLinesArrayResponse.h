/*
 * OrderLinesArrayResponse.h
 *
 * 
 */

#ifndef _OrderLinesArrayResponse_H_
#define _OrderLinesArrayResponse_H_


#include <string>
#include "OrderLines.h"
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

class OrderLinesArrayResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderLinesArrayResponse();
	OrderLinesArrayResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderLinesArrayResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<OrderLines> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <OrderLines> items);

private:
	std::list <OrderLines>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderLinesArrayResponse_H_ */
