/*
 * InviteStatus.h
 *
 * The current status of the invite.
 */

#ifndef _InviteStatus_H_
#define _InviteStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The current status of the invite.
 *
 *  \ingroup Models
 *
 */

class InviteStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	InviteStatus();
	InviteStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~InviteStatus();

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

#endif /* _InviteStatus_H_ */
