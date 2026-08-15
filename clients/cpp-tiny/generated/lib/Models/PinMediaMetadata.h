
/*
 * PinMediaMetadata.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PinMediaMetadata_H_
#define TINY_CPP_CLIENT_PinMediaMetadata_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ImageMetadata.h"
#include "ImageSize.h"
#include "VideoMetadataWithItemType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PinMediaMetadata{
public:

    /*! \brief Constructor.
	 */
    PinMediaMetadata();
    PinMediaMetadata(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinMediaMetadata();


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
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	ImageSize getImages();

	/*! \brief Set 
	 */
	void setImages(ImageSize  images);
	/*! \brief Get 
	 */
	std::string getItemType();

	/*! \brief Set 
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


    private:
    std::string description{};
    ImageSize images;
    std::string item_type{};
    std::string link{};
    std::string title{};
    std::string cover_image_url{};
    long duration{};
    int height{};
    std::string video_url{};
    int width{};
};
}

#endif /* TINY_CPP_CLIENT_PinMediaMetadata_H_ */
