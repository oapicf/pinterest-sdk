
/*
 * DeleteInvitesResultsResponseArray_items_inner_exception.h
 *
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 */

#ifndef TINY_CPP_CLIENT_DeleteInvitesResultsResponseArray_items_inner_exception_H_
#define TINY_CPP_CLIENT_DeleteInvitesResultsResponseArray_items_inner_exception_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 *
 *  \ingroup Models
 *
 */

class DeleteInvitesResultsResponseArray_items_inner_exception{
public:

    /*! \brief Constructor.
	 */
    DeleteInvitesResultsResponseArray_items_inner_exception();
    DeleteInvitesResultsResponseArray_items_inner_exception(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteInvitesResultsResponseArray_items_inner_exception();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier of an invite.
	 */
	std::string getInviteId();

	/*! \brief Set Unique identifier of an invite.
	 */
	void setInviteId(std::string  invite_id);
	/*! \brief Get Error message associated with the error in performing the action on the invite/request.
	 */
	std::string getMessage();

	/*! \brief Set Error message associated with the error in performing the action on the invite/request.
	 */
	void setMessage(std::string  message);


    private:
    std::string invite_id{};
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_DeleteInvitesResultsResponseArray_items_inner_exception_H_ */
