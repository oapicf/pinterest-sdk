
/*
 * BulkJobData.h
 *
 * Bulk request result data.
 */

#ifndef TINY_CPP_CLIENT_BulkJobData_H_
#define TINY_CPP_CLIENT_BulkJobData_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BulkRequestStatus.h"

namespace Tiny {


/*! \brief Bulk request result data.
 *
 *  \ingroup Models
 *
 */

class BulkJobData{
public:

    /*! \brief Constructor.
	 */
    BulkJobData();
    BulkJobData(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BulkJobData();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Presigned s3 file url for the bulk request result.
	 */
	std::string getResultUrl();

	/*! \brief Set Presigned s3 file url for the bulk request result.
	 */
	void setResultUrl(std::string result_url);
	/*! \brief Get 
	 */
	BulkRequestStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(BulkRequestStatus status);
	/*! \brief Get Bulk Workload Id.
	 */
	int getWorkloadId();

	/*! \brief Set Bulk Workload Id.
	 */
	void setWorkloadId(int workload_id);


    private:
    std::string result_url{};
    BulkRequestStatus status;
    int workload_id{};
};
}

#endif /* TINY_CPP_CLIENT_BulkJobData_H_ */
