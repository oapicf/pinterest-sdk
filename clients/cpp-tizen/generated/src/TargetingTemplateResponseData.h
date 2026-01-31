/*
 * TargetingTemplateResponseData.h
 *
 * 
 */

#ifndef _TargetingTemplateResponseData_H_
#define _TargetingTemplateResponseData_H_


#include <string>
#include "PlacementGroupType.h"
#include "TargetingSpec.h"
#include "TargetingTemplateAudienceSizing.h"
#include "TargetingTemplateKeyword.h"
#include "TrackingUrls.h"
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

class TargetingTemplateResponseData : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingTemplateResponseData();
	TargetingTemplateResponseData(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingTemplateResponseData();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
	 */
	bool getAutoTargetingEnabled();

	/*! \brief Set Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
	 */
	void setAutoTargetingEnabled(bool  auto_targeting_enabled);
	/*! \brief Get 
	 */
	std::list<TargetingTemplateKeyword> getKeywords();

	/*! \brief Set 
	 */
	void setKeywords(std::list <TargetingTemplateKeyword> keywords);
	/*! \brief Get targeting template name
	 */
	std::string getName();

	/*! \brief Set targeting template name
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	PlacementGroupType getPlacementGroup();

	/*! \brief Set 
	 */
	void setPlacementGroup(PlacementGroupType  placement_group);
	/*! \brief Get 
	 */
	TargetingSpec getTargetingAttributes();

	/*! \brief Set 
	 */
	void setTargetingAttributes(TargetingSpec  targeting_attributes);
	/*! \brief Get 
	 */
	TrackingUrls getTrackingUrls();

	/*! \brief Set 
	 */
	void setTrackingUrls(TrackingUrls  tracking_urls);
	/*! \brief Get The ID of the advertiser that this targeting template belongs to.
	 */
	std::string getAdAccountId();

	/*! \brief Set The ID of the advertiser that this targeting template belongs to.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get Targeting template created time. Unix timestamp in seconds.
	 */
	int getCreatedTime();

	/*! \brief Set Targeting template created time. Unix timestamp in seconds.
	 */
	void setCreatedTime(int  created_time);
	/*! \brief Get Targeting template ID.
	 */
	std::string getId();

	/*! \brief Set Targeting template ID.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	TargetingTemplateAudienceSizing getSizing();

	/*! \brief Set 
	 */
	void setSizing(TargetingTemplateAudienceSizing  sizing);
	/*! \brief Get Indicate targeting template is active or Deleted
	 */
	std::string getStatus();

	/*! \brief Set Indicate targeting template is active or Deleted
	 */
	void setStatus(std::string  status);
	/*! \brief Get Targeting template updated time.Unix timestamp in seconds.
	 */
	int getUpdatedTime();

	/*! \brief Set Targeting template updated time.Unix timestamp in seconds.
	 */
	void setUpdatedTime(int  updated_time);

private:
	bool auto_targeting_enabled;
	std::list <TargetingTemplateKeyword>keywords;
	std::string name;
	PlacementGroupType placement_group;
	TargetingSpec targeting_attributes;
	TrackingUrls tracking_urls;
	std::string ad_account_id;
	int created_time;
	std::string id;
	TargetingTemplateAudienceSizing sizing;
	std::string status;
	int updated_time;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingTemplateResponseData_H_ */
