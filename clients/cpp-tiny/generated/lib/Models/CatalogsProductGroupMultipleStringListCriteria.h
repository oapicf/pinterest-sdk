
/*
 * CatalogsProductGroupMultipleStringListCriteria.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsProductGroupMultipleStringListCriteria_H_
#define TINY_CPP_CLIENT_CatalogsProductGroupMultipleStringListCriteria_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupMultipleStringListCriteria{
public:

    /*! \brief Constructor.
	 */
    CatalogsProductGroupMultipleStringListCriteria();
    CatalogsProductGroupMultipleStringListCriteria(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsProductGroupMultipleStringListCriteria();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	bool isNegated();

	/*! \brief Set 
	 */
	void setNegated(bool negated);
	/*! \brief Get 
	 */
	std::list<std::list> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list<std::list> values);


    private:
    bool negated{};
    std::list<std::list> values;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsProductGroupMultipleStringListCriteria_H_ */
