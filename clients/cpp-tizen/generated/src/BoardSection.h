/*
 * BoardSection.h
 *
 * Sections help organize pins within a board.
 */

#ifndef _BoardSection_H_
#define _BoardSection_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Sections help organize pins within a board.
 *
 *  \ingroup Models
 *
 */

class BoardSection : public Object {
public:
	/*! \brief Constructor.
	 */
	BoardSection();
	BoardSection(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BoardSection();

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

#endif /* _BoardSection_H_ */
