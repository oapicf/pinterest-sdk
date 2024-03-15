/*
 * AdsAnalyticsGetAsyncResponse.h
 *
 * 
 */

#ifndef _AdsAnalyticsGetAsyncResponse_H_
#define _AdsAnalyticsGetAsyncResponse_H_


#include <string>
#include "BulkReportingJobStatus.h"
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

class AdsAnalyticsGetAsyncResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsAnalyticsGetAsyncResponse();
	AdsAnalyticsGetAsyncResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsAnalyticsGetAsyncResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	BulkReportingJobStatus getReportStatus();

	/*! \brief Set 
	 */
	void setReportStatus(BulkReportingJobStatus  report_status);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);
	/*! \brief Get 
	 */
	long long getSize();

	/*! \brief Set 
	 */
	void setSize(long long  size);

private:
	BulkReportingJobStatus report_status;
	std::string url;
	long long size;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdsAnalyticsGetAsyncResponse_H_ */
