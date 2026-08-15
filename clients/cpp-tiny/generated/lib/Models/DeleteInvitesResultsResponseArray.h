
/*
 * DeleteInvitesResultsResponseArray.h
 *
 * Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
 */

#ifndef TINY_CPP_CLIENT_DeleteInvitesResultsResponseArray_H_
#define TINY_CPP_CLIENT_DeleteInvitesResultsResponseArray_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DeleteInvitesResultsResponseArray_items_inner.h"
#include <list>

namespace Tiny {


/*! \brief Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
 *
 *  \ingroup Models
 *
 */

class DeleteInvitesResultsResponseArray{
public:

    /*! \brief Constructor.
	 */
    DeleteInvitesResultsResponseArray();
    DeleteInvitesResultsResponseArray(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteInvitesResultsResponseArray();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.
	 */
	std::list<DeleteInvitesResultsResponseArray_items_inner> getItems();

	/*! \brief Set List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.
	 */
	void setItems(std::list <DeleteInvitesResultsResponseArray_items_inner> items);


    private:
    std::list<DeleteInvitesResultsResponseArray_items_inner> items;
};
}

#endif /* TINY_CPP_CLIENT_DeleteInvitesResultsResponseArray_H_ */
