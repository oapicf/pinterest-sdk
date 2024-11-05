/*
 * SharedAudienceResponse.h
 *
 * 
 */

#ifndef _SharedAudienceResponse_H_
#define _SharedAudienceResponse_H_


#include <string>
#include "Role.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SharedAudienceResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	SharedAudienceResponse();
	SharedAudienceResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SharedAudienceResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string audience_id;
	std::list <Role>permissions;
	std::list <std::string>recipient_account_ids;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SharedAudienceResponse_H_ */
