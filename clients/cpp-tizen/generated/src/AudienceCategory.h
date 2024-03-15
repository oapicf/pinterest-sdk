/*
 * AudienceCategory.h
 *
 * 
 */

#ifndef _AudienceCategory_H_
#define _AudienceCategory_H_


#include <string>
#include "AudienceSubcategory.h"
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

class AudienceCategory : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceCategory();
	AudienceCategory(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceCategory();

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
	/*! \brief Get Interest name.
	 */
	std::string getName();

	/*! \brief Set Interest name.
	 */
	void setName(std::string  name);
	/*! \brief Get Interest's percent of category's total audience.
	 */
	long long getRatio();

	/*! \brief Set Interest's percent of category's total audience.
	 */
	void setRatio(long long  ratio);
	/*! \brief Get Interest affinity index.
	 */
	long long getIndex();

	/*! \brief Set Interest affinity index.
	 */
	void setIndex(long long  index);
	/*! \brief Get Interest ID.
	 */
	std::string getId();

	/*! \brief Set Interest ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Subcategory interest distribution
	 */
	std::list<AudienceSubcategory> getSubcategories();

	/*! \brief Set Subcategory interest distribution
	 */
	void setSubcategories(std::list <AudienceSubcategory> subcategories);

private:
	std::string key;
	std::string name;
	long long ratio;
	long long index;
	std::string id;
	std::list <AudienceSubcategory>subcategories;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceCategory_H_ */
