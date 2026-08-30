/*
 * ConversionProductAttributionType.h
 *
 * Conversion product attribution level
 */

#ifndef _ConversionProductAttributionType_H_
#define _ConversionProductAttributionType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Conversion product attribution level
 *
 *  \ingroup Models
 *
 */

class ConversionProductAttributionType : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionProductAttributionType();
	ConversionProductAttributionType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionProductAttributionType();

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

#endif /* _ConversionProductAttributionType_H_ */
