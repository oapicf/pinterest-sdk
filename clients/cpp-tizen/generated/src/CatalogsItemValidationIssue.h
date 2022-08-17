/*
 * CatalogsItemValidationIssue.h
 *
 * 
 */

#ifndef _CatalogsItemValidationIssue_H_
#define _CatalogsItemValidationIssue_H_


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

class CatalogsItemValidationIssue : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsItemValidationIssue();
	CatalogsItemValidationIssue(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsItemValidationIssue();

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

#endif /* _CatalogsItemValidationIssue_H_ */
