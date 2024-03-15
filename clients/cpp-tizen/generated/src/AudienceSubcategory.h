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

	/*! \brief Get Interest unique key (same as ID).
	 */
	std::string getKey();

	/*! \brief Set Interest unique key (same as ID).
	 */
	void setKey(std::string  key);
	/*! \brief Get Subinterest name.
	 */
	std::string getName();

	/*! \brief Set Subinterest name.
	 */
	void setName(std::string  name);
	/*! \brief Get Subinterest's percent of category's total audience.
	 */
	long long getRatio();

	/*! \brief Set Subinterest's percent of category's total audience.
	 */
	void setRatio(long long  ratio);
	/*! \brief Get Subinterest affinity index.
	 */
	long long getIndex();

	/*! \brief Set Subinterest affinity index.
	 */
	void setIndex(long long  index);
	/*! \brief Get Subinterest ID.
	 */
	std::string getId();

	/*! \brief Set Subinterest ID.
	 */
	void setId(std::string  id);

private:
	std::string key;
	std::string name;
	long long ratio;
	long long index;
	std::string id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceSubcategory_H_ */
