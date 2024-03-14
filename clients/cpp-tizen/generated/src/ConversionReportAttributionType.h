/*
 * ConversionReportAttributionType.h
 *
 * Attribution type. Refers to the Pinterest Tag endpoints
 */

#ifndef _ConversionReportAttributionType_H_
#define _ConversionReportAttributionType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Attribution type. Refers to the Pinterest Tag endpoints
 *
 *  \ingroup Models
 *
 */

class ConversionReportAttributionType : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionReportAttributionType();
	ConversionReportAttributionType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionReportAttributionType();

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

#endif /* _ConversionReportAttributionType_H_ */
