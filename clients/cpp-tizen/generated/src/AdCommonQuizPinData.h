/*
 * AdCommon_quiz_pin_data.h
 *
 * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 */

#ifndef _AdCommon_quiz_pin_data_H_
#define _AdCommon_quiz_pin_data_H_


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


/*! \brief Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 *
 *  \ingroup Models
 *
 */

class AdCommon_quiz_pin_data : public Object {
public:
	/*! \brief Constructor.
	 */
	AdCommon_quiz_pin_data();
	AdCommon_quiz_pin_data(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdCommon_quiz_pin_data();

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

private:
	std::list <QuizPinQuestion>questions;
	std::list <QuizPinResult>results;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdCommon_quiz_pin_data_H_ */
