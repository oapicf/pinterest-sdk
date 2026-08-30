/*
 * ConversionTagTypeOptimal.h
 *
 * Conversion tag type
 */

#ifndef _ConversionTagTypeOptimal_H_
#define _ConversionTagTypeOptimal_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Conversion tag type
 *
 *  \ingroup Models
 *
 */

class ConversionTagTypeOptimal : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionTagTypeOptimal();
	ConversionTagTypeOptimal(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionTagTypeOptimal();

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

#endif /* _ConversionTagTypeOptimal_H_ */
