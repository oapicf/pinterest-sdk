/*
 * KeywordsMetricsArrayResponse.h
 *
 * 
 */

#ifndef _KeywordsMetricsArrayResponse_H_
#define _KeywordsMetricsArrayResponse_H_


#include <string>
#include "KeywordMetricsResponse.h"
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

class KeywordsMetricsArrayResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	KeywordsMetricsArrayResponse();
	KeywordsMetricsArrayResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~KeywordsMetricsArrayResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<KeywordMetricsResponse> getData();

	/*! \brief Set 
	 */
	void setData(std::list <KeywordMetricsResponse> data);

private:
	std::list <KeywordMetricsResponse>data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _KeywordsMetricsArrayResponse_H_ */
