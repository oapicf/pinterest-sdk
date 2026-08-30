
/*
 * ConversionDeletionRequestStatus.h
 *
 * Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled.
 */

#ifndef TINY_CPP_CLIENT_ConversionDeletionRequestStatus_H_
#define TINY_CPP_CLIENT_ConversionDeletionRequestStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
 *
 *  \ingroup Models
 *
 */

class ConversionDeletionRequestStatus{
public:

    /*! \brief Constructor.
	 */
    ConversionDeletionRequestStatus();
    ConversionDeletionRequestStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionDeletionRequestStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ConversionDeletionRequestStatus_H_ */
