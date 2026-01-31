/*
 * LabelError.h
 *
 * 
 */

#ifndef _LabelError_H_
#define _LabelError_H_


#include <string>
#include "Label.h"
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

class LabelError : public Object {
public:
	/*! \brief Constructor.
	 */
	LabelError();
	LabelError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LabelError();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Label getData();

	/*! \brief Set 
	 */
	void setData(Label  data);
	/*! \brief Get 
	 */
	std::list<std::string> getErrorMessages();

	/*! \brief Set 
	 */
	void setErrorMessages(std::list <std::string> error_messages);

private:
	Label data;
	std::list <std::string>error_messages;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LabelError_H_ */
