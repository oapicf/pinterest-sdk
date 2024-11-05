/*
 * CatalogsRetailProduct.h
 *
 * 
 */

#ifndef _CatalogsRetailProduct_H_
#define _CatalogsRetailProduct_H_


#include <string>
#include "CatalogsRetailProductMetadata.h"
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

class CatalogsRetailProduct : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsRetailProduct();
	CatalogsRetailProduct(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsRetailProduct();

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
	CatalogsRetailProductMetadata getMetadata();

	/*! \brief Set 
	 */
	void setMetadata(CatalogsRetailProductMetadata  metadata);
	/*! \brief Get 
	 */
	Pin getPin();

	/*! \brief Set 
	 */
	void setPin(Pin  pin);

private:
	std::string catalog_type;
	CatalogsRetailProductMetadata metadata;
	Pin pin;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsRetailProduct_H_ */
