/*
 * BudgetType.h
 *
 * Budget type. If DAILY, an ad group&#39;s daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group &#x60;start_time&#x60; and &#x60;end_time&#x60; range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. For CBO campaigns, only \&quot;CBO_ADGROUP\&quot; is allowed. For WEB_SESSIONS campaigns, only \&quot;LIFETIME\&quot; is allowed. For update, only draft ad groups may update budget type.
 */

#ifndef _BudgetType_H_
#define _BudgetType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. For CBO campaigns, only \"CBO_ADGROUP\" is allowed. For WEB_SESSIONS campaigns, only \"LIFETIME\" is allowed. For update, only draft ad groups may update budget type.
 *
 *  \ingroup Models
 *
 */

class BudgetType : public Object {
public:
	/*! \brief Constructor.
	 */
	BudgetType();
	BudgetType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BudgetType();

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

#endif /* _BudgetType_H_ */
