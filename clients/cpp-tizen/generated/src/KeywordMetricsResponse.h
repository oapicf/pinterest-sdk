/*
 * KeywordMetricsResponse.h
 *
 * 
 */

#ifndef _KeywordMetricsResponse_H_
#define _KeywordMetricsResponse_H_


#include <string>
#include "KeywordMetrics.h"
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

class KeywordMetricsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	KeywordMetricsResponse();
	KeywordMetricsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~KeywordMetricsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Keyword name, e.g., \"keyword\":\"fashion outfits\"
	 */
	std::string getKeyword();

	/*! \brief Set Keyword name, e.g., \"keyword\":\"fashion outfits\"
	 */
	void setKeyword(std::string  keyword);
	/*! \brief Get 
	 */
	KeywordMetrics getMetrics();

	/*! \brief Set 
	 */
	void setMetrics(KeywordMetrics  metrics);

private:
	std::string keyword;
	KeywordMetrics metrics;
	void __init();
	void __cleanup();

};
}
}

#endif /* _KeywordMetricsResponse_H_ */
