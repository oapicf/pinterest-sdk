/*
 * OperationType.h
 *
 * Operation type to share a specific audience or revoke access to a previously shared audience
 */

#ifndef _OperationType_H_
#define _OperationType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Operation type to share a specific audience or revoke access to a previously shared audience
 *
 *  \ingroup Models
 *
 */

class OperationType : public Object {
public:
	/*! \brief Constructor.
	 */
	OperationType();
	OperationType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OperationType();

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

#endif /* _OperationType_H_ */
