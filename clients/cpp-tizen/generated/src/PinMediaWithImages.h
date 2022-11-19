/*
 * PinMediaWithImages.h
 *
 * Pin with multiple images.
 */

#ifndef _PinMediaWithImages_H_
#define _PinMediaWithImages_H_


#include <string>
#include "ImageMetadata.h"
#include "PinMedia.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Pin with multiple images.
 *
 *  \ingroup Models
 *
 */

class PinMediaWithImages : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaWithImages();
	PinMediaWithImages(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaWithImages();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<ImageMetadata> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <ImageMetadata> items);
	/*! \brief Get 
	 */
	std::string getMediaType();

	/*! \brief Set 
	 */
	void setMediaType(std::string  media_type);

private:
	std::list <ImageMetadata>items;
	std::string media_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaWithImages_H_ */
