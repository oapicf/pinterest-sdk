/*
 * UpdateMaskFieldType.h
 *
 * The field types supported by the update mask
 */

#ifndef _UpdateMaskFieldType_H_
#define _UpdateMaskFieldType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The field types supported by the update mask
 *
 *  \ingroup Models
 *
 */

class UpdateMaskFieldType : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateMaskFieldType();
	UpdateMaskFieldType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateMaskFieldType();

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

#endif /* _UpdateMaskFieldType_H_ */
