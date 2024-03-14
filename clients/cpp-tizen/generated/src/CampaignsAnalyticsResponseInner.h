/*
 * CampaignsAnalyticsResponse_inner.h
 *
 * 
 */

#ifndef _CampaignsAnalyticsResponse_inner_H_
#define _CampaignsAnalyticsResponse_inner_H_


#include <string>
#include "AnyType.h"
#include "Date.h"
#include <map>
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

class CampaignsAnalyticsResponse_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignsAnalyticsResponse_inner();
	CampaignsAnalyticsResponse_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignsAnalyticsResponse_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the campaing that this metrics belongs to.
	 */
	std::string getCAMPAIGNID();

	/*! \brief Set The ID of the campaing that this metrics belongs to.
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

#endif /* _CampaignsAnalyticsResponse_inner_H_ */
