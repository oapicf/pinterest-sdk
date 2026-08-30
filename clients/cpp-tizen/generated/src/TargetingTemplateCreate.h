/*
 * TargetingTemplateCreate.h
 *
 * Resource create operation model.
 */

#ifndef _TargetingTemplateCreate_H_
#define _TargetingTemplateCreate_H_


#include <string>
#include "PlacementGroupType.h"
#include "TargetingSpecOptimal.h"
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


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class TargetingTemplateCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingTemplateCreate();
	TargetingTemplateCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingTemplateCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
	 */
	bool getAutoTargetingEnabled();

	/*! \brief Set Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
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

private:
	bool auto_targeting_enabled;
	std::list <TargetingTemplateKeyword>keywords;
	std::string name;
	PlacementGroupType placement_group;
	TargetingSpecOptimal targeting_attributes;
	TrackingUrls tracking_urls;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingTemplateCreate_H_ */
