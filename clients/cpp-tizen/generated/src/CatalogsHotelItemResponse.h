/*
 * CatalogsHotelItemResponse.h
 *
 * Object describing a hotel record
 */

#ifndef _CatalogsHotelItemResponse_H_
#define _CatalogsHotelItemResponse_H_


#include <string>
#include "CatalogsHotelAttributes.h"
#include "CatalogsType.h"
#include "Pin.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing a hotel record
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelItemResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelItemResponse();
	CatalogsHotelItemResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelItemResponse();

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
	/*! \brief Get The pins mapped to the item
	 */
	std::list<Pin> getPins();

	/*! \brief Set The pins mapped to the item
	 */
	void setPins(std::list <Pin> pins);
	/*! \brief Get 
	 */
	CatalogsHotelAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(CatalogsHotelAttributes  attributes);

private:
	CatalogsType catalog_type;
	std::string hotel_id;
	std::list <Pin>pins;
	CatalogsHotelAttributes attributes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelItemResponse_H_ */
