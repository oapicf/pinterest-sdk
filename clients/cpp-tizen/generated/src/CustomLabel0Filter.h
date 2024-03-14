/*
 * CustomLabel0Filter.h
 *
 * 
 */

#ifndef _CustomLabel0Filter_H_
#define _CustomLabel0Filter_H_


#include <string>
#include "CatalogsProductGroupMultipleStringCriteria.h"
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

class CustomLabel0Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomLabel0Filter();
	CustomLabel0Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomLabel0Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL0();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL0(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_0);

private:
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_0;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomLabel0Filter_H_ */
