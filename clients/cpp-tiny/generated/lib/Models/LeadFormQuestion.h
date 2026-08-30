
/*
 * LeadFormQuestion.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LeadFormQuestion_H_
#define TINY_CPP_CLIENT_LeadFormQuestion_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LeadFormQuestionFieldType.h"
#include "LeadFormQuestionType.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LeadFormQuestion{
public:

    /*! \brief Constructor.
	 */
    LeadFormQuestion();
    LeadFormQuestion(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadFormQuestion();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	LeadFormQuestionFieldType getCustomQuestionFieldType();

	/*! \brief Set 
	 */
	void setCustomQuestionFieldType(LeadFormQuestionFieldType custom_question_field_type);
	/*! \brief Get Question label for a custom question.
	 */
	std::string getCustomQuestionLabel();

	/*! \brief Set Question label for a custom question.
	 */
	void setCustomQuestionLabel(std::string custom_question_label);
	/*! \brief Get Question options for a custom question.
	 */
	std::list<std::string> getCustomQuestionOptions();

	/*! \brief Set Question options for a custom question.
	 */
	void setCustomQuestionOptions(std::list<std::string> custom_question_options);
	/*! \brief Get 
	 */
	LeadFormQuestionType getQuestionType();

	/*! \brief Set 
	 */
	void setQuestionType(LeadFormQuestionType question_type);


    private:
    LeadFormQuestionFieldType custom_question_field_type;
    std::string custom_question_label{};
    std::list<std::string> custom_question_options;
    LeadFormQuestionType question_type;
};
}

#endif /* TINY_CPP_CLIENT_LeadFormQuestion_H_ */
