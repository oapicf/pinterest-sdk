/*
 * ContentType.h
 *
 * 
 */

#ifndef _ContentType_H_
#define _ContentType_H_


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

class ContentType : public Object {
public:
	/*! \brief Constructor.
	 */
	ContentType();
	ContentType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ContentType();

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

#endif /* _ContentType_H_ */
