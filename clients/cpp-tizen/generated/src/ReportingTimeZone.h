/*
 * ReportingTimeZone.h
 *
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/) Specify the timezone to be applied for the reporting.
 */

#ifndef _ReportingTimeZone_H_
#define _ReportingTimeZone_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief [Closed beta](/docs/getting-started/using-beta-and-restricted-features/) Specify the timezone to be applied for the reporting.
 *
 *  \ingroup Models
 *
 */

class ReportingTimeZone : public Object {
public:
	/*! \brief Constructor.
	 */
	ReportingTimeZone();
	ReportingTimeZone(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ReportingTimeZone();

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

#endif /* _ReportingTimeZone_H_ */
