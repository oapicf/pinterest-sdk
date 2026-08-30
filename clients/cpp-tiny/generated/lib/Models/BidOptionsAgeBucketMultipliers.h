
/*
 * BidOptionsAgeBucketMultipliers.h
 *
 * This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef TINY_CPP_CLIENT_BidOptionsAgeBucketMultipliers_H_
#define TINY_CPP_CLIENT_BidOptionsAgeBucketMultipliers_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 *
 *  \ingroup Models
 *
 */

class BidOptionsAgeBucketMultipliers{
public:

    /*! \brief Constructor.
	 */
    BidOptionsAgeBucketMultipliers();
    BidOptionsAgeBucketMultipliers(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BidOptionsAgeBucketMultipliers();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	long get1824();

	/*! \brief Set 
	 */
	void set1824(long 1824);
	/*! \brief Get 
	 */
	long get2534();

	/*! \brief Set 
	 */
	void set2534(long 2534);
	/*! \brief Get 
	 */
	long get3544();

	/*! \brief Set 
	 */
	void set3544(long 3544);
	/*! \brief Get 
	 */
	long get4549();

	/*! \brief Set 
	 */
	void set4549(long 4549);
	/*! \brief Get 
	 */
	long get5054();

	/*! \brief Set 
	 */
	void set5054(long 5054);
	/*! \brief Get 
	 */
	long get5564();

	/*! \brief Set 
	 */
	void set5564(long 5564);
	/*! \brief Get 
	 */
	long get65();

	/*! \brief Set 
	 */
	void set65(long 65);


    private:
    long 1824{};
    long 2534{};
    long 3544{};
    long 4549{};
    long 5054{};
    long 5564{};
    long 65{};
};
}

#endif /* TINY_CPP_CLIENT_BidOptionsAgeBucketMultipliers_H_ */
