/*
 * CatalogsProductGroupsUpdateRequestSchema.h
 *
 * 
 */

#ifndef _CatalogsProductGroupsUpdateRequestSchema_H_
#define _CatalogsProductGroupsUpdateRequestSchema_H_


#include <string>
#include "CatalogsCreativeAssetsProductGroupFilters.h"
#include "CatalogsLocale.h"
#include "CatalogsProductGroupUpdateRequest.h"
#include "CatalogsVerticalProductGroupUpdateRequest.h"
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

class CatalogsProductGroupsUpdateRequestSchema : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupsUpdateRequestSchema();
	CatalogsProductGroupsUpdateRequestSchema(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupsUpdateRequestSchema();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsCreativeAssetsProductGroupFilters  filters);
	/*! \brief Get boolean indicator of whether the product group is being featured or not
	 */
	bool getIsFeatured();

	/*! \brief Set boolean indicator of whether the product group is being featured or not
	 */
	void setIsFeatured(bool  is_featured);
	/*! \brief Get Name of catalog product group
	 */
	std::string getName();

	/*! \brief Set Name of catalog product group
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string  catalog_type);
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
	std::string description;
	CatalogsCreativeAssetsProductGroupFilters filters;
	bool is_featured;
	std::string name;
	std::string catalog_type;
	Country country;
	CatalogsLocale locale;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupsUpdateRequestSchema_H_ */
