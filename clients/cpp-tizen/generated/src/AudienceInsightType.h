/*
 * AudienceInsightType.h
 *
 * 
 */

#ifndef _AudienceInsightType_H_
#define _AudienceInsightType_H_


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

class AudienceInsightType : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceInsightType();
	AudienceInsightType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceInsightType();

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

#endif /* _AudienceInsightType_H_ */
