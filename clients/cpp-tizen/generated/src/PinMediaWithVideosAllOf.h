/*
 * PinMediaWithVideos_allOf.h
 *
 * 
 */

#ifndef _PinMediaWithVideos_allOf_H_
#define _PinMediaWithVideos_allOf_H_


#include <string>
#include "VideoMetadata.h"
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

class PinMediaWithVideos_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaWithVideos_allOf();
	PinMediaWithVideos_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaWithVideos_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<VideoMetadata> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <VideoMetadata> items);

private:
	std::list <VideoMetadata>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaWithVideos_allOf_H_ */
