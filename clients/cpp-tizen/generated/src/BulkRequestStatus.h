/*
 * BulkRequestStatus.h
 *
 * Bulk request status
 */

#ifndef _BulkRequestStatus_H_
#define _BulkRequestStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Bulk request status
 *
 *  \ingroup Models
 *
 */

class BulkRequestStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	BulkRequestStatus();
	BulkRequestStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BulkRequestStatus();

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

#endif /* _BulkRequestStatus_H_ */
