
/*
 * Customer_lists_list_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Customer_lists_list_200_response_H_
#define TINY_CPP_CLIENT_Customer_lists_list_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CustomerList.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Customer_lists_list_200_response{
public:

    /*! \brief Constructor.
	 */
    Customer_lists_list_200_response();
    Customer_lists_list_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Customer_lists_list_200_response();


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
	/*! \brief Get 
	 */
	std::list<CustomerList> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <CustomerList> items);


    private:
    std::string bookmark{};
    std::list<CustomerList> items;
};
}

#endif /* TINY_CPP_CLIENT_Customer_lists_list_200_response_H_ */
