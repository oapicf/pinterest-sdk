/*
 * DynamicTitlesProcessCSV.h
 *
 * 
 */

#ifndef _DynamicTitlesProcessCSV_H_
#define _DynamicTitlesProcessCSV_H_


#include <string>
#include "DynamicTitlesProcessCSVError.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DynamicTitlesProcessCSV : public Object {
public:
	/*! \brief Constructor.
	 */
	DynamicTitlesProcessCSV();
	DynamicTitlesProcessCSV(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DynamicTitlesProcessCSV();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of validation errors. Empty on success.
	 */
	std::list<DynamicTitlesProcessCSVError> getErrors();

	/*! \brief Set List of validation errors. Empty on success.
	 */
	void setErrors(std::list <DynamicTitlesProcessCSVError> errors);
	/*! \brief Get Processing status. Present on success.
	 */
	std::string getStatus();

	/*! \brief Set Processing status. Present on success.
	 */
	void setStatus(std::string  status);

private:
	std::list <DynamicTitlesProcessCSVError>errors;
	std::string status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DynamicTitlesProcessCSV_H_ */
