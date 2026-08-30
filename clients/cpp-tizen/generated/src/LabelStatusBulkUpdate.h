/*
 * LabelStatusBulkUpdate.h
 *
 * Set status to &#x60;ARCHIVED&#x60; to remove the label from the parent entity.
 */

#ifndef _LabelStatusBulkUpdate_H_
#define _LabelStatusBulkUpdate_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Set status to `ARCHIVED` to remove the label from the parent entity.
 *
 *  \ingroup Models
 *
 */

class LabelStatusBulkUpdate : public Object {
public:
	/*! \brief Constructor.
	 */
	LabelStatusBulkUpdate();
	LabelStatusBulkUpdate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LabelStatusBulkUpdate();

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

#endif /* _LabelStatusBulkUpdate_H_ */
