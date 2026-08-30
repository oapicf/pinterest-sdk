/*
 * IntegrationLogLevel.h
 *
 * Log level type for integration applications.
 */

#ifndef _IntegrationLogLevel_H_
#define _IntegrationLogLevel_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Log level type for integration applications.
 *
 *  \ingroup Models
 *
 */

class IntegrationLogLevel : public Object {
public:
	/*! \brief Constructor.
	 */
	IntegrationLogLevel();
	IntegrationLogLevel(char* str);

	/*! \brief Destructor.
	 */
	virtual ~IntegrationLogLevel();

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

#endif /* _IntegrationLogLevel_H_ */
