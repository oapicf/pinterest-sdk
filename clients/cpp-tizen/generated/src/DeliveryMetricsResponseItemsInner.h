/*
 * DeliveryMetricsResponse_items_inner.h
 *
 * 
 */

#ifndef _DeliveryMetricsResponse_items_inner_H_
#define _DeliveryMetricsResponse_items_inner_H_


#include <string>
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

class DeliveryMetricsResponse_items_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	DeliveryMetricsResponse_items_inner();
	DeliveryMetricsResponse_items_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeliveryMetricsResponse_items_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Metric's name.
	 */
	std::string getName();

	/*! \brief Set Metric's name.
	 */
	void setName(std::string  name);
	/*! \brief Get Category name
	 */
	std::string getCategory();

	/*! \brief Set Category name
	 */
	void setCategory(std::string  category);
	/*! \brief Get How the metric is defined.
	 */
	std::string getDefinition();

	/*! \brief Set How the metric is defined.
	 */
	void setDefinition(std::string  definition);
	/*! \brief Get Display name, when available. If unavaible it will not be returned.
	 */
	std::string getDisplayName();

	/*! \brief Set Display name, when available. If unavaible it will not be returned.
	 */
	void setDisplayName(std::string  display_name);

private:
	std::string name;
	std::string category;
	std::string definition;
	std::string display_name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeliveryMetricsResponse_items_inner_H_ */
