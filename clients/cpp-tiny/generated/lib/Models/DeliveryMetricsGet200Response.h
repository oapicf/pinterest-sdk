
/*
 * Delivery_metrics_get_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Delivery_metrics_get_200_response_H_
#define TINY_CPP_CLIENT_Delivery_metrics_get_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DeliveryMetricsResponseItemsItems.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Delivery_metrics_get_200_response{
public:

    /*! \brief Constructor.
	 */
    Delivery_metrics_get_200_response();
    Delivery_metrics_get_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Delivery_metrics_get_200_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<DeliveryMetricsResponseItemsItems> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<DeliveryMetricsResponseItemsItems> items);


    private:
    std::list<DeliveryMetricsResponseItemsItems> items;
};
}

#endif /* TINY_CPP_CLIENT_Delivery_metrics_get_200_response_H_ */
