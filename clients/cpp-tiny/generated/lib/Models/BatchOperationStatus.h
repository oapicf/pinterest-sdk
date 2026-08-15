
/*
 * BatchOperationStatus.h
 *
 * The status of the operation performed by the batch
 */

#ifndef TINY_CPP_CLIENT_BatchOperationStatus_H_
#define TINY_CPP_CLIENT_BatchOperationStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The status of the operation performed by the batch
 *
 *  \ingroup Models
 *
 */

class BatchOperationStatus{
public:

    /*! \brief Constructor.
	 */
    BatchOperationStatus();
    BatchOperationStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BatchOperationStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BatchOperationStatus_H_ */
