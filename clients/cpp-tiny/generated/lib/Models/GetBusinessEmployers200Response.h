
/*
 * Get_business_employers_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Get_business_employers_200_response_H_
#define TINY_CPP_CLIENT_Get_business_employers_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UserBusinessRoleBinding.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Get_business_employers_200_response{
public:

    /*! \brief Constructor.
	 */
    Get_business_employers_200_response();
    Get_business_employers_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Get_business_employers_200_response();


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
	/*! \brief Get List of employers.
	 */
	std::list<UserBusinessRoleBinding> getItems();

	/*! \brief Set List of employers.
	 */
	void setItems(std::list <UserBusinessRoleBinding> items);


    private:
    std::string bookmark{};
    std::list<UserBusinessRoleBinding> items;
};
}

#endif /* TINY_CPP_CLIENT_Get_business_employers_200_response_H_ */
