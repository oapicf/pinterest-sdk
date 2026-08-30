/*
 * NullableLabelStatus.h
 *
 * The new status you want to give the label, either &#x60;ACTIVE&#x60; (in use) or no longer in use (&#x60;ARCHIVED&#x60;).
 */

#ifndef _NullableLabelStatus_H_
#define _NullableLabelStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The new status you want to give the label, either `ACTIVE` (in use) or no longer in use (`ARCHIVED`).
 *
 *  \ingroup Models
 *
 */

class NullableLabelStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	NullableLabelStatus();
	NullableLabelStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NullableLabelStatus();

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

#endif /* _NullableLabelStatus_H_ */
