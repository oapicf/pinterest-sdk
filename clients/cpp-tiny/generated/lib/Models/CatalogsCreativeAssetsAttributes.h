
/*
 * CatalogsCreativeAssetsAttributes.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreativeAssetsAttributes_H_
#define TINY_CPP_CLIENT_CatalogsCreativeAssetsAttributes_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsAttributes{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreativeAssetsAttributes();
    CatalogsCreativeAssetsAttributes(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreativeAssetsAttributes();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Link to the creative assets page.
	 */
	std::string getAndroidDeepLink();

	/*! \brief Set Link to the creative assets page.
	 */
	void setAndroidDeepLink(std::string  android_deep_link);
	/*! \brief Get Custom grouping of creative assets.
	 */
	std::string getCustomLabel0();

	/*! \brief Set Custom grouping of creative assets.
	 */
	void setCustomLabel0(std::string  custom_label_0);
	/*! \brief Get Custom grouping of creative assets.
	 */
	std::string getCustomLabel1();

	/*! \brief Set Custom grouping of creative assets.
	 */
	void setCustomLabel1(std::string  custom_label_1);
	/*! \brief Get Custom grouping of creative assets.
	 */
	std::string getCustomLabel2();

	/*! \brief Set Custom grouping of creative assets.
	 */
	void setCustomLabel2(std::string  custom_label_2);
	/*! \brief Get Custom grouping of creative assets.
	 */
	std::string getCustomLabel3();

	/*! \brief Set Custom grouping of creative assets.
	 */
	void setCustomLabel3(std::string  custom_label_3);
	/*! \brief Get Custom grouping of creative assets.
	 */
	std::string getCustomLabel4();

	/*! \brief Set Custom grouping of creative assets.
	 */
	void setCustomLabel4(std::string  custom_label_4);
	/*! \brief Get Brief description of the creative assets.
	 */
	std::string getDescription();

	/*! \brief Set Brief description of the creative assets.
	 */
	void setDescription(std::string  description);
	/*! \brief Get The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
	 */
	std::string getGoogleProductCategory();

	/*! \brief Set The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
	 */
	void setGoogleProductCategory(std::string  google_product_category);
	/*! \brief Get IOS deep link to the creative assets page.
	 */
	std::string getIosDeepLink();

	/*! \brief Set IOS deep link to the creative assets page.
	 */
	void setIosDeepLink(std::string  ios_deep_link);
	/*! \brief Get Link to the creative assets page.
	 */
	std::string getLink();

	/*! \brief Set Link to the creative assets page.
	 */
	void setLink(std::string  link);
	/*! \brief Get The name of the creative assets.
	 */
	std::string getTitle();

	/*! \brief Set The name of the creative assets.
	 */
	void setTitle(std::string  title);
	/*! \brief Get Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
	 */
	std::string getVisibility();

	/*! \brief Set Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
	 */
	void setVisibility(std::string  visibility);
	/*! \brief Get The creative assets image.
	 */
	std::string getImageLink();

	/*! \brief Set The creative assets image.
	 */
	void setImageLink(std::string  image_link);
	/*! \brief Get The creative assets video.
	 */
	std::string getVideoLink();

	/*! \brief Set The creative assets video.
	 */
	void setVideoLink(std::string  video_link);


    private:
    std::string android_deep_link{};
    std::string custom_label_0{};
    std::string custom_label_1{};
    std::string custom_label_2{};
    std::string custom_label_3{};
    std::string custom_label_4{};
    std::string description{};
    std::string google_product_category{};
    std::string ios_deep_link{};
    std::string link{};
    std::string title{};
    std::string visibility{};
    std::string image_link{};
    std::string video_link{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreativeAssetsAttributes_H_ */
