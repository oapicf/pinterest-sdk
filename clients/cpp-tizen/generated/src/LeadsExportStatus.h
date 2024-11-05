/*
 * LeadsExportStatus.h
 *
 * Status of a leads export job
 */

#ifndef _LeadsExportStatus_H_
#define _LeadsExportStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Status of a leads export job
 *
 *  \ingroup Models
 *
 */

class LeadsExportStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadsExportStatus();
	LeadsExportStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadsExportStatus();

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

#endif /* _LeadsExportStatus_H_ */
