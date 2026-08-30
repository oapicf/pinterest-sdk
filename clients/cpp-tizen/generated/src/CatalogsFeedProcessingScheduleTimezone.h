/*
 * CatalogsFeedProcessingScheduleTimezone.h
 *
 * The timezone selected for the processing schedule time
 */

#ifndef _CatalogsFeedProcessingScheduleTimezone_H_
#define _CatalogsFeedProcessingScheduleTimezone_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The timezone selected for the processing schedule time
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedProcessingScheduleTimezone : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedProcessingScheduleTimezone();
	CatalogsFeedProcessingScheduleTimezone(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedProcessingScheduleTimezone();

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

#endif /* _CatalogsFeedProcessingScheduleTimezone_H_ */
