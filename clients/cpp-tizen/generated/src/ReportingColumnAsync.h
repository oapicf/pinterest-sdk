/*
 * ReportingColumnAsync.h
 *
 * Reporting columns
 */

#ifndef _ReportingColumnAsync_H_
#define _ReportingColumnAsync_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Reporting columns
 *
 *  \ingroup Models
 *
 */

class ReportingColumnAsync : public Object {
public:
	/*! \brief Constructor.
	 */
	ReportingColumnAsync();
	ReportingColumnAsync(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ReportingColumnAsync();

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

#endif /* _ReportingColumnAsync_H_ */
