
/*
 * ScheduleBidOptions_placement_multipliers.h
 *
 * This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef TINY_CPP_CLIENT_ScheduleBidOptions_placement_multipliers_H_
#define TINY_CPP_CLIENT_ScheduleBidOptions_placement_multipliers_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 *
 *  \ingroup Models
 *
 */

class ScheduleBidOptions_placement_multipliers{
public:

    /*! \brief Constructor.
	 */
    ScheduleBidOptions_placement_multipliers();
    ScheduleBidOptions_placement_multipliers(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ScheduleBidOptions_placement_multipliers();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Browse (home-feed and related surfaces)
	 */
	double getBrowse();

	/*! \brief Set Browse (home-feed and related surfaces)
	 */
	void setBrowse(double browse);
	/*! \brief Get Related-Pins placement
	 */
	double getRelatedPins();

	/*! \brief Set Related-Pins placement
	 */
	void setRelatedPins(double related_pins);
	/*! \brief Get Search placement
	 */
	double getSearch();

	/*! \brief Set Search placement
	 */
	void setSearch(double search);


    private:
    double browse{};
    double related_pins{};
    double search{};
};
}

#endif /* TINY_CPP_CLIENT_ScheduleBidOptions_placement_multipliers_H_ */
