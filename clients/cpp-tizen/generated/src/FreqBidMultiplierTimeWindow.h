/*
 * FreqBidMultiplierTimeWindow.h
 *
 * The time window for frequency bid multipliers.
 */

#ifndef _FreqBidMultiplierTimeWindow_H_
#define _FreqBidMultiplierTimeWindow_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The time window for frequency bid multipliers.
 *
 *  \ingroup Models
 *
 */

class FreqBidMultiplierTimeWindow : public Object {
public:
	/*! \brief Constructor.
	 */
	FreqBidMultiplierTimeWindow();
	FreqBidMultiplierTimeWindow(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FreqBidMultiplierTimeWindow();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _FreqBidMultiplierTimeWindow_H_ */
