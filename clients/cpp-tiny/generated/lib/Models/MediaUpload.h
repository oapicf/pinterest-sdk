
/*
 * MediaUpload.h
 *
 * Media upload that has been registered but not uploaded/processed yet.
 */

#ifndef TINY_CPP_CLIENT_MediaUpload_H_
#define TINY_CPP_CLIENT_MediaUpload_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MediaUploadParameters.h"
#include "MediaUploadType.h"

namespace Tiny {


/*! \brief Media upload that has been registered but not uploaded/processed yet.
 *
 *  \ingroup Models
 *
 */

class MediaUpload{
public:

    /*! \brief Constructor.
	 */
    MediaUpload();
    MediaUpload(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MediaUpload();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
	 */
	std::string getMediaId();

	/*! \brief Set Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
	 */
	void setMediaId(std::string media_id);
	/*! \brief Get 
	 */
	MediaUploadType getMediaType();

	/*! \brief Set 
	 */
	void setMediaType(MediaUploadType media_type);
	/*! \brief Get The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
	 */
	MediaUploadParameters getUploadParameters();

	/*! \brief Set The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
	 */
	void setUploadParameters(MediaUploadParameters upload_parameters);
	/*! \brief Get The URL where you will POST your media file.
	 */
	std::string getUploadUrl();

	/*! \brief Set The URL where you will POST your media file.
	 */
	void setUploadUrl(std::string upload_url);


    private:
    std::string media_id{};
    MediaUploadType media_type;
    MediaUploadParameters upload_parameters;
    std::string upload_url{};
};
}

#endif /* TINY_CPP_CLIENT_MediaUpload_H_ */
