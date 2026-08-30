
/*
 * Ad_account_countries_get_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Ad_account_countries_get_200_response_H_
#define TINY_CPP_CLIENT_Ad_account_countries_get_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdAccountsCountry.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Ad_account_countries_get_200_response{
public:

    /*! \brief Constructor.
	 */
    Ad_account_countries_get_200_response();
    Ad_account_countries_get_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Ad_account_countries_get_200_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<AdAccountsCountry> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<AdAccountsCountry> items);


    private:
    std::list<AdAccountsCountry> items;
};
}

#endif /* TINY_CPP_CLIENT_Ad_account_countries_get_200_response_H_ */
