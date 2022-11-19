/*
 * KeywordUpdateBody.h
 *
 * 
 */

#ifndef _KeywordUpdateBody_H_
#define _KeywordUpdateBody_H_


#include <string>
#include "KeywordUpdate.h"
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

class KeywordUpdateBody : public Object {
public:
	/*! \brief Constructor.
	 */
	KeywordUpdateBody();
	KeywordUpdateBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~KeywordUpdateBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Keywords to update. Object array. Each object has 3 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>3. \"bid\": number<br>For example: [{\"id\":\"2886610576653\", \"archived\": false, \"bid\": 20000}, {\"id\":\"2886610576654\",  \"archived\": true, \"bid\": 20000}, ...]
	 */
	std::list<KeywordUpdate> getKeywords();

	/*! \brief Set Keywords to update. Object array. Each object has 3 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>3. \"bid\": number<br>For example: [{\"id\":\"2886610576653\", \"archived\": false, \"bid\": 20000}, {\"id\":\"2886610576654\",  \"archived\": true, \"bid\": 20000}, ...]
	 */
	void setKeywords(std::list <KeywordUpdate> keywords);

private:
	std::list <KeywordUpdate>keywords;
	void __init();
	void __cleanup();

};
}
}

#endif /* _KeywordUpdateBody_H_ */
