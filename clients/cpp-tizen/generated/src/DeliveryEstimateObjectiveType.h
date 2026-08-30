/*
 * DeliveryEstimateObjectiveType.h
 *
 * Objective type for delivery estimates.
 */

#ifndef _DeliveryEstimateObjectiveType_H_
#define _DeliveryEstimateObjectiveType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Objective type for delivery estimates.
 *
 *  \ingroup Models
 *
 */

class DeliveryEstimateObjectiveType : public Object {
public:
	/*! \brief Constructor.
	 */
	DeliveryEstimateObjectiveType();
	DeliveryEstimateObjectiveType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeliveryEstimateObjectiveType();

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

#endif /* _DeliveryEstimateObjectiveType_H_ */
