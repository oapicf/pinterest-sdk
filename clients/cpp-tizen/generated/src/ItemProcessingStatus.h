/*
 * ItemProcessingStatus.h
 *
 * The status of the item processing record
 */

#ifndef _ItemProcessingStatus_H_
#define _ItemProcessingStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The status of the item processing record
 *
 *  \ingroup Models
 *
 */

class ItemProcessingStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemProcessingStatus();
	ItemProcessingStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemProcessingStatus();

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

#endif /* _ItemProcessingStatus_H_ */
