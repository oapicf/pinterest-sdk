/*
 * NullableCurrency.h
 *
 * Currency Codes from ISO 4217.
 */

#ifndef _NullableCurrency_H_
#define _NullableCurrency_H_


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

class NullableCurrency : public Object {
public:
	/*! \brief Constructor.
	 */
	NullableCurrency();
	NullableCurrency(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NullableCurrency();

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

#endif /* _NullableCurrency_H_ */
