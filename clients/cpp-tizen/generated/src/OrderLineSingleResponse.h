/*
 * OrderLineSingleResponse.h
 *
 * 
 */

#ifndef _OrderLineSingleResponse_H_
#define _OrderLineSingleResponse_H_


#include <string>
#include "OrderLineResponse.h"
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

class OrderLineSingleResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderLineSingleResponse();
	OrderLineSingleResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderLineSingleResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OrderLineResponse getData();

	/*! \brief Set 
	 */
	void setData(OrderLineResponse  data);

private:
	OrderLineResponse data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderLineSingleResponse_H_ */
