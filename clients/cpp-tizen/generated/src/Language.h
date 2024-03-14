/*
 * Language.h
 *
 * Language code, which is among the offical ISO 639-1 language list.
 */

#ifndef _Language_H_
#define _Language_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Language code, which is among the offical ISO 639-1 language list.
 *
 *  \ingroup Models
 *
 */

class Language : public Object {
public:
	/*! \brief Constructor.
	 */
	Language();
	Language(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Language();

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

#endif /* _Language_H_ */
