/*
 * PinMedia.h
 *
 * Pin media that can be an image, video, or a mix of both.
 */

#ifndef _PinMedia_H_
#define _PinMedia_H_


#include <string>
#include "ImageSize.h"
#include "PinMediaMetadata.h"
#include "PinMediaWithImage.h"
#include "PinMediaWithImageAndVideo.h"
#include "PinMediaWithImages.h"
#include "PinMediaWithVideo.h"
#include "PinMediaWithVideos.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Pin media that can be an image, video, or a mix of both.
 *
 *  \ingroup Models
 *
 */

class PinMedia : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMedia();
	PinMedia(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMedia();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get 
	 */
	std::string getCoverImageUrl();

	/*! \brief Set 
	 */
	void setCoverImageUrl(std::string  cover_image_url);
	/*! \brief Get Duration (in miliseconds). Field maybe null after creation due to video processing time.
	 */
	long long getDuration();

	/*! \brief Set Duration (in miliseconds). Field maybe null after creation due to video processing time.
	 */
	void setDuration(long long  duration);
	/*! \brief Get Height (in pixels). Field maybe null after creation due to video processing time.
	 */
	int getHeight();

	/*! \brief Set Height (in pixels). Field maybe null after creation due to video processing time.
	 */
	void setHeight(int  height);
	/*! \brief Get Video url (720p).  **Note:** This field is limited and not available to all apps.
	 */
	std::string getVideoUrl();

	/*! \brief Set Video url (720p).  **Note:** This field is limited and not available to all apps.
	 */
	void setVideoUrl(std::string  video_url);
	/*! \brief Get Video url (HLS).  **Note:** This field is limited and not available to all apps.
	 */
	std::string getVideoUrlHls();

	/*! \brief Set Video url (HLS).  **Note:** This field is limited and not available to all apps.
	 */
	void setVideoUrlHls(std::string  video_url_hls);
	/*! \brief Get Width (in pixels). Field maybe null after creation due to video processing time.
	 */
	int getWidth();

	/*! \brief Set Width (in pixels). Field maybe null after creation due to video processing time.
	 */
	void setWidth(int  width);
	/*! \brief Get 
	 */
	std::list<PinMediaMetadata> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <PinMediaMetadata> items);

private:
	ImageSize images;
	std::string media_type;
	std::string cover_image_url;
	long long duration;
	int height;
	std::string video_url;
	std::string video_url_hls;
	int width;
	std::list <PinMediaMetadata>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMedia_H_ */
