
/*
 * Brand_accounts_update_request.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Brand_accounts_update_request_H_
#define TINY_CPP_CLIENT_Brand_accounts_update_request_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Country.h"
#include "Image_Base64.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Brand_accounts_update_request{
public:

    /*! \brief Constructor.
	 */
    Brand_accounts_update_request();
    Brand_accounts_update_request(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Brand_accounts_update_request();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Brand Account name
	 */
	std::string getName();

	/*! \brief Set Brand Account name
	 */
	void setName(std::string  name);
	/*! \brief Get Brand Account username
	 */
	std::string getUsername();

	/*! \brief Set Brand Account username
	 */
	void setUsername(std::string  username);
	/*! \brief Get 
	 */
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country  country);
	/*! \brief Get Brand Account about information
	 */
	std::string getAbout();

	/*! \brief Set Brand Account about information
	 */
	void setAbout(std::string  about);
	/*! \brief Get Brand Account website
	 */
	std::string getWebsite();

	/*! \brief Set Brand Account website
	 */
	void setWebsite(std::string  website);
	/*! \brief Get 
	 */
	Image_Base64 getProfileImage();

	/*! \brief Set 
	 */
	void setProfileImage(Image_Base64  profile_image);


    private:
    std::string name{};
    std::string username{};
    Country country;
    std::string about{};
    std::string website{};
    Image_Base64 profile_image;
};
}

#endif /* TINY_CPP_CLIENT_Brand_accounts_update_request_H_ */
