/*
 * SourcePlatformOptions.h
 *
 * List of source platforms for a conversion event.
 */

#ifndef _SourcePlatformOptions_H_
#define _SourcePlatformOptions_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief List of source platforms for a conversion event.
 *
 *  \ingroup Models
 *
 */

class SourcePlatformOptions : public Object {
public:
	/*! \brief Constructor.
	 */
	SourcePlatformOptions();
	SourcePlatformOptions(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SourcePlatformOptions();

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

#endif /* _SourcePlatformOptions_H_ */
