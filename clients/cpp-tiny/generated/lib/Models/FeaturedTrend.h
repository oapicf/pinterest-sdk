
/*
 * FeaturedTrend.h
 *
 * Featured trending topics for a specific interest and market
 */

#ifndef TINY_CPP_CLIENT_FeaturedTrend_H_
#define TINY_CPP_CLIENT_FeaturedTrend_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "InterestsEnum.h"
#include "ProductCategoryRegion.h"
#include "TrendingTopic.h"
#include <list>

namespace Tiny {


/*! \brief Featured trending topics for a specific interest and market
 *
 *  \ingroup Models
 *
 */

class FeaturedTrend{
public:

    /*! \brief Constructor.
	 */
    FeaturedTrend();
    FeaturedTrend(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeaturedTrend();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The main interest category
	 */
	InterestsEnum getInterest();

	/*! \brief Set The main interest category
	 */
	void setInterest(InterestsEnum interest);
	/*! \brief Get Market code (e.g., 'US', 'UK', etc.)
	 */
	ProductCategoryRegion getMarket();

	/*! \brief Set Market code (e.g., 'US', 'UK', etc.)
	 */
	void setMarket(ProductCategoryRegion market);
	/*! \brief Get List of trending topics within this interest category
	 */
	std::list<TrendingTopic> getTrends();

	/*! \brief Set List of trending topics within this interest category
	 */
	void setTrends(std::list<TrendingTopic> trends);


    private:
    InterestsEnum interest;
    ProductCategoryRegion market;
    std::list<TrendingTopic> trends;
};
}

#endif /* TINY_CPP_CLIENT_FeaturedTrend_H_ */
