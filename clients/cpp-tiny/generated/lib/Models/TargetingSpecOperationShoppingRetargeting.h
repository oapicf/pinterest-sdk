
/*
 * TargetingSpecOperationShoppingRetargeting.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TargetingSpecOperationShoppingRetargeting_H_
#define TINY_CPP_CLIENT_TargetingSpecOperationShoppingRetargeting_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TargetingSpecShoppingRetargeting.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TargetingSpecOperationShoppingRetargeting{
public:

    /*! \brief Constructor.
	 */
    TargetingSpecOperationShoppingRetargeting();
    TargetingSpecOperationShoppingRetargeting(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingSpecOperationShoppingRetargeting();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getField();

	/*! \brief Set 
	 */
	void setField(std::string  field);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string  operation);
	/*! \brief Get 
	 */
	std::list<TargetingSpecShoppingRetargeting> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <TargetingSpecShoppingRetargeting> values);


    private:
    std::string field{};
    std::string operation{};
    std::list<TargetingSpecShoppingRetargeting> values;
};
}

#endif /* TINY_CPP_CLIENT_TargetingSpecOperationShoppingRetargeting_H_ */
