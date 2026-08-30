
/*
 * AdPreviewSourceImage.h
 *
 * Ad preview source from an image URL.
 */

#ifndef TINY_CPP_CLIENT_AdPreviewSourceImage_H_
#define TINY_CPP_CLIENT_AdPreviewSourceImage_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Ad preview source from an image URL.
 *
 *  \ingroup Models
 *
 */

class AdPreviewSourceImage{
public:

    /*! \brief Constructor.
	 */
    AdPreviewSourceImage();
    AdPreviewSourceImage(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdPreviewSourceImage();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Image URL.
	 */
	std::string getImageUrl();

	/*! \brief Set Image URL.
	 */
	void setImageUrl(std::string image_url);
	/*! \brief Get Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
	 */
	std::string getPromotionId();

	/*! \brief Set Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
	 */
	void setPromotionId(std::string promotion_id);
	/*! \brief Get Title displayed below ad.
	 */
	std::string getTitle();

	/*! \brief Set Title displayed below ad.
	 */
	void setTitle(std::string title);


    private:
    std::string image_url{};
    std::string promotion_id{};
    std::string title{};
};
}

#endif /* TINY_CPP_CLIENT_AdPreviewSourceImage_H_ */
