/*
 * SharedAudienceResponseCommon.h
 *
 * 
 */

#ifndef _SharedAudienceResponseCommon_H_
#define _SharedAudienceResponseCommon_H_


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

class SharedAudienceResponseCommon : public Object {
public:
	/*! \brief Constructor.
	 */
	SharedAudienceResponseCommon();
	SharedAudienceResponseCommon(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SharedAudienceResponseCommon();

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

private:
	std::string audience_id;
	std::list <Role>permissions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SharedAudienceResponseCommon_H_ */
