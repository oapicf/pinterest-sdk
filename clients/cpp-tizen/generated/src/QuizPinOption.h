/*
 * QuizPinOption.h
 *
 *  This field contains multiple options to a quiz question.
 */

#ifndef _QuizPinOption_H_
#define _QuizPinOption_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief  This field contains multiple options to a quiz question.
 *
 *  \ingroup Models
 *
 */

class QuizPinOption : public Object {
public:
	/*! \brief Constructor.
	 */
	QuizPinOption();
	QuizPinOption(char* str);

	/*! \brief Destructor.
	 */
	virtual ~QuizPinOption();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	long long getId();

	/*! \brief Set 
	 */
	void setId(long long  id);
	/*! \brief Get 
	 */
	std::string getText();

	/*! \brief Set 
	 */
	void setText(std::string  text);

private:
	long long id;
	std::string text;
	void __init();
	void __cleanup();

};
}
}

#endif /* _QuizPinOption_H_ */
