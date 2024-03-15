/*
 * LeadFormQuestionType.h
 *
 * Lead form question type
 */

#ifndef _LeadFormQuestionType_H_
#define _LeadFormQuestionType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Lead form question type
 *
 *  \ingroup Models
 *
 */

class LeadFormQuestionType : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadFormQuestionType();
	LeadFormQuestionType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadFormQuestionType();

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

#endif /* _LeadFormQuestionType_H_ */
