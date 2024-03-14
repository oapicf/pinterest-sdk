/*
 * Exception.h
 *
 * 
 */

#ifndef _Exception_H_
#define _Exception_H_


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

class Exception : public Object {
public:
	/*! \brief Constructor.
	 */
	Exception();
	Exception(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Exception();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Exception error code.
	 */
	int getCode();

	/*! \brief Set Exception error code.
	 */
	void setCode(int  code);
	/*! \brief Get Exception message.
	 */
	std::string getMessage();

	/*! \brief Set Exception message.
	 */
	void setMessage(std::string  message);

private:
	int code;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Exception_H_ */
