/*
 * SupplementalItemProcessingStatus.h
 *
 * The status of the item processing record
 */

#ifndef _SupplementalItemProcessingStatus_H_
#define _SupplementalItemProcessingStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The status of the item processing record
 *
 *  \ingroup Models
 *
 */

class SupplementalItemProcessingStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	SupplementalItemProcessingStatus();
	SupplementalItemProcessingStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SupplementalItemProcessingStatus();

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

#endif /* _SupplementalItemProcessingStatus_H_ */
