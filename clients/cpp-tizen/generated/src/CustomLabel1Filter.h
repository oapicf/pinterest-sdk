/*
 * CustomLabel1Filter.h
 *
 * 
 */

#ifndef _CustomLabel1Filter_H_
#define _CustomLabel1Filter_H_


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

class CustomLabel1Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomLabel1Filter();
	CustomLabel1Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomLabel1Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL1();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL1(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_1);

private:
	CatalogsProductGroupMultipleStringCriteria cUSTOM_LABEL_1;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomLabel1Filter_H_ */
