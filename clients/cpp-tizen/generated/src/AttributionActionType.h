/*
 * AttributionActionType.h
 *
 * Type of an attributed action.
 */

#ifndef _AttributionActionType_H_
#define _AttributionActionType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Type of an attributed action.
 *
 *  \ingroup Models
 *
 */

class AttributionActionType : public Object {
public:
	/*! \brief Constructor.
	 */
	AttributionActionType();
	AttributionActionType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AttributionActionType();

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

#endif /* _AttributionActionType_H_ */
