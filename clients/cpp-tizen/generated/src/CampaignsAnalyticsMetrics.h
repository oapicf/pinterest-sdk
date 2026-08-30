/*
 * CampaignsAnalyticsMetrics.h
 *
 * 
 */

#ifndef _CampaignsAnalyticsMetrics_H_
#define _CampaignsAnalyticsMetrics_H_


#include <string>
#include "Date.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CampaignsAnalyticsMetrics : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignsAnalyticsMetrics();
	CampaignsAnalyticsMetrics(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignsAnalyticsMetrics();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
	 */
	std::string getCAMPAIGNID();

	/*! \brief Set The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
	 */
	void setCAMPAIGNID(std::string  cAMPAIGN_ID);
	/*! \brief Get Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	 */
	Date getDATE();

	/*! \brief Set Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	 */
	void setDATE(Date  dATE);

private:
	std::string cAMPAIGN_ID;
	Date dATE;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignsAnalyticsMetrics_H_ */
