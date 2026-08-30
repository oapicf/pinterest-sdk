
/*
 * BidOptionsAudienceMultipliers.h
 *
 * This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef TINY_CPP_CLIENT_BidOptionsAudienceMultipliers_H_
#define TINY_CPP_CLIENT_BidOptionsAudienceMultipliers_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 *
 *  \ingroup Models
 *
 */

class BidOptionsAudienceMultipliers{
public:

    /*! \brief Constructor.
	 */
    BidOptionsAudienceMultipliers();
    BidOptionsAudienceMultipliers(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BidOptionsAudienceMultipliers();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getAudienceId();

	/*! \brief Set 
	 */
	void setAudienceId(std::string audience_id);
	/*! \brief Get 
	 */
	long getMultiplier();

	/*! \brief Set 
	 */
	void setMultiplier(long multiplier);


    private:
    std::string audience_id{};
    long multiplier{};
};
}

#endif /* TINY_CPP_CLIENT_BidOptionsAudienceMultipliers_H_ */
