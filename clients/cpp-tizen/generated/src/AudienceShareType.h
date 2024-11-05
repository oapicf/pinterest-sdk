/*
 * AudienceShareType.h
 *
 * 
 */

#ifndef _AudienceShareType_H_
#define _AudienceShareType_H_


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

class AudienceShareType : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceShareType();
	AudienceShareType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceShareType();

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

#endif /* _AudienceShareType_H_ */
