/*
 * TargetingSpec_SHOPPING_RETARGETING_1_inner.h
 *
 * 
 */

#ifndef _TargetingSpec_SHOPPING_RETARGETING_1_inner_H_
#define _TargetingSpec_SHOPPING_RETARGETING_1_inner_H_


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

class TargetingSpec_SHOPPING_RETARGETING_1_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingSpec_SHOPPING_RETARGETING_1_inner();
	TargetingSpec_SHOPPING_RETARGETING_1_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingSpec_SHOPPING_RETARGETING_1_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getLookbackWindow();

	/*! \brief Set 
	 */
	void setLookbackWindow(int  lookback_window);
	/*! \brief Get 
	 */
	std::list<int> getTagTypes();

	/*! \brief Set 
	 */
	void setTagTypes(std::list <int> tag_types);
	/*! \brief Get 
	 */
	int getExclusionWindow();

	/*! \brief Set 
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

#endif /* _TargetingSpec_SHOPPING_RETARGETING_1_inner_H_ */
