
/*
 * CancelInvitesBody.h
 *
 * Request body used to cancel invites
 */

#ifndef TINY_CPP_CLIENT_CancelInvitesBody_H_
#define TINY_CPP_CLIENT_CancelInvitesBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Request body used to cancel invites
 *
 *  \ingroup Models
 *
 */

class CancelInvitesBody{
public:

    /*! \brief Constructor.
	 */
    CancelInvitesBody();
    CancelInvitesBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CancelInvitesBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of invite/request ids to be cancelled
	 */
	std::list<std::string> getInviteIds();

	/*! \brief Set List of invite/request ids to be cancelled
	 */
	void setInviteIds(std::list <std::string> invite_ids);


    private:
    std::list<std::string> invite_ids;
};
}

#endif /* TINY_CPP_CLIENT_CancelInvitesBody_H_ */
