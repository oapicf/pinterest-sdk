
/*
 * Ssio_order_lines_get_by_ad_account_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Ssio_order_lines_get_by_ad_account_200_response_H_
#define TINY_CPP_CLIENT_Ssio_order_lines_get_by_ad_account_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "SSIOOrderLine.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Ssio_order_lines_get_by_ad_account_200_response{
public:

    /*! \brief Constructor.
	 */
    Ssio_order_lines_get_by_ad_account_200_response();
    Ssio_order_lines_get_by_ad_account_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Ssio_order_lines_get_by_ad_account_200_response();


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
	/*! \brief Get SSIO order lines by ad acount id
	 */
	std::list<SSIOOrderLine> getItems();

	/*! \brief Set SSIO order lines by ad acount id
	 */
	void setItems(std::list <SSIOOrderLine> items);


    private:
    std::string bookmark{};
    std::list<SSIOOrderLine> items;
};
}

#endif /* TINY_CPP_CLIENT_Ssio_order_lines_get_by_ad_account_200_response_H_ */
