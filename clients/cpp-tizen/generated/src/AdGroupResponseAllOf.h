/*
 * AdGroupResponse_allOf.h
 *
 * 
 */

#ifndef _AdGroupResponse_allOf_H_
#define _AdGroupResponse_allOf_H_


#include <string>
#include "AdGroupSummaryStatus.h"
#include "AnyType.h"
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

class AdGroupResponse_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupResponse_allOf();
	AdGroupResponse_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupResponse_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Ad group ID.
	 */
	std::string getId();

	/*! \brief Set Ad group ID.
	 */
	void setId(std::string  id);
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
	/*! \brief Get Always \"adgroup\".
	 */
	std::string getType();

	/*! \brief Set Always \"adgroup\".
	 */
	void setType(std::string  type);
	/*! \brief Get oCPM learn mode
	 */
	std::string getConversionLearningModeType();

	/*! \brief Set oCPM learn mode
	 */
	void setConversionLearningModeType(std::string  conversion_learning_mode_type);
	/*! \brief Get Ad group summary status.
	 */
	AdGroupSummaryStatus getSummaryStatus();

	/*! \brief Set Ad group summary status.
	 */
	void setSummaryStatus(AdGroupSummaryStatus  summary_status);
	/*! \brief Get Feed Profile ID associated to the adgroup.
	 */
	std::string getFeedProfileId();

	/*! \brief Set Feed Profile ID associated to the adgroup.
	 */
	void setFeedProfileId(std::string  feed_profile_id);
	/*! \brief Get [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
	 */
	AnyType getDcaAssets();

	/*! \brief Set [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
	 */
	void setDcaAssets(AnyType  dca_assets);

private:
	std::string id;
	std::string ad_account_id;
	int created_time;
	int updated_time;
	std::string type;
	std::string conversion_learning_mode_type;
	AdGroupSummaryStatus summary_status;
	std::string feed_profile_id;
	AnyType dca_assets;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupResponse_allOf_H_ */
