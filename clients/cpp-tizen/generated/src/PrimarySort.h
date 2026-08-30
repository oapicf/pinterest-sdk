/*
 * PrimarySort.h
 *
 * Whether to first sort the report by date or by ID
 */

#ifndef _PrimarySort_H_
#define _PrimarySort_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Whether to first sort the report by date or by ID
 *
 *  \ingroup Models
 *
 */

class PrimarySort : public Object {
public:
	/*! \brief Constructor.
	 */
	PrimarySort();
	PrimarySort(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PrimarySort();

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

#endif /* _PrimarySort_H_ */
