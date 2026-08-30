/*
 * FrequencyMultipliers.h
 *
 * This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */

#ifndef _FrequencyMultipliers_H_
#define _FrequencyMultipliers_H_


#include <string>
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 *
 *  \ingroup Models
 *
 */

class FrequencyMultipliers : public Object {
public:
	/*! \brief Constructor.
	 */
	FrequencyMultipliers();
	FrequencyMultipliers(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FrequencyMultipliers();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Impression count identifier.
	 */
	std::string getIMPRESSIONCOUNT();

	/*! \brief Set Impression count identifier.
	 */
	void setIMPRESSIONCOUNT(std::string  iMPRESSION_COUNT);

private:
	std::string iMPRESSION_COUNT;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FrequencyMultipliers_H_ */
