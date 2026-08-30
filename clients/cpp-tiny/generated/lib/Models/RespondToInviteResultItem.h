
/*
 * RespondToInviteResultItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RespondToInviteResultItem_H_
#define TINY_CPP_CLIENT_RespondToInviteResultItem_H_


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

class RespondToInviteResultItem{
public:

    /*! \brief Constructor.
	 */
    RespondToInviteResultItem();
    RespondToInviteResultItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RespondToInviteResultItem();


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
	/*! \brief Get An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
	 */
	BaseInviteDataResponse getInvite();

	/*! \brief Set An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
	 */
	void setInvite(BaseInviteDataResponse invite);


    private:
    InviteExceptionResponse exception;
    BaseInviteDataResponse invite;
};
}

#endif /* TINY_CPP_CLIENT_RespondToInviteResultItem_H_ */
