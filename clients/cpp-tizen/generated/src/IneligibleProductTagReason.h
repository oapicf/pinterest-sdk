/*
 * IneligibleProductTagReason.h
 *
 * Reason why a product pin is ineligible for tagging.
 */

#ifndef _IneligibleProductTagReason_H_
#define _IneligibleProductTagReason_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Reason why a product pin is ineligible for tagging.
 *
 *  \ingroup Models
 *
 */

class IneligibleProductTagReason : public Object {
public:
	/*! \brief Constructor.
	 */
	IneligibleProductTagReason();
	IneligibleProductTagReason(char* str);

	/*! \brief Destructor.
	 */
	virtual ~IneligibleProductTagReason();

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

#endif /* _IneligibleProductTagReason_H_ */
