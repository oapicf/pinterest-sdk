/*
 * BatchOperationStatus.h
 *
 * The status of the operation performed by the batch
 */

#ifndef _BatchOperationStatus_H_
#define _BatchOperationStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The status of the operation performed by the batch
 *
 *  \ingroup Models
 *
 */

class BatchOperationStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	BatchOperationStatus();
	BatchOperationStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BatchOperationStatus();

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

#endif /* _BatchOperationStatus_H_ */
