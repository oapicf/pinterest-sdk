
/*
 * SupplementalItemsBatchResponse.h
 *
 * Response model for supplemental items batch operation
 */

#ifndef TINY_CPP_CLIENT_SupplementalItemsBatchResponse_H_
#define TINY_CPP_CLIENT_SupplementalItemsBatchResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "SupplementalItemBatchOperationStatus.h"
#include "SupplementalOperationResult.h"
#include <list>

namespace Tiny {


/*! \brief Response model for supplemental items batch operation
 *
 *  \ingroup Models
 *
 */

class SupplementalItemsBatchResponse{
public:

    /*! \brief Constructor.
	 */
    SupplementalItemsBatchResponse();
    SupplementalItemsBatchResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SupplementalItemsBatchResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Id of the batch operation
	 */
	std::string getBatchId();

	/*! \brief Set Id of the batch operation
	 */
	void setBatchId(std::string batch_id);
	/*! \brief Get Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
	 */
	std::string getCompletedTime();

	/*! \brief Set Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
	 */
	void setCompletedTime(std::string completed_time);
	/*! \brief Get Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
	 */
	std::string getCreatedTime();

	/*! \brief Set Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
	 */
	void setCreatedTime(std::string created_time);
	/*! \brief Get Array of operation results
	 */
	std::list<SupplementalOperationResult> getOperationResults();

	/*! \brief Set Array of operation results
	 */
	void setOperationResults(std::list<SupplementalOperationResult> operation_results);
	/*! \brief Get Status of the batch: PROCESSING, COMPLETED, FAILED
	 */
	SupplementalItemBatchOperationStatus getStatus();

	/*! \brief Set Status of the batch: PROCESSING, COMPLETED, FAILED
	 */
	void setStatus(SupplementalItemBatchOperationStatus status);


    private:
    std::string batch_id{};
    std::string completed_time{};
    std::string created_time{};
    std::list<SupplementalOperationResult> operation_results;
    SupplementalItemBatchOperationStatus status;
};
}

#endif /* TINY_CPP_CLIENT_SupplementalItemsBatchResponse_H_ */
