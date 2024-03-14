/*
 * ItemValidationEvent.h
 *
 * Object describing an item validation event
 */

#ifndef _ItemValidationEvent_H_
#define _ItemValidationEvent_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing an item validation event
 *
 *  \ingroup Models
 *
 */

class ItemValidationEvent : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemValidationEvent();
	ItemValidationEvent(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemValidationEvent();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The attribute that the item validation event references
	 */
	std::string getAttribute();

	/*! \brief Set The attribute that the item validation event references
	 */
	void setAttribute(std::string  attribute);
	/*! \brief Get The event code that the item validation event references
	 */
	int getCode();

	/*! \brief Set The event code that the item validation event references
	 */
	void setCode(int  code);
	/*! \brief Get Title message describing the item validation event
	 */
	std::string getMessage();

	/*! \brief Set Title message describing the item validation event
	 */
	void setMessage(std::string  message);

private:
	std::string attribute;
	int code;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemValidationEvent_H_ */
