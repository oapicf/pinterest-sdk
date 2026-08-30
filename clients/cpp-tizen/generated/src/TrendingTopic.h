/*
 * TrendingTopic.h
 *
 * Individual trending topic within an interest category
 */

#ifndef _TrendingTopic_H_
#define _TrendingTopic_H_


#include <string>
#include "TrendingPin.h"
#include <list>
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Individual trending topic within an interest category
 *
 *  \ingroup Models
 *
 */

class TrendingTopic : public Object {
public:
	/*! \brief Constructor.
	 */
	TrendingTopic();
	TrendingTopic(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrendingTopic();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Description of the trending topic
	 */
	std::string getDescription();

	/*! \brief Set Description of the trending topic
	 */
	void setDescription(std::string  description);
	/*! \brief Get Unique identifier for the trending topic
	 */
	std::string getId();

	/*! \brief Set Unique identifier for the trending topic
	 */
	void setId(std::string  id);
	/*! \brief Get Month-over-month growth percentage
	 */
	int getPercentGrowthMom();

	/*! \brief Set Month-over-month growth percentage
	 */
	void setPercentGrowthMom(int  percent_growth_mom);
	/*! \brief Get Array of pin images related to this trend (up to 6)
	 */
	std::list<TrendingPin> getPins();

	/*! \brief Set Array of pin images related to this trend (up to 6)
	 */
	void setPins(std::list <TrendingPin> pins);
	/*! \brief Get List of related interest categories
	 */
	std::list<std::string> getRelatedInterests();

	/*! \brief Set List of related interest categories
	 */
	void setRelatedInterests(std::list <std::string> related_interests);
	/*! \brief Get List of related search terms
	 */
	std::list<std::string> getRelatedSearches();

	/*! \brief Set List of related search terms
	 */
	void setRelatedSearches(std::list <std::string> related_searches);
	/*! \brief Get Time series data showing trend values over time, with dates as keys and values as numeric
	 */
	std::map<std::string, std::string> getTimeSeries();

	/*! \brief Set Time series data showing trend values over time, with dates as keys and values as numeric
	 */
	void setTimeSeries(std::map <std::string, std::string> time_series);
	/*! \brief Get Title of the trending topic
	 */
	std::string getTitle();

	/*! \brief Set Title of the trending topic
	 */
	void setTitle(std::string  title);

private:
	std::string description;
	std::string id;
	int percent_growth_mom;
	std::list <TrendingPin>pins;
	std::list <std::string>related_interests;
	std::list <std::string>related_searches;
	std::map <std::string, std::string>time_series;
	std::string title;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TrendingTopic_H_ */
