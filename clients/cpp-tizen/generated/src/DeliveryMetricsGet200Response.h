/*
 * Delivery_metrics_get_200_response.h
 *
 * 
 */

#ifndef _Delivery_metrics_get_200_response_H_
#define _Delivery_metrics_get_200_response_H_


#include <string>
#include "DeliveryMetricsResponseItemsItems.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Delivery_metrics_get_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Delivery_metrics_get_200_response();
	Delivery_metrics_get_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Delivery_metrics_get_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<DeliveryMetricsResponseItemsItems> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <DeliveryMetricsResponseItemsItems> items);

private:
	std::list <DeliveryMetricsResponseItemsItems>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Delivery_metrics_get_200_response_H_ */
