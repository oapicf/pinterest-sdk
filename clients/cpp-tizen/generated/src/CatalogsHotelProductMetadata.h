/*
 * CatalogsHotelProductMetadata.h
 *
 * Hotel product metadata entity
 */

#ifndef _CatalogsHotelProductMetadata_H_
#define _CatalogsHotelProductMetadata_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Hotel product metadata entity
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelProductMetadata : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelProductMetadata();
	CatalogsHotelProductMetadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelProductMetadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The user-created unique ID that represents the hotel item.
	 */
	std::string getHotelId();

	/*! \brief Set The user-created unique ID that represents the hotel item.
	 */
	void setHotelId(std::string  hotel_id);

private:
	std::string hotel_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelProductMetadata_H_ */
