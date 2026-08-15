
/*
 * AdPreviewCreateFromImage.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdPreviewCreateFromImage_H_
#define TINY_CPP_CLIENT_AdPreviewCreateFromImage_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdPreviewCreateFromImage{
public:

    /*! \brief Constructor.
	 */
    AdPreviewCreateFromImage();
    AdPreviewCreateFromImage(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdPreviewCreateFromImage();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Image URL.
	 */
	std::string getImageUrl();

	/*! \brief Set Image URL.
	 */
	void setImageUrl(std::string  image_url);
	/*! \brief Get Title displayed below ad.
	 */
	std::string getTitle();

	/*! \brief Set Title displayed below ad.
	 */
	void setTitle(std::string  title);


    private:
    std::string image_url{};
    std::string title{};
};
}

#endif /* TINY_CPP_CLIENT_AdPreviewCreateFromImage_H_ */
