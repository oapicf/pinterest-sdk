
/*
 * BulkReportingJobStatus.h
 *
 * Possible status for a bulk reporting job
 */

#ifndef TINY_CPP_CLIENT_BulkReportingJobStatus_H_
#define TINY_CPP_CLIENT_BulkReportingJobStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Possible status for a bulk reporting job
 *
 *  \ingroup Models
 *
 */

class BulkReportingJobStatus{
public:

    /*! \brief Constructor.
	 */
    BulkReportingJobStatus();
    BulkReportingJobStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BulkReportingJobStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BulkReportingJobStatus_H_ */
