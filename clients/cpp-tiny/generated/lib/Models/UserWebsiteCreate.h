
/*
 * UserWebsiteCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_UserWebsiteCreate_H_
#define TINY_CPP_CLIENT_UserWebsiteCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "WebsiteVerificationMethod.h"

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class UserWebsiteCreate{
public:

    /*! \brief Constructor.
	 */
    UserWebsiteCreate();
    UserWebsiteCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UserWebsiteCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Method used to verify website ownership.
	 */
	WebsiteVerificationMethod getVerificationMethod();

	/*! \brief Set Method used to verify website ownership.
	 */
	void setVerificationMethod(WebsiteVerificationMethod verification_method);
	/*! \brief Get Website with path or domain only
	 */
	std::string getWebsite();

	/*! \brief Set Website with path or domain only
	 */
	void setWebsite(std::string website);


    private:
    WebsiteVerificationMethod verification_method;
    std::string website{};
};
}

#endif /* TINY_CPP_CLIENT_UserWebsiteCreate_H_ */
