/*
 * PinMediaSourceVideoID.h
 *
 * Video ID-based media source
 */

#ifndef _PinMediaSourceVideoID_H_
#define _PinMediaSourceVideoID_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Video ID-based media source
 *
 *  \ingroup Models
 *
 */

class PinMediaSourceVideoID : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaSourceVideoID();
	PinMediaSourceVideoID(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaSourceVideoID();

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
	/*! \brief Get Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	 */
	bool getIsStandard();

	/*! \brief Set Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	 */
	void setIsStandard(bool  is_standard);

private:
	std::string source_type;
	std::string cover_image_url;
	std::string cover_image_content_type;
	std::string cover_image_data;
	std::string media_id;
	bool is_standard;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaSourceVideoID_H_ */
