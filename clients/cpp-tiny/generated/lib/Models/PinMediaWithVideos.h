
/*
 * PinMediaWithVideos.h
 *
 * Pin with multiple videos.
 */

#ifndef TINY_CPP_CLIENT_PinMediaWithVideos_H_
#define TINY_CPP_CLIENT_PinMediaWithVideos_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "VideoMetadataWithItemType.h"
#include <list>

namespace Tiny {


/*! \brief Pin with multiple videos.
 *
 *  \ingroup Models
 *
 */

class PinMediaWithVideos{
public:

    /*! \brief Constructor.
	 */
    PinMediaWithVideos();
    PinMediaWithVideos(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinMediaWithVideos();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<VideoMetadataWithItemType> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <VideoMetadataWithItemType> items);
	/*! \brief Get 
	 */
	std::string getMediaType();

	/*! \brief Set 
	 */
	void setMediaType(std::string  media_type);


    private:
    std::list<VideoMetadataWithItemType> items;
    std::string media_type{};
};
}

#endif /* TINY_CPP_CLIENT_PinMediaWithVideos_H_ */
