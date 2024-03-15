/*
 * CampaignCommon.h
 *
 * Campaign Data
 */

#ifndef _CampaignCommon_H_
#define _CampaignCommon_H_


#include <string>
#include "AdCommon_tracking_urls.h"
#include "CampaignSummaryStatus.h"
#include "EntityStatus.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Campaign Data
 *
 *  \ingroup Models
 *
 */

class CampaignCommon : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignCommon();
	CampaignCommon(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignCommon();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
	 */
	std::string getAdAccountId();

	/*! \brief Set Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get Campaign name.
	 */
	std::string getName();

	/*! \brief Set Campaign name.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	EntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityStatus  status);
	/*! \brief Get Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
	 */
	int getLifetimeSpendCap();

	/*! \brief Set Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
	 */
	void setLifetimeSpendCap(int  lifetime_spend_cap);
	/*! \brief Get Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
	 */
	int getDailySpendCap();

	/*! \brief Set Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
	 */
	void setDailySpendCap(int  daily_spend_cap);
	/*! \brief Get Order line ID that appears on the invoice.
	 */
	std::string getOrderLineId();

	/*! \brief Set Order line ID that appears on the invoice.
	 */
	void setOrderLineId(std::string  order_line_id);
	/*! \brief Get 
	 */
	AdCommon_tracking_urls getTrackingUrls();

	/*! \brief Set 
	 */
	void setTrackingUrls(AdCommon_tracking_urls  tracking_urls);
	/*! \brief Get Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
	 */
	int getStartTime();

	/*! \brief Set Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
	 */
	void setStartTime(int  start_time);
	/*! \brief Get Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
	 */
	int getEndTime();

	/*! \brief Set Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
	 */
	void setEndTime(int  end_time);
	/*! \brief Get 
	 */
	CampaignSummaryStatus getSummaryStatus();

	/*! \brief Set 
	 */
	void setSummaryStatus(CampaignSummaryStatus  summary_status);

private:
	std::string ad_account_id;
	std::string name;
	EntityStatus status;
	int lifetime_spend_cap;
	int daily_spend_cap;
	std::string order_line_id;
	AdCommon_tracking_urls tracking_urls;
	int start_time;
	int end_time;
	CampaignSummaryStatus summary_status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignCommon_H_ */
