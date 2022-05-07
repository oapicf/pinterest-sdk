/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Register media upload
* Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.
*
* mediaUploadRequest MediaUploadRequest Create a media upload request
* returns MediaUpload
* */
const media/create = ({ mediaUploadRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        mediaUploadRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get media upload details
* Get details for a registered media upload, including its current status.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.
*
* mediaUnderscoreid String Media identifier
* returns MediaUploadDetails
* */
const media/get = ({ mediaUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        mediaUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List media uploads
* List media uploads filtered by given parameters.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.
*
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)
* returns Paginated
* */
const media/list = ({ bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        bookmark,
        pageUnderscoresize,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  media/create,
  media/get,
  media/list,
};
