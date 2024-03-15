/*
 * CatalogsFeedsCreateRequest_default_locale.h
 *
 * The locale used within a feed for product descriptions.
 */

#ifndef _CatalogsFeedsCreateRequest_default_locale_H_
#define _CatalogsFeedsCreateRequest_default_locale_H_


#include <string>
#include "CatalogsLocale.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The locale used within a feed for product descriptions.
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedsCreateRequest_default_locale : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedsCreateRequest_default_locale();
	CatalogsFeedsCreateRequest_default_locale(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedsCreateRequest_default_locale();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedsCreateRequest_default_locale_H_ */
