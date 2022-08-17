/*
 * DataStatus.h
 *
 * Metrics availablity, e.g., \&quot;READY\&quot;.
 */

#ifndef _DataStatus_H_
#define _DataStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Metrics availablity, e.g., \"READY\".
 *
 *  \ingroup Models
 *
 */

class DataStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	DataStatus();
	DataStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DataStatus();

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

#endif /* _DataStatus_H_ */
