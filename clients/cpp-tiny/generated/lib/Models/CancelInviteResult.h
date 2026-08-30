
/*
 * CancelInviteResult.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CancelInviteResult_H_
#define TINY_CPP_CLIENT_CancelInviteResult_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CancelInviteResultUser.h"
#include "InviteDataResponse.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CancelInviteResult{
public:

    /*! \brief Constructor.
	 */
    CancelInviteResult();
    CancelInviteResult(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CancelInviteResult();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string id);
	/*! \brief Get 
	 */
	InviteDataResponse getInviteData();

	/*! \brief Set 
	 */
	void setInviteData(InviteDataResponse invite_data);
	/*! \brief Get 
	 */
	bool isIsReceivedInvite();

	/*! \brief Set 
	 */
	void setIsReceivedInvite(bool is_received_invite);
	/*! \brief Get 
	 */
	CancelInviteResultUser getUser();

	/*! \brief Set 
	 */
	void setUser(CancelInviteResultUser user);


    private:
    std::string id{};
    InviteDataResponse invite_data;
    bool is_received_invite{};
    CancelInviteResultUser user;
};
}

#endif /* TINY_CPP_CLIENT_CancelInviteResult_H_ */
