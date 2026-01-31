/*
 * CatalogsHotelProductGroupType.h
 *
 * &lt;p&gt;Catalog hotel product group type&lt;/p&gt; &lt;p&gt;MERCHANT_CREATED: Product groups created by merchants. &lt;br&gt;ALL_LISTINGS: Includes every hotel item in your catalog.
 */

#ifndef _CatalogsHotelProductGroupType_H_
#define _CatalogsHotelProductGroupType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief <p>Catalog hotel product group type</p> <p>MERCHANT_CREATED: Product groups created by merchants. <br>ALL_LISTINGS: Includes every hotel item in your catalog.
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelProductGroupType : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelProductGroupType();
	CatalogsHotelProductGroupType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelProductGroupType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelProductGroupType_H_ */
