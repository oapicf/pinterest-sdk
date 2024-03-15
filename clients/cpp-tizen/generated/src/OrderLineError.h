/*
 * OrderLineError.h
 *
 * 
 */

#ifndef _OrderLineError_H_
#define _OrderLineError_H_


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

class OrderLineError : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderLineError();
	OrderLineError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderLineError();

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
	/*! \brief Get 
	 */
	std::list<std::string> getErrorMessages();

	/*! \brief Set 
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

#endif /* _OrderLineError_H_ */
