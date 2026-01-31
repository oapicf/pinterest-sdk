/*
 * TargetingSpecShoppingRetargeting.h
 *
 * 
 */

#ifndef _TargetingSpecShoppingRetargeting_H_
#define _TargetingSpecShoppingRetargeting_H_


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

class TargetingSpecShoppingRetargeting : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingSpecShoppingRetargeting();
	TargetingSpecShoppingRetargeting(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingSpecShoppingRetargeting();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Number of days ago to stop lookback timeframe for dynamic retargeting
	 */
	int getExclusionWindow();

	/*! \brief Set Number of days ago to stop lookback timeframe for dynamic retargeting
	 */
	void setExclusionWindow(int  exclusion_window);
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

private:
	int exclusion_window;
	int lookback_window;
	std::list <int>tag_types;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingSpecShoppingRetargeting_H_ */
