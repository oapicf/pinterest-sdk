/*
 * ProductGroupPromotionCommon.h
 *
 * 
 */

#ifndef _ProductGroupPromotionCommon_H_
#define _ProductGroupPromotionCommon_H_


#include <string>
#include "CreativeType.h"
#include "EntityStatus.h"
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

class ProductGroupPromotionCommon : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductGroupPromotionCommon();
	ProductGroupPromotionCommon(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductGroupPromotionCommon();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	EntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityStatus  status);
	/*! \brief Get Tracking template for proudct group promotions. 4000 limit
	 */
	std::string getTrackingUrl();

	/*! \brief Set Tracking template for proudct group promotions. 4000 limit
	 */
	void setTrackingUrl(std::string  tracking_url);
	/*! \brief Get ID of the catalogs product group that this product group promotion references
	 */
	std::string getCatalogsProductGroupId();

	/*! \brief Set ID of the catalogs product group that this product group promotion references
	 */
	void setCatalogsProductGroupId(std::string  catalogs_product_group_id);
	/*! \brief Get Catalogs product group
	 */
	std::string getCatalogsProductGroupName();

	/*! \brief Set Catalogs product group
	 */
	void setCatalogsProductGroupName(std::string  catalogs_product_group_name);
	/*! \brief Get 
	 */
	CreativeType getCreativeType();

	/*! \brief Set 
	 */
	void setCreativeType(CreativeType  creative_type);
	/*! \brief Get Hero Pin ID if this PG is promoted as a Collection
	 */
	std::string getCollectionsHeroPinId();

	/*! \brief Set Hero Pin ID if this PG is promoted as a Collection
	 */
	void setCollectionsHeroPinId(std::string  collections_hero_pin_id);
	/*! \brief Get Collections Hero Destination Url
	 */
	std::string getCollectionsHeroDestinationUrl();

	/*! \brief Set Collections Hero Destination Url
	 */
	void setCollectionsHeroDestinationUrl(std::string  collections_hero_destination_url);
	/*! \brief Get Slideshow Collections Title
	 */
	std::string getSlideshowCollectionsTitle();

	/*! \brief Set Slideshow Collections Title
	 */
	void setSlideshowCollectionsTitle(std::string  slideshow_collections_title);
	/*! \brief Get Slideshow Collections Description
	 */
	std::string getSlideshowCollectionsDescription();

	/*! \brief Set Slideshow Collections Description
	 */
	void setSlideshowCollectionsDescription(std::string  slideshow_collections_description);
	/*! \brief Get If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
	 */
	bool getIsMdl();

	/*! \brief Set If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
	 */
	void setIsMdl(bool  is_mdl);

private:
	EntityStatus status;
	std::string tracking_url;
	std::string catalogs_product_group_id;
	std::string catalogs_product_group_name;
	CreativeType creative_type;
	std::string collections_hero_pin_id;
	std::string collections_hero_destination_url;
	std::string slideshow_collections_title;
	std::string slideshow_collections_description;
	bool is_mdl;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductGroupPromotionCommon_H_ */
