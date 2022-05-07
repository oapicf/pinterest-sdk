/*
 * AdsAnalyticsFilterColumn.h
 *
 * Reporting columns for sync reporting data filter
 */

#ifndef _AdsAnalyticsFilterColumn_H_
#define _AdsAnalyticsFilterColumn_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Reporting columns for sync reporting data filter
 *
 *  \ingroup Models
 *
 */

class AdsAnalyticsFilterColumn : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsAnalyticsFilterColumn();
	AdsAnalyticsFilterColumn(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsAnalyticsFilterColumn();

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

#endif /* _AdsAnalyticsFilterColumn_H_ */
