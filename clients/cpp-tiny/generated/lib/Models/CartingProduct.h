
/*
 * CartingProduct.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CartingProduct_H_
#define TINY_CPP_CLIENT_CartingProduct_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CartingRetailer.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CartingProduct{
public:

    /*! \brief Constructor.
	 */
    CartingProduct();
    CartingProduct(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CartingProduct();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get the internal Pinterest carting product id (different from industry product id)
	 */
	std::string getCartingProductId();

	/*! \brief Set the internal Pinterest carting product id (different from industry product id)
	 */
	void setCartingProductId(std::string carting_product_id);
	/*! \brief Get Whether to display only the preferred retailers for the carting product
	 */
	bool isDisplayPreferredRetailersOnly();

	/*! \brief Set Whether to display only the preferred retailers for the carting product
	 */
	void setDisplayPreferredRetailersOnly(bool display_preferred_retailers_only);
	/*! \brief Get Whether to display the price for the carting product
	 */
	bool isDisplayProductPrice();

	/*! \brief Set Whether to display the price for the carting product
	 */
	void setDisplayProductPrice(bool display_product_price);
	/*! \brief Get A sorted array of preferred retailers for the carting product
	 */
	std::list<CartingRetailer> getPreferredRetailers();

	/*! \brief Set A sorted array of preferred retailers for the carting product
	 */
	void setPreferredRetailers(std::list<CartingRetailer> preferred_retailers);
	/*! \brief Get Whether to randomize preferred retailers for the carting product
	 */
	bool isRandomizePreferredRetailers();

	/*! \brief Set Whether to randomize preferred retailers for the carting product
	 */
	void setRandomizePreferredRetailers(bool randomize_preferred_retailers);


    private:
    std::string carting_product_id{};
    bool display_preferred_retailers_only{};
    bool display_product_price{};
    std::list<CartingRetailer> preferred_retailers;
    bool randomize_preferred_retailers{};
};
}

#endif /* TINY_CPP_CLIENT_CartingProduct_H_ */
