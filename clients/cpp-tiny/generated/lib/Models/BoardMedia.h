
/*
 * BoardMedia.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BoardMedia_H_
#define TINY_CPP_CLIENT_BoardMedia_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BoardMedia{
public:

    /*! \brief Constructor.
	 */
    BoardMedia();
    BoardMedia(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BoardMedia();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Board cover image
	 */
	std::string getImageCoverUrl();

	/*! \brief Set Board cover image
	 */
	void setImageCoverUrl(std::string image_cover_url);
	/*! \brief Get Board pin thumbnail urls.
	 */
	std::list<std::string> getPinThumbnailUrls();

	/*! \brief Set Board pin thumbnail urls.
	 */
	void setPinThumbnailUrls(std::list<std::string> pin_thumbnail_urls);


    private:
    std::string image_cover_url{};
    std::list<std::string> pin_thumbnail_urls;
};
}

#endif /* TINY_CPP_CLIENT_BoardMedia_H_ */
