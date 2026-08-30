
/*
 * CatalogsRetailProductMetadata.h
 *
 * Retail product metadata entity
 */

#ifndef TINY_CPP_CLIENT_CatalogsRetailProductMetadata_H_
#define TINY_CPP_CLIENT_CatalogsRetailProductMetadata_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "NonNullableCatalogsCurrency.h"
#include "ProductAvailability.h"

namespace Tiny {


/*! \brief Retail product metadata entity
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailProductMetadata{
public:

    /*! \brief Constructor.
	 */
    CatalogsRetailProductMetadata();
    CatalogsRetailProductMetadata(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsRetailProductMetadata();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ProductAvailability getAvailability();

	/*! \brief Set 
	 */
	void setAvailability(ProductAvailability availability);
	/*! \brief Get 
	 */
	NonNullableCatalogsCurrency getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(NonNullableCatalogsCurrency currency);
	/*! \brief Get The parent ID of the product.
	 */
	std::string getItemGroupId();

	/*! \brief Set The parent ID of the product.
	 */
	void setItemGroupId(std::string item_group_id);
	/*! \brief Get The user-created unique ID that represents the product.
	 */
	std::string getItemId();

	/*! \brief Set The user-created unique ID that represents the product.
	 */
	void setItemId(std::string item_id);
	/*! \brief Get The price of the product.
	 */
	long getPrice();

	/*! \brief Set The price of the product.
	 */
	void setPrice(long price);
	/*! \brief Get The discounted price of the product.
	 */
	long getSalePrice();

	/*! \brief Set The discounted price of the product.
	 */
	void setSalePrice(long sale_price);


    private:
    ProductAvailability availability;
    NonNullableCatalogsCurrency currency;
    std::string item_group_id{};
    std::string item_id{};
    long price{};
    long sale_price{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsRetailProductMetadata_H_ */
