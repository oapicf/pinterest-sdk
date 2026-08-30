
/*
 * Ssio_insertion_orders_status_get_by_ad_account_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Ssio_insertion_orders_status_get_by_ad_account_200_response_H_
#define TINY_CPP_CLIENT_Ssio_insertion_orders_status_get_by_ad_account_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "SSIOInsertionOrderStatus.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Ssio_insertion_orders_status_get_by_ad_account_200_response{
public:

    /*! \brief Constructor.
	 */
    Ssio_insertion_orders_status_get_by_ad_account_200_response();
    Ssio_insertion_orders_status_get_by_ad_account_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Ssio_insertion_orders_status_get_by_ad_account_200_response();


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
	void setBookmark(std::string bookmark);
	/*! \brief Get 
	 */
	std::list<SSIOInsertionOrderStatus> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<SSIOInsertionOrderStatus> items);


    private:
    std::string bookmark{};
    std::list<SSIOInsertionOrderStatus> items;
};
}

#endif /* TINY_CPP_CLIENT_Ssio_insertion_orders_status_get_by_ad_account_200_response_H_ */
