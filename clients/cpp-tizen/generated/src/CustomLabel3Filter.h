/*
 * CustomLabel3Filter.h
 *
 * 
 */

#ifndef _CustomLabel3Filter_H_
#define _CustomLabel3Filter_H_


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

class CustomLabel3Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomLabel3Filter();
	CustomLabel3Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomLabel3Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL3();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL3(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_3);

private:
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_3;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomLabel3Filter_H_ */
