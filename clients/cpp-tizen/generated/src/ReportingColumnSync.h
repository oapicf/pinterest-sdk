/*
 * ReportingColumnSync.h
 *
 * Reporting columns for sync reporting endpoints
 */

#ifndef _ReportingColumnSync_H_
#define _ReportingColumnSync_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Reporting columns for sync reporting endpoints
 *
 *  \ingroup Models
 *
 */

class ReportingColumnSync : public Object {
public:
	/*! \brief Constructor.
	 */
	ReportingColumnSync();
	ReportingColumnSync(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ReportingColumnSync();

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

#endif /* _ReportingColumnSync_H_ */
