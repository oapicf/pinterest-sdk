/*
 * PinMediaWithVideos.h
 *
 * Pin with multiple videos.
 */

#ifndef _PinMediaWithVideos_H_
#define _PinMediaWithVideos_H_


#include <string>
#include "PinMedia.h"
#include "VideoMetadata.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Pin with multiple videos.
 *
 *  \ingroup Models
 *
 */

class PinMediaWithVideos : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaWithVideos();
	PinMediaWithVideos(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaWithVideos();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getMediaType();

	/*! \brief Set 
	 */
	void setMediaType(std::string  media_type);
	/*! \brief Get 
	 */
	std::list<VideoMetadata> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <VideoMetadata> items);

private:
	std::string media_type;
	std::list <VideoMetadata>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaWithVideos_H_ */
