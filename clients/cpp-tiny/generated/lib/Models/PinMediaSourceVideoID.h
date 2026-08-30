
/*
 * PinMediaSourceVideoID.h
 *
 * Video ID-based media source.
 */

#ifndef TINY_CPP_CLIENT_PinMediaSourceVideoID_H_
#define TINY_CPP_CLIENT_PinMediaSourceVideoID_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ContentType.h"

namespace Tiny {


/*! \brief Video ID-based media source.
 *
 *  \ingroup Models
 *
 */

class PinMediaSourceVideoID{
public:

    /*! \brief Constructor.
	 */
    PinMediaSourceVideoID();
    PinMediaSourceVideoID(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinMediaSourceVideoID();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Content type for cover image Base64.
	 */
	ContentType getCoverImageContentType();

	/*! \brief Set Content type for cover image Base64.
	 */
	void setCoverImageContentType(ContentType cover_image_content_type);
	/*! \brief Get Cover image Base64.
	 */
	std::string getCoverImageData();

	/*! \brief Set Cover image Base64.
	 */
	void setCoverImageData(std::string cover_image_data);
	/*! \brief Get Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
	 */
	int getCoverImageKeyFrameTime();

	/*! \brief Set Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
	 */
	void setCoverImageKeyFrameTime(int cover_image_key_frame_time);
	/*! \brief Get Cover image URL.
	 */
	std::string getCoverImageUrl();

	/*! \brief Set Cover image URL.
	 */
	void setCoverImageUrl(std::string cover_image_url);
	/*! \brief Get Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	 */
	bool isIsStandard();

	/*! \brief Set Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	 */
	void setIsStandard(bool is_standard);
	/*! \brief Get 
	 */
	std::string getMediaId();

	/*! \brief Set 
	 */
	void setMediaId(std::string media_id);
	/*! \brief Get 
	 */
	std::string getSourceType();

	/*! \brief Set 
	 */
	void setSourceType(std::string source_type);


    private:
    ContentType cover_image_content_type;
    std::string cover_image_data{};
    int cover_image_key_frame_time{};
    std::string cover_image_url{};
    bool is_standard{};
    std::string media_id{};
    std::string source_type{};
};
}

#endif /* TINY_CPP_CLIENT_PinMediaSourceVideoID_H_ */
