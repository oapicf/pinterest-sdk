/*
 * MsotEventName.h
 *
 * Type of user conversion event.
 */

#ifndef _MsotEventName_H_
#define _MsotEventName_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Type of user conversion event.
 *
 *  \ingroup Models
 *
 */

class MsotEventName : public Object {
public:
	/*! \brief Constructor.
	 */
	MsotEventName();
	MsotEventName(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MsotEventName();

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

#endif /* _MsotEventName_H_ */
