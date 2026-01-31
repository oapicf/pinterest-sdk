/*
 * PinMediaSource.h
 *
 * Pin media source that can be an image, video, or a mix of both passed in as a request.
 */

#ifndef _PinMediaSource_H_
#define _PinMediaSource_H_


#include <string>
#include "ContentType.h"
#include "PinMediaSourceImageBase64.h"
#include "PinMediaSourceImageURL.h"
#include "PinMediaSourceImagesBase64.h"
#include "PinMediaSourceImagesURL.h"
#include "PinMediaSourceImagesURLItem.h"
#include "PinMediaSourcePinURL.h"
#include "PinMediaSourceVideoID.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Pin media source that can be an image, video, or a mix of both passed in as a request.
 *
 *  \ingroup Models
 *
 */

class PinMediaSource : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaSource();
	PinMediaSource(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaSource();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ContentType getContentType();

	/*! \brief Set 
	 */
	void setContentType(ContentType  content_type);
	/*! \brief Get 
	 */
	std::string getData();

	/*! \brief Set 
	 */
	void setData(std::string  data);
	/*! \brief Get Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	 */
	bool getIsStandard();

	/*! \brief Set Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	 */
	void setIsStandard(bool  is_standard);
	/*! \brief Get 
	 */
	std::string getSourceType();

	/*! \brief Set 
	 */
	void setSourceType(std::string  source_type);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);
	/*! \brief Get Content type for cover image Base64.
	 */
	ContentType getCoverImageContentType();

	/*! \brief Set Content type for cover image Base64.
	 */
	void setCoverImageContentType(ContentType  cover_image_content_type);
	/*! \brief Get Cover image Base64.
	 */
	std::string getCoverImageData();

	/*! \brief Set Cover image Base64.
	 */
	void setCoverImageData(std::string  cover_image_data);
	/*! \brief Get Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
	 */
	int getCoverImageKeyFrameTime();

	/*! \brief Set Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
	 */
	void setCoverImageKeyFrameTime(int  cover_image_key_frame_time);
	/*! \brief Get Cover image URL.
	 */
	std::string getCoverImageUrl();

	/*! \brief Set Cover image URL.
	 */
	void setCoverImageUrl(std::string  cover_image_url);
	/*! \brief Get 
	 */
	std::string getMediaId();

	/*! \brief Set 
	 */
	void setMediaId(std::string  media_id);
	/*! \brief Get 
	 */
	int getIndex();

	/*! \brief Set 
	 */
	void setIndex(int  index);
	/*! \brief Get Array with image objects.
	 */
	std::list<PinMediaSourceImagesURLItem> getItems();

	/*! \brief Set Array with image objects.
	 */
	void setItems(std::list <PinMediaSourceImagesURLItem> items);
	/*! \brief Get This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
	 */
	bool getIsAffiliateLink();

	/*! \brief Set This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
	 */
	void setIsAffiliateLink(bool  is_affiliate_link);

private:
	ContentType content_type;
	std::string data;
	bool is_standard;
	std::string source_type;
	std::string url;
	ContentType cover_image_content_type;
	std::string cover_image_data;
	int cover_image_key_frame_time;
	std::string cover_image_url;
	std::string media_id;
	int index;
	std::list <PinMediaSourceImagesURLItem>items;
	bool is_affiliate_link;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaSource_H_ */
