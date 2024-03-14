/*
 * NonNullableCatalogsCurrency.h
 *
 * Currency Codes from ISO 4217.
 */

#ifndef _NonNullableCatalogsCurrency_H_
#define _NonNullableCatalogsCurrency_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Currency Codes from ISO 4217.
 *
 *  \ingroup Models
 *
 */

class NonNullableCatalogsCurrency : public Object {
public:
	/*! \brief Constructor.
	 */
	NonNullableCatalogsCurrency();
	NonNullableCatalogsCurrency(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NonNullableCatalogsCurrency();

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

#endif /* _NonNullableCatalogsCurrency_H_ */
