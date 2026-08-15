
/*
 * OrderLineSingleResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrderLineSingleResponse_H_
#define TINY_CPP_CLIENT_OrderLineSingleResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderLineResponse.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrderLineSingleResponse{
public:

    /*! \brief Constructor.
	 */
    OrderLineSingleResponse();
    OrderLineSingleResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderLineSingleResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OrderLineResponse getData();

	/*! \brief Set 
	 */
	void setData(OrderLineResponse  data);


    private:
    OrderLineResponse data;
};
}

#endif /* TINY_CPP_CLIENT_OrderLineSingleResponse_H_ */
