/*
 * BulkReportingJobStatus.h
 *
 * Possible status for a bulk reporting job
 */

#ifndef _BulkReportingJobStatus_H_
#define _BulkReportingJobStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Possible status for a bulk reporting job
 *
 *  \ingroup Models
 *
 */

class BulkReportingJobStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	BulkReportingJobStatus();
	BulkReportingJobStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BulkReportingJobStatus();

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

#endif /* _BulkReportingJobStatus_H_ */
