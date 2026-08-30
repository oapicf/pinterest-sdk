/*
 * BidStrategyType.h
 *
 * Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \&quot;Pinterest Performance+ bidding\&quot;.
 */

#ifndef _BidStrategyType_H_
#define _BidStrategyType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
 *
 *  \ingroup Models
 *
 */

class BidStrategyType : public Object {
public:
	/*! \brief Constructor.
	 */
	BidStrategyType();
	BidStrategyType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BidStrategyType();

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

#endif /* _BidStrategyType_H_ */
