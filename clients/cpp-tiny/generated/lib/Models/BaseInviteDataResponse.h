
/*
 * BaseInviteDataResponse.h
 *
 * Common invite/request data returned by the business access endpoints.
 */

#ifndef TINY_CPP_CLIENT_BaseInviteDataResponse_H_
#define TINY_CPP_CLIENT_BaseInviteDataResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BusinessAccessUserSummary.h"
#include "InviteDataResponse.h"

namespace Tiny {


/*! \brief Common invite/request data returned by the business access endpoints.
 *
 *  \ingroup Models
 *
 */

class BaseInviteDataResponse{
public:

    /*! \brief Constructor.
	 */
    BaseInviteDataResponse();
    BaseInviteDataResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BaseInviteDataResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier of the invite/request.
	 */
	std::string getId();

	/*! \brief Set Unique identifier of the invite/request.
	 */
	void setId(std::string id);
	/*! \brief Get 
	 */
	InviteDataResponse getInviteData();

	/*! \brief Set 
	 */
	void setInviteData(InviteDataResponse invite_data);
	/*! \brief Get Indicates whether the invite/request was received.
	 */
	bool isIsReceivedInvite();

	/*! \brief Set Indicates whether the invite/request was received.
	 */
	void setIsReceivedInvite(bool is_received_invite);
	/*! \brief Get Metadata for the member/partner that was sent the invite/request.
	 */
	BusinessAccessUserSummary getUser();

	/*! \brief Set Metadata for the member/partner that was sent the invite/request.
	 */
	void setUser(BusinessAccessUserSummary user);


    private:
    std::string id{};
    InviteDataResponse invite_data;
    bool is_received_invite{};
    BusinessAccessUserSummary user;
};
}

#endif /* TINY_CPP_CLIENT_BaseInviteDataResponse_H_ */
