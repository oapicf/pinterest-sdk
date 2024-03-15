/*
 * ConversionTagType.h
 *
 * conversion tag type
 */

#ifndef _ConversionTagType_H_
#define _ConversionTagType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief conversion tag type
 *
 *  \ingroup Models
 *
 */

class ConversionTagType : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionTagType();
	ConversionTagType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionTagType();

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

#endif /* _ConversionTagType_H_ */
