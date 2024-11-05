/*
 * UpdateMaskBidOptionField.h
 *
 * bid option field to apply operation updates to
 */

#ifndef _UpdateMaskBidOptionField_H_
#define _UpdateMaskBidOptionField_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief bid option field to apply operation updates to
 *
 *  \ingroup Models
 *
 */

class UpdateMaskBidOptionField : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateMaskBidOptionField();
	UpdateMaskBidOptionField(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateMaskBidOptionField();

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

#endif /* _UpdateMaskBidOptionField_H_ */
