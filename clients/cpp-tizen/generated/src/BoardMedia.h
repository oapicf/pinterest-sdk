/*
 * BoardMedia.h
 *
 * 
 */

#ifndef _BoardMedia_H_
#define _BoardMedia_H_


#include <string>
#include <list>
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

class BoardMedia : public Object {
public:
	/*! \brief Constructor.
	 */
	BoardMedia();
	BoardMedia(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BoardMedia();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Board cover image
	 */
	std::string getImageCoverUrl();

	/*! \brief Set Board cover image
	 */
	void setImageCoverUrl(std::string  image_cover_url);
	/*! \brief Get Board pin thumbnail urls.
	 */
	std::list<std::string> getPinThumbnailUrls();

	/*! \brief Set Board pin thumbnail urls.
	 */
	void setPinThumbnailUrls(std::list <std::string> pin_thumbnail_urls);

private:
	std::string image_cover_url;
	std::list <std::string>pin_thumbnail_urls;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BoardMedia_H_ */
