
/*
 * AppsflyerAudience.h
 *
 * Request model for creating an AppsFlyer audience
 */

#ifndef TINY_CPP_CLIENT_AppsflyerAudience_H_
#define TINY_CPP_CLIENT_AppsflyerAudience_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AppsflyerPlatform.h"

namespace Tiny {


/*! \brief Request model for creating an AppsFlyer audience
 *
 *  \ingroup Models
 *
 */

class AppsflyerAudience{
public:

    /*! \brief Constructor.
	 */
    AppsflyerAudience();
    AppsflyerAudience(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AppsflyerAudience();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the audience container
	 */
	std::string getContainerId();

	/*! \brief Set The ID of the audience container
	 */
	void setContainerId(std::string container_id);
	/*! \brief Get The name of the audience
	 */
	std::string getName();

	/*! \brief Set The name of the audience
	 */
	void setName(std::string name);
	/*! \brief Get The platform of the audience
	 */
	AppsflyerPlatform getPlatform();

	/*! \brief Set The platform of the audience
	 */
	void setPlatform(AppsflyerPlatform platform);


    private:
    std::string container_id{};
    std::string name{};
    AppsflyerPlatform platform;
};
}

#endif /* TINY_CPP_CLIENT_AppsflyerAudience_H_ */
