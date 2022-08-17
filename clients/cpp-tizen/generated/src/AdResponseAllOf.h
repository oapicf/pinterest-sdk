/*
 * AdResponse_allOf.h
 *
 * 
 */

#ifndef _AdResponse_allOf_H_
#define _AdResponse_allOf_H_


#include <string>
#include "PinPromotionSummaryStatus.h"
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

class AdResponse_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	AdResponse_allOf();
	AdResponse_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdResponse_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the advertiser that this ad belongs to.
	 */
	std::string getAdAccountId();

	/*! \brief Set The ID of the advertiser that this ad belongs to.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get ID of the ad campaign that contains this ad.
	 */
	std::string getCampaignId();

	/*! \brief Set ID of the ad campaign that contains this ad.
	 */
	void setCampaignId(std::string  campaign_id);
	/*! \brief Get Destination URL template for all items within a collections drawer.
	 */
	std::string getCollectionItemsDestinationUrlTemplate();

	/*! \brief Set Destination URL template for all items within a collections drawer.
	 */
	void setCollectionItemsDestinationUrlTemplate(std::string  collection_items_destination_url_template);
	/*! \brief Get Pin creation time. Unix timestamp in seconds.
	 */
	int getCreatedTime();

	/*! \brief Set Pin creation time. Unix timestamp in seconds.
	 */
	void setCreatedTime(int  created_time);
	/*! \brief Get The ID of this ad.
	 */
	std::string getId();

	/*! \brief Set The ID of this ad.
	 */
	void setId(std::string  id);
	/*! \brief Get Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
	 */
	std::list<std::string> getRejectedReasons();

	/*! \brief Set Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
	 */
	void setRejectedReasons(std::list <std::string> rejected_reasons);
	/*! \brief Get Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
	 */
	std::list<std::string> getRejectionLabels();

	/*! \brief Set Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
	 */
	void setRejectionLabels(std::list <std::string> rejection_labels);
	/*! \brief Get Ad review status
	 */
	std::string getReviewStatus();

	/*! \brief Set Ad review status
	 */
	void setReviewStatus(std::string  review_status);
	/*! \brief Get Always \"ad\".
	 */
	std::string getType();

	/*! \brief Set Always \"ad\".
	 */
	void setType(std::string  type);
	/*! \brief Get Last update time. Unix timestamp in seconds.
	 */
	int getUpdatedTime();

	/*! \brief Set Last update time. Unix timestamp in seconds.
	 */
	void setUpdatedTime(int  updated_time);
	/*! \brief Get Ad summary status
	 */
	PinPromotionSummaryStatus getSummaryStatus();

	/*! \brief Set Ad summary status
	 */
	void setSummaryStatus(PinPromotionSummaryStatus  summary_status);

private:
	std::string ad_account_id;
	std::string campaign_id;
	std::string collection_items_destination_url_template;
	int created_time;
	std::string id;
	std::list <std::string>rejected_reasons;
	std::list <std::string>rejection_labels;
	std::string review_status;
	std::string type;
	int updated_time;
	PinPromotionSummaryStatus summary_status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdResponse_allOf_H_ */
