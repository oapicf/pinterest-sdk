/*
 * AdGroupSummaryStatus.h
 *
 * Summary status for ad group
 */

#ifndef _AdGroupSummaryStatus_H_
#define _AdGroupSummaryStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Summary status for ad group
 *
 *  \ingroup Models
 *
 */

class AdGroupSummaryStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupSummaryStatus();
	AdGroupSummaryStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupSummaryStatus();

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

#endif /* _AdGroupSummaryStatus_H_ */
