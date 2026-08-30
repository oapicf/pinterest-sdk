/*
 * AdgroupTrackingFeatures.h
 *
 * 
 */

#ifndef _AdgroupTrackingFeatures_H_
#define _AdgroupTrackingFeatures_H_


#include <string>
#include "AdgroupTrackingFeatureType.h"
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

class AdgroupTrackingFeatures : public Object {
public:
	/*! \brief Constructor.
	 */
	AdgroupTrackingFeatures();
	AdgroupTrackingFeatures(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdgroupTrackingFeatures();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Tracking features. To clear this field, set to null.
	 */
	std::list<AdgroupTrackingFeatureType> getEnabled();

	/*! \brief Set Tracking features. To clear this field, set to null.
	 */
	void setEnabled(std::list <AdgroupTrackingFeatureType> enabled);

private:
	std::list <AdgroupTrackingFeatureType>enabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdgroupTrackingFeatures_H_ */
