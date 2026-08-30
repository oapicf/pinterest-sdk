/*
 * LocalInventoryItemsBatch.h
 *
 * Unified model for local inventory items batch operation
 */

#ifndef _LocalInventoryItemsBatch_H_
#define _LocalInventoryItemsBatch_H_


#include <string>
#include "SupplementalItemBatchOperationStatus.h"
#include "SupplementalOperationResult.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Unified model for local inventory items batch operation
 *
 *  \ingroup Models
 *
 */

class LocalInventoryItemsBatch : public Object {
public:
	/*! \brief Constructor.
	 */
	LocalInventoryItemsBatch();
	LocalInventoryItemsBatch(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocalInventoryItemsBatch();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Id of the batch operation
	 */
	std::string getBatchId();

	/*! \brief Set Id of the batch operation
	 */
	void setBatchId(std::string  batch_id);
	/*! \brief Get Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
	 */
	std::string getCompletedTime();

	/*! \brief Set Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
	 */
	void setCompletedTime(std::string  completed_time);
	/*! \brief Get Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
	 */
	std::string getCreatedTime();

	/*! \brief Set Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
	 */
	void setCreatedTime(std::string  created_time);
	/*! \brief Get Array of operation results
	 */
	std::list<SupplementalOperationResult> getOperationResults();

	/*! \brief Set Array of operation results
	 */
	void setOperationResults(std::list <SupplementalOperationResult> operation_results);
	/*! \brief Get Status of the batch: PROCESSING, COMPLETED, FAILED
	 */
	SupplementalItemBatchOperationStatus getStatus();

	/*! \brief Set Status of the batch: PROCESSING, COMPLETED, FAILED
	 */
	void setStatus(SupplementalItemBatchOperationStatus  status);

private:
	std::string batch_id;
	std::string completed_time;
	std::string created_time;
	std::list <SupplementalOperationResult>operation_results;
	SupplementalItemBatchOperationStatus status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocalInventoryItemsBatch_H_ */
