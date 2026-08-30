
/*
 * InviteActionResultItem.h
 *
 * An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
 */

#ifndef TINY_CPP_CLIENT_InviteActionResultItem_H_
#define TINY_CPP_CLIENT_InviteActionResultItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "InviteBusinessRoleBinding.h"
#include "InviteExceptionResponse.h"

namespace Tiny {


/*! \brief An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
 *
 *  \ingroup Models
 *
 */

class InviteActionResultItem{
public:

    /*! \brief Constructor.
	 */
    InviteActionResultItem();
    InviteActionResultItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InviteActionResultItem();


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
	void setException(InviteExceptionResponse exception);
	/*! \brief Get 
	 */
	InviteBusinessRoleBinding getInvite();

	/*! \brief Set 
	 */
	void setInvite(InviteBusinessRoleBinding invite);


    private:
    InviteExceptionResponse exception;
    InviteBusinessRoleBinding invite;
};
}

#endif /* TINY_CPP_CLIENT_InviteActionResultItem_H_ */
