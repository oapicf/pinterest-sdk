
/*
 * FrequencyMultipliers.h
 *
 * This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */

#ifndef TINY_CPP_CLIENT_FrequencyMultipliers_H_
#define TINY_CPP_CLIENT_FrequencyMultipliers_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <map>

namespace Tiny {


/*! \brief This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 *
 *  \ingroup Models
 *
 */

class FrequencyMultipliers{
public:

    /*! \brief Constructor.
	 */
    FrequencyMultipliers();
    FrequencyMultipliers(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FrequencyMultipliers();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Impression count identifier.
	 */
	std::string getIMPRESSIONCOUNT();

	/*! \brief Set Impression count identifier.
	 */
	void setIMPRESSIONCOUNT(std::string iMPRESSION_COUNT);


    private:
    std::string iMPRESSION_COUNT{};
};
}

#endif /* TINY_CPP_CLIENT_FrequencyMultipliers_H_ */
