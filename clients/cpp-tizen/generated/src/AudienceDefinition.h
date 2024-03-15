/*
 * AudienceDefinition.h
 *
 * Queryable audience representation.
 */

#ifndef _AudienceDefinition_H_
#define _AudienceDefinition_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Queryable audience representation.
 *
 *  \ingroup Models
 *
 */

class AudienceDefinition : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceDefinition();
	AudienceDefinition(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceDefinition();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Generation date
	 */
	std::string getDate();

	/*! \brief Set Generation date
	 */
	void setDate(std::string  date);
	/*! \brief Get Generated audience type to request.
	 */
	std::string getType();

	/*! \brief Set Generated audience type to request.
	 */
	void setType(std::string  type);
	/*! \brief Get Generated audience scope to request.
	 */
	std::string getScope();

	/*! \brief Set Generated audience scope to request.
	 */
	void setScope(std::string  scope);

private:
	std::string date;
	std::string type;
	std::string scope;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceDefinition_H_ */
