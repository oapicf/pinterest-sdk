
/*
 * BulkRequestStatus.h
 *
 * Bulk request status
 */

#ifndef TINY_CPP_CLIENT_BulkRequestStatus_H_
#define TINY_CPP_CLIENT_BulkRequestStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Bulk request status
 *
 *  \ingroup Models
 *
 */

class BulkRequestStatus{
public:

    /*! \brief Constructor.
	 */
    BulkRequestStatus();
    BulkRequestStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BulkRequestStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BulkRequestStatus_H_ */
