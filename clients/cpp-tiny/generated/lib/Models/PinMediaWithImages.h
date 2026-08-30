
/*
 * PinMediaWithImages.h
 *
 * Pin with multiple images.
 */

#ifndef TINY_CPP_CLIENT_PinMediaWithImages_H_
#define TINY_CPP_CLIENT_PinMediaWithImages_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ImageMetadata.h"
#include <list>

namespace Tiny {


/*! \brief Pin with multiple images.
 *
 *  \ingroup Models
 *
 */

class PinMediaWithImages{
public:

    /*! \brief Constructor.
	 */
    PinMediaWithImages();
    PinMediaWithImages(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinMediaWithImages();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<ImageMetadata> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<ImageMetadata> items);
	/*! \brief Get 
	 */
	std::string getMediaType();

	/*! \brief Set 
	 */
	void setMediaType(std::string media_type);


    private:
    std::list<ImageMetadata> items;
    std::string media_type{};
};
}

#endif /* TINY_CPP_CLIENT_PinMediaWithImages_H_ */
