/*
 * DataOutputFormat.h
 *
 * Format of generated report
 */

#ifndef _DataOutputFormat_H_
#define _DataOutputFormat_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Format of generated report
 *
 *  \ingroup Models
 *
 */

class DataOutputFormat : public Object {
public:
	/*! \brief Constructor.
	 */
	DataOutputFormat();
	DataOutputFormat(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DataOutputFormat();

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

#endif /* _DataOutputFormat_H_ */
