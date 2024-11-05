/*
 * PinMediaWithVideo.h
 *
 * Pin with video.
 */

#ifndef _PinMediaWithVideo_H_
#define _PinMediaWithVideo_H_


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


/*! \brief Pin with video.
 *
 *  \ingroup Models
 *
 */

class PinMediaWithVideo : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaWithVideo();
	PinMediaWithVideo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaWithVideo();

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
	/*! \brief Get 
	 */
	std::string getCoverImageUrl();

	/*! \brief Set 
	 */
	void setCoverImageUrl(std::string  cover_image_url);
	/*! \brief Get Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
	 */
	std::string getVideoUrl();

	/*! \brief Set Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
	 */
	void setVideoUrl(std::string  video_url);
	/*! \brief Get Duration (in milliseconds)
	 */
	long long getDuration();

	/*! \brief Set Duration (in milliseconds)
	 */
	void setDuration(long long  duration);
	/*! \brief Get Height (in pixels)
	 */
	int getHeight();

	/*! \brief Set Height (in pixels)
	 */
	void setHeight(int  height);
	/*! \brief Get Width (in pixels)
	 */
	int getWidth();

	/*! \brief Set Width (in pixels)
	 */
	void setWidth(int  width);

private:
	std::string media_type;
	PinMediaWithImage_allOf_images images;
	std::string cover_image_url;
	std::string video_url;
	long long duration;
	int height;
	int width;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaWithVideo_H_ */
