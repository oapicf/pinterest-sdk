/*
 * Pinterest.Lib.Status204.h
 *
 * The resource was successfully deleted.
 */

#ifndef _Pinterest.Lib.Status204_H_
#define _Pinterest.Lib.Status204_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The resource was successfully deleted.
 *
 *  \ingroup Models
 *
 */

class Pinterest.Lib.Status204 : public Object {
public:
	/*! \brief Constructor.
	 */
	Pinterest.Lib.Status204();
	Pinterest.Lib.Status204(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Pinterest.Lib.Status204();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	long long getStatusCode();

	/*! \brief Set 
	 */
	void setStatusCode(long long  statusCode);

private:
	long long statusCode;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Pinterest.Lib.Status204_H_ */
