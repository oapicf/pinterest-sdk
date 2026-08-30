/*
 * PinMediaMetadata.h
 *
 * Per-item entry inside &#x60;PinMedia.items&#x60; for mixed image/video pins. Discriminated by &#x60;item_type&#x60;.
 */

#ifndef _PinMediaMetadata_H_
#define _PinMediaMetadata_H_


#include <string>
#include "ImageMetadata.h"
#include "ImageSize.h"
#include "VideoMetadataWithItemType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Per-item entry inside `PinMedia.items` for mixed image/video pins. Discriminated by `item_type`.
 *
 *  \ingroup Models
 *
 */

class PinMediaMetadata : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaMetadata();
	PinMediaMetadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaMetadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	ImageSize getImages();

	/*! \brief Set 
	 */
	void setImages(ImageSize  images);
	/*! \brief Get Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
	 */
	std::string getItemType();

	/*! \brief Set Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
	 */
	void setItemType(std::string  item_type);
	/*! \brief Get 
	 */
	std::string getLink();

	/*! \brief Set 
	 */
	void setLink(std::string  link);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
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

private:
	std::string description;
	ImageSize images;
	std::string item_type;
	std::string link;
	std::string title;
	std::string cover_image_url;
	long long duration;
	int height;
	std::string video_url;
	std::string video_url_hls;
	int width;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaMetadata_H_ */
