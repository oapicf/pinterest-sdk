/*
 * BaseInviteDataResponse.h
 *
 * Common invite/request data returned by the business access endpoints.
 */

#ifndef _BaseInviteDataResponse_H_
#define _BaseInviteDataResponse_H_


#include <string>
#include "BusinessAccessUserSummary.h"
#include "InviteDataResponse.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Common invite/request data returned by the business access endpoints.
 *
 *  \ingroup Models
 *
 */

class BaseInviteDataResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	BaseInviteDataResponse();
	BaseInviteDataResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BaseInviteDataResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier of the invite/request.
	 */
	std::string getId();

	/*! \brief Set Unique identifier of the invite/request.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	InviteDataResponse getInviteData();

	/*! \brief Set 
	 */
	void setInviteData(InviteDataResponse  invite_data);
	/*! \brief Get Indicates whether the invite/request was received.
	 */
	bool getIsReceivedInvite();

	/*! \brief Set Indicates whether the invite/request was received.
	 */
	void setIsReceivedInvite(bool  is_received_invite);
	/*! \brief Get Metadata for the member/partner that was sent the invite/request.
	 */
	BusinessAccessUserSummary getUser();

	/*! \brief Set Metadata for the member/partner that was sent the invite/request.
	 */
	void setUser(BusinessAccessUserSummary  user);

private:
	std::string id;
	InviteDataResponse invite_data;
	bool is_received_invite;
	BusinessAccessUserSummary user;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BaseInviteDataResponse_H_ */
