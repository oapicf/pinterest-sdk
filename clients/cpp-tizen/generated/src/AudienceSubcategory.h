/*
 * AudienceSubcategory.h
 *
 * 
 */

#ifndef _AudienceSubcategory_H_
#define _AudienceSubcategory_H_


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

class AudienceSubcategory : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceSubcategory();
	AudienceSubcategory(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceSubcategory();

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
	long long getIndex();

	/*! \brief Set 
	 */
	void setIndex(long long  index);
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
	/*! \brief Get 
	 */
	long long getRatio();

	/*! \brief Set 
	 */
	void setRatio(long long  ratio);

private:
	std::string id;
	long long index;
	std::string key;
	std::string name;
	long long ratio;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceSubcategory_H_ */
