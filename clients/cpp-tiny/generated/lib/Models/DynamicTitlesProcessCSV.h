
/*
 * DynamicTitlesProcessCSV.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DynamicTitlesProcessCSV_H_
#define TINY_CPP_CLIENT_DynamicTitlesProcessCSV_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DynamicTitlesProcessCSVError.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DynamicTitlesProcessCSV{
public:

    /*! \brief Constructor.
	 */
    DynamicTitlesProcessCSV();
    DynamicTitlesProcessCSV(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DynamicTitlesProcessCSV();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of validation errors. Empty on success.
	 */
	std::list<DynamicTitlesProcessCSVError> getErrors();

	/*! \brief Set List of validation errors. Empty on success.
	 */
	void setErrors(std::list<DynamicTitlesProcessCSVError> errors);
	/*! \brief Get Processing status. Present on success.
	 */
	std::string getStatus();

	/*! \brief Set Processing status. Present on success.
	 */
	void setStatus(std::string status);


    private:
    std::list<DynamicTitlesProcessCSVError> errors;
    std::string status{};
};
}

#endif /* TINY_CPP_CLIENT_DynamicTitlesProcessCSV_H_ */
