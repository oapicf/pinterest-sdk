/*
 * BulkOutputFormat.h
 *
 * Bulk file output format
 */

#ifndef _BulkOutputFormat_H_
#define _BulkOutputFormat_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Bulk file output format
 *
 *  \ingroup Models
 *
 */

class BulkOutputFormat : public Object {
public:
	/*! \brief Constructor.
	 */
	BulkOutputFormat();
	BulkOutputFormat(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BulkOutputFormat();

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

#endif /* _BulkOutputFormat_H_ */
