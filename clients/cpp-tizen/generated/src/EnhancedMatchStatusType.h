/*
 * EnhancedMatchStatusType.h
 *
 * The enhanced match status of the tag
 */

#ifndef _EnhancedMatchStatusType_H_
#define _EnhancedMatchStatusType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The enhanced match status of the tag
 *
 *  \ingroup Models
 *
 */

class EnhancedMatchStatusType : public Object {
public:
	/*! \brief Constructor.
	 */
	EnhancedMatchStatusType();
	EnhancedMatchStatusType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EnhancedMatchStatusType();

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

#endif /* _EnhancedMatchStatusType_H_ */
