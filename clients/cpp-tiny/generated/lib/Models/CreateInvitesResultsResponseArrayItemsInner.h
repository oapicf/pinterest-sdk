
/*
 * CreateInvitesResultsResponseArray_items_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateInvitesResultsResponseArray_items_inner_H_
#define TINY_CPP_CLIENT_CreateInvitesResultsResponseArray_items_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateInvitesResultsResponseArray_items_inner_invite.h"
#include "InviteExceptionResponse.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateInvitesResultsResponseArray_items_inner{
public:

    /*! \brief Constructor.
	 */
    CreateInvitesResultsResponseArray_items_inner();
    CreateInvitesResultsResponseArray_items_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateInvitesResultsResponseArray_items_inner();


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
	CreateInvitesResultsResponseArray_items_inner_invite getInvite();

	/*! \brief Set 
	 */
	void setInvite(CreateInvitesResultsResponseArray_items_inner_invite  invite);


    private:
    InviteExceptionResponse exception;
    CreateInvitesResultsResponseArray_items_inner_invite invite;
};
}

#endif /* TINY_CPP_CLIENT_CreateInvitesResultsResponseArray_items_inner_H_ */
