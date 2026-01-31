/*
 * CatalogsItemsRequest.h
 *
 * Request object of catalogs items
 */

#ifndef _CatalogsItemsRequest_H_
#define _CatalogsItemsRequest_H_


#include <string>
#include "CatalogsItemsPostFilters.h"
#include "Country.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object of catalogs items
 *
 *  \ingroup Models
 *
 */

class CatalogsItemsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsItemsRequest();
	CatalogsItemsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsItemsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country  country);
	/*! \brief Get 
	 */
	CatalogsItemsPostFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsItemsPostFilters  filters);
	/*! \brief Get We recommend using the CatalogsLocale values.
	 */
	std::string getLanguage();

	/*! \brief Set We recommend using the CatalogsLocale values.
	 */
	void setLanguage(std::string  language);

private:
	Country country;
	CatalogsItemsPostFilters filters;
	std::string language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemsRequest_H_ */
