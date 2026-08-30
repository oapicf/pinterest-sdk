
/*
 * TargetingSpecOperations.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TargetingSpecOperations_H_
#define TINY_CPP_CLIENT_TargetingSpecOperations_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TargetingSpecOperationAgeBucket.h"
#include "TargetingSpecOperationAppType.h"
#include "TargetingSpecOperationAudienceExclude.h"
#include "TargetingSpecOperationAudienceInclude.h"
#include "TargetingSpecOperationGender.h"
#include "TargetingSpecOperationGeo.h"
#include "TargetingSpecOperationGeoExclude.h"
#include "TargetingSpecOperationInterest.h"
#include "TargetingSpecOperationLocale.h"
#include "TargetingSpecOperationLocation.h"
#include "TargetingSpecOperationLocationExclude.h"
#include "TargetingSpecOperationMaximumAge.h"
#include "TargetingSpecOperationMinimumAge.h"
#include "TargetingSpecOperationShoppingRetargeting.h"
#include "TargetingSpecShoppingRetargeting.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TargetingSpecOperations{
public:

    /*! \brief Constructor.
	 */
    TargetingSpecOperations();
    TargetingSpecOperations(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingSpecOperations();


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
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string operation);
	/*! \brief Get 
	 */
	std::list<TargetingSpecShoppingRetargeting> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list<TargetingSpecShoppingRetargeting> values);
	/*! \brief Get 
	 */
	std::string getValue();

	/*! \brief Set 
	 */
	void setValue(std::string value);


    private:
    std::string field{};
    std::string operation{};
    std::list<TargetingSpecShoppingRetargeting> values;
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_TargetingSpecOperations_H_ */
