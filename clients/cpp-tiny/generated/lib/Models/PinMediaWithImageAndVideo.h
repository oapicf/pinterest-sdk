
/*
 * PinMediaWithImageAndVideo.h
 *
 * Pin with a mix of images and videos.
 */

#ifndef TINY_CPP_CLIENT_PinMediaWithImageAndVideo_H_
#define TINY_CPP_CLIENT_PinMediaWithImageAndVideo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PinMediaMetadata.h"
#include <list>

namespace Tiny {


/*! \brief Pin with a mix of images and videos.
 *
 *  \ingroup Models
 *
 */

class PinMediaWithImageAndVideo{
public:

    /*! \brief Constructor.
	 */
    PinMediaWithImageAndVideo();
    PinMediaWithImageAndVideo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinMediaWithImageAndVideo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<PinMediaMetadata> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<PinMediaMetadata> items);
	/*! \brief Get 
	 */
	std::string getMediaType();

	/*! \brief Set 
	 */
	void setMediaType(std::string media_type);


    private:
    std::list<PinMediaMetadata> items;
    std::string media_type{};
};
}

#endif /* TINY_CPP_CLIENT_PinMediaWithImageAndVideo_H_ */
