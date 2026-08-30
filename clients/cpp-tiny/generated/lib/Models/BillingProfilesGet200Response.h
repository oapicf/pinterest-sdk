
/*
 * Billing_profiles_get_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Billing_profiles_get_200_response_H_
#define TINY_CPP_CLIENT_Billing_profiles_get_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BillingProfilesResponse.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Billing_profiles_get_200_response{
public:

    /*! \brief Constructor.
	 */
    Billing_profiles_get_200_response();
    Billing_profiles_get_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Billing_profiles_get_200_response();


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
	std::list<BillingProfilesResponse> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<BillingProfilesResponse> items);


    private:
    std::string bookmark{};
    std::list<BillingProfilesResponse> items;
};
}

#endif /* TINY_CPP_CLIENT_Billing_profiles_get_200_response_H_ */
