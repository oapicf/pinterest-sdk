#ifndef _MediaManager_H_
#define _MediaManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Media.h"
#include "MediaUpload.h"
#include "MediaUploadCreate.h"
#include "Media_list_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Media Media
 * \ingroup Operations
 *  @{
 */
class MediaManager {
public:
	MediaManager();
	virtual ~MediaManager();

/*! \brief Register media upload. *Synchronous*
 *
 * Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file's contents as the request's `file` parameter and also include all of the parameters from `upload_parameters`.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
 * \param mediaUploadCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool mediaCreateSync(char * accessToken,
	std::shared_ptr<MediaUploadCreate> mediaUploadCreate, 
	void(* handler)(MediaUpload, Error, void* )
	, void* userData);

/*! \brief Register media upload. *Asynchronous*
 *
 * Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file's contents as the request's `file` parameter and also include all of the parameters from `upload_parameters`.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
 * \param mediaUploadCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool mediaCreateAsync(char * accessToken,
	std::shared_ptr<MediaUploadCreate> mediaUploadCreate, 
	void(* handler)(MediaUpload, Error, void* )
	, void* userData);


/*! \brief Get media upload details. *Synchronous*
 *
 * Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
 * \param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool mediaGetSync(char * accessToken,
	std::string mediaId, 
	void(* handler)(Media, Error, void* )
	, void* userData);

/*! \brief Get media upload details. *Asynchronous*
 *
 * Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
 * \param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool mediaGetAsync(char * accessToken,
	std::string mediaId, 
	void(* handler)(Media, Error, void* )
	, void* userData);


/*! \brief List media uploads. *Synchronous*
 *
 * List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool mediaListSync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Media_list_200_response, Error, void* )
	, void* userData);

/*! \brief List media uploads. *Asynchronous*
 *
 * List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool mediaListAsync(char * accessToken,
	std::string bookmark, int pageSize, 
	void(* handler)(Media_list_200_response, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* MediaManager_H_ */
