/*
 * TemplateBasedReportCreate.h
 *
 * Resource create operation model.
 */

#ifndef _TemplateBasedReportCreate_H_
#define _TemplateBasedReportCreate_H_


#include <string>
#include "BulkReportingJobStatus.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class TemplateBasedReportCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	TemplateBasedReportCreate();
	TemplateBasedReportCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TemplateBasedReportCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string  message);
	/*! \brief Get 
	 */
	BulkReportingJobStatus getReportStatus();

	/*! \brief Set 
	 */
	void setReportStatus(BulkReportingJobStatus  report_status);
	/*! \brief Get 
	 */
	std::string getToken();

	/*! \brief Set 
	 */
	void setToken(std::string  token);

private:
	std::string message;
	BulkReportingJobStatus report_status;
	std::string token;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TemplateBasedReportCreate_H_ */
