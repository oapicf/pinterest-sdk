/*
 * ProductGroupReferenceFilter.h
 *
 * 
 */

#ifndef _ProductGroupReferenceFilter_H_
#define _ProductGroupReferenceFilter_H_


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

class ProductGroupReferenceFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductGroupReferenceFilter();
	ProductGroupReferenceFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductGroupReferenceFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getPRODUCTGROUP();

	/*! \brief Set 
	 */
	void setPRODUCTGROUP(CatalogsProductGroupMultipleStringCriteria  pRODUCT_GROUP);

private:
	CatalogsProductGroupMultipleStringCriteria pRODUCT_GROUP;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductGroupReferenceFilter_H_ */
