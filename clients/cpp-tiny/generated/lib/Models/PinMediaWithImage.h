
/*
 * PinMediaWithImage.h
 *
 * Pin with image.
 */

#ifndef TINY_CPP_CLIENT_PinMediaWithImage_H_
#define TINY_CPP_CLIENT_PinMediaWithImage_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ImageSize.h"

namespace Tiny {


/*! \brief Pin with image.
 *
 *  \ingroup Models
 *
 */

class PinMediaWithImage{
public:

    /*! \brief Constructor.
	 */
    PinMediaWithImage();
    PinMediaWithImage(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinMediaWithImage();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ImageSize getImages();

	/*! \brief Set 
	 */
	void setImages(ImageSize  images);
	/*! \brief Get 
	 */
	std::string getMediaType();

	/*! \brief Set 
	 */
	void setMediaType(std::string  media_type);


    private:
    ImageSize images;
    std::string media_type{};
};
}

#endif /* TINY_CPP_CLIENT_PinMediaWithImage_H_ */
