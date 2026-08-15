
/*
 * BusinessSharedAudienceResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BusinessSharedAudienceResponse_H_
#define TINY_CPP_CLIENT_BusinessSharedAudienceResponse_H_


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

class BusinessSharedAudienceResponse{
public:

    /*! \brief Constructor.
	 */
    BusinessSharedAudienceResponse();
    BusinessSharedAudienceResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessSharedAudienceResponse();


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
	/*! \brief Get Business IDs that received the audience
	 */
	std::list<std::string> getRecipientBusinessIds();

	/*! \brief Set Business IDs that received the audience
	 */
	void setRecipientBusinessIds(std::list <std::string> recipient_business_ids);


    private:
    std::string audience_id{};
    std::list<Role> permissions;
    std::list<std::string> recipient_business_ids;
};
}

#endif /* TINY_CPP_CLIENT_BusinessSharedAudienceResponse_H_ */
