
/*
 * TargetingSpecOperationMinMaxAge.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TargetingSpecOperationMinMaxAge_H_
#define TINY_CPP_CLIENT_TargetingSpecOperationMinMaxAge_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TargetingSpecOperationMinMaxAge{
public:

    /*! \brief Constructor.
	 */
    TargetingSpecOperationMinMaxAge();
    TargetingSpecOperationMinMaxAge(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingSpecOperationMinMaxAge();


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
	std::string getValue();

	/*! \brief Set 
	 */
	void setValue(std::string  value);


    private:
    std::string field{};
    std::string operation{};
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_TargetingSpecOperationMinMaxAge_H_ */
