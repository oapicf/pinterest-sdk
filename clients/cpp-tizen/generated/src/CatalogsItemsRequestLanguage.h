/*
 * CatalogsItemsRequest_language.h
 *
 * We recommend using the CatalogsLocale values.
 */

#ifndef _CatalogsItemsRequest_language_H_
#define _CatalogsItemsRequest_language_H_


#include <string>
#include "CatalogsLocale.h"
#include "Language.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief We recommend using the CatalogsLocale values.
 *
 *  \ingroup Models
 *
 */

class CatalogsItemsRequest_language : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsItemsRequest_language();
	CatalogsItemsRequest_language(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsItemsRequest_language();

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

#endif /* _CatalogsItemsRequest_language_H_ */
