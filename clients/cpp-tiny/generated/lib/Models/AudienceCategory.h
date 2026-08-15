
/*
 * AudienceCategory.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AudienceCategory_H_
#define TINY_CPP_CLIENT_AudienceCategory_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AudienceSubcategory.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AudienceCategory{
public:

    /*! \brief Constructor.
	 */
    AudienceCategory();
    AudienceCategory(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceCategory();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Interest ID.
	 */
	std::string getId();

	/*! \brief Set Interest ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Interest affinity index.
	 */
	long getIndex();

	/*! \brief Set Interest affinity index.
	 */
	void setIndex(long  index);
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
	long getRatio();

	/*! \brief Set Interest's percent of category's total audience.
	 */
	void setRatio(long  ratio);
	/*! \brief Get Subcategory interest distribution
	 */
	std::list<AudienceSubcategory> getSubcategories();

	/*! \brief Set Subcategory interest distribution
	 */
	void setSubcategories(std::list <AudienceSubcategory> subcategories);


    private:
    std::string id{};
    long index{};
    std::string key{};
    std::string name{};
    long ratio{};
    std::list<AudienceSubcategory> subcategories;
};
}

#endif /* TINY_CPP_CLIENT_AudienceCategory_H_ */
