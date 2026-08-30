/*
 * ScrollupGoalMetadata.h
 *
 * 
 */

#ifndef _ScrollupGoalMetadata_H_
#define _ScrollupGoalMetadata_H_


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

class ScrollupGoalMetadata : public Object {
public:
	/*! \brief Constructor.
	 */
	ScrollupGoalMetadata();
	ScrollupGoalMetadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ScrollupGoalMetadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getScrollupGoalValueInMicroCurrency();

	/*! \brief Set 
	 */
	void setScrollupGoalValueInMicroCurrency(std::string  scrollup_goal_value_in_micro_currency);

private:
	std::string scrollup_goal_value_in_micro_currency;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ScrollupGoalMetadata_H_ */
