/*
 * HotelIdFilter.h
 *
 * 
 */

#ifndef _HotelIdFilter_H_
#define _HotelIdFilter_H_


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

class HotelIdFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	HotelIdFilter();
	HotelIdFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~HotelIdFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getHOTELID();

	/*! \brief Set 
	 */
	void setHOTELID(CatalogsProductGroupMultipleStringCriteria  hOTEL_ID);

private:
	CatalogsProductGroupMultipleStringCriteria hOTEL_ID;
	void __init();
	void __cleanup();

};
}
}

#endif /* _HotelIdFilter_H_ */
