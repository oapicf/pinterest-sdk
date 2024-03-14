/*
 * DeliveryMetricsResponse.h
 *
 * 
 */

#ifndef _DeliveryMetricsResponse_H_
#define _DeliveryMetricsResponse_H_


#include <string>
#include "DeliveryMetricsResponse_items_inner.h"
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

class DeliveryMetricsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DeliveryMetricsResponse();
	DeliveryMetricsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeliveryMetricsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<DeliveryMetricsResponse_items_inner> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <DeliveryMetricsResponse_items_inner> items);

private:
	std::list <DeliveryMetricsResponse_items_inner>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeliveryMetricsResponse_H_ */
