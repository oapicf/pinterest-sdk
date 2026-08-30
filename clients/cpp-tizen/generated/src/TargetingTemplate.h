/*
 * TargetingTemplate.h
 *
 * 
 */

#ifndef _TargetingTemplate_H_
#define _TargetingTemplate_H_


#include <string>
#include "PlacementGroupType.h"
#include "TargetingSpecOptimal.h"
#include "TargetingTemplateAudienceSizing.h"
#include "TargetingTemplateKeyword.h"
#include "TargetingTemplateStatus.h"
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

class TargetingTemplate : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingTemplate();
	TargetingTemplate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingTemplate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the advertiser that this targeting template belongs to.
	 */
	std::string getAdAccountId();

	/*! \brief Set The ID of the advertiser that this targeting template belongs to.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
	 */
	bool getAutoTargetingEnabled();

	/*! \brief Set Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
	 */
	void setAutoTargetingEnabled(bool  auto_targeting_enabled);
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
	TargetingTemplateAudienceSizing getSizing();

	/*! \brief Set 
	 */
	void setSizing(TargetingTemplateAudienceSizing  sizing);
	/*! \brief Get Indicate targeting template is active or Deleted
	 */
	TargetingTemplateStatus getStatus();

	/*! \brief Set Indicate targeting template is active or Deleted
	 */
	void setStatus(TargetingTemplateStatus  status);
	/*! \brief Get targeting profile attributes
	 */
	TargetingSpecOptimal getTargetingAttributes();

	/*! \brief Set targeting profile attributes
	 */
	void setTargetingAttributes(TargetingSpecOptimal  targeting_attributes);
	/*! \brief Get 
	 */
	TrackingUrls getTrackingUrls();

	/*! \brief Set 
	 */
	void setTrackingUrls(TrackingUrls  tracking_urls);
	/*! \brief Get Targeting template updated time.Unix timestamp in seconds.
	 */
	int getUpdatedTime();

	/*! \brief Set Targeting template updated time.Unix timestamp in seconds.
	 */
	void setUpdatedTime(int  updated_time);
	/*! \brief Get Inform if the targeting template is valid (ex. would be false if has revoked audience)
	 */
	bool getValid();

	/*! \brief Set Inform if the targeting template is valid (ex. would be false if has revoked audience)
	 */
	void setValid(bool  valid);

private:
	std::string ad_account_id;
	bool auto_targeting_enabled;
	int created_time;
	std::string id;
	std::list <TargetingTemplateKeyword>keywords;
	std::string name;
	PlacementGroupType placement_group;
	TargetingTemplateAudienceSizing sizing;
	TargetingTemplateStatus status;
	TargetingSpecOptimal targeting_attributes;
	TrackingUrls tracking_urls;
	int updated_time;
	bool valid;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingTemplate_H_ */
