/*
 * OrderLineMutationError.h
 *
 * 
 */

#ifndef _OrderLineMutationError_H_
#define _OrderLineMutationError_H_


#include <string>
#include "OrderLine.h"
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

class OrderLineMutationError : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderLineMutationError();
	OrderLineMutationError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderLineMutationError();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OrderLine getData();

	/*! \brief Set 
	 */
	void setData(OrderLine  data);
	/*! \brief Get Error messages.
	 */
	std::list<std::string> getErrorMessages();

	/*! \brief Set Error messages.
	 */
	void setErrorMessages(std::list <std::string> error_messages);

private:
	OrderLine data;
	std::list <std::string>error_messages;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderLineMutationError_H_ */
