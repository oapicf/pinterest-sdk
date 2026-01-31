/*
 * Media.h
 *
 * 
 */

#ifndef _Media_H_
#define _Media_H_


#include <string>
#include "MediaUploadStatus.h"
#include "MediaUploadType.h"
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

class Media : public Object {
public:
	/*! \brief Constructor.
	 */
	Media();
	Media(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Media();

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
	/*! \brief Get 
	 */
	MediaUploadStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(MediaUploadStatus  status);

private:
	std::string media_id;
	MediaUploadType media_type;
	MediaUploadStatus status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Media_H_ */
