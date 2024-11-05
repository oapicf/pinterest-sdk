/*
 * CreateAssetAccessRequestErrorMessage_inner.h
 *
 * 
 */

#ifndef _CreateAssetAccessRequestErrorMessage_inner_H_
#define _CreateAssetAccessRequestErrorMessage_inner_H_


#include <string>
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

class CreateAssetAccessRequestErrorMessage_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateAssetAccessRequestErrorMessage_inner();
	CreateAssetAccessRequestErrorMessage_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateAssetAccessRequestErrorMessage_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Error code associated with the error in requesting asset access.
	 */
	int getCode();

	/*! \brief Set Error code associated with the error in requesting asset access.
	 */
	void setCode(int  code);
	/*! \brief Get 
	 */
	std::list<std::string> getMessages();

	/*! \brief Set 
	 */
	void setMessages(std::list <std::string> messages);

private:
	int code;
	std::list <std::string>messages;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateAssetAccessRequestErrorMessage_inner_H_ */
