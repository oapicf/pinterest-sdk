/*
 * CatalogsRetailProductGroupCreateRequest.h
 *
 * Request object for creating a product group.
 */

#ifndef _CatalogsRetailProductGroupCreateRequest_H_
#define _CatalogsRetailProductGroupCreateRequest_H_


#include <string>
#include "CatalogsLocale.h"
#include "CatalogsProductGroupFiltersRequest.h"
#include "Country.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object for creating a product group.
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailProductGroupCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsRetailProductGroupCreateRequest();
	CatalogsRetailProductGroupCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsRetailProductGroupCreateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
	 */
	std::string getCatalogType();

	/*! \brief Set Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
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
	CatalogsProductGroupFiltersRequest getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsProductGroupFiltersRequest  filters);
	/*! \brief Get Catalog id pertaining to the retail product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the retail product group.
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
	std::string catalog_type;
	std::string name;
	std::string description;
	CatalogsProductGroupFiltersRequest filters;
	std::string catalog_id;
	Country country;
	CatalogsLocale locale;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsRetailProductGroupCreateRequest_H_ */
