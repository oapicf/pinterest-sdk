/*
 * MetricsReportingTemplateType.h
 *
 * Reporting template type
 */

#ifndef _MetricsReportingTemplateType_H_
#define _MetricsReportingTemplateType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Reporting template type
 *
 *  \ingroup Models
 *
 */

class MetricsReportingTemplateType : public Object {
public:
	/*! \brief Constructor.
	 */
	MetricsReportingTemplateType();
	MetricsReportingTemplateType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MetricsReportingTemplateType();

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

#endif /* _MetricsReportingTemplateType_H_ */
