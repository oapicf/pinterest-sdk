/*
 * PinMediaWithImageAndVideo.h
 *
 * Pin with a mix of images and videos.
 */

#ifndef _PinMediaWithImageAndVideo_H_
#define _PinMediaWithImageAndVideo_H_


#include <string>
#include "PinMedia.h"
#include "PinMediaMetadata.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Pin with a mix of images and videos.
 *
 *  \ingroup Models
 *
 */

class PinMediaWithImageAndVideo : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaWithImageAndVideo();
	PinMediaWithImageAndVideo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaWithImageAndVideo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<PinMediaMetadata> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <PinMediaMetadata> items);
	/*! \brief Get 
	 */
	std::string getMediaType();

	/*! \brief Set 
	 */
	void setMediaType(std::string  media_type);

private:
	std::list <PinMediaMetadata>items;
	std::string media_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaWithImageAndVideo_H_ */
