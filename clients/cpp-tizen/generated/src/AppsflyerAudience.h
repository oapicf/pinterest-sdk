/*
 * AppsflyerAudience.h
 *
 * Request model for creating an AppsFlyer audience
 */

#ifndef _AppsflyerAudience_H_
#define _AppsflyerAudience_H_


#include <string>
#include "AppsflyerPlatform.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request model for creating an AppsFlyer audience
 *
 *  \ingroup Models
 *
 */

class AppsflyerAudience : public Object {
public:
	/*! \brief Constructor.
	 */
	AppsflyerAudience();
	AppsflyerAudience(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AppsflyerAudience();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the audience container
	 */
	std::string getContainerId();

	/*! \brief Set The ID of the audience container
	 */
	void setContainerId(std::string  container_id);
	/*! \brief Get The name of the audience
	 */
	std::string getName();

	/*! \brief Set The name of the audience
	 */
	void setName(std::string  name);
	/*! \brief Get The platform of the audience
	 */
	AppsflyerPlatform getPlatform();

	/*! \brief Set The platform of the audience
	 */
	void setPlatform(AppsflyerPlatform  platform);

private:
	std::string container_id;
	std::string name;
	AppsflyerPlatform platform;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AppsflyerAudience_H_ */
