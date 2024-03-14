/*
 * BrandFilter.h
 *
 * 
 */

#ifndef _BrandFilter_H_
#define _BrandFilter_H_


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

class BrandFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	BrandFilter();
	BrandFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BrandFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getBRAND();

	/*! \brief Set 
	 */
	void setBRAND(CatalogsProductGroupMultipleStringCriteria  bRAND);

private:
	CatalogsProductGroupMultipleStringCriteria bRAND;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BrandFilter_H_ */
