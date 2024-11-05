/*
 * PinMediaWithImage.h
 *
 * Pin with image.
 */

#ifndef _PinMediaWithImage_H_
#define _PinMediaWithImage_H_


#include <string>
#include "PinMedia.h"
#include "PinMediaWithImage_allOf_images.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Pin with image.
 *
 *  \ingroup Models
 *
 */

class PinMediaWithImage : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaWithImage();
	PinMediaWithImage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaWithImage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getMediaType();

	/*! \brief Set 
	 */
	void setMediaType(std::string  media_type);
	/*! \brief Get 
	 */
	PinMediaWithImage_allOf_images getImages();

	/*! \brief Set 
	 */
	void setImages(PinMediaWithImage_allOf_images  images);

private:
	std::string media_type;
	PinMediaWithImage_allOf_images images;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaWithImage_H_ */
