
/*
 * Ad_accounts_list_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Ad_accounts_list_200_response_H_
#define TINY_CPP_CLIENT_Ad_accounts_list_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdAccount.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Ad_accounts_list_200_response{
public:

    /*! \brief Constructor.
	 */
    Ad_accounts_list_200_response();
    Ad_accounts_list_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Ad_accounts_list_200_response();


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
	std::list<AdAccount> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<AdAccount> items);


    private:
    std::string bookmark{};
    std::list<AdAccount> items;
};
}

#endif /* TINY_CPP_CLIENT_Ad_accounts_list_200_response_H_ */
