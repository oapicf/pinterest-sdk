
/*
 * Catalogs_product_group_pins_list_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Catalogs_product_group_pins_list_200_response_H_
#define TINY_CPP_CLIENT_Catalogs_product_group_pins_list_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProduct.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Catalogs_product_group_pins_list_200_response{
public:

    /*! \brief Constructor.
	 */
    Catalogs_product_group_pins_list_200_response();
    Catalogs_product_group_pins_list_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Catalogs_product_group_pins_list_200_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);
	/*! \brief Get Pins
	 */
	std::list<CatalogsProduct> getItems();

	/*! \brief Set Pins
	 */
	void setItems(std::list <CatalogsProduct> items);


    private:
    std::string bookmark{};
    std::list<CatalogsProduct> items;
};
}

#endif /* TINY_CPP_CLIENT_Catalogs_product_group_pins_list_200_response_H_ */
