
/*
 * SSIOInsertionOrderStatusResponse.h
 *
 * SSIO insertion order status response for a single pin order id lookup.
 */

#ifndef TINY_CPP_CLIENT_SSIOInsertionOrderStatusResponse_H_
#define TINY_CPP_CLIENT_SSIOInsertionOrderStatusResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief SSIO insertion order status response for a single pin order id lookup.
 *
 *  \ingroup Models
 *
 */

class SSIOInsertionOrderStatusResponse{
public:

    /*! \brief Constructor.
	 */
    SSIOInsertionOrderStatusResponse();
    SSIOInsertionOrderStatusResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SSIOInsertionOrderStatusResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Salesforce insertion order creation time
	 */
	std::string getCreationTime();

	/*! \brief Set Salesforce insertion order creation time
	 */
	void setCreationTime(std::string creation_time);
	/*! \brief Get Salesforce order id
	 */
	std::string getPinOrderId();

	/*! \brief Set Salesforce order id
	 */
	void setPinOrderId(std::string pin_order_id);
	/*! \brief Get Salesforce insertion order status
	 */
	std::string getStatus();

	/*! \brief Set Salesforce insertion order status
	 */
	void setStatus(std::string status);


    private:
    std::string creation_time{};
    std::string pin_order_id{};
    std::string status{};
};
}

#endif /* TINY_CPP_CLIENT_SSIOInsertionOrderStatusResponse_H_ */
