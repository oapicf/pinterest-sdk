/*
 * ConditionFilter.h
 *
 * 
 */

#ifndef _ConditionFilter_H_
#define _ConditionFilter_H_


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

class ConditionFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	ConditionFilter();
	ConditionFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConditionFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCONDITION();

	/*! \brief Set 
	 */
	void setCONDITION(CatalogsProductGroupMultipleStringCriteria  cONDITION);

private:
	CatalogsProductGroupMultipleStringCriteria cONDITION;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConditionFilter_H_ */
