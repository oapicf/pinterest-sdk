/*
 * CatalogsUpdatableCreativeAssetsAttributes.h
 *
 * 
 */

#ifndef _CatalogsUpdatableCreativeAssetsAttributes_H_
#define _CatalogsUpdatableCreativeAssetsAttributes_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsUpdatableCreativeAssetsAttributes : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsUpdatableCreativeAssetsAttributes();
	CatalogsUpdatableCreativeAssetsAttributes(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsUpdatableCreativeAssetsAttributes();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The name of the creative assets.
	 */
	std::string getTitle();

	/*! \brief Set The name of the creative assets.
	 */
	void setTitle(std::string  title);
	/*! \brief Get Brief description of the creative assets.
	 */
	std::string getDescription();

	/*! \brief Set Brief description of the creative assets.
	 */
	void setDescription(std::string  description);
	/*! \brief Get Link to the creative assets page.
	 */
	std::string getLink();

	/*! \brief Set Link to the creative assets page.
	 */
	void setLink(std::string  link);
	/*! \brief Get IOS deep link to the creative assets page.
	 */
	std::string getIosDeepLink();

	/*! \brief Set IOS deep link to the creative assets page.
	 */
	void setIosDeepLink(std::string  ios_deep_link);
	/*! \brief Get Link to the creative assets page.
	 */
	std::string getAndroidDeepLink();

	/*! \brief Set Link to the creative assets page.
	 */
	void setAndroidDeepLink(std::string  android_deep_link);
	/*! \brief Get The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
	 */
	std::string getGoogleProductCategory();

	/*! \brief Set The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
	 */
	void setGoogleProductCategory(std::string  google_product_category);
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
	/*! \brief Get Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
	 */
	std::string getVisibility();

	/*! \brief Set Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
	 */
	void setVisibility(std::string  visibility);

private:
	std::string title;
	std::string description;
	std::string link;
	std::string ios_deep_link;
	std::string android_deep_link;
	std::string google_product_category;
	std::string custom_label_0;
	std::string custom_label_1;
	std::string custom_label_2;
	std::string custom_label_3;
	std::string custom_label_4;
	std::string visibility;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsUpdatableCreativeAssetsAttributes_H_ */
