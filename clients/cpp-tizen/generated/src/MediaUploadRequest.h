/*
 * MediaUploadRequest.h
 *
 * Media upload request
 */

#ifndef _MediaUploadRequest_H_
#define _MediaUploadRequest_H_


#include <string>
#include "MediaUploadType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Media upload request
 *
 *  \ingroup Models
 *
 */

class MediaUploadRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	MediaUploadRequest();
	MediaUploadRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MediaUploadRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	MediaUploadType getMediaType();

	/*! \brief Set 
	 */
	void setMediaType(MediaUploadType  media_type);

private:
	MediaUploadType media_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MediaUploadRequest_H_ */
