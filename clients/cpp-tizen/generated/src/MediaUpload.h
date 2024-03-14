/*
 * MediaUpload.h
 *
 * Media upload that has been registered but not uploaded/processed yet.
 */

#ifndef _MediaUpload_H_
#define _MediaUpload_H_


#include <string>
#include "MediaUploadType.h"
#include "MediaUpload_allOf_upload_parameters.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Media upload that has been registered but not uploaded/processed yet.
 *
 *  \ingroup Models
 *
 */

class MediaUpload : public Object {
public:
	/*! \brief Constructor.
	 */
	MediaUpload();
	MediaUpload(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MediaUpload();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
	 */
	std::string getMediaId();

	/*! \brief Set Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
	 */
	void setMediaId(std::string  media_id);
	/*! \brief Get 
	 */
	MediaUploadType getMediaType();

	/*! \brief Set 
	 */
	void setMediaType(MediaUploadType  media_type);
	/*! \brief Get The URL where you will POST your media file.
	 */
	std::string getUploadUrl();

	/*! \brief Set The URL where you will POST your media file.
	 */
	void setUploadUrl(std::string  upload_url);
	/*! \brief Get 
	 */
	MediaUpload_allOf_upload_parameters getUploadParameters();

	/*! \brief Set 
	 */
	void setUploadParameters(MediaUpload_allOf_upload_parameters  upload_parameters);

private:
	std::string media_id;
	MediaUploadType media_type;
	std::string upload_url;
	MediaUpload_allOf_upload_parameters upload_parameters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MediaUpload_H_ */
