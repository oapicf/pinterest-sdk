
/*
 * TargetingSpecOperationAppType.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TargetingSpecOperationAppType_H_
#define TINY_CPP_CLIENT_TargetingSpecOperationAppType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TargetingSpecAppType.h"
#include "TargetingSpecListOperation.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TargetingSpecOperationAppType{
public:

    /*! \brief Constructor.
	 */
    TargetingSpecOperationAppType();
    TargetingSpecOperationAppType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingSpecOperationAppType();


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
	void setField(std::string field);
	/*! \brief Get 
	 */
	TargetingSpecListOperation getOperation();

	/*! \brief Set 
	 */
	void setOperation(TargetingSpecListOperation operation);
	/*! \brief Get 
	 */
	std::list<TargetingSpecAppType> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list<TargetingSpecAppType> values);


    private:
    std::string field{};
    TargetingSpecListOperation operation;
    std::list<TargetingSpecAppType> values;
};
}

#endif /* TINY_CPP_CLIENT_TargetingSpecOperationAppType_H_ */
