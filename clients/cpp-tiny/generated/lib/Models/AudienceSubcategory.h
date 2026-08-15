
/*
 * AudienceSubcategory.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AudienceSubcategory_H_
#define TINY_CPP_CLIENT_AudienceSubcategory_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AudienceSubcategory{
public:

    /*! \brief Constructor.
	 */
    AudienceSubcategory();
    AudienceSubcategory(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceSubcategory();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Subinterest ID.
	 */
	std::string getId();

	/*! \brief Set Subinterest ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Subinterest affinity index.
	 */
	long getIndex();

	/*! \brief Set Subinterest affinity index.
	 */
	void setIndex(long  index);
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
	long getRatio();

	/*! \brief Set Subinterest's percent of category's total audience.
	 */
	void setRatio(long  ratio);


    private:
    std::string id{};
    long index{};
    std::string key{};
    std::string name{};
    long ratio{};
};
}

#endif /* TINY_CPP_CLIENT_AudienceSubcategory_H_ */
