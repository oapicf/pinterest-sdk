
/*
 * CatalogsProductGroupFilterOperatorTypeCriteria.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsProductGroupFilterOperatorTypeCriteria_H_
#define TINY_CPP_CLIENT_CatalogsProductGroupFilterOperatorTypeCriteria_H_


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

class CatalogsProductGroupFilterOperatorTypeCriteria{
public:

    /*! \brief Constructor.
	 */
    CatalogsProductGroupFilterOperatorTypeCriteria();
    CatalogsProductGroupFilterOperatorTypeCriteria(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsProductGroupFilterOperatorTypeCriteria();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getFilterOperatorType();

	/*! \brief Set 
	 */
	void setFilterOperatorType(std::string  filter_operator_type);
	/*! \brief Get 
	 */
	bool isNegated();

	/*! \brief Set 
	 */
	void setNegated(bool  negated);
	/*! \brief Get 
	 */
	std::list<std::string> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <std::string> values);


    private:
    std::string filter_operator_type{};
    bool negated{};
    std::list<std::string> values;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsProductGroupFilterOperatorTypeCriteria_H_ */
