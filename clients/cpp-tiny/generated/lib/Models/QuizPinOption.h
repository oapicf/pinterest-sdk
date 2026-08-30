
/*
 * QuizPinOption.h
 *
 * This field contains multiple options to a quiz question.
 */

#ifndef TINY_CPP_CLIENT_QuizPinOption_H_
#define TINY_CPP_CLIENT_QuizPinOption_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief This field contains multiple options to a quiz question.
 *
 *  \ingroup Models
 *
 */

class QuizPinOption{
public:

    /*! \brief Constructor.
	 */
    QuizPinOption();
    QuizPinOption(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~QuizPinOption();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	long getId();

	/*! \brief Set 
	 */
	void setId(long id);
	/*! \brief Get 
	 */
	std::string getText();

	/*! \brief Set 
	 */
	void setText(std::string text);


    private:
    long id{};
    std::string text{};
};
}

#endif /* TINY_CPP_CLIENT_QuizPinOption_H_ */
