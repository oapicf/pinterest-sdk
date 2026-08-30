/*
 * TargetingSpecListOperation.h
 *
 * 
 */

#ifndef _TargetingSpecListOperation_H_
#define _TargetingSpecListOperation_H_


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

class TargetingSpecListOperation : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingSpecListOperation();
	TargetingSpecListOperation(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingSpecListOperation();

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

#endif /* _TargetingSpecListOperation_H_ */
