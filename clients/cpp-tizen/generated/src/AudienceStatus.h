/*
 * AudienceStatus.h
 *
 * Audience processing status
 */

#ifndef _AudienceStatus_H_
#define _AudienceStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Audience processing status
 *
 *  \ingroup Models
 *
 */

class AudienceStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceStatus();
	AudienceStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceStatus();

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

#endif /* _AudienceStatus_H_ */
