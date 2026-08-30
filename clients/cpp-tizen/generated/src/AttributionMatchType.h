/*
 * AttributionMatchType.h
 *
 * Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
 */

#ifndef _AttributionMatchType_H_
#define _AttributionMatchType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
 *
 *  \ingroup Models
 *
 */

class AttributionMatchType : public Object {
public:
	/*! \brief Constructor.
	 */
	AttributionMatchType();
	AttributionMatchType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AttributionMatchType();

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

#endif /* _AttributionMatchType_H_ */
