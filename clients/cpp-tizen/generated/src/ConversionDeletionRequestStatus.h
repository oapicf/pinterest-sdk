/*
 * ConversionDeletionRequestStatus.h
 *
 * Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled.
 */

#ifndef _ConversionDeletionRequestStatus_H_
#define _ConversionDeletionRequestStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
 *
 *  \ingroup Models
 *
 */

class ConversionDeletionRequestStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionDeletionRequestStatus();
	ConversionDeletionRequestStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionDeletionRequestStatus();

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

#endif /* _ConversionDeletionRequestStatus_H_ */
