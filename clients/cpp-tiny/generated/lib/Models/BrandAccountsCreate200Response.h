
/*
 * Brand_accounts_create_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Brand_accounts_create_200_response_H_
#define TINY_CPP_CLIENT_Brand_accounts_create_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Brand_accounts_create_200_response{
public:

    /*! \brief Constructor.
	 */
    Brand_accounts_create_200_response();
    Brand_accounts_create_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Brand_accounts_create_200_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get id of the newly created brand account
	 */
	std::string getBrandAccountId();

	/*! \brief Set id of the newly created brand account
	 */
	void setBrandAccountId(std::string  brand_account_id);


    private:
    std::string brand_account_id{};
};
}

#endif /* TINY_CPP_CLIENT_Brand_accounts_create_200_response_H_ */
