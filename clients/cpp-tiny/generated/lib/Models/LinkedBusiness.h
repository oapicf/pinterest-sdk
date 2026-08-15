
/*
 * LinkedBusiness.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LinkedBusiness_H_
#define TINY_CPP_CLIENT_LinkedBusiness_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LinkedBusiness{
public:

    /*! \brief Constructor.
	 */
    LinkedBusiness();
    LinkedBusiness(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LinkedBusiness();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get image_large_url
	 */
	std::string getImageLargeUrl();

	/*! \brief Set image_large_url
	 */
	void setImageLargeUrl(std::string  image_large_url);
	/*! \brief Get image_medium_url
	 */
	std::string getImageMediumUrl();

	/*! \brief Set image_medium_url
	 */
	void setImageMediumUrl(std::string  image_medium_url);
	/*! \brief Get image_small_url
	 */
	std::string getImageSmallUrl();

	/*! \brief Set image_small_url
	 */
	void setImageSmallUrl(std::string  image_small_url);
	/*! \brief Get image_xlarge_url
	 */
	std::string getImageXlargeUrl();

	/*! \brief Set image_xlarge_url
	 */
	void setImageXlargeUrl(std::string  image_xlarge_url);
	/*! \brief Get Username
	 */
	std::string getUsername();

	/*! \brief Set Username
	 */
	void setUsername(std::string  username);


    private:
    std::string image_large_url{};
    std::string image_medium_url{};
    std::string image_small_url{};
    std::string image_xlarge_url{};
    std::string username{};
};
}

#endif /* TINY_CPP_CLIENT_LinkedBusiness_H_ */
