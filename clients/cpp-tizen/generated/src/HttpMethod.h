/*
 * HttpMethod.h
 *
 * HTTP request method.
 */

#ifndef _HttpMethod_H_
#define _HttpMethod_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief HTTP request method.
 *
 *  \ingroup Models
 *
 */

class HttpMethod : public Object {
public:
	/*! \brief Constructor.
	 */
	HttpMethod();
	HttpMethod(char* str);

	/*! \brief Destructor.
	 */
	virtual ~HttpMethod();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _HttpMethod_H_ */
