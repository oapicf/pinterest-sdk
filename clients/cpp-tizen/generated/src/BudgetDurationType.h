/*
 * BudgetDurationType.h
 *
 * Budget duration type for delivery estimates.
 */

#ifndef _BudgetDurationType_H_
#define _BudgetDurationType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Budget duration type for delivery estimates.
 *
 *  \ingroup Models
 *
 */

class BudgetDurationType : public Object {
public:
	/*! \brief Constructor.
	 */
	BudgetDurationType();
	BudgetDurationType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BudgetDurationType();

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

#endif /* _BudgetDurationType_H_ */
