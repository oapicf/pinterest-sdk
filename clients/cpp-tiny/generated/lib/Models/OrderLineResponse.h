
/*
 * OrderLineResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrderLineResponse_H_
#define TINY_CPP_CLIENT_OrderLineResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderLine.h"
#include "OrderLineError.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrderLineResponse{
public:

    /*! \brief Constructor.
	 */
    OrderLineResponse();
    OrderLineResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderLineResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Error list if update(s) fail.
	 */
	std::list<OrderLineError> getErrors();

	/*! \brief Set Error list if update(s) fail.
	 */
	void setErrors(std::list <OrderLineError> errors);
	/*! \brief Get Order Line object array.
	 */
	std::list<OrderLine> getOrderLine();

	/*! \brief Set Order Line object array.
	 */
	void setOrderLine(std::list <OrderLine> order_line);


    private:
    std::list<OrderLineError> errors;
    std::list<OrderLine> order_line;
};
}

#endif /* TINY_CPP_CLIENT_OrderLineResponse_H_ */
