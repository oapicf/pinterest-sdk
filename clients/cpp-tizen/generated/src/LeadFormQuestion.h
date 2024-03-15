/*
 * LeadFormQuestion.h
 *
 * 
 */

#ifndef _LeadFormQuestion_H_
#define _LeadFormQuestion_H_


#include <string>
#include "LeadFormQuestionFieldType.h"
#include "LeadFormQuestionType.h"
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

class LeadFormQuestion : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadFormQuestion();
	LeadFormQuestion(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadFormQuestion();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	LeadFormQuestionType getQuestionType();

	/*! \brief Set 
	 */
	void setQuestionType(LeadFormQuestionType  question_type);
	/*! \brief Get 
	 */
	LeadFormQuestionFieldType getCustomQuestionFieldType();

	/*! \brief Set 
	 */
	void setCustomQuestionFieldType(LeadFormQuestionFieldType  custom_question_field_type);
	/*! \brief Get Question label for a custom question.
	 */
	std::string getCustomQuestionLabel();

	/*! \brief Set Question label for a custom question.
	 */
	void setCustomQuestionLabel(std::string  custom_question_label);
	/*! \brief Get Question options for a custom question.
	 */
	std::list<std::string> getCustomQuestionOptions();

	/*! \brief Set Question options for a custom question.
	 */
	void setCustomQuestionOptions(std::list <std::string> custom_question_options);

private:
	LeadFormQuestionType question_type;
	LeadFormQuestionFieldType custom_question_field_type;
	std::string custom_question_label;
	std::list <std::string>custom_question_options;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LeadFormQuestion_H_ */
