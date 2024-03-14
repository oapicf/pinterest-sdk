/*
 * EntityStatus.h
 *
 * Entity status
 */

#ifndef _EntityStatus_H_
#define _EntityStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Entity status
 *
 *  \ingroup Models
 *
 */

class EntityStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	EntityStatus();
	EntityStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EntityStatus();

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

#endif /* _EntityStatus_H_ */
