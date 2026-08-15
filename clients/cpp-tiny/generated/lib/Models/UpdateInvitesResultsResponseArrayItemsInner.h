
/*
 * UpdateInvitesResultsResponseArray_items_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdateInvitesResultsResponseArray_items_inner_H_
#define TINY_CPP_CLIENT_UpdateInvitesResultsResponseArray_items_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "InviteBusinessRoleBinding.h"
#include "InviteExceptionResponse.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdateInvitesResultsResponseArray_items_inner{
public:

    /*! \brief Constructor.
	 */
    UpdateInvitesResultsResponseArray_items_inner();
    UpdateInvitesResultsResponseArray_items_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateInvitesResultsResponseArray_items_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	InviteExceptionResponse getException();

	/*! \brief Set 
	 */
	void setException(InviteExceptionResponse  exception);
	/*! \brief Get 
	 */
	InviteBusinessRoleBinding getInvite();

	/*! \brief Set 
	 */
	void setInvite(InviteBusinessRoleBinding  invite);


    private:
    InviteExceptionResponse exception;
    InviteBusinessRoleBinding invite;
};
}

#endif /* TINY_CPP_CLIENT_UpdateInvitesResultsResponseArray_items_inner_H_ */
