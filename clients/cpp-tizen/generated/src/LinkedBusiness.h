/*
 * LinkedBusiness.h
 *
 * 
 */

#ifndef _LinkedBusiness_H_
#define _LinkedBusiness_H_


#include <string>
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

class LinkedBusiness : public Object {
public:
	/*! \brief Constructor.
	 */
	LinkedBusiness();
	LinkedBusiness(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LinkedBusiness();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Username
	 */
	std::string getUsername();

	/*! \brief Set Username
	 */
	void setUsername(std::string  username);
	/*! \brief Get image_small_url
	 */
	std::string getImageSmallUrl();

	/*! \brief Set image_small_url
	 */
	void setImageSmallUrl(std::string  image_small_url);
	/*! \brief Get image_medium_url
	 */
	std::string getImageMediumUrl();

	/*! \brief Set image_medium_url
	 */
	void setImageMediumUrl(std::string  image_medium_url);
	/*! \brief Get image_large_url
	 */
	std::string getImageLargeUrl();

	/*! \brief Set image_large_url
	 */
	void setImageLargeUrl(std::string  image_large_url);
	/*! \brief Get image_xlarge_url
	 */
	std::string getImageXlargeUrl();

	/*! \brief Set image_xlarge_url
	 */
	void setImageXlargeUrl(std::string  image_xlarge_url);

private:
	std::string username;
	std::string image_small_url;
	std::string image_medium_url;
	std::string image_large_url;
	std::string image_xlarge_url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LinkedBusiness_H_ */
