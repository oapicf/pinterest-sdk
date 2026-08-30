/*
 * CancelInviteException.h
 *
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 */

#ifndef _CancelInviteException_H_
#define _CancelInviteException_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 *
 *  \ingroup Models
 *
 */

class CancelInviteException : public Object {
public:
	/*! \brief Constructor.
	 */
	CancelInviteException();
	CancelInviteException(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CancelInviteException();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getInviteId();

	/*! \brief Set 
	 */
	void setInviteId(std::string  invite_id);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string  message);

private:
	std::string invite_id;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CancelInviteException_H_ */
