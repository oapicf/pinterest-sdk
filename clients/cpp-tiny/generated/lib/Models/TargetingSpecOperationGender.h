
/*
 * TargetingSpecOperationGender.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TargetingSpecOperationGender_H_
#define TINY_CPP_CLIENT_TargetingSpecOperationGender_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TargetingSpecGender.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TargetingSpecOperationGender{
public:

    /*! \brief Constructor.
	 */
    TargetingSpecOperationGender();
    TargetingSpecOperationGender(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingSpecOperationGender();


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
	std::list<TargetingSpecGender> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <TargetingSpecGender> values);


    private:
    std::string field{};
    std::string operation{};
    std::list<TargetingSpecGender> values;
};
}

#endif /* TINY_CPP_CLIENT_TargetingSpecOperationGender_H_ */
