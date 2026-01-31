/*
 * FeaturedTrend.h
 *
 * Featured trending topics for a specific interest and market
 */

#ifndef _FeaturedTrend_H_
#define _FeaturedTrend_H_


#include <string>
#include "InterestsEnum.h"
#include "ProductCategoryRegion.h"
#include "TrendingTopic.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Featured trending topics for a specific interest and market
 *
 *  \ingroup Models
 *
 */

class FeaturedTrend : public Object {
public:
	/*! \brief Constructor.
	 */
	FeaturedTrend();
	FeaturedTrend(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeaturedTrend();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The main interest category
	 */
	InterestsEnum getInterest();

	/*! \brief Set The main interest category
	 */
	void setInterest(InterestsEnum  interest);
	/*! \brief Get Market code (e.g., 'US', 'UK', etc.)
	 */
	ProductCategoryRegion getMarket();

	/*! \brief Set Market code (e.g., 'US', 'UK', etc.)
	 */
	void setMarket(ProductCategoryRegion  market);
	/*! \brief Get List of trending topics within this interest category
	 */
	std::list<TrendingTopic> getTrends();

	/*! \brief Set List of trending topics within this interest category
	 */
	void setTrends(std::list <TrendingTopic> trends);

private:
	InterestsEnum interest;
	ProductCategoryRegion market;
	std::list <TrendingTopic>trends;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeaturedTrend_H_ */
