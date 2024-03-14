/*
 * MetricsReportingLevel.h
 *
 * Level of the reporting request
 */

#ifndef _MetricsReportingLevel_H_
#define _MetricsReportingLevel_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Level of the reporting request
 *
 *  \ingroup Models
 *
 */

class MetricsReportingLevel : public Object {
public:
	/*! \brief Constructor.
	 */
	MetricsReportingLevel();
	MetricsReportingLevel(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MetricsReportingLevel();

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

#endif /* _MetricsReportingLevel_H_ */
