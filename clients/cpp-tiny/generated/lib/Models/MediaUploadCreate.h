
/*
 * MediaUploadCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_MediaUploadCreate_H_
#define TINY_CPP_CLIENT_MediaUploadCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MediaUploadType.h"

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class MediaUploadCreate{
public:

    /*! \brief Constructor.
	 */
    MediaUploadCreate();
    MediaUploadCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MediaUploadCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	MediaUploadType getMediaType();

	/*! \brief Set 
	 */
	void setMediaType(MediaUploadType  media_type);


    private:
    MediaUploadType media_type;
};
}

#endif /* TINY_CPP_CLIENT_MediaUploadCreate_H_ */
