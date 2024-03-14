/*
 * KeywordMetrics.h
 *
 * Keyword metrics JSON
 */

#ifndef _KeywordMetrics_H_
#define _KeywordMetrics_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Keyword metrics JSON
 *
 *  \ingroup Models
 *
 */

class KeywordMetrics : public Object {
public:
	/*! \brief Constructor.
	 */
	KeywordMetrics();
	KeywordMetrics(char* str);

	/*! \brief Destructor.
	 */
	virtual ~KeywordMetrics();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Average cost per click
	 */
	long long getAvgCpcInMicroCurrency();

	/*! \brief Set Average cost per click
	 */
	void setAvgCpcInMicroCurrency(long long  avg_cpc_in_micro_currency);
	/*! \brief Get Keyword's search frequency. This value is based on keyword frequency in pepsi client response
	 */
	std::string getKeywordQueryVolume();

	/*! \brief Set Keyword's search frequency. This value is based on keyword frequency in pepsi client response
	 */
	void setKeywordQueryVolume(std::string  keyword_query_volume);

private:
	long long avg_cpc_in_micro_currency;
	std::string keyword_query_volume;
	void __init();
	void __cleanup();

};
}
}

#endif /* _KeywordMetrics_H_ */
