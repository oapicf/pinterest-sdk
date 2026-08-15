
/*
 * QuizPinData.h
 *
 * This field includes all quiz data including questions, options, and results.
 */

#ifndef TINY_CPP_CLIENT_QuizPinData_H_
#define TINY_CPP_CLIENT_QuizPinData_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "QuizPinQuestion.h"
#include "QuizPinResult.h"
#include <list>

namespace Tiny {


/*! \brief This field includes all quiz data including questions, options, and results.
 *
 *  \ingroup Models
 *
 */

class QuizPinData{
public:

    /*! \brief Constructor.
	 */
    QuizPinData();
    QuizPinData(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~QuizPinData();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	/*! \brief Get 
	 */
	QuizPinResult getTieBreakerCustomResult();

	/*! \brief Set 
	 */
	void setTieBreakerCustomResult(QuizPinResult  tie_breaker_custom_result);
	/*! \brief Get Quiz ad tie breaker type, default is RANDOM
	 */
	std::string getTieBreakerType();

	/*! \brief Set Quiz ad tie breaker type, default is RANDOM
	 */
	void setTieBreakerType(std::string  tie_breaker_type);


    private:
    std::list<QuizPinQuestion> questions;
    std::list<QuizPinResult> results;
    QuizPinResult tie_breaker_custom_result;
    std::string tie_breaker_type{};
};
}

#endif /* TINY_CPP_CLIENT_QuizPinData_H_ */
