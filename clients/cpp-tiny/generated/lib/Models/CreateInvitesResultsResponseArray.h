
/*
 * CreateInvitesResultsResponseArray.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateInvitesResultsResponseArray_H_
#define TINY_CPP_CLIENT_CreateInvitesResultsResponseArray_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "InviteActionResultItem.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateInvitesResultsResponseArray{
public:

    /*! \brief Constructor.
	 */
    CreateInvitesResultsResponseArray();
    CreateInvitesResultsResponseArray(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateInvitesResultsResponseArray();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
	 */
	std::list<InviteActionResultItem> getItems();

	/*! \brief Set List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
	 */
	void setItems(std::list<InviteActionResultItem> items);


    private:
    std::list<InviteActionResultItem> items;
};
}

#endif /* TINY_CPP_CLIENT_CreateInvitesResultsResponseArray_H_ */
