/*
 * EntityLabelError.h
 *
 * 
 */

#ifndef _EntityLabelError_H_
#define _EntityLabelError_H_


#include <string>
#include "EntityLabel.h"
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

class EntityLabelError : public Object {
public:
	/*! \brief Constructor.
	 */
	EntityLabelError();
	EntityLabelError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EntityLabelError();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	EntityLabel getData();

	/*! \brief Set 
	 */
	void setData(EntityLabel  data);
	/*! \brief Get 
	 */
	std::list<std::string> getErrorMessages();

	/*! \brief Set 
	 */
	void setErrorMessages(std::list <std::string> error_messages);

private:
	EntityLabel data;
	std::list <std::string>error_messages;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EntityLabelError_H_ */
