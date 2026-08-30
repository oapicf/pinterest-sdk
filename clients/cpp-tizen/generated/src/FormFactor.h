/*
 * FormFactor.h
 *
 * Device form factor
 */

#ifndef _FormFactor_H_
#define _FormFactor_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Device form factor
 *
 *  \ingroup Models
 *
 */

class FormFactor : public Object {
public:
	/*! \brief Constructor.
	 */
	FormFactor();
	FormFactor(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FormFactor();

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

#endif /* _FormFactor_H_ */
