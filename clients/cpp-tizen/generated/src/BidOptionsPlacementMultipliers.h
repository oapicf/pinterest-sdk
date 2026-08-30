/*
 * BidOptionsPlacementMultipliers.h
 *
 * This represents a mapping from placement to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef _BidOptionsPlacementMultipliers_H_
#define _BidOptionsPlacementMultipliers_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This represents a mapping from placement to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 *
 *  \ingroup Models
 *
 */

class BidOptionsPlacementMultipliers : public Object {
public:
	/*! \brief Constructor.
	 */
	BidOptionsPlacementMultipliers();
	BidOptionsPlacementMultipliers(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BidOptionsPlacementMultipliers();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	long long getBrowse();

	/*! \brief Set 
	 */
	void setBrowse(long long  browse);
	/*! \brief Get 
	 */
	long long getRelatedPins();

	/*! \brief Set 
	 */
	void setRelatedPins(long long  related_pins);
	/*! \brief Get 
	 */
	long long getSearch();

	/*! \brief Set 
	 */
	void setSearch(long long  search);

private:
	long long browse;
	long long related_pins;
	long long search;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BidOptionsPlacementMultipliers_H_ */
