
/*
 * TargetingSpecOperationGeoExclude.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TargetingSpecOperationGeoExclude_H_
#define TINY_CPP_CLIENT_TargetingSpecOperationGeoExclude_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TargetingSpecListOperation.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TargetingSpecOperationGeoExclude{
public:

    /*! \brief Constructor.
	 */
    TargetingSpecOperationGeoExclude();
    TargetingSpecOperationGeoExclude(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingSpecOperationGeoExclude();


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
	std::list<std::string> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list<std::string> values);


    private:
    std::string field{};
    TargetingSpecListOperation operation;
    std::list<std::string> values;
};
}

#endif /* TINY_CPP_CLIENT_TargetingSpecOperationGeoExclude_H_ */
