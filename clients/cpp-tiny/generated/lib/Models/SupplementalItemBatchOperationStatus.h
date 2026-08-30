
/*
 * SupplementalItemBatchOperationStatus.h
 *
 * The status of the batch operation
 */

#ifndef TINY_CPP_CLIENT_SupplementalItemBatchOperationStatus_H_
#define TINY_CPP_CLIENT_SupplementalItemBatchOperationStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The status of the batch operation
 *
 *  \ingroup Models
 *
 */

class SupplementalItemBatchOperationStatus{
public:

    /*! \brief Constructor.
	 */
    SupplementalItemBatchOperationStatus();
    SupplementalItemBatchOperationStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SupplementalItemBatchOperationStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_SupplementalItemBatchOperationStatus_H_ */
