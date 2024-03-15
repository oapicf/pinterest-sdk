/*
 * PinMediaMetadata.h
 *
 * 
 */

#ifndef _PinMediaMetadata_H_
#define _PinMediaMetadata_H_


#include <string>
#include "ImageMetadata.h"
#include "ImageMetadata_images.h"
#include "VideoMetadata.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
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
	std::string getItemType();

	/*! \brief Set 
	 */
	void setItemType(std::string  item_type);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	std::string getLink();

	/*! \brief Set 
	 */
	void setLink(std::string  link);
	/*! \brief Get 
	 */
	ImageMetadata_images getImages();

	/*! \brief Set 
	 */
	void setImages(ImageMetadata_images  images);
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
	std::string item_type;
	std::string title;
	std::string description;
	std::string link;
	ImageMetadata_images images;
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

#endif /* _PinMediaMetadata_H_ */
