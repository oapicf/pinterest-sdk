/*
 * CustomLabel4Filter.h
 *
 * 
 */

#ifndef _CustomLabel4Filter_H_
#define _CustomLabel4Filter_H_


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

class CustomLabel4Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomLabel4Filter();
	CustomLabel4Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomLabel4Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL4();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL4(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_4);

private:
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_4;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomLabel4Filter_H_ */
