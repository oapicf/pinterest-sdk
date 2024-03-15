/*
 * TrendingKeywordsResponse.h
 *
 * 
 */

#ifndef _TrendingKeywordsResponse_H_
#define _TrendingKeywordsResponse_H_


#include <string>
#include "TrendingKeywordsResponse_trends_inner.h"
#include <list>
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

class TrendingKeywordsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	TrendingKeywordsResponse();
	TrendingKeywordsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrendingKeywordsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
	 */
	std::list<TrendingKeywordsResponse_trends_inner> getTrends();

	/*! \brief Set The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
	 */
	void setTrends(std::list <TrendingKeywordsResponse_trends_inner> trends);

private:
	std::list <TrendingKeywordsResponse_trends_inner>trends;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TrendingKeywordsResponse_H_ */
