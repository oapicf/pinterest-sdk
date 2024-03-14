/*
 * CampaignSummaryStatus.h
 *
 * Summary status for campaign
 */

#ifndef _CampaignSummaryStatus_H_
#define _CampaignSummaryStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Summary status for campaign
 *
 *  \ingroup Models
 *
 */

class CampaignSummaryStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignSummaryStatus();
	CampaignSummaryStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignSummaryStatus();

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

#endif /* _CampaignSummaryStatus_H_ */
