
/*
 * CancelInvitesRequest.h
 *
 * An object with the list of invite/request ids to cancel.
 */

#ifndef TINY_CPP_CLIENT_CancelInvitesRequest_H_
#define TINY_CPP_CLIENT_CancelInvitesRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief An object with the list of invite/request ids to cancel.
 *
 *  \ingroup Models
 *
 */

class CancelInvitesRequest{
public:

    /*! \brief Constructor.
	 */
    CancelInvitesRequest();
    CancelInvitesRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CancelInvitesRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A list of invite/request ids to cancel.
	 */
	std::list<std::string> getInviteIds();

	/*! \brief Set A list of invite/request ids to cancel.
	 */
	void setInviteIds(std::list<std::string> invite_ids);


    private:
    std::list<std::string> invite_ids;
};
}

#endif /* TINY_CPP_CLIENT_CancelInvitesRequest_H_ */
