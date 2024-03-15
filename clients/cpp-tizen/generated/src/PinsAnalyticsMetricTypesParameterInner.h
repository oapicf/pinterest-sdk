/*
 * Pins_analytics_metric_types_parameter_inner.h
 *
 * 
 */

#ifndef _Pins_analytics_metric_types_parameter_inner_H_
#define _Pins_analytics_metric_types_parameter_inner_H_


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

class Pins_analytics_metric_types_parameter_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	Pins_analytics_metric_types_parameter_inner();
	Pins_analytics_metric_types_parameter_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Pins_analytics_metric_types_parameter_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _Pins_analytics_metric_types_parameter_inner_H_ */
