
/*
 * TrendingProductCategory.h
 *
 * Trending shopping product category
 */

#ifndef TINY_CPP_CLIENT_TrendingProductCategory_H_
#define TINY_CPP_CLIENT_TrendingProductCategory_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ProductCategoriesEngagementType.h"
#include <list>

namespace Tiny {


/*! \brief Trending shopping product category
 *
 *  \ingroup Models
 *
 */

class TrendingProductCategory{
public:

    /*! \brief Constructor.
	 */
    TrendingProductCategory();
    TrendingProductCategory(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TrendingProductCategory();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Engagement type
	 */
	ProductCategoriesEngagementType getEngagementType();

	/*! \brief Set Engagement type
	 */
	void setEngagementType(ProductCategoriesEngagementType engagement_type);
	/*! \brief Get Month-over-month change percentage
	 */
	int getPctChangeMom();

	/*! \brief Set Month-over-month change percentage
	 */
	void setPctChangeMom(int pct_change_mom);
	/*! \brief Get Relative volume percentage
	 */
	int getPercentRelativeVolume();

	/*! \brief Set Relative volume percentage
	 */
	void setPercentRelativeVolume(int percent_relative_volume);
	/*! \brief Get Pinterest Product Category Id
	 */
	int getPinterestProductCategoryId();

	/*! \brief Set Pinterest Product Category Id
	 */
	void setPinterestProductCategoryId(int pinterest_product_category_id);
	/*! \brief Get Product Category Name
	 */
	std::string getProductCategory();

	/*! \brief Set Product Category Name
	 */
	void setProductCategory(std::string product_category);
	/*! \brief Get Vertical name associated with the product category
	 */
	std::list<std::string> getVerticals();

	/*! \brief Set Vertical name associated with the product category
	 */
	void setVerticals(std::list<std::string> verticals);


    private:
    ProductCategoriesEngagementType engagement_type;
    int pct_change_mom{};
    int percent_relative_volume{};
    int pinterest_product_category_id{};
    std::string product_category{};
    std::list<std::string> verticals;
};
}

#endif /* TINY_CPP_CLIENT_TrendingProductCategory_H_ */
