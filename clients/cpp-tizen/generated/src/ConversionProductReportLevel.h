/*
 * ConversionProductReportLevel.h
 *
 * Level of the report
 */

#ifndef _ConversionProductReportLevel_H_
#define _ConversionProductReportLevel_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Level of the report
 *
 *  \ingroup Models
 *
 */

class ConversionProductReportLevel : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionProductReportLevel();
	ConversionProductReportLevel(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionProductReportLevel();

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

#endif /* _ConversionProductReportLevel_H_ */
