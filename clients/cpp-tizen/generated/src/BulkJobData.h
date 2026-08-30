/*
 * BulkJobData.h
 *
 * Bulk request result data.
 */

#ifndef _BulkJobData_H_
#define _BulkJobData_H_


#include <string>
#include "BulkRequestStatus.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Bulk request result data.
 *
 *  \ingroup Models
 *
 */

class BulkJobData : public Object {
public:
	/*! \brief Constructor.
	 */
	BulkJobData();
	BulkJobData(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BulkJobData();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Presigned s3 file url for the bulk request result.
	 */
	std::string getResultUrl();

	/*! \brief Set Presigned s3 file url for the bulk request result.
	 */
	void setResultUrl(std::string  result_url);
	/*! \brief Get 
	 */
	BulkRequestStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(BulkRequestStatus  status);
	/*! \brief Get Bulk Workload Id.
	 */
	int getWorkloadId();

	/*! \brief Set Bulk Workload Id.
	 */
	void setWorkloadId(int  workload_id);

private:
	std::string result_url;
	BulkRequestStatus status;
	int workload_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BulkJobData_H_ */
