/*
 * ConversionReportTimeType.h
 *
 * Conversion report time type
 */

#ifndef _ConversionReportTimeType_H_
#define _ConversionReportTimeType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Conversion report time type
 *
 *  \ingroup Models
 *
 */

class ConversionReportTimeType : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionReportTimeType();
	ConversionReportTimeType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionReportTimeType();

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

#endif /* _ConversionReportTimeType_H_ */
