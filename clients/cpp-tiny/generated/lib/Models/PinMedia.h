
/*
 * PinMedia.h
 *
 * Pin media that can be an image, video, or a mix of both.
 */

#ifndef TINY_CPP_CLIENT_PinMedia_H_
#define TINY_CPP_CLIENT_PinMedia_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ImageSize.h"
#include "PinMediaMetadata.h"
#include "PinMediaWithImage.h"
#include "PinMediaWithImageAndVideo.h"
#include "PinMediaWithImages.h"
#include "PinMediaWithVideo.h"
#include "PinMediaWithVideos.h"
#include <list>

namespace Tiny {


/*! \brief Pin media that can be an image, video, or a mix of both.
 *
 *  \ingroup Models
 *
 */

class PinMedia{
public:

    /*! \brief Constructor.
	 */
    PinMedia();
    PinMedia(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinMedia();


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
	/*! \brief Get 
	 */
	std::string getCoverImageUrl();

	/*! \brief Set 
	 */
	void setCoverImageUrl(std::string  cover_image_url);
	/*! \brief Get Duration (in miliseconds). Field maybe null after creation due to video processing time.
	 */
	long getDuration();

	/*! \brief Set Duration (in miliseconds). Field maybe null after creation due to video processing time.
	 */
	void setDuration(long  duration);
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
    std::string media_type{};
    std::string cover_image_url{};
    long duration{};
    int height{};
    std::string video_url{};
    int width{};
    std::list<PinMediaMetadata> items;
};
}

#endif /* TINY_CPP_CLIENT_PinMedia_H_ */
