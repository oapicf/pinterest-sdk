/*
 * CartingProduct.h
 *
 * 
 */

#ifndef _CartingProduct_H_
#define _CartingProduct_H_


#include <string>
#include "CartingRetailer.h"
#include <list>
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

class CartingProduct : public Object {
public:
	/*! \brief Constructor.
	 */
	CartingProduct();
	CartingProduct(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CartingProduct();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get the internal Pinterest carting product id (different from industry product id)
	 */
	std::string getCartingProductId();

	/*! \brief Set the internal Pinterest carting product id (different from industry product id)
	 */
	void setCartingProductId(std::string  carting_product_id);
	/*! \brief Get Whether to display only the preferred retailers for the carting product
	 */
	bool getDisplayPreferredRetailersOnly();

	/*! \brief Set Whether to display only the preferred retailers for the carting product
	 */
	void setDisplayPreferredRetailersOnly(bool  display_preferred_retailers_only);
	/*! \brief Get Whether to display the price for the carting product
	 */
	bool getDisplayProductPrice();

	/*! \brief Set Whether to display the price for the carting product
	 */
	void setDisplayProductPrice(bool  display_product_price);
	/*! \brief Get A sorted array of preferred retailers for the carting product
	 */
	std::list<CartingRetailer> getPreferredRetailers();

	/*! \brief Set A sorted array of preferred retailers for the carting product
	 */
	void setPreferredRetailers(std::list <CartingRetailer> preferred_retailers);
	/*! \brief Get Whether to randomize preferred retailers for the carting product
	 */
	bool getRandomizePreferredRetailers();

	/*! \brief Set Whether to randomize preferred retailers for the carting product
	 */
	void setRandomizePreferredRetailers(bool  randomize_preferred_retailers);

private:
	std::string carting_product_id;
	bool display_preferred_retailers_only;
	bool display_product_price;
	std::list <CartingRetailer>preferred_retailers;
	bool randomize_preferred_retailers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CartingProduct_H_ */
