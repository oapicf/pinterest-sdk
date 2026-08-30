/*
 * ConversionDeletionRequest.h
 *
 * Conversion deletion request
 */

#ifndef _ConversionDeletionRequest_H_
#define _ConversionDeletionRequest_H_


#include <string>
#include "ConversionDeletionRequestStatus.h"
#include "Date.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Conversion deletion request
 *
 *  \ingroup Models
 *
 */

class ConversionDeletionRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionDeletionRequest();
	ConversionDeletionRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionDeletionRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Timestamp when the conversion deletion request was succesfully created.
	 */
	Date getCreatedTime();

	/*! \brief Set Timestamp when the conversion deletion request was succesfully created.
	 */
	void setCreatedTime(Date  created_time);
	/*! \brief Get Timestamp when the conversion deletion request was processed.
	 */
	Date getProcessedTime();

	/*! \brief Set Timestamp when the conversion deletion request was processed.
	 */
	void setProcessedTime(Date  processed_time);
	/*! \brief Get Unique identifier of the conversion deletion request
	 */
	std::string getRequestId();

	/*! \brief Set Unique identifier of the conversion deletion request
	 */
	void setRequestId(std::string  request_id);
	/*! \brief Get Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
	 */
	ConversionDeletionRequestStatus getStatus();

	/*! \brief Set Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
	 */
	void setStatus(ConversionDeletionRequestStatus  status);

private:
	Date created_time;
	Date processed_time;
	std::string request_id;
	ConversionDeletionRequestStatus status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionDeletionRequest_H_ */
