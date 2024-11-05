/*
 * CatalogsHotelProduct.h
 *
 * 
 */

#ifndef _CatalogsHotelProduct_H_
#define _CatalogsHotelProduct_H_


#include <string>
#include "CatalogsHotelProductMetadata.h"
#include "Pin.h"
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

class CatalogsHotelProduct : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelProduct();
	CatalogsHotelProduct(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelProduct();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get 
	 */
	CatalogsHotelProductMetadata getMetadata();

	/*! \brief Set 
	 */
	void setMetadata(CatalogsHotelProductMetadata  metadata);
	/*! \brief Get 
	 */
	Pin getPin();

	/*! \brief Set 
	 */
	void setPin(Pin  pin);

private:
	std::string catalog_type;
	CatalogsHotelProductMetadata metadata;
	Pin pin;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelProduct_H_ */
