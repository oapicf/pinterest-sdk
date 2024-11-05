/*
 * QuizPinData.h
 *
 * This field includes all quiz data including questions, options, and results.
 */

#ifndef _QuizPinData_H_
#define _QuizPinData_H_


#include <string>
#include "QuizPinQuestion.h"
#include "QuizPinResult.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This field includes all quiz data including questions, options, and results.
 *
 *  \ingroup Models
 *
 */

class QuizPinData : public Object {
public:
	/*! \brief Constructor.
	 */
	QuizPinData();
	QuizPinData(char* str);

	/*! \brief Destructor.
	 */
	virtual ~QuizPinData();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<QuizPinQuestion> getQuestions();

	/*! \brief Set 
	 */
	void setQuestions(std::list <QuizPinQuestion> questions);
	/*! \brief Get 
	 */
	std::list<QuizPinResult> getResults();

	/*! \brief Set 
	 */
	void setResults(std::list <QuizPinResult> results);
	/*! \brief Get Quiz ad tie breaker type, default is RANDOM
	 */
	std::string getTieBreakerType();

	/*! \brief Set Quiz ad tie breaker type, default is RANDOM
	 */
	void setTieBreakerType(std::string  tie_breaker_type);
	/*! \brief Get 
	 */
	QuizPinResult getTieBreakerCustomResult();

	/*! \brief Set 
	 */
	void setTieBreakerCustomResult(QuizPinResult  tie_breaker_custom_result);

private:
	std::list <QuizPinQuestion>questions;
	std::list <QuizPinResult>results;
	std::string tie_breaker_type;
	QuizPinResult tie_breaker_custom_result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _QuizPinData_H_ */
