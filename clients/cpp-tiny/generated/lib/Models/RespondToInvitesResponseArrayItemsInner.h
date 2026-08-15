
/*
 * RespondToInvitesResponseArray_items_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RespondToInvitesResponseArray_items_inner_H_
#define TINY_CPP_CLIENT_RespondToInvitesResponseArray_items_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BaseInviteDataResponse.h"
#include "InviteExceptionResponse.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RespondToInvitesResponseArray_items_inner{
public:

    /*! \brief Constructor.
	 */
    RespondToInvitesResponseArray_items_inner();
    RespondToInvitesResponseArray_items_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RespondToInvitesResponseArray_items_inner();


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
	BaseInviteDataResponse getInvite();

	/*! \brief Set 
	 */
	void setInvite(BaseInviteDataResponse  invite);


    private:
    InviteExceptionResponse exception;
    BaseInviteDataResponse invite;
};
}

#endif /* TINY_CPP_CLIENT_RespondToInvitesResponseArray_items_inner_H_ */
