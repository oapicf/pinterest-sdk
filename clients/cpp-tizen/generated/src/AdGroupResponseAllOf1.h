/*
 * AdGroupResponse_allOf_1.h
 *
 * 
 */

#ifndef _AdGroupResponse_allOf_1_H_
#define _AdGroupResponse_allOf_1_H_


#include <string>
#include "ActionType.h"
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

class AdGroupResponse_allOf_1 : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupResponse_allOf_1();
	AdGroupResponse_allOf_1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupResponse_allOf_1();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Campaign ID of the ad group.
	 */
	std::string getCampaignId();

	/*! \brief Set Campaign ID of the ad group.
	 */
	void setCampaignId(std::string  campaign_id);
	/*! \brief Get 
	 */
	ActionType getBillableEvent();

	/*! \brief Set 
	 */
	void setBillableEvent(ActionType  billable_event);
	/*! \brief Get Ad group ID.
	 */
	std::string getId();

	/*! \brief Set Ad group ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Always \"adgroup\".
	 */
	std::string getType();

	/*! \brief Set Always \"adgroup\".
	 */
	void setType(std::string  type);
	/*! \brief Get Advertiser ID.
	 */
	std::string getAdAccountId();

	/*! \brief Set Advertiser ID.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get Ad group creation time. Unix timestamp in seconds.
	 */
	int getCreatedTime();

	/*! \brief Set Ad group creation time. Unix timestamp in seconds.
	 */
	void setCreatedTime(int  created_time);
	/*! \brief Get Ad group last update time. Unix timestamp in seconds.
	 */
	int getUpdatedTime();

	/*! \brief Set Ad group last update time. Unix timestamp in seconds.
	 */
	void setUpdatedTime(int  updated_time);

private:
	std::string campaign_id;
	ActionType billable_event;
	std::string id;
	std::string type;
	std::string ad_account_id;
	int created_time;
	int updated_time;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupResponse_allOf_1_H_ */
