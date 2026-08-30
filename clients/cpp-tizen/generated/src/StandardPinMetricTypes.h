/*
 * StandardPinMetricTypes.h
 *
 * Standard Pin metric types
 */

#ifndef _StandardPinMetricTypes_H_
#define _StandardPinMetricTypes_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Standard Pin metric types
 *
 *  \ingroup Models
 *
 */

class StandardPinMetricTypes : public Object {
public:
	/*! \brief Constructor.
	 */
	StandardPinMetricTypes();
	StandardPinMetricTypes(char* str);

	/*! \brief Destructor.
	 */
	virtual ~StandardPinMetricTypes();

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

#endif /* _StandardPinMetricTypes_H_ */
