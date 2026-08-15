
/*
 * CreateAssetInvitesRequest.h
 *
 * Request body for updating asset roles for existing invites.
 */

#ifndef TINY_CPP_CLIENT_CreateAssetInvitesRequest_H_
#define TINY_CPP_CLIENT_CreateAssetInvitesRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateAssetInvitesRequestItem.h"
#include <list>

namespace Tiny {


/*! \brief Request body for updating asset roles for existing invites.
 *
 *  \ingroup Models
 *
 */

class CreateAssetInvitesRequest{
public:

    /*! \brief Constructor.
	 */
    CreateAssetInvitesRequest();
    CreateAssetInvitesRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateAssetInvitesRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<CreateAssetInvitesRequestItem> getInvites();

	/*! \brief Set 
	 */
	void setInvites(std::list <CreateAssetInvitesRequestItem> invites);


    private:
    std::list<CreateAssetInvitesRequestItem> invites;
};
}

#endif /* TINY_CPP_CLIENT_CreateAssetInvitesRequest_H_ */
