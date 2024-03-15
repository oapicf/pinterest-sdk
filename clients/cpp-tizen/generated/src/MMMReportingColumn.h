/*
 * MMMReportingColumn.h
 *
 * Marketing Mix Modeling (MMM) Reporting Columns
 */

#ifndef _MMMReportingColumn_H_
#define _MMMReportingColumn_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Marketing Mix Modeling (MMM) Reporting Columns
 *
 *  \ingroup Models
 *
 */

class MMMReportingColumn : public Object {
public:
	/*! \brief Constructor.
	 */
	MMMReportingColumn();
	MMMReportingColumn(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MMMReportingColumn();

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

#endif /* _MMMReportingColumn_H_ */
