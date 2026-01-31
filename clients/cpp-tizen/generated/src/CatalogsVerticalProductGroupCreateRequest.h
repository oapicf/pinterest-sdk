/*
 * CatalogsVerticalProductGroupCreateRequest.h
 *
 * Request object for creating a catalog based product group.
 */

#ifndef _CatalogsVerticalProductGroupCreateRequest_H_
#define _CatalogsVerticalProductGroupCreateRequest_H_


#include <string>
#include "CatalogsCreativeAssetsProductGroupCreateRequest.h"
#include "CatalogsCreativeAssetsProductGroupFilters.h"
#include "CatalogsHotelProductGroupCreateRequest.h"
#include "CatalogsLocale.h"
#include "CatalogsRetailProductGroupCreateRequest.h"
#include "Country.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object for creating a catalog based product group.
 *
 *  \ingroup Models
 *
 */

class CatalogsVerticalProductGroupCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsVerticalProductGroupCreateRequest();
	CatalogsVerticalProductGroupCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsVerticalProductGroupCreateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Catalog id pertaining to the creative assets product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the creative assets product group.
	 */
	void setCatalogId(std::string  catalog_id);
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
	/*! \brief Get 
	 */
	CatalogsLocale getLocale();

	/*! \brief Set 
	 */
	void setLocale(CatalogsLocale  locale);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);

private:
	std::string catalog_id;
	std::string catalog_type;
	Country country;
	std::string description;
	CatalogsCreativeAssetsProductGroupFilters filters;
	CatalogsLocale locale;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsVerticalProductGroupCreateRequest_H_ */
