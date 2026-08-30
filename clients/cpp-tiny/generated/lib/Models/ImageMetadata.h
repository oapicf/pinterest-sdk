
/*
 * ImageMetadata.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ImageMetadata_H_
#define TINY_CPP_CLIENT_ImageMetadata_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ImageSize.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ImageMetadata{
public:

    /*! \brief Constructor.
	 */
    ImageMetadata();
    ImageMetadata(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ImageMetadata();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	ImageSize getImages();

	/*! \brief Set 
	 */
	void setImages(ImageSize images);
	/*! \brief Get Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.
	 */
	std::string getItemType();

	/*! \brief Set Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.
	 */
	void setItemType(std::string item_type);
	/*! \brief Get 
	 */
	std::string getLink();

	/*! \brief Set 
	 */
	void setLink(std::string link);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string title);


    private:
    std::string description{};
    ImageSize images;
    std::string item_type{};
    std::string link{};
    std::string title{};
};
}

#endif /* TINY_CPP_CLIENT_ImageMetadata_H_ */
