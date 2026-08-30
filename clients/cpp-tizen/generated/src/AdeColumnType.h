/*
 * AdeColumnType.h
 *
 * Metrics for custom defined conversion event.
 */

#ifndef _AdeColumnType_H_
#define _AdeColumnType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Metrics for custom defined conversion event.
 *
 *  \ingroup Models
 *
 */

class AdeColumnType : public Object {
public:
	/*! \brief Constructor.
	 */
	AdeColumnType();
	AdeColumnType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdeColumnType();

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

#endif /* _AdeColumnType_H_ */
