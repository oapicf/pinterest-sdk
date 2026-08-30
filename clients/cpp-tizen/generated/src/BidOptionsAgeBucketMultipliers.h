/*
 * BidOptionsAgeBucketMultipliers.h
 *
 * This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef _BidOptionsAgeBucketMultipliers_H_
#define _BidOptionsAgeBucketMultipliers_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 *
 *  \ingroup Models
 *
 */

class BidOptionsAgeBucketMultipliers : public Object {
public:
	/*! \brief Constructor.
	 */
	BidOptionsAgeBucketMultipliers();
	BidOptionsAgeBucketMultipliers(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BidOptionsAgeBucketMultipliers();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	long long get1824();

	/*! \brief Set 
	 */
	void set1824(long long  1824);
	/*! \brief Get 
	 */
	long long get2534();

	/*! \brief Set 
	 */
	void set2534(long long  2534);
	/*! \brief Get 
	 */
	long long get3544();

	/*! \brief Set 
	 */
	void set3544(long long  3544);
	/*! \brief Get 
	 */
	long long get4549();

	/*! \brief Set 
	 */
	void set4549(long long  4549);
	/*! \brief Get 
	 */
	long long get5054();

	/*! \brief Set 
	 */
	void set5054(long long  5054);
	/*! \brief Get 
	 */
	long long get5564();

	/*! \brief Set 
	 */
	void set5564(long long  5564);
	/*! \brief Get 
	 */
	long long get65();

	/*! \brief Set 
	 */
	void set65(long long  65);

private:
	long long 1824;
	long long 2534;
	long long 3544;
	long long 4549;
	long long 5054;
	long long 5564;
	long long 65;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BidOptionsAgeBucketMultipliers_H_ */
