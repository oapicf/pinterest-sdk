/*
 * AppsflyerAudienceCreate.h
 *
 * Resource create operation model.
 */

#ifndef _AppsflyerAudienceCreate_H_
#define _AppsflyerAudienceCreate_H_


#include <string>
#include "AppsflyerPlatform.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class AppsflyerAudienceCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	AppsflyerAudienceCreate();
	AppsflyerAudienceCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AppsflyerAudienceCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string name;
	AppsflyerPlatform platform;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AppsflyerAudienceCreate_H_ */
