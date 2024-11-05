/*
 * TargetingTemplateCommon.h
 *
 * 
 */

#ifndef _TargetingTemplateCommon_H_
#define _TargetingTemplateCommon_H_


#include <string>
#include "PlacementGroupType.h"
#include "TargetingSpec.h"
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

class TargetingTemplateCommon : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingTemplateCommon();
	TargetingTemplateCommon(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingTemplateCommon();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get targeting template name
	 */
	std::string getName();

	/*! \brief Set targeting template name
	 */
	void setName(std::string  name);
	/*! \brief Get Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
	 */
	bool getAutoTargetingEnabled();

	/*! \brief Set Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
	 */
	void setAutoTargetingEnabled(bool  auto_targeting_enabled);
	/*! \brief Get 
	 */
	TargetingSpec getTargetingAttributes();

	/*! \brief Set 
	 */
	void setTargetingAttributes(TargetingSpec  targeting_attributes);
	/*! \brief Get 
	 */
	PlacementGroupType getPlacementGroup();

	/*! \brief Set 
	 */
	void setPlacementGroup(PlacementGroupType  placement_group);
	/*! \brief Get 
	 */
	std::list<TargetingTemplateKeyword> getKeywords();

	/*! \brief Set 
	 */
	void setKeywords(std::list <TargetingTemplateKeyword> keywords);
	/*! \brief Get 
	 */
	TrackingUrls getTrackingUrls();

	/*! \brief Set 
	 */
	void setTrackingUrls(TrackingUrls  tracking_urls);

private:
	std::string name;
	bool auto_targeting_enabled;
	TargetingSpec targeting_attributes;
	PlacementGroupType placement_group;
	std::list <TargetingTemplateKeyword>keywords;
	TrackingUrls tracking_urls;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingTemplateCommon_H_ */
