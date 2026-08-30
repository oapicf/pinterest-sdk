
/*
 * Delete_business_membership_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Delete_business_membership_200_response_H_
#define TINY_CPP_CLIENT_Delete_business_membership_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Delete_business_membership_200_response{
public:

    /*! \brief Constructor.
	 */
    Delete_business_membership_200_response();
    Delete_business_membership_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Delete_business_membership_200_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<std::string> getDeletedMembers();

	/*! \brief Set 
	 */
	void setDeletedMembers(std::list<std::string> deleted_members);


    private:
    std::list<std::string> deleted_members;
};
}

#endif /* TINY_CPP_CLIENT_Delete_business_membership_200_response_H_ */
