
/*
 * CatalogsProductGroupUint32Criteria.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsProductGroupUint32Criteria_H_
#define TINY_CPP_CLIENT_CatalogsProductGroupUint32Criteria_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupUint32Criteria{
public:

    /*! \brief Constructor.
	 */
    CatalogsProductGroupUint32Criteria();
    CatalogsProductGroupUint32Criteria(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsProductGroupUint32Criteria();


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
	std::string getROperator();

	/*! \brief Set 
	 */
	void setROperator(std::string  r_operator);
	/*! \brief Get 
	 */
	int getValue();

	/*! \brief Set 
	 */
	void setValue(int  value);


    private:
    bool negated{};
    std::string r_operator{};
    int value{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsProductGroupUint32Criteria_H_ */
