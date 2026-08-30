/*
 * ReportType.h
 *
 * 
 */

#ifndef _ReportType_H_
#define _ReportType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ReportType : public Object {
public:
	/*! \brief Constructor.
	 */
	ReportType();
	ReportType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ReportType();

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

#endif /* _ReportType_H_ */
