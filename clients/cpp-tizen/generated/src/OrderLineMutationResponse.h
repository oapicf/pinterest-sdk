/*
 * OrderLineMutationResponse.h
 *
 * 
 */

#ifndef _OrderLineMutationResponse_H_
#define _OrderLineMutationResponse_H_


#include <string>
#include "OrderLineMutationResult.h"
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

class OrderLineMutationResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderLineMutationResponse();
	OrderLineMutationResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderLineMutationResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OrderLineMutationResult getData();

	/*! \brief Set 
	 */
	void setData(OrderLineMutationResult  data);

private:
	OrderLineMutationResult data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderLineMutationResponse_H_ */
