/*
 * AdPreviewSourceImage.h
 *
 * Ad preview source from an image URL.
 */

#ifndef _AdPreviewSourceImage_H_
#define _AdPreviewSourceImage_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ad preview source from an image URL.
 *
 *  \ingroup Models
 *
 */

class AdPreviewSourceImage : public Object {
public:
	/*! \brief Constructor.
	 */
	AdPreviewSourceImage();
	AdPreviewSourceImage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdPreviewSourceImage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Image URL.
	 */
	std::string getImageUrl();

	/*! \brief Set Image URL.
	 */
	void setImageUrl(std::string  image_url);
	/*! \brief Get Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
	 */
	std::string getPromotionId();

	/*! \brief Set Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
	 */
	void setPromotionId(std::string  promotion_id);
	/*! \brief Get Title displayed below ad.
	 */
	std::string getTitle();

	/*! \brief Set Title displayed below ad.
	 */
	void setTitle(std::string  title);

private:
	std::string image_url;
	std::string promotion_id;
	std::string title;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdPreviewSourceImage_H_ */
