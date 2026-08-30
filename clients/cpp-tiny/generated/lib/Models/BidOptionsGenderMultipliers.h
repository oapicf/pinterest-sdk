
/*
 * BidOptionsGenderMultipliers.h
 *
 * This represents a mapping from gender targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment.  All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef TINY_CPP_CLIENT_BidOptionsGenderMultipliers_H_
#define TINY_CPP_CLIENT_BidOptionsGenderMultipliers_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief This represents a mapping from gender targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment.  All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 *
 *  \ingroup Models
 *
 */

class BidOptionsGenderMultipliers{
public:

    /*! \brief Constructor.
	 */
    BidOptionsGenderMultipliers();
    BidOptionsGenderMultipliers(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BidOptionsGenderMultipliers();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	long getFemale();

	/*! \brief Set 
	 */
	void setFemale(long female);
	/*! \brief Get 
	 */
	long getMale();

	/*! \brief Set 
	 */
	void setMale(long male);


    private:
    long female{};
    long male{};
};
}

#endif /* TINY_CPP_CLIENT_BidOptionsGenderMultipliers_H_ */
