
/*
 * SSIOEditInsertionOrderResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SSIOEditInsertionOrderResponse_H_
#define TINY_CPP_CLIENT_SSIOEditInsertionOrderResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SSIOEditInsertionOrderResponse{
public:

    /*! \brief Constructor.
	 */
    SSIOEditInsertionOrderResponse();
    SSIOEditInsertionOrderResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SSIOEditInsertionOrderResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Salesforce order id
	 */
	std::string getPinOrderId();

	/*! \brief Set Salesforce order id
	 */
	void setPinOrderId(std::string  pin_order_id);


    private:
    std::string pin_order_id{};
};
}

#endif /* TINY_CPP_CLIENT_SSIOEditInsertionOrderResponse_H_ */
