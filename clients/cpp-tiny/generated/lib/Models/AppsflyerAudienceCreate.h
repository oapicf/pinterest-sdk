
/*
 * AppsflyerAudienceCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_AppsflyerAudienceCreate_H_
#define TINY_CPP_CLIENT_AppsflyerAudienceCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AppsflyerPlatform.h"

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class AppsflyerAudienceCreate{
public:

    /*! \brief Constructor.
	 */
    AppsflyerAudienceCreate();
    AppsflyerAudienceCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AppsflyerAudienceCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string name{};
    AppsflyerPlatform platform;
};
}

#endif /* TINY_CPP_CLIENT_AppsflyerAudienceCreate_H_ */
