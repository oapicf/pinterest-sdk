/*
 * QuizPinQuestion.h
 *
 * A specific quiz inquiry.
 */

#ifndef _QuizPinQuestion_H_
#define _QuizPinQuestion_H_


#include <string>
#include "QuizPinOption.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A specific quiz inquiry.
 *
 *  \ingroup Models
 *
 */

class QuizPinQuestion : public Object {
public:
	/*! \brief Constructor.
	 */
	QuizPinQuestion();
	QuizPinQuestion(char* str);

	/*! \brief Destructor.
	 */
	virtual ~QuizPinQuestion();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	long long getQuestionId();

	/*! \brief Set 
	 */
	void setQuestionId(long long  question_id);
	/*! \brief Get 
	 */
	std::string getQuestionText();

	/*! \brief Set 
	 */
	void setQuestionText(std::string  question_text);
	/*! \brief Get 
	 */
	std::list<QuizPinOption> getOptions();

	/*! \brief Set 
	 */
	void setOptions(std::list <QuizPinOption> options);

private:
	long long question_id;
	std::string question_text;
	std::list <QuizPinOption>options;
	void __init();
	void __cleanup();

};
}
}

#endif /* _QuizPinQuestion_H_ */
