
/*
 * VideoMetadataWithItemType.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_VideoMetadataWithItemType_H_
#define TINY_CPP_CLIENT_VideoMetadataWithItemType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class VideoMetadataWithItemType{
public:

    /*! \brief Constructor.
	 */
    VideoMetadataWithItemType();
    VideoMetadataWithItemType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VideoMetadataWithItemType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getCoverImageUrl();

	/*! \brief Set 
	 */
	void setCoverImageUrl(std::string cover_image_url);
	/*! \brief Get Duration (in miliseconds). Field maybe null after creation due to video processing time.
	 */
	long getDuration();

	/*! \brief Set Duration (in miliseconds). Field maybe null after creation due to video processing time.
	 */
	void setDuration(long duration);
	/*! \brief Get Height (in pixels). Field maybe null after creation due to video processing time.
	 */
	int getHeight();

	/*! \brief Set Height (in pixels). Field maybe null after creation due to video processing time.
	 */
	void setHeight(int height);
	/*! \brief Get Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
	 */
	std::string getItemType();

	/*! \brief Set Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
	 */
	void setItemType(std::string item_type);
	/*! \brief Get Video url (720p).  **Note:** This field is limited and not available to all apps.
	 */
	std::string getVideoUrl();

	/*! \brief Set Video url (720p).  **Note:** This field is limited and not available to all apps.
	 */
	void setVideoUrl(std::string video_url);
	/*! \brief Get Video url (HLS).  **Note:** This field is limited and not available to all apps.
	 */
	std::string getVideoUrlHls();

	/*! \brief Set Video url (HLS).  **Note:** This field is limited and not available to all apps.
	 */
	void setVideoUrlHls(std::string video_url_hls);
	/*! \brief Get Width (in pixels). Field maybe null after creation due to video processing time.
	 */
	int getWidth();

	/*! \brief Set Width (in pixels). Field maybe null after creation due to video processing time.
	 */
	void setWidth(int width);


    private:
    std::string cover_image_url{};
    long duration{};
    int height{};
    std::string item_type{};
    std::string video_url{};
    std::string video_url_hls{};
    int width{};
};
}

#endif /* TINY_CPP_CLIENT_VideoMetadataWithItemType_H_ */
