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
#include "PinMediaSourceVideoID.h"
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
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);
	/*! \brief Get 
	 */
	std::string getCoverImageUrl();

	/*! \brief Set 
	 */
	void setCoverImageUrl(std::string  cover_image_url);
	/*! \brief Get 
	 */
	std::string getMediaId();

	/*! \brief Set 
	 */
	void setMediaId(std::string  media_id);

private:
	std::string source_type;
	std::string content_type;
	std::string data;
	std::string url;
	std::string cover_image_url;
	std::string media_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaSource_H_ */
