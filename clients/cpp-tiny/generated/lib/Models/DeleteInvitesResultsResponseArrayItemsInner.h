
/*
 * DeleteInvitesResultsResponseArray_items_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DeleteInvitesResultsResponseArray_items_inner_H_
#define TINY_CPP_CLIENT_DeleteInvitesResultsResponseArray_items_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BaseInviteDataResponse.h"
#include "DeleteInvitesResultsResponseArray_items_inner_exception.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DeleteInvitesResultsResponseArray_items_inner{
public:

    /*! \brief Constructor.
	 */
    DeleteInvitesResultsResponseArray_items_inner();
    DeleteInvitesResultsResponseArray_items_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteInvitesResultsResponseArray_items_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	DeleteInvitesResultsResponseArray_items_inner_exception getException();

	/*! \brief Set 
	 */
	void setException(DeleteInvitesResultsResponseArray_items_inner_exception  exception);
	/*! \brief Get 
	 */
	BaseInviteDataResponse getInvite();

	/*! \brief Set 
	 */
	void setInvite(BaseInviteDataResponse  invite);


    private:
    DeleteInvitesResultsResponseArray_items_inner_exception exception;
    BaseInviteDataResponse invite;
};
}

#endif /* TINY_CPP_CLIENT_DeleteInvitesResultsResponseArray_items_inner_H_ */
