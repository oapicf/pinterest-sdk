#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/media.h"
#include "../model/media_list_200_response.h"
#include "../model/media_upload.h"
#include "../model/media_upload_create.h"
#include "../model/pinterest_lib_error.h"


// Register media upload
//
// Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file's contents as the request's `file` parameter and also include all of the parameters from `upload_parameters`.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
//
media_upload_t*
MediaAPI_mediaCreate(apiClient_t *apiClient, media_upload_create_t *media_upload_create);


// Get media upload details
//
// Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
//
media_t*
MediaAPI_mediaGet(apiClient_t *apiClient, char *media_id);


// List media uploads
//
// List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
//
media_list_200_response_t*
MediaAPI_mediaList(apiClient_t *apiClient, char *bookmark, int *page_size);


