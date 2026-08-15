
/*
 * OrderLinesArrayResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrderLinesArrayResponse_H_
#define TINY_CPP_CLIENT_OrderLinesArrayResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderLines.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrderLinesArrayResponse{
public:

    /*! \brief Constructor.
	 */
    OrderLinesArrayResponse();
    OrderLinesArrayResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderLinesArrayResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<OrderLines> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <OrderLines> items);


    private:
    std::list<OrderLines> items;
};
}

#endif /* TINY_CPP_CLIENT_OrderLinesArrayResponse_H_ */
