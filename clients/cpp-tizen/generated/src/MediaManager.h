#ifndef _MediaManager_H_
#define _MediaManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"
#include "MediaUpload.h"
#include "MediaUploadDetails.h"
#include "MediaUploadRequest.h"
#include "Media_list_200_response.h"
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
 * Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
 * \param mediaUploadRequest Create a media upload request *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool mediaCreateSync(char * accessToken,
	std::shared_ptr<MediaUploadRequest> mediaUploadRequest, 
	void(* handler)(MediaUpload, Error, void* )
	, void* userData);

/*! \brief Register media upload. *Asynchronous*
 *
 * Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
 * \param mediaUploadRequest Create a media upload request *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool mediaCreateAsync(char * accessToken,
	std::shared_ptr<MediaUploadRequest> mediaUploadRequest, 
	void(* handler)(MediaUpload, Error, void* )
	, void* userData);


/*! \brief Get media upload details. *Synchronous*
 *
 * Get details for a registered media upload, including its current status.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
 * \param mediaId Media identifier *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool mediaGetSync(char * accessToken,
	std::string mediaId, 
	void(* handler)(MediaUploadDetails, Error, void* )
	, void* userData);

/*! \brief Get media upload details. *Asynchronous*
 *
 * Get details for a registered media upload, including its current status.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
 * \param mediaId Media identifier *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool mediaGetAsync(char * accessToken,
	std::string mediaId, 
	void(* handler)(MediaUploadDetails, Error, void* )
	, void* userData);


/*! \brief List media uploads. *Synchronous*
 *
 * List media uploads filtered by given parameters.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
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
 * List media uploads filtered by given parameters.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
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
