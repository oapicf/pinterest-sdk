/*
 * Pin_media_source.h
 *
 * 
 */

#ifndef _Pin_media_source_H_
#define _Pin_media_source_H_


#include <string>
#include "PinMediaSource.h"
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

class Pin_media_source : public Object {
public:
	/*! \brief Constructor.
	 */
	Pin_media_source();
	Pin_media_source(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Pin_media_source();

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

#endif /* _Pin_media_source_H_ */
