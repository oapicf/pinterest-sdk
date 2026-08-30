/*
 * NetworkType.h
 *
 * Type of network connection.
 */

#ifndef _NetworkType_H_
#define _NetworkType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Type of network connection.
 *
 *  \ingroup Models
 *
 */

class NetworkType : public Object {
public:
	/*! \brief Constructor.
	 */
	NetworkType();
	NetworkType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NetworkType();

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

#endif /* _NetworkType_H_ */
