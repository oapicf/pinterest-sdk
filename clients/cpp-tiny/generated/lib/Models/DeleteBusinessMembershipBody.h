
/*
 * DeleteBusinessMembershipBody.h
 *
 * List of members with role to delete.
 */

#ifndef TINY_CPP_CLIENT_DeleteBusinessMembershipBody_H_
#define TINY_CPP_CLIENT_DeleteBusinessMembershipBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DeleteBusinessMembershipMember.h"
#include <list>

namespace Tiny {


/*! \brief List of members with role to delete.
 *
 *  \ingroup Models
 *
 */

class DeleteBusinessMembershipBody{
public:

    /*! \brief Constructor.
	 */
    DeleteBusinessMembershipBody();
    DeleteBusinessMembershipBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteBusinessMembershipBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<DeleteBusinessMembershipMember> getMembers();

	/*! \brief Set 
	 */
	void setMembers(std::list<DeleteBusinessMembershipMember> members);


    private:
    std::list<DeleteBusinessMembershipMember> members;
};
}

#endif /* TINY_CPP_CLIENT_DeleteBusinessMembershipBody_H_ */
