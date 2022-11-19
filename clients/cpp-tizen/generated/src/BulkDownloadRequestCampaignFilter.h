/*
 * BulkDownloadRequest_campaign_filter.h
 *
 * 
 */

#ifndef _BulkDownloadRequest_campaign_filter_H_
#define _BulkDownloadRequest_campaign_filter_H_


#include <string>
#include "CampaignSummaryStatus.h"
#include "ObjectiveType.h"
#include <list>
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

class BulkDownloadRequest_campaign_filter : public Object {
public:
	/*! \brief Constructor.
	 */
	BulkDownloadRequest_campaign_filter();
	BulkDownloadRequest_campaign_filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BulkDownloadRequest_campaign_filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unix UTC timestamp.
	 */
	std::string getStartTime();

	/*! \brief Set Unix UTC timestamp.
	 */
	void setStartTime(std::string  start_time);
	/*! \brief Get Unix UTC timestamp.
	 */
	std::string getEndTime();

	/*! \brief Set Unix UTC timestamp.
	 */
	void setEndTime(std::string  end_time);
	/*! \brief Get Campaign name
	 */
	std::string getName();

	/*! \brief Set Campaign name
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::list<CampaignSummaryStatus> getCampaignStatus();

	/*! \brief Set 
	 */
	void setCampaignStatus(std::list <CampaignSummaryStatus> campaign_status);
	/*! \brief Get 
	 */
	std::list<ObjectiveType> getObjectiveType();

	/*! \brief Set 
	 */
	void setObjectiveType(std::list <ObjectiveType> objective_type);

private:
	std::string start_time;
	std::string end_time;
	std::string name;
	std::list <CampaignSummaryStatus>campaign_status;
	std::list <ObjectiveType>objective_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BulkDownloadRequest_campaign_filter_H_ */
