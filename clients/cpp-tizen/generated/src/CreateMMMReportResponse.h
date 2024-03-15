/*
 * CreateMMMReportResponse.h
 *
 * 
 */

#ifndef _CreateMMMReportResponse_H_
#define _CreateMMMReportResponse_H_


#include <string>
#include "CreateMMMReportResponseData.h"
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

class CreateMMMReportResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateMMMReportResponse();
	CreateMMMReportResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateMMMReportResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	long long getCode();

	/*! \brief Set 
	 */
	void setCode(long long  code);
	/*! \brief Get 
	 */
	CreateMMMReportResponseData getData();

	/*! \brief Set 
	 */
	void setData(CreateMMMReportResponseData  data);

private:
	long long code;
	CreateMMMReportResponseData data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateMMMReportResponse_H_ */
