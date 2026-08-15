
/*
 * PlacementMultipliers.h
 *
 * This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */

#ifndef TINY_CPP_CLIENT_PlacementMultipliers_H_
#define TINY_CPP_CLIENT_PlacementMultipliers_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 *
 *  \ingroup Models
 *
 */

class PlacementMultipliers{
public:

    /*! \brief Constructor.
	 */
    PlacementMultipliers();
    PlacementMultipliers(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PlacementMultipliers();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getPLACEMENT();

	/*! \brief Set 
	 */
	void setPLACEMENT(std::string  pLACEMENT);


    private:
    std::string pLACEMENT{};
};
}

#endif /* TINY_CPP_CLIENT_PlacementMultipliers_H_ */
