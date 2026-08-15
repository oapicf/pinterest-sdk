
/*
 * Media.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Media_H_
#define TINY_CPP_CLIENT_Media_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MediaUploadStatus.h"
#include "MediaUploadType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Media{
public:

    /*! \brief Constructor.
	 */
    Media();
    Media(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Media();


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
    std::string media_id{};
    MediaUploadType media_type;
    MediaUploadStatus status;
};
}

#endif /* TINY_CPP_CLIENT_Media_H_ */
