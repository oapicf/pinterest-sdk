/*
 * CustomLabel2Filter.h
 *
 * 
 */

#ifndef _CustomLabel2Filter_H_
#define _CustomLabel2Filter_H_


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

class CustomLabel2Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomLabel2Filter();
	CustomLabel2Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomLabel2Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL2();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL2(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_2);

private:
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_2;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomLabel2Filter_H_ */
