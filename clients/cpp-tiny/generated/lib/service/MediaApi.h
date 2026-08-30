#ifndef TINY_CPP_CLIENT_MediaApi_H_
#define TINY_CPP_CLIENT_MediaApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Media.h"
#include "MediaUpload.h"
#include "MediaUploadCreate.h"
#include "Media_list_200_response.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class MediaApi : public Service {
public:
    MediaApi() = default;

    virtual ~MediaApi();

    /**
    * Register media upload.
    *
    * Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file's contents as the request's `file` parameter and also include all of the parameters from `upload_parameters`.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
    * \param mediaUploadCreate  *Required*
    */
    Response<
                MediaUpload
        >
    media_create(
            
            MediaUploadCreate mediaUploadCreate
            
    );
    /**
    * Get media upload details.
    *
    * Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
    * \param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation. *Required*
    */
    Response<
                Media
        >
    media_get(
            
            std::string mediaId
            
    );
    /**
    * List media uploads.
    *
    * List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Media_list_200_response
        >
    media_list(
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_MediaApi_H_ */