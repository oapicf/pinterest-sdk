
/*
 * CatalogsProductGroupMultipleMediaTypesCriteria.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsProductGroupMultipleMediaTypesCriteria_H_
#define TINY_CPP_CLIENT_CatalogsProductGroupMultipleMediaTypesCriteria_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MediaType.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupMultipleMediaTypesCriteria{
public:

    /*! \brief Constructor.
	 */
    CatalogsProductGroupMultipleMediaTypesCriteria();
    CatalogsProductGroupMultipleMediaTypesCriteria(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsProductGroupMultipleMediaTypesCriteria();


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
	std::list<MediaType> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list<MediaType> values);


    private:
    bool negated{};
    std::list<MediaType> values;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsProductGroupMultipleMediaTypesCriteria_H_ */
