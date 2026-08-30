/*
 * CatalogsProduct.h
 *
 * 
 */

#ifndef _CatalogsProduct_H_
#define _CatalogsProduct_H_


#include <string>
#include "CatalogsCreativeAssetsProduct.h"
#include "CatalogsCreativeAssetsProductMetadata.h"
#include "CatalogsHotelProduct.h"
#include "CatalogsRetailProduct.h"
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

class CatalogsProduct : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProduct();
	CatalogsProduct(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProduct();

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
	CatalogsCreativeAssetsProductMetadata getMetadata();

	/*! \brief Set 
	 */
	void setMetadata(CatalogsCreativeAssetsProductMetadata  metadata);
	/*! \brief Get 
	 */
	Pin getPin();

	/*! \brief Set 
	 */
	void setPin(Pin  pin);

private:
	std::string catalog_type;
	CatalogsCreativeAssetsProductMetadata metadata;
	Pin pin;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProduct_H_ */
