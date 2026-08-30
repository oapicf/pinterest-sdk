/*
 * BasePreferredMediaType.h
 *
 * 
 */

#ifndef _BasePreferredMediaType_H_
#define _BasePreferredMediaType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BasePreferredMediaType : public Object {
public:
	/*! \brief Constructor.
	 */
	BasePreferredMediaType();
	BasePreferredMediaType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BasePreferredMediaType();

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

#endif /* _BasePreferredMediaType_H_ */
