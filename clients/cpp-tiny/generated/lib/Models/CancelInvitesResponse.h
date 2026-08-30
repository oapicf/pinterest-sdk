
/*
 * CancelInvitesResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CancelInvitesResponse_H_
#define TINY_CPP_CLIENT_CancelInvitesResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CancelInviteResultItem.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CancelInvitesResponse{
public:

    /*! \brief Constructor.
	 */
    CancelInvitesResponse();
    CancelInvitesResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CancelInvitesResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<CancelInviteResultItem> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<CancelInviteResultItem> items);


    private:
    std::list<CancelInviteResultItem> items;
};
}

#endif /* TINY_CPP_CLIENT_CancelInvitesResponse_H_ */
