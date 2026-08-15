
/*
 * BatchOperation.h
 *
 * The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \&quot;Out of Stock\&quot;.
 */

#ifndef TINY_CPP_CLIENT_BatchOperation_H_
#define TINY_CPP_CLIENT_BatchOperation_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".
 *
 *  \ingroup Models
 *
 */

class BatchOperation{
public:

    /*! \brief Constructor.
	 */
    BatchOperation();
    BatchOperation(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BatchOperation();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BatchOperation_H_ */
