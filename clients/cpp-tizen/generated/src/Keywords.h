/*
 * Keywords.h
 *
 * 
 */

#ifndef _Keywords_H_
#define _Keywords_H_


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

class Keywords : public Object {
public:
	/*! \brief Constructor.
	 */
	Keywords();
	Keywords(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Keywords();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Keyword error
	 */
	std::list<KeywordError> getErrors();

	/*! \brief Set Keyword error
	 */
	void setErrors(std::list <KeywordError> errors);
	/*! \brief Get Keywords
	 */
	std::list<Keyword> getKeywords();

	/*! \brief Set Keywords
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

#endif /* _Keywords_H_ */
