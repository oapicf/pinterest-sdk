/*
 * LeadFormQuestionFieldType.h
 *
 * Lead form question field type
 */

#ifndef _LeadFormQuestionFieldType_H_
#define _LeadFormQuestionFieldType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Lead form question field type
 *
 *  \ingroup Models
 *
 */

class LeadFormQuestionFieldType : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadFormQuestionFieldType();
	LeadFormQuestionFieldType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadFormQuestionFieldType();

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

#endif /* _LeadFormQuestionFieldType_H_ */
