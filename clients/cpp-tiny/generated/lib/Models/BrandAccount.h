
/*
 * BrandAccount.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BrandAccount_H_
#define TINY_CPP_CLIENT_BrandAccount_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BrandAccount{
public:

    /*! \brief Constructor.
	 */
    BrandAccount();
    BrandAccount(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BrandAccount();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getBrandAccountId();

	/*! \brief Set 
	 */
	void setBrandAccountId(std::string brand_account_id);


    private:
    std::string brand_account_id{};
};
}

#endif /* TINY_CPP_CLIENT_BrandAccount_H_ */
