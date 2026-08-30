
/*
 * InviteDataResponse.h
 *
 * Metadata for the invite/request.
 */

#ifndef TINY_CPP_CLIENT_InviteDataResponse_H_
#define TINY_CPP_CLIENT_InviteDataResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Metadata for the invite/request.
 *
 *  \ingroup Models
 *
 */

class InviteDataResponse{
public:

    /*! \brief Constructor.
	 */
    InviteDataResponse();
    InviteDataResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InviteDataResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The date and time when the invite/request will expire. Returned in milliseconds.
	 */
	int getInviteExpiration();

	/*! \brief Set The date and time when the invite/request will expire. Returned in milliseconds.
	 */
	void setInviteExpiration(int invite_expiration);
	/*! \brief Get The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
	 */
	std::string getInviteStatus();

	/*! \brief Set The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
	 */
	void setInviteStatus(std::string invite_status);
	/*! \brief Get The type of invite. - 'MEMBER_INVITE' is to invite a member to access your business assets. - 'PARTNER_INVITE' is to invite a partner to access your business assets. - 'PARTNER_REQUEST' is to request access a partner's business assets.
	 */
	std::string getInviteType();

	/*! \brief Set The type of invite. - 'MEMBER_INVITE' is to invite a member to access your business assets. - 'PARTNER_INVITE' is to invite a partner to access your business assets. - 'PARTNER_REQUEST' is to request access a partner's business assets.
	 */
	void setInviteType(std::string invite_type);
	/*! \brief Get The date and time the invite/request was last updated. Returned in milliseconds.
	 */
	int getLastUpdatedTime();

	/*! \brief Set The date and time the invite/request was last updated. Returned in milliseconds.
	 */
	void setLastUpdatedTime(int last_updated_time);
	/*! \brief Get The date and time the invite/request was sent/created. Returned in milliseconds.
	 */
	int getSentAt();

	/*! \brief Set The date and time the invite/request was sent/created. Returned in milliseconds.
	 */
	void setSentAt(int sent_at);


    private:
    int invite_expiration{};
    std::string invite_status{};
    std::string invite_type{};
    int last_updated_time{};
    int sent_at{};
};
}

#endif /* TINY_CPP_CLIENT_InviteDataResponse_H_ */
