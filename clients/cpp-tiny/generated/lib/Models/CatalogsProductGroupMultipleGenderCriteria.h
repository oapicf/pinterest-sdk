
/*
 * CatalogsProductGroupMultipleGenderCriteria.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsProductGroupMultipleGenderCriteria_H_
#define TINY_CPP_CLIENT_CatalogsProductGroupMultipleGenderCriteria_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Gender.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupMultipleGenderCriteria{
public:

    /*! \brief Constructor.
	 */
    CatalogsProductGroupMultipleGenderCriteria();
    CatalogsProductGroupMultipleGenderCriteria(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsProductGroupMultipleGenderCriteria();


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
	void setNegated(bool  negated);
	/*! \brief Get 
	 */
	std::list<Gender> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <Gender> values);


    private:
    bool negated{};
    std::list<Gender> values;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsProductGroupMultipleGenderCriteria_H_ */
