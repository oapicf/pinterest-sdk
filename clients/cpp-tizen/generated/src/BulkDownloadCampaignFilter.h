/*
 * BulkDownloadCampaignFilter.h
 *
 * 
 */

#ifndef _BulkDownloadCampaignFilter_H_
#define _BulkDownloadCampaignFilter_H_


#include <string>
#include "ConversionObjectiveType.h"
#include "SummaryStatus.h"
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

class BulkDownloadCampaignFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	BulkDownloadCampaignFilter();
	BulkDownloadCampaignFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BulkDownloadCampaignFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<SummaryStatus> getCampaignStatus();

	/*! \brief Set 
	 */
	void setCampaignStatus(std::list <SummaryStatus> campaign_status);
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
	std::list<ConversionObjectiveType> getObjectiveType();

	/*! \brief Set 
	 */
	void setObjectiveType(std::list <ConversionObjectiveType> objective_type);
	/*! \brief Get Unix UTC timestamp.
	 */
	std::string getStartTime();

	/*! \brief Set Unix UTC timestamp.
	 */
	void setStartTime(std::string  start_time);

private:
	std::list <SummaryStatus>campaign_status;
	std::string end_time;
	std::string name;
	std::list <ConversionObjectiveType>objective_type;
	std::string start_time;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BulkDownloadCampaignFilter_H_ */
