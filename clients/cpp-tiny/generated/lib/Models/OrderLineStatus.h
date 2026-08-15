
/*
 * OrderLineStatus.h
 *
 * Order Line Status
 */

#ifndef TINY_CPP_CLIENT_OrderLineStatus_H_
#define TINY_CPP_CLIENT_OrderLineStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Order Line Status
 *
 *  \ingroup Models
 *
 */

class OrderLineStatus{
public:

    /*! \brief Constructor.
	 */
    OrderLineStatus();
    OrderLineStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderLineStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrderLineStatus_H_ */
