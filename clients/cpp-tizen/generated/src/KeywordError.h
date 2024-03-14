/*
 * KeywordError.h
 *
 * 
 */

#ifndef _KeywordError_H_
#define _KeywordError_H_


#include <string>
#include "Keyword.h"
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

class KeywordError : public Object {
public:
	/*! \brief Constructor.
	 */
	KeywordError();
	KeywordError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~KeywordError();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Keyword getData();

	/*! \brief Set 
	 */
	void setData(Keyword  data);
	/*! \brief Get 
	 */
	std::list<std::string> getErrorMessages();

	/*! \brief Set 
	 */
	void setErrorMessages(std::list <std::string> error_messages);

private:
	Keyword data;
	std::list <std::string>error_messages;
	void __init();
	void __cleanup();

};
}
}

#endif /* _KeywordError_H_ */
