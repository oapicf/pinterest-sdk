
/*
 * ConversionDeletionRequest.h
 *
 * Conversion deletion request
 */

#ifndef TINY_CPP_CLIENT_ConversionDeletionRequest_H_
#define TINY_CPP_CLIENT_ConversionDeletionRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConversionDeletionRequestStatus.h"
#include "Date.h"

namespace Tiny {


/*! \brief Conversion deletion request
 *
 *  \ingroup Models
 *
 */

class ConversionDeletionRequest{
public:

    /*! \brief Constructor.
	 */
    ConversionDeletionRequest();
    ConversionDeletionRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionDeletionRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Timestamp when the conversion deletion request was succesfully created.
	 */
	Date getCreatedTime();

	/*! \brief Set Timestamp when the conversion deletion request was succesfully created.
	 */
	void setCreatedTime(Date created_time);
	/*! \brief Get Timestamp when the conversion deletion request was processed.
	 */
	Date getProcessedTime();

	/*! \brief Set Timestamp when the conversion deletion request was processed.
	 */
	void setProcessedTime(Date processed_time);
	/*! \brief Get Unique identifier of the conversion deletion request
	 */
	std::string getRequestId();

	/*! \brief Set Unique identifier of the conversion deletion request
	 */
	void setRequestId(std::string request_id);
	/*! \brief Get Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
	 */
	ConversionDeletionRequestStatus getStatus();

	/*! \brief Set Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
	 */
	void setStatus(ConversionDeletionRequestStatus status);


    private:
    Date created_time;
    Date processed_time;
    std::string request_id{};
    ConversionDeletionRequestStatus status;
};
}

#endif /* TINY_CPP_CLIENT_ConversionDeletionRequest_H_ */
