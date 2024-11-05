/*
 * Multiple_product_groups_inner.h
 *
 * 
 */

#ifndef _Multiple_product_groups_inner_H_
#define _Multiple_product_groups_inner_H_


#include <string>
#include "CatalogsCreativeAssetsProductGroupFilters.h"
#include "CatalogsLocale.h"
#include "CatalogsProductGroupCreateRequest.h"
#include "CatalogsVerticalProductGroupCreateRequest.h"
#include "Country.h"
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

class Multiple_product_groups_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	Multiple_product_groups_inner();
	Multiple_product_groups_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Multiple_product_groups_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get boolean indicator of whether the product group is being featured or not
	 */
	bool getIsFeatured();

	/*! \brief Set boolean indicator of whether the product group is being featured or not
	 */
	void setIsFeatured(bool  is_featured);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsCreativeAssetsProductGroupFilters  filters);
	/*! \brief Get Catalog Feed id pertaining to the catalog product group.
	 */
	std::string getFeedId();

	/*! \brief Set Catalog Feed id pertaining to the catalog product group.
	 */
	void setFeedId(std::string  feed_id);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get Catalog id pertaining to the creative assets product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the creative assets product group.
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get 
	 */
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country  country);
	/*! \brief Get 
	 */
	CatalogsLocale getLocale();

	/*! \brief Set 
	 */
	void setLocale(CatalogsLocale  locale);

private:
	std::string name;
	std::string description;
	bool is_featured;
	CatalogsCreativeAssetsProductGroupFilters filters;
	std::string feed_id;
	std::string catalog_type;
	std::string catalog_id;
	Country country;
	CatalogsLocale locale;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Multiple_product_groups_inner_H_ */
