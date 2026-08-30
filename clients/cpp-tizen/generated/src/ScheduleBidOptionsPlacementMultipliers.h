/*
 * ScheduleBidOptions_placement_multipliers.h
 *
 * This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef _ScheduleBidOptions_placement_multipliers_H_
#define _ScheduleBidOptions_placement_multipliers_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 *
 *  \ingroup Models
 *
 */

class ScheduleBidOptions_placement_multipliers : public Object {
public:
	/*! \brief Constructor.
	 */
	ScheduleBidOptions_placement_multipliers();
	ScheduleBidOptions_placement_multipliers(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ScheduleBidOptions_placement_multipliers();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Browse (home-feed and related surfaces)
	 */
	double getBrowse();

	/*! \brief Set Browse (home-feed and related surfaces)
	 */
	void setBrowse(double  browse);
	/*! \brief Get Related-Pins placement
	 */
	double getRelatedPins();

	/*! \brief Set Related-Pins placement
	 */
	void setRelatedPins(double  related_pins);
	/*! \brief Get Search placement
	 */
	double getSearch();

	/*! \brief Set Search placement
	 */
	void setSearch(double  search);

private:
	double browse;
	double related_pins;
	double search;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ScheduleBidOptions_placement_multipliers_H_ */
