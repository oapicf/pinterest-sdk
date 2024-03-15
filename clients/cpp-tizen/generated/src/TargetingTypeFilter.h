/*
 * TargetingTypeFilter.h
 *
 * 
 */

#ifndef _TargetingTypeFilter_H_
#define _TargetingTypeFilter_H_


#include <string>
#include "AdsAnalyticsTargetingType.h"
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

class TargetingTypeFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingTypeFilter();
	TargetingTypeFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingTypeFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
	 */
	std::list<AdsAnalyticsTargetingType> getTargetingTypes();

	/*! \brief Set List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
	 */
	void setTargetingTypes(std::list <AdsAnalyticsTargetingType> targeting_types);

private:
	std::list <AdsAnalyticsTargetingType>targeting_types;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingTypeFilter_H_ */
