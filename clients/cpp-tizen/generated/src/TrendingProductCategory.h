/*
 * TrendingProductCategory.h
 *
 * Trending shopping product category
 */

#ifndef _TrendingProductCategory_H_
#define _TrendingProductCategory_H_


#include <string>
#include "ProductCategoriesEngagementType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Trending shopping product category
 *
 *  \ingroup Models
 *
 */

class TrendingProductCategory : public Object {
public:
	/*! \brief Constructor.
	 */
	TrendingProductCategory();
	TrendingProductCategory(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrendingProductCategory();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Engagement type
	 */
	ProductCategoriesEngagementType getEngagementType();

	/*! \brief Set Engagement type
	 */
	void setEngagementType(ProductCategoriesEngagementType  engagement_type);
	/*! \brief Get Month-over-month change percentage
	 */
	int getPctChangeMom();

	/*! \brief Set Month-over-month change percentage
	 */
	void setPctChangeMom(int  pct_change_mom);
	/*! \brief Get Relative volume percentage
	 */
	int getPercentRelativeVolume();

	/*! \brief Set Relative volume percentage
	 */
	void setPercentRelativeVolume(int  percent_relative_volume);
	/*! \brief Get Pinterest Product Category Id
	 */
	int getPinterestProductCategoryId();

	/*! \brief Set Pinterest Product Category Id
	 */
	void setPinterestProductCategoryId(int  pinterest_product_category_id);
	/*! \brief Get Product Category Name
	 */
	std::string getProductCategory();

	/*! \brief Set Product Category Name
	 */
	void setProductCategory(std::string  product_category);
	/*! \brief Get Vertical name associated with the product category
	 */
	std::list<std::string> getVerticals();

	/*! \brief Set Vertical name associated with the product category
	 */
	void setVerticals(std::list <std::string> verticals);

private:
	ProductCategoriesEngagementType engagement_type;
	int pct_change_mom;
	int percent_relative_volume;
	int pinterest_product_category_id;
	std::string product_category;
	std::list <std::string>verticals;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TrendingProductCategory_H_ */
