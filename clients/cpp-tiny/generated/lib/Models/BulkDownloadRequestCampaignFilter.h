
/*
 * BulkDownloadRequest_campaign_filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BulkDownloadRequest_campaign_filter_H_
#define TINY_CPP_CLIENT_BulkDownloadRequest_campaign_filter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignSummaryStatus.h"
#include "ObjectiveType.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BulkDownloadRequest_campaign_filter{
public:

    /*! \brief Constructor.
	 */
    BulkDownloadRequest_campaign_filter();
    BulkDownloadRequest_campaign_filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BulkDownloadRequest_campaign_filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<CampaignSummaryStatus> getCampaignStatus();

	/*! \brief Set 
	 */
	void setCampaignStatus(std::list <CampaignSummaryStatus> campaign_status);
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
	std::list<ObjectiveType> getObjectiveType();

	/*! \brief Set 
	 */
	void setObjectiveType(std::list <ObjectiveType> objective_type);
	/*! \brief Get Unix UTC timestamp.
	 */
	std::string getStartTime();

	/*! \brief Set Unix UTC timestamp.
	 */
	void setStartTime(std::string  start_time);


    private:
    std::list<CampaignSummaryStatus> campaign_status;
    std::string end_time{};
    std::string name{};
    std::list<ObjectiveType> objective_type;
    std::string start_time{};
};
}

#endif /* TINY_CPP_CLIENT_BulkDownloadRequest_campaign_filter_H_ */
