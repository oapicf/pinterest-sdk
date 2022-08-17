/*
 * CatalogsProduct.h
 *
 * 
 */

#ifndef _CatalogsProduct_H_
#define _CatalogsProduct_H_


#include <string>
#include "CatalogsProductMetadata.h"
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
	CatalogsProductMetadata getMetadata();

	/*! \brief Set 
	 */
	void setMetadata(CatalogsProductMetadata  metadata);
	/*! \brief Get 
	 */
	Pin getPin();

	/*! \brief Set 
	 */
	void setPin(Pin  pin);

private:
	CatalogsProductMetadata metadata;
	Pin pin;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProduct_H_ */
