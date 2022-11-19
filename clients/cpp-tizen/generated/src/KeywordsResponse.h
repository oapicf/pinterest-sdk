/*
 * KeywordsResponse.h
 *
 * 
 */

#ifndef _KeywordsResponse_H_
#define _KeywordsResponse_H_


#include <string>
#include "Keyword.h"
#include "KeywordError.h"
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

class KeywordsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	KeywordsResponse();
	KeywordsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~KeywordsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<KeywordError> getErrors();

	/*! \brief Set 
	 */
	void setErrors(std::list <KeywordError> errors);
	/*! \brief Get 
	 */
	std::list<Keyword> getKeywords();

	/*! \brief Set 
	 */
	void setKeywords(std::list <Keyword> keywords);

private:
	std::list <KeywordError>errors;
	std::list <Keyword>keywords;
	void __init();
	void __cleanup();

};
}
}

#endif /* _KeywordsResponse_H_ */
