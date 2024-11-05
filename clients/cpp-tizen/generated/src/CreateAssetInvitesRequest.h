/*
 * CreateAssetInvitesRequest.h
 *
 * Request body for updating asset roles for existing invites.
 */

#ifndef _CreateAssetInvitesRequest_H_
#define _CreateAssetInvitesRequest_H_


#include <string>
#include "CreateAssetInvitesRequestItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request body for updating asset roles for existing invites.
 *
 *  \ingroup Models
 *
 */

class CreateAssetInvitesRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateAssetInvitesRequest();
	CreateAssetInvitesRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateAssetInvitesRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CreateAssetInvitesRequestItem> getInvites();

	/*! \brief Set 
	 */
	void setInvites(std::list <CreateAssetInvitesRequestItem> invites);

private:
	std::list <CreateAssetInvitesRequestItem>invites;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateAssetInvitesRequest_H_ */
