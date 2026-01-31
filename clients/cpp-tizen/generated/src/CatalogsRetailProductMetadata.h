/*
 * CatalogsRetailProductMetadata.h
 *
 * Retail product metadata entity
 */

#ifndef _CatalogsRetailProductMetadata_H_
#define _CatalogsRetailProductMetadata_H_


#include <string>
#include "NonNullableCatalogsCurrency.h"
#include "NonNullableProductAvailabilityType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Retail product metadata entity
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailProductMetadata : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsRetailProductMetadata();
	CatalogsRetailProductMetadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsRetailProductMetadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	NonNullableProductAvailabilityType getAvailability();

	/*! \brief Set 
	 */
	void setAvailability(NonNullableProductAvailabilityType  availability);
	/*! \brief Get 
	 */
	NonNullableCatalogsCurrency getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(NonNullableCatalogsCurrency  currency);
	/*! \brief Get The parent ID of the product.
	 */
	std::string getItemGroupId();

	/*! \brief Set The parent ID of the product.
	 */
	void setItemGroupId(std::string  item_group_id);
	/*! \brief Get The user-created unique ID that represents the product.
	 */
	std::string getItemId();

	/*! \brief Set The user-created unique ID that represents the product.
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get The price of the product.
	 */
	long long getPrice();

	/*! \brief Set The price of the product.
	 */
	void setPrice(long long  price);
	/*! \brief Get The discounted price of the product.
	 */
	long long getSalePrice();

	/*! \brief Set The discounted price of the product.
	 */
	void setSalePrice(long long  sale_price);

private:
	NonNullableProductAvailabilityType availability;
	NonNullableCatalogsCurrency currency;
	std::string item_group_id;
	std::string item_id;
	long long price;
	long long sale_price;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsRetailProductMetadata_H_ */
