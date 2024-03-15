/*
 * CatalogsUpsertHotelItem.h
 *
 * A hotel item to be upserted.
 */

#ifndef _CatalogsUpsertHotelItem_H_
#define _CatalogsUpsertHotelItem_H_


#include <string>
#include "CatalogsHotelAttributes.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A hotel item to be upserted.
 *
 *  \ingroup Models
 *
 */

class CatalogsUpsertHotelItem : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsUpsertHotelItem();
	CatalogsUpsertHotelItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsUpsertHotelItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The catalog hotel id in the merchant namespace
	 */
	std::string getHotelId();

	/*! \brief Set The catalog hotel id in the merchant namespace
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
	CatalogsHotelAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(CatalogsHotelAttributes  attributes);

private:
	std::string hotel_id;
	std::string operation;
	CatalogsHotelAttributes attributes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsUpsertHotelItem_H_ */
