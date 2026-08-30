
/*
 * BulkDownloadCampaignFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BulkDownloadCampaignFilter_H_
#define TINY_CPP_CLIENT_BulkDownloadCampaignFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConversionObjectiveType.h"
#include "SummaryStatus.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BulkDownloadCampaignFilter{
public:

    /*! \brief Constructor.
	 */
    BulkDownloadCampaignFilter();
    BulkDownloadCampaignFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BulkDownloadCampaignFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<SummaryStatus> getCampaignStatus();

	/*! \brief Set 
	 */
	void setCampaignStatus(std::list<SummaryStatus> campaign_status);
	/*! \brief Get Unix UTC timestamp.
	 */
	std::string getEndTime();

	/*! \brief Set Unix UTC timestamp.
	 */
	void setEndTime(std::string end_time);
	/*! \brief Get Campaign name
	 */
	std::string getName();

	/*! \brief Set Campaign name
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	std::list<ConversionObjectiveType> getObjectiveType();

	/*! \brief Set 
	 */
	void setObjectiveType(std::list<ConversionObjectiveType> objective_type);
	/*! \brief Get Unix UTC timestamp.
	 */
	std::string getStartTime();

	/*! \brief Set Unix UTC timestamp.
	 */
	void setStartTime(std::string start_time);


    private:
    std::list<SummaryStatus> campaign_status;
    std::string end_time{};
    std::string name{};
    std::list<ConversionObjectiveType> objective_type;
    std::string start_time{};
};
}

#endif /* TINY_CPP_CLIENT_BulkDownloadCampaignFilter_H_ */
