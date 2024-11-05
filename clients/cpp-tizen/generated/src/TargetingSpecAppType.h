/*
 * TargetingSpecAppType.h
 *
 * 
 */

#ifndef _TargetingSpecAppType_H_
#define _TargetingSpecAppType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TargetingSpecAppType : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingSpecAppType();
	TargetingSpecAppType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingSpecAppType();

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

#endif /* _TargetingSpecAppType_H_ */
