/*
 * ScheduleType.h
 *
 * The schedule type
 */

#ifndef _ScheduleType_H_
#define _ScheduleType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The schedule type
 *
 *  \ingroup Models
 *
 */

class ScheduleType : public Object {
public:
	/*! \brief Constructor.
	 */
	ScheduleType();
	ScheduleType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ScheduleType();

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

#endif /* _ScheduleType_H_ */
