
/*
 * RespondToInvitesResponseArray.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RespondToInvitesResponseArray_H_
#define TINY_CPP_CLIENT_RespondToInvitesResponseArray_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RespondToInvitesResponseArray_items_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RespondToInvitesResponseArray{
public:

    /*! \brief Constructor.
	 */
    RespondToInvitesResponseArray();
    RespondToInvitesResponseArray(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RespondToInvitesResponseArray();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.
	 */
	std::list<RespondToInvitesResponseArray_items_inner> getItems();

	/*! \brief Set List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.
	 */
	void setItems(std::list <RespondToInvitesResponseArray_items_inner> items);


    private:
    std::list<RespondToInvitesResponseArray_items_inner> items;
};
}

#endif /* TINY_CPP_CLIENT_RespondToInvitesResponseArray_H_ */
