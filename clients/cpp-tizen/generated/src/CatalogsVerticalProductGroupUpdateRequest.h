/*
 * CatalogsVerticalProductGroupUpdateRequest.h
 *
 * Request object for updating a catalog based product group.
 */

#ifndef _CatalogsVerticalProductGroupUpdateRequest_H_
#define _CatalogsVerticalProductGroupUpdateRequest_H_


#include <string>
#include "CatalogsCreativeAssetsProductGroupFilters.h"
#include "CatalogsCreativeAssetsProductGroupUpdateRequest.h"
#include "CatalogsHotelProductGroupUpdateRequest.h"
#include "CatalogsLocale.h"
#include "CatalogsRetailProductGroupUpdateRequest.h"
#include "Country.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object for updating a catalog based product group.
 *
 *  \ingroup Models
 *
 */

class CatalogsVerticalProductGroupUpdateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsVerticalProductGroupUpdateRequest();
	CatalogsVerticalProductGroupUpdateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsVerticalProductGroupUpdateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string  catalog_type);
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
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsCreativeAssetsProductGroupFilters  filters);
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
	std::string catalog_type;
	std::string name;
	std::string description;
	CatalogsCreativeAssetsProductGroupFilters filters;
	Country country;
	CatalogsLocale locale;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsVerticalProductGroupUpdateRequest_H_ */
