
/*
 * TrendingTopic.h
 *
 * Individual trending topic within an interest category
 */

#ifndef TINY_CPP_CLIENT_TrendingTopic_H_
#define TINY_CPP_CLIENT_TrendingTopic_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TrendingPin.h"
#include <list>
#include <map>

namespace Tiny {


/*! \brief Individual trending topic within an interest category
 *
 *  \ingroup Models
 *
 */

class TrendingTopic{
public:

    /*! \brief Constructor.
	 */
    TrendingTopic();
    TrendingTopic(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TrendingTopic();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Description of the trending topic
	 */
	std::string getDescription();

	/*! \brief Set Description of the trending topic
	 */
	void setDescription(std::string description);
	/*! \brief Get Unique identifier for the trending topic
	 */
	std::string getId();

	/*! \brief Set Unique identifier for the trending topic
	 */
	void setId(std::string id);
	/*! \brief Get Month-over-month growth percentage
	 */
	int getPercentGrowthMom();

	/*! \brief Set Month-over-month growth percentage
	 */
	void setPercentGrowthMom(int percent_growth_mom);
	/*! \brief Get Array of pin images related to this trend (up to 6)
	 */
	std::list<TrendingPin> getPins();

	/*! \brief Set Array of pin images related to this trend (up to 6)
	 */
	void setPins(std::list<TrendingPin> pins);
	/*! \brief Get List of related interest categories
	 */
	std::list<std::string> getRelatedInterests();

	/*! \brief Set List of related interest categories
	 */
	void setRelatedInterests(std::list<std::string> related_interests);
	/*! \brief Get List of related search terms
	 */
	std::list<std::string> getRelatedSearches();

	/*! \brief Set List of related search terms
	 */
	void setRelatedSearches(std::list<std::string> related_searches);
	/*! \brief Get Time series data showing trend values over time, with dates as keys and values as numeric
	 */
	std::map<std::string, long> getTimeSeries();

	/*! \brief Set Time series data showing trend values over time, with dates as keys and values as numeric
	 */
	void setTimeSeries(std::map<std::string, long> time_series);
	/*! \brief Get Title of the trending topic
	 */
	std::string getTitle();

	/*! \brief Set Title of the trending topic
	 */
	void setTitle(std::string title);


    private:
    std::string description{};
    std::string id{};
    int percent_growth_mom{};
    std::list<TrendingPin> pins;
    std::list<std::string> related_interests;
    std::list<std::string> related_searches;
    std::map<std::string, long> time_series;
    std::string title{};
};
}

#endif /* TINY_CPP_CLIENT_TrendingTopic_H_ */
