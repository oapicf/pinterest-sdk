/*
 * CatalogsHotelItemErrorResponse.h
 *
 * Object describing a hotel item error
 */

#ifndef _CatalogsHotelItemErrorResponse_H_
#define _CatalogsHotelItemErrorResponse_H_


#include <string>
#include "CatalogsType.h"
#include "ItemValidationEvent.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing a hotel item error
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelItemErrorResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelItemErrorResponse();
	CatalogsHotelItemErrorResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelItemErrorResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get The catalog hotel id in the merchant namespace
	 */
	std::string getHotelId();

	/*! \brief Set The catalog hotel id in the merchant namespace
	 */
	void setHotelId(std::string  hotel_id);
	/*! \brief Get Array with the errors for the item id requested
	 */
	std::list<ItemValidationEvent> getErrors();

	/*! \brief Set Array with the errors for the item id requested
	 */
	void setErrors(std::list <ItemValidationEvent> errors);

private:
	CatalogsType catalog_type;
	std::string hotel_id;
	std::list <ItemValidationEvent>errors;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelItemErrorResponse_H_ */
