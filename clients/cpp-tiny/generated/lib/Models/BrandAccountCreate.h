
/*
 * BrandAccountCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_BrandAccountCreate_H_
#define TINY_CPP_CLIENT_BrandAccountCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BrandAccountProfileImage.h"
#include "Country.h"

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class BrandAccountCreate{
public:

    /*! \brief Constructor.
	 */
    BrandAccountCreate();
    BrandAccountCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BrandAccountCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Brand Account about information
	 */
	std::string getAbout();

	/*! \brief Set Brand Account about information
	 */
	void setAbout(std::string about);
	/*! \brief Get 
	 */
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country country);
	/*! \brief Get Brand Account name
	 */
	std::string getName();

	/*! \brief Set Brand Account name
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	BrandAccountProfileImage getProfileImage();

	/*! \brief Set 
	 */
	void setProfileImage(BrandAccountProfileImage profile_image);
	/*! \brief Get Brand Account username
	 */
	std::string getUsername();

	/*! \brief Set Brand Account username
	 */
	void setUsername(std::string username);
	/*! \brief Get Brand Account website
	 */
	std::string getWebsite();

	/*! \brief Set Brand Account website
	 */
	void setWebsite(std::string website);


    private:
    std::string about{};
    Country country;
    std::string name{};
    BrandAccountProfileImage profile_image;
    std::string username{};
    std::string website{};
};
}

#endif /* TINY_CPP_CLIENT_BrandAccountCreate_H_ */
