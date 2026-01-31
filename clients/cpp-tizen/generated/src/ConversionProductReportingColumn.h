/*
 * ConversionProductReportingColumn.h
 *
 * Conversion Product Reporting columns
 */

#ifndef _ConversionProductReportingColumn_H_
#define _ConversionProductReportingColumn_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Conversion Product Reporting columns
 *
 *  \ingroup Models
 *
 */

class ConversionProductReportingColumn : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionProductReportingColumn();
	ConversionProductReportingColumn(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionProductReportingColumn();

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

#endif /* _ConversionProductReportingColumn_H_ */
