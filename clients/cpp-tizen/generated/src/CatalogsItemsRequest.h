/*
 * CatalogsItemsRequest.h
 *
 * Request object of catalogs items
 */

#ifndef _CatalogsItemsRequest_H_
#define _CatalogsItemsRequest_H_


#include <string>
#include "CatalogsItemsPostFilters.h"
#include "CatalogsItemsRequest_language.h"
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
	CatalogsItemsRequest_language getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(CatalogsItemsRequest_language  language);
	/*! \brief Get 
	 */
	CatalogsItemsPostFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsItemsPostFilters  filters);

private:
	Country country;
	CatalogsItemsRequest_language language;
	CatalogsItemsPostFilters filters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemsRequest_H_ */
