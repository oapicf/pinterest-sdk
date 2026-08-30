
/*
 * ScheduleAppTypeMultipliers.h
 *
 * This represents a mapping from app type targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef TINY_CPP_CLIENT_ScheduleAppTypeMultipliers_H_
#define TINY_CPP_CLIENT_ScheduleAppTypeMultipliers_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TargetingSpecAppType.h"
#include <map>

namespace Tiny {


/*! \brief This represents a mapping from app type targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 *
 *  \ingroup Models
 *
 */

class ScheduleAppTypeMultipliers{
public:

    /*! \brief Constructor.
	 */
    ScheduleAppTypeMultipliers();
    ScheduleAppTypeMultipliers(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ScheduleAppTypeMultipliers();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	TargetingSpecAppType getAPPTYPE();

	/*! \brief Set 
	 */
	void setAPPTYPE(TargetingSpecAppType aPP_TYPE);


    private:
    TargetingSpecAppType aPP_TYPE;
};
}

#endif /* TINY_CPP_CLIENT_ScheduleAppTypeMultipliers_H_ */
