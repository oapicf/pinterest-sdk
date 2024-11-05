/*
 * CatalogsCreateReportResponse.h
 *
 * 
 */

#ifndef _CatalogsCreateReportResponse_H_
#define _CatalogsCreateReportResponse_H_


#include <string>
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

class CatalogsCreateReportResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreateReportResponse();
	CatalogsCreateReportResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreateReportResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Token to be used to get the report
	 */
	std::string getToken();

	/*! \brief Set Token to be used to get the report
	 */
	void setToken(std::string  token);

private:
	std::string token;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreateReportResponse_H_ */
