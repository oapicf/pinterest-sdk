/*
 * ReportingColumn.h
 *
 * Reporting Columns
 */

#ifndef _ReportingColumn_H_
#define _ReportingColumn_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Reporting Columns
 *
 *  \ingroup Models
 *
 */

class ReportingColumn : public Object {
public:
	/*! \brief Constructor.
	 */
	ReportingColumn();
	ReportingColumn(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ReportingColumn();

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

#endif /* _ReportingColumn_H_ */
