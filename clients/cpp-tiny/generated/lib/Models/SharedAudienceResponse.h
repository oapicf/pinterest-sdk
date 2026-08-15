
/*
 * SharedAudienceResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SharedAudienceResponse_H_
#define TINY_CPP_CLIENT_SharedAudienceResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Role.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SharedAudienceResponse{
public:

    /*! \brief Constructor.
	 */
    SharedAudienceResponse();
    SharedAudienceResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SharedAudienceResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Audience ID that was shared
	 */
	std::string getAudienceId();

	/*! \brief Set Audience ID that was shared
	 */
	void setAudienceId(std::string  audience_id);
	/*! \brief Get 
	 */
	std::list<Role> getPermissions();

	/*! \brief Set 
	 */
	void setPermissions(std::list <Role> permissions);
	/*! \brief Get Account IDs that received the audience
	 */
	std::list<std::string> getRecipientAccountIds();

	/*! \brief Set Account IDs that received the audience
	 */
	void setRecipientAccountIds(std::list <std::string> recipient_account_ids);


    private:
    std::string audience_id{};
    std::list<Role> permissions;
    std::list<std::string> recipient_account_ids;
};
}

#endif /* TINY_CPP_CLIENT_SharedAudienceResponse_H_ */
