
/*
 * UpdateInvitesResultsResponseArray.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdateInvitesResultsResponseArray_H_
#define TINY_CPP_CLIENT_UpdateInvitesResultsResponseArray_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdateInvitesResultsResponseArray_items_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdateInvitesResultsResponseArray{
public:

    /*! \brief Constructor.
	 */
    UpdateInvitesResultsResponseArray();
    UpdateInvitesResultsResponseArray(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateInvitesResultsResponseArray();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
	 */
	std::list<UpdateInvitesResultsResponseArray_items_inner> getItems();

	/*! \brief Set List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
	 */
	void setItems(std::list <UpdateInvitesResultsResponseArray_items_inner> items);


    private:
    std::list<UpdateInvitesResultsResponseArray_items_inner> items;
};
}

#endif /* TINY_CPP_CLIENT_UpdateInvitesResultsResponseArray_H_ */
