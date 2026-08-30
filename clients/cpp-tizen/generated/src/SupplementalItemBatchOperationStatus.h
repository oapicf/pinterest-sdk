/*
 * SupplementalItemBatchOperationStatus.h
 *
 * The status of the batch operation
 */

#ifndef _SupplementalItemBatchOperationStatus_H_
#define _SupplementalItemBatchOperationStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The status of the batch operation
 *
 *  \ingroup Models
 *
 */

class SupplementalItemBatchOperationStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	SupplementalItemBatchOperationStatus();
	SupplementalItemBatchOperationStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SupplementalItemBatchOperationStatus();

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

#endif /* _SupplementalItemBatchOperationStatus_H_ */
