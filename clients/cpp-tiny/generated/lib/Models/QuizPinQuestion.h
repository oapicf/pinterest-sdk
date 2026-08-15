
/*
 * QuizPinQuestion.h
 *
 * A specific quiz inquiry.
 */

#ifndef TINY_CPP_CLIENT_QuizPinQuestion_H_
#define TINY_CPP_CLIENT_QuizPinQuestion_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "QuizPinOption.h"
#include <list>

namespace Tiny {


/*! \brief A specific quiz inquiry.
 *
 *  \ingroup Models
 *
 */

class QuizPinQuestion{
public:

    /*! \brief Constructor.
	 */
    QuizPinQuestion();
    QuizPinQuestion(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~QuizPinQuestion();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<QuizPinOption> getOptions();

	/*! \brief Set 
	 */
	void setOptions(std::list <QuizPinOption> options);
	/*! \brief Get 
	 */
	long getQuestionId();

	/*! \brief Set 
	 */
	void setQuestionId(long  question_id);
	/*! \brief Get 
	 */
	std::string getQuestionText();

	/*! \brief Set 
	 */
	void setQuestionText(std::string  question_text);


    private:
    std::list<QuizPinOption> options;
    long question_id{};
    std::string question_text{};
};
}

#endif /* TINY_CPP_CLIENT_QuizPinQuestion_H_ */
