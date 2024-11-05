/*
 * BaseInviteDataResponse_invite_data.h
 *
 * Metadata for the invite/request.
 */

#ifndef _BaseInviteDataResponse_invite_data_H_
#define _BaseInviteDataResponse_invite_data_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Metadata for the invite/request.
 *
 *  \ingroup Models
 *
 */

class BaseInviteDataResponse_invite_data : public Object {
public:
	/*! \brief Constructor.
	 */
	BaseInviteDataResponse_invite_data();
	BaseInviteDataResponse_invite_data(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BaseInviteDataResponse_invite_data();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The date and time when the invite/request will expire. Returned in milliseconds.
	 */
	int getInviteExpiration();

	/*! \brief Set The date and time when the invite/request will expire. Returned in milliseconds.
	 */
	void setInviteExpiration(int  invite_expiration);
	/*! \brief Get The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
	 */
	std::string getInviteStatus();

	/*! \brief Set The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
	 */
	void setInviteStatus(std::string  invite_status);
	/*! \brief Get The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
	 */
	std::string getInviteType();

	/*! \brief Set The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
	 */
	void setInviteType(std::string  invite_type);
	/*! \brief Get The date and time the invite/request was last updated. Returned in milliseconds.
	 */
	int getLastUpdatedTime();

	/*! \brief Set The date and time the invite/request was last updated. Returned in milliseconds.
	 */
	void setLastUpdatedTime(int  last_updated_time);
	/*! \brief Get The date and time the invite/request was sent/created. Returned in milliseconds.
	 */
	int getSentAt();

	/*! \brief Set The date and time the invite/request was sent/created. Returned in milliseconds.
	 */
	void setSentAt(int  sent_at);

private:
	int invite_expiration;
	std::string invite_status;
	std::string invite_type;
	int last_updated_time;
	int sent_at;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BaseInviteDataResponse_invite_data_H_ */
