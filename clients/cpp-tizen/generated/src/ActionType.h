/*
 * ActionType.h
 *
 * Ad group billable event type. For update, only draft ad groups may update billable event.
 */

#ifndef _ActionType_H_
#define _ActionType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ad group billable event type. For update, only draft ad groups may update billable event.
 *
 *  \ingroup Models
 *
 */

class ActionType : public Object {
public:
	/*! \brief Constructor.
	 */
	ActionType();
	ActionType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ActionType();

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

#endif /* _ActionType_H_ */
