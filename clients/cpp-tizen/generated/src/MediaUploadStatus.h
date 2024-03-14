/*
 * MediaUploadStatus.h
 *
 * Media upload status
 */

#ifndef _MediaUploadStatus_H_
#define _MediaUploadStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Media upload status
 *
 *  \ingroup Models
 *
 */

class MediaUploadStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	MediaUploadStatus();
	MediaUploadStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MediaUploadStatus();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _MediaUploadStatus_H_ */
