/*
 * ScheduleStatus.h
 *
 * Schedule status
 */

#ifndef _ScheduleStatus_H_
#define _ScheduleStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Schedule status
 *
 *  \ingroup Models
 *
 */

class ScheduleStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	ScheduleStatus();
	ScheduleStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ScheduleStatus();

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

#endif /* _ScheduleStatus_H_ */
