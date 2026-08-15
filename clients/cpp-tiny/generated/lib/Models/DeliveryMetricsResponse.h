
/*
 * DeliveryMetricsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DeliveryMetricsResponse_H_
#define TINY_CPP_CLIENT_DeliveryMetricsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DeliveryMetricsResponse_items_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DeliveryMetricsResponse{
public:

    /*! \brief Constructor.
	 */
    DeliveryMetricsResponse();
    DeliveryMetricsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeliveryMetricsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<DeliveryMetricsResponse_items_inner> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <DeliveryMetricsResponse_items_inner> items);


    private:
    std::list<DeliveryMetricsResponse_items_inner> items;
};
}

#endif /* TINY_CPP_CLIENT_DeliveryMetricsResponse_H_ */
