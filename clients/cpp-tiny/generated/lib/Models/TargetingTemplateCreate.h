
/*
 * TargetingTemplateCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_TargetingTemplateCreate_H_
#define TINY_CPP_CLIENT_TargetingTemplateCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PlacementGroupType.h"
#include "TargetingSpecOptimal.h"
#include "TargetingTemplateKeyword.h"
#include "TrackingUrls.h"
#include <list>

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class TargetingTemplateCreate{
public:

    /*! \brief Constructor.
	 */
    TargetingTemplateCreate();
    TargetingTemplateCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingTemplateCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
	 */
	bool isAutoTargetingEnabled();

	/*! \brief Set Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
	 */
	void setAutoTargetingEnabled(bool auto_targeting_enabled);
	/*! \brief Get 
	 */
	std::list<TargetingTemplateKeyword> getKeywords();

	/*! \brief Set 
	 */
	void setKeywords(std::list<TargetingTemplateKeyword> keywords);
	/*! \brief Get targeting template name
	 */
	std::string getName();

	/*! \brief Set targeting template name
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	PlacementGroupType getPlacementGroup();

	/*! \brief Set 
	 */
	void setPlacementGroup(PlacementGroupType placement_group);
	/*! \brief Get targeting profile attributes
	 */
	TargetingSpecOptimal getTargetingAttributes();

	/*! \brief Set targeting profile attributes
	 */
	void setTargetingAttributes(TargetingSpecOptimal targeting_attributes);
	/*! \brief Get 
	 */
	TrackingUrls getTrackingUrls();

	/*! \brief Set 
	 */
	void setTrackingUrls(TrackingUrls tracking_urls);


    private:
    bool auto_targeting_enabled{};
    std::list<TargetingTemplateKeyword> keywords;
    std::string name{};
    PlacementGroupType placement_group;
    TargetingSpecOptimal targeting_attributes;
    TrackingUrls tracking_urls;
};
}

#endif /* TINY_CPP_CLIENT_TargetingTemplateCreate_H_ */
