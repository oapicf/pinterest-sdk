#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/error.h"
#include "../model/media_list_200_response.h"
#include "../model/media_upload.h"
#include "../model/media_upload_details.h"
#include "../model/media_upload_request.h"


// Register media upload
//
// Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
//
media_upload_t*
MediaAPI_mediaCreate(apiClient_t *apiClient, media_upload_request_t *media_upload_request);


// Get media upload details
//
// Get details for a registered media upload, including its current status.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
//
media_upload_details_t*
MediaAPI_mediaGet(apiClient_t *apiClient, char *media_id);


// List media uploads
//
// List media uploads filtered by given parameters.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
//
media_list_200_response_t*
MediaAPI_mediaList(apiClient_t *apiClient, char *bookmark, int *page_size);


