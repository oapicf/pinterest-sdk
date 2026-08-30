
/*
 * UpdateBusinessMembershipsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdateBusinessMembershipsResponse_H_
#define TINY_CPP_CLIENT_UpdateBusinessMembershipsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BusinessMembershipMember.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdateBusinessMembershipsResponse{
public:

    /*! \brief Constructor.
	 */
    UpdateBusinessMembershipsResponse();
    UpdateBusinessMembershipsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateBusinessMembershipsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of members with updated business access role.
	 */
	std::list<BusinessMembershipMember> getItems();

	/*! \brief Set List of members with updated business access role.
	 */
	void setItems(std::list<BusinessMembershipMember> items);


    private:
    std::list<BusinessMembershipMember> items;
};
}

#endif /* TINY_CPP_CLIENT_UpdateBusinessMembershipsResponse_H_ */
