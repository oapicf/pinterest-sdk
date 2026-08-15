
/*
 * CreateInvitesResultsResponseArray_items_inner_invite.h
 *
 * An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
 */

#ifndef TINY_CPP_CLIENT_CreateInvitesResultsResponseArray_items_inner_invite_H_
#define TINY_CPP_CLIENT_CreateInvitesResultsResponseArray_items_inner_invite_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BusinessAccessUserSummary.h"

namespace Tiny {


/*! \brief An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
 *
 *  \ingroup Models
 *
 */

class CreateInvitesResultsResponseArray_items_inner_invite{
public:

    /*! \brief Constructor.
	 */
    CreateInvitesResultsResponseArray_items_inner_invite();
    CreateInvitesResultsResponseArray_items_inner_invite(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateInvitesResultsResponseArray_items_inner_invite();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier of the invite/request.
	 */
	std::string getId();

	/*! \brief Set Unique identifier of the invite/request.
	 */
	void setId(std::string  id);
	/*! \brief Get Metadata for the member/partner that was sent the invite/request.
	 */
	BusinessAccessUserSummary getUser();

	/*! \brief Set Metadata for the member/partner that was sent the invite/request.
	 */
	void setUser(BusinessAccessUserSummary  user);


    private:
    std::string id{};
    BusinessAccessUserSummary user;
};
}

#endif /* TINY_CPP_CLIENT_CreateInvitesResultsResponseArray_items_inner_invite_H_ */
