/*
 * PinPromotionSummaryStatus.h
 *
 * Summary status for pin promotions
 */

#ifndef _PinPromotionSummaryStatus_H_
#define _PinPromotionSummaryStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Summary status for pin promotions
 *
 *  \ingroup Models
 *
 */

class PinPromotionSummaryStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	PinPromotionSummaryStatus();
	PinPromotionSummaryStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinPromotionSummaryStatus();

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

#endif /* _PinPromotionSummaryStatus_H_ */
