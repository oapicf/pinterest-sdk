/*
 * BusinessSharedAudienceResponse.h
 *
 * 
 */

#ifndef _BusinessSharedAudienceResponse_H_
#define _BusinessSharedAudienceResponse_H_


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

class BusinessSharedAudienceResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	BusinessSharedAudienceResponse();
	BusinessSharedAudienceResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BusinessSharedAudienceResponse();

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
	/*! \brief Get Business IDs that received the audience
	 */
	std::list<std::string> getRecipientBusinessIds();

	/*! \brief Set Business IDs that received the audience
	 */
	void setRecipientBusinessIds(std::list <std::string> recipient_business_ids);

private:
	std::string audience_id;
	std::list <Role>permissions;
	std::list <std::string>recipient_business_ids;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BusinessSharedAudienceResponse_H_ */
