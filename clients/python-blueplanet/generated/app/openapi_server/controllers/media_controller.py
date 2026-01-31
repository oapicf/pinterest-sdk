import connexion

from app.openapi_server.models.media import Media  # noqa: E501
from app.openapi_server.models.media_list200_response import MediaList200Response  # noqa: E501
from app.openapi_server.models.media_upload import MediaUpload  # noqa: E501
from app.openapi_server.models.media_upload_create import MediaUploadCreate  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server import util


def media_create(body):  # noqa: E501
    """Register media upload

    Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &#x60;curl&#x60;, for example) to &#x60;upload_url&#x60; using the &#x60;Content-Type&#x60; header value. Send the media file&#39;s contents as the request&#39;s &#x60;file&#x60; parameter and also include all of the parameters from &#x60;upload_parameters&#x60;.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation. # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: MediaUpload
    """
    if connexion.request.is_json:
        body = MediaUploadCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def media_get(media_id):  # noqa: E501
    """Get media upload details

    Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation. # noqa: E501

    :param media_id: Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
    :type media_id: str

    :rtype: Media
    """
    return 'do some magic!'


def media_list(bookmark=None, page_size=None):  # noqa: E501
    """List media uploads

    List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation. # noqa: E501

    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: MediaList200Response
    """
    return 'do some magic!'
