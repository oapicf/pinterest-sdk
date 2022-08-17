/*
 * TargetingSpec_SHOPPING_RETARGETING.h
 *
 * 
 */

#ifndef _TargetingSpec_SHOPPING_RETARGETING_H_
#define _TargetingSpec_SHOPPING_RETARGETING_H_


#include <string>
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

class TargetingSpec_SHOPPING_RETARGETING : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingSpec_SHOPPING_RETARGETING();
	TargetingSpec_SHOPPING_RETARGETING(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingSpec_SHOPPING_RETARGETING();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Number of days ago to start lookback timeframe for dynamic retargeting
	 */
	int getLookbackWindow();

	/*! \brief Set Number of days ago to start lookback timeframe for dynamic retargeting
	 */
	void setLookbackWindow(int  lookback_window);
	/*! \brief Get Event types to target for dynamic retargeting
	 */
	std::list<int> getTagTypes();

	/*! \brief Set Event types to target for dynamic retargeting
	 */
	void setTagTypes(std::list <int> tag_types);
	/*! \brief Get Number of days ago to stop lookback timeframe for dynamic retargeting
	 */
	int getExclusionWindow();

	/*! \brief Set Number of days ago to stop lookback timeframe for dynamic retargeting
	 */
	void setExclusionWindow(int  exclusion_window);

private:
	int lookback_window;
	std::list <int>tag_types;
	int exclusion_window;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingSpec_SHOPPING_RETARGETING_H_ */
