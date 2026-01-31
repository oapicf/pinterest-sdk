/*
 * Pinterest.Lib.Error.h
 *
 * Default error response
 */

#ifndef _Pinterest.Lib.Error_H_
#define _Pinterest.Lib.Error_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Default error response
 *
 *  \ingroup Models
 *
 */

class Pinterest.Lib.Error : public Object {
public:
	/*! \brief Constructor.
	 */
	Pinterest.Lib.Error();
	Pinterest.Lib.Error(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Pinterest.Lib.Error();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getCode();

	/*! \brief Set 
	 */
	void setCode(int  code);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
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

#endif /* _Pinterest.Lib.Error_H_ */
