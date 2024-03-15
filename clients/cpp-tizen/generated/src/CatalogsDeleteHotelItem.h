/*
 * CatalogsDeleteHotelItem.h
 *
 * A hotel item to be deleted
 */

#ifndef _CatalogsDeleteHotelItem_H_
#define _CatalogsDeleteHotelItem_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A hotel item to be deleted
 *
 *  \ingroup Models
 *
 */

class CatalogsDeleteHotelItem : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsDeleteHotelItem();
	CatalogsDeleteHotelItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsDeleteHotelItem();

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

private:
	std::string hotel_id;
	std::string operation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsDeleteHotelItem_H_ */
