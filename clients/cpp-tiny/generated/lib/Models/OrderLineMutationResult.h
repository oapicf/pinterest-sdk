
/*
 * OrderLineMutationResult.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrderLineMutationResult_H_
#define TINY_CPP_CLIENT_OrderLineMutationResult_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderLine.h"
#include "OrderLineMutationError.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrderLineMutationResult{
public:

    /*! \brief Constructor.
	 */
    OrderLineMutationResult();
    OrderLineMutationResult(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderLineMutationResult();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Error list if update(s) fail.
	 */
	std::list<OrderLineMutationError> getErrors();

	/*! \brief Set Error list if update(s) fail.
	 */
	void setErrors(std::list<OrderLineMutationError> errors);
	/*! \brief Get Order Line object array.
	 */
	std::list<OrderLine> getOrderLine();

	/*! \brief Set Order Line object array.
	 */
	void setOrderLine(std::list<OrderLine> order_line);


    private:
    std::list<OrderLineMutationError> errors;
    std::list<OrderLine> order_line;
};
}

#endif /* TINY_CPP_CLIENT_OrderLineMutationResult_H_ */
