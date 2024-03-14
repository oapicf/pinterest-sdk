/*
 * ItemGroupIdFilter.h
 *
 * 
 */

#ifndef _ItemGroupIdFilter_H_
#define _ItemGroupIdFilter_H_


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

class ItemGroupIdFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemGroupIdFilter();
	ItemGroupIdFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemGroupIdFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getITEMGROUPID();

	/*! \brief Set 
	 */
	void setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria  iTEM_GROUP_ID);

private:
	CatalogsProductGroupMultipleStringCriteria iTEM_GROUP_ID;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemGroupIdFilter_H_ */
