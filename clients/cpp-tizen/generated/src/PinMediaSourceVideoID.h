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
	std::string cover_image_url;
	std::string media_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaSourceVideoID_H_ */
