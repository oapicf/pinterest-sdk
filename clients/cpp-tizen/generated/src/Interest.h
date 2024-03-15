/*
 * Interest.h
 *
 * 
 */

#ifndef _Interest_H_
#define _Interest_H_


#include <string>
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

class Interest : public Object {
public:
	/*! \brief Constructor.
	 */
	Interest();
	Interest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Interest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getCanonicalUrl();

	/*! \brief Set 
	 */
	void setCanonicalUrl(std::string  canonical_url);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getKey();

	/*! \brief Set 
	 */
	void setKey(std::string  key);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);

private:
	std::string canonical_url;
	std::string id;
	std::string key;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Interest_H_ */
