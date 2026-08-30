/*
 * AttributionScope.h
 *
 * Ad event type used for attribution.
 */

#ifndef _AttributionScope_H_
#define _AttributionScope_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ad event type used for attribution.
 *
 *  \ingroup Models
 *
 */

class AttributionScope : public Object {
public:
	/*! \brief Constructor.
	 */
	AttributionScope();
	AttributionScope(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AttributionScope();

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

#endif /* _AttributionScope_H_ */
