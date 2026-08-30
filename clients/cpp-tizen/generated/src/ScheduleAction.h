/*
 * ScheduleAction.h
 *
 * The schedule action
 */

#ifndef _ScheduleAction_H_
#define _ScheduleAction_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The schedule action
 *
 *  \ingroup Models
 *
 */

class ScheduleAction : public Object {
public:
	/*! \brief Constructor.
	 */
	ScheduleAction();
	ScheduleAction(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ScheduleAction();

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

#endif /* _ScheduleAction_H_ */
