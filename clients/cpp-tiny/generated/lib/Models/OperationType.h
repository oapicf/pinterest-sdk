
/*
 * OperationType.h
 *
 * Operation type to share a specific audience or revoke access to a previously shared audience
 */

#ifndef TINY_CPP_CLIENT_OperationType_H_
#define TINY_CPP_CLIENT_OperationType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Operation type to share a specific audience or revoke access to a previously shared audience
 *
 *  \ingroup Models
 *
 */

class OperationType{
public:

    /*! \brief Constructor.
	 */
    OperationType();
    OperationType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OperationType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OperationType_H_ */
