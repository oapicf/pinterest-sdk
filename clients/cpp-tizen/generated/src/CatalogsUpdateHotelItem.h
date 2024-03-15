/*
 * CatalogsUpdateHotelItem.h
 *
 * Object describing an hotel item batch record
 */

#ifndef _CatalogsUpdateHotelItem_H_
#define _CatalogsUpdateHotelItem_H_


#include <string>
#include "CatalogsUpdatableHotelAttributes.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing an hotel item batch record
 *
 *  \ingroup Models
 *
 */

class CatalogsUpdateHotelItem : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsUpdateHotelItem();
	CatalogsUpdateHotelItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsUpdateHotelItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The catalog hotel item id in the merchant namespace
	 */
	std::string getHotelId();

	/*! \brief Set The catalog hotel item id in the merchant namespace
	 */
	void setHotelId(std::string  hotel_id);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string  operation);
	/*! \brief Get 
	 */
	CatalogsUpdatableHotelAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(CatalogsUpdatableHotelAttributes  attributes);

private:
	std::string hotel_id;
	std::string operation;
	CatalogsUpdatableHotelAttributes attributes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsUpdateHotelItem_H_ */
