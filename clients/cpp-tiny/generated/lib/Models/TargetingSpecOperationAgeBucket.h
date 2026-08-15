
/*
 * TargetingSpecOperationAgeBucket.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TargetingSpecOperationAgeBucket_H_
#define TINY_CPP_CLIENT_TargetingSpecOperationAgeBucket_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TargetingSpecAgeBucket.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TargetingSpecOperationAgeBucket{
public:

    /*! \brief Constructor.
	 */
    TargetingSpecOperationAgeBucket();
    TargetingSpecOperationAgeBucket(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingSpecOperationAgeBucket();


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
	std::list<TargetingSpecAgeBucket> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <TargetingSpecAgeBucket> values);


    private:
    std::string field{};
    std::string operation{};
    std::list<TargetingSpecAgeBucket> values;
};
}

#endif /* TINY_CPP_CLIENT_TargetingSpecOperationAgeBucket_H_ */
