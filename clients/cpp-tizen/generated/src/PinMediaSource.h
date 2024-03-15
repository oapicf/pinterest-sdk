/*
 * PinMediaSource.h
 *
 * Pin media source.
 */

#ifndef _PinMediaSource_H_
#define _PinMediaSource_H_


#include <string>
#include "PinMediaSourceImageBase64.h"
#include "PinMediaSourceImageURL.h"
#include "PinMediaSourceImagesBase64.h"
#include "PinMediaSourceImagesURL.h"
#include "PinMediaSourceImagesURL_items_inner.h"
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


/*! \brief Pin media source.
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
	std::string getSourceType();

	/*! \brief Set 
	 */
	void setSourceType(std::string  source_type);
	/*! \brief Get 
	 */
	std::string getContentType();

	/*! \brief Set 
	 */
	void setContentType(std::string  content_type);
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
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);
	/*! \brief Get Cover image url.
	 */
	std::string getCoverImageUrl();

	/*! \brief Set Cover image url.
	 */
	void setCoverImageUrl(std::string  cover_image_url);
	/*! \brief Get Content type for cover image Base64.
	 */
	std::string getCoverImageContentType();

	/*! \brief Set Content type for cover image Base64.
	 */
	void setCoverImageContentType(std::string  cover_image_content_type);
	/*! \brief Get Cover image Base64.
	 */
	std::string getCoverImageData();

	/*! \brief Set Cover image Base64.
	 */
	void setCoverImageData(std::string  cover_image_data);
	/*! \brief Get 
	 */
	std::string getMediaId();

	/*! \brief Set 
	 */
	void setMediaId(std::string  media_id);
	/*! \brief Get Array with image objects.
	 */
	std::list<PinMediaSourceImagesURL_items_inner> getItems();

	/*! \brief Set Array with image objects.
	 */
	void setItems(std::list <PinMediaSourceImagesURL_items_inner> items);
	/*! \brief Get 
	 */
	int getIndex();

	/*! \brief Set 
	 */
	void setIndex(int  index);
	/*! \brief Get This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
	 */
	bool getIsAffiliateLink();

	/*! \brief Set This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
	 */
	void setIsAffiliateLink(bool  is_affiliate_link);

private:
	std::string source_type;
	std::string content_type;
	std::string data;
	bool is_standard;
	std::string url;
	std::string cover_image_url;
	std::string cover_image_content_type;
	std::string cover_image_data;
	std::string media_id;
	std::list <PinMediaSourceImagesURL_items_inner>items;
	int index;
	bool is_affiliate_link;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaSource_H_ */
