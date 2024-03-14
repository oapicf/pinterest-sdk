/*
 * BoardUpdate.h
 *
 * Board fields for updates
 */

#ifndef _BoardUpdate_H_
#define _BoardUpdate_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Board fields for updates
 *
 *  \ingroup Models
 *
 */

class BoardUpdate : public Object {
public:
	/*! \brief Constructor.
	 */
	BoardUpdate();
	BoardUpdate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BoardUpdate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	std::string getPrivacy();

	/*! \brief Set 
	 */
	void setPrivacy(std::string  privacy);

private:
	std::string name;
	std::string description;
	std::string privacy;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BoardUpdate_H_ */
