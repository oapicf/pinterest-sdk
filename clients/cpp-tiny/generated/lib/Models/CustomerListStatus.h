
/*
 * CustomerListStatus.h
 *
 * Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users.
 */

#ifndef TINY_CPP_CLIENT_CustomerListStatus_H_
#define TINY_CPP_CLIENT_CustomerListStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
 *
 *  \ingroup Models
 *
 */

class CustomerListStatus{
public:

    /*! \brief Constructor.
	 */
    CustomerListStatus();
    CustomerListStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomerListStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CustomerListStatus_H_ */
