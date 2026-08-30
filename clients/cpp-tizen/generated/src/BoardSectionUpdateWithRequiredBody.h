/*
 * BoardSectionUpdateWithRequiredBody.h
 *
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

#ifndef _BoardSectionUpdateWithRequiredBody_H_
#define _BoardSectionUpdateWithRequiredBody_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create or update operation model with required body fields (no OptionalProperties).
 *
 *  \ingroup Models
 *
 */

class BoardSectionUpdateWithRequiredBody : public Object {
public:
	/*! \brief Constructor.
	 */
	BoardSectionUpdateWithRequiredBody();
	BoardSectionUpdateWithRequiredBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BoardSectionUpdateWithRequiredBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);

private:
	std::string id;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BoardSectionUpdateWithRequiredBody_H_ */
