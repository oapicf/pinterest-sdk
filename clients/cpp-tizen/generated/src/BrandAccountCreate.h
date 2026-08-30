/*
 * BrandAccountCreate.h
 *
 * Resource create operation model.
 */

#ifndef _BrandAccountCreate_H_
#define _BrandAccountCreate_H_


#include <string>
#include "BrandAccountProfileImage.h"
#include "Country.h"
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

class BrandAccountCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	BrandAccountCreate();
	BrandAccountCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BrandAccountCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Brand Account about information
	 */
	std::string getAbout();

	/*! \brief Set Brand Account about information
	 */
	void setAbout(std::string  about);
	/*! \brief Get 
	 */
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country  country);
	/*! \brief Get Brand Account name
	 */
	std::string getName();

	/*! \brief Set Brand Account name
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	BrandAccountProfileImage getProfileImage();

	/*! \brief Set 
	 */
	void setProfileImage(BrandAccountProfileImage  profile_image);
	/*! \brief Get Brand Account username
	 */
	std::string getUsername();

	/*! \brief Set Brand Account username
	 */
	void setUsername(std::string  username);
	/*! \brief Get Brand Account website
	 */
	std::string getWebsite();

	/*! \brief Set Brand Account website
	 */
	void setWebsite(std::string  website);

private:
	std::string about;
	Country country;
	std::string name;
	BrandAccountProfileImage profile_image;
	std::string username;
	std::string website;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BrandAccountCreate_H_ */
