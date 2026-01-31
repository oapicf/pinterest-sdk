/*
 * MediaUploadCreate.h
 *
 * Resource create operation model.
 */

#ifndef _MediaUploadCreate_H_
#define _MediaUploadCreate_H_


#include <string>
#include "MediaUploadType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class MediaUploadCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	MediaUploadCreate();
	MediaUploadCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MediaUploadCreate();

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

#endif /* _MediaUploadCreate_H_ */
