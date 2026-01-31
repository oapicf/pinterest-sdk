/*
 * OverallStatusOptions.h
 *
 * Overall status of event quality score.
 */

#ifndef _OverallStatusOptions_H_
#define _OverallStatusOptions_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Overall status of event quality score.
 *
 *  \ingroup Models
 *
 */

class OverallStatusOptions : public Object {
public:
	/*! \brief Constructor.
	 */
	OverallStatusOptions();
	OverallStatusOptions(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OverallStatusOptions();

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

#endif /* _OverallStatusOptions_H_ */
