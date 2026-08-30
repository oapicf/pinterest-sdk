/*
 * CatalogsRetailProductGroupUpdateRequest.h
 *
 * Request object for updating a retail product group.
 */

#ifndef _CatalogsRetailProductGroupUpdateRequest_H_
#define _CatalogsRetailProductGroupUpdateRequest_H_


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


/*! \brief Request object for updating a retail product group.
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailProductGroupUpdateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsRetailProductGroupUpdateRequest();
	CatalogsRetailProductGroupUpdateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsRetailProductGroupUpdateRequest();

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
	CatalogsProductGroupFiltersRequest getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsProductGroupFiltersRequest  filters);
	/*! \brief Get 
	 */
	CatalogsLocale getLocale();

	/*! \brief Set 
	 */
	void setLocale(CatalogsLocale  locale);
	/*! \brief Get Name of catalog product group
	 */
	std::string getName();

	/*! \brief Set Name of catalog product group
	 */
	void setName(std::string  name);

private:
	std::string catalog_type;
	Country country;
	std::string description;
	CatalogsProductGroupFiltersRequest filters;
	CatalogsLocale locale;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsRetailProductGroupUpdateRequest_H_ */
